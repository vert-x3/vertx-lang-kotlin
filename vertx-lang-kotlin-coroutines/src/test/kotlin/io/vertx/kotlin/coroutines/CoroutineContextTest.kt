/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.coroutines

import io.vertx.core.Context
import io.vertx.core.DeploymentOptions
import io.vertx.core.Vertx
import io.vertx.core.impl.ContextInternal
import io.vertx.core.impl.VertxInternal
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.junit.After
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong
import java.util.concurrent.atomic.AtomicReference
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner::class)
class CoroutineContextTest {

  private lateinit var vertx: Vertx
  private lateinit var ai: AsyncInterface

  @Before
  fun before() {
    vertx = Vertx.vertx()
    ai = AsyncInterfaceImpl(vertx)
  }

  @After
  fun after() {
    vertx.close()
  }

  @Test
  fun `test without context`(testContext: TestContext) {
    val async = testContext.async()
    GlobalScope.launch(vertx.dispatcher()) {
      runTest(testContext)
      async.complete()
    }
  }

  @Test
  fun `test in EventLoop context`(testContext: TestContext) {
    val async = testContext.async()
    val ctx = vertx.getOrCreateContext()
    ctx.runOnContext {
      GlobalScope.launch(vertx.dispatcher()) {
        runTest(testContext)
        async.complete()
      }
    }
  }

  @Test
  fun `test in Worker context`(testContext: TestContext) {
    val async = testContext.async()
    vertx.deployVerticle(object : CoroutineVerticle() {
      override suspend fun start() {
        launch {
          runTest(testContext, isOnEventLoop = false)
        }
      }
    }, DeploymentOptions().setWorker(true)).onComplete(testContext.asyncAssertSuccess {
      async.complete()
    })
  }

  @Test
  fun `test using Unconfined dispatcher`(testContext: TestContext) {
    val async = testContext.async()
    val current = Thread.currentThread()
    GlobalScope.launch(Dispatchers.Unconfined) {
      testContext.assertEquals(current, Thread.currentThread())
      awaitEvent<Long> { vertx.setTimer(10, it) }
      testContext.assertTrue(Context.isOnEventLoopThread())
      async.complete()
    }
  }

  @Test
  fun `test join`(testContext: TestContext) {
    val done = AtomicBoolean()
    val job = GlobalScope.launch(vertx.dispatcher()) {
      awaitEvent<Long> { vertx.setTimer(500, it) }
      done.set(true)
    }
    runBlocking {
      job.join()
      testContext.assertTrue(done.get())
    }
  }

  suspend fun runTest(testContext: TestContext, isOnEventLoop: Boolean = true) {
    testContext.assertTrue(Context.isOnVertxThread())
    val ctx = Vertx.currentContext()
    val a = AtomicLong()
    val id = awaitEvent<Long> { handler ->
      a.set(vertx.setTimer(10, handler))
    }
    testContext.assertEquals(id, a.get())
    if (isOnEventLoop) testContext.assertTrue(Context.isOnEventLoopThread(), "Expected event loop thread instead of ${Thread.currentThread()}")
    else testContext.assertFalse(Context.isOnEventLoopThread(), "Expected non event loop thread")
    testContext.assertEquals(ctx, Vertx.currentContext())
  }

  @Test
  fun `test mutex`(testContext: TestContext) {
    val mutex = Mutex()
    val dispatcher = vertx.dispatcher()
    val times = 10
    val latch = testContext.async(times)
    for (i in 0..times) {
      GlobalScope.launch(dispatcher) {
        mutex.withLock {
          testContext.assertTrue(Context.isOnVertxThread())
          latch.countDown()
        }
      }
    }
    latch.await(5000)
  }

  @Test
  fun `test delay`(testContext: TestContext) {
    val latch = testContext.async()
    GlobalScope.launch(vertx.dispatcher()) {
      val ctx = Vertx.currentContext()
      delay(100)
      testContext.assertEquals(ctx, Vertx.currentContext())
      latch.complete()
    }
  }

  @Test
  fun `test periodic`(testContext: TestContext) {
    val count = AtomicInteger()
    val interrupted = testContext.async()
    val job = GlobalScope.launch(vertx.dispatcher()) {
      val ctx = Vertx.currentContext()
      try {
        testContext.assertEquals(ctx, Vertx.currentContext())
        repeat(1000) {
          count.incrementAndGet()
          delay(10)
        }
      } catch (e: CancellationException) {
        testContext.assertEquals(ctx, Vertx.currentContext())
        interrupted.countDown()
        throw e
      }
    }
    Thread.sleep(100)
    job.cancel()
    testContext.assertTrue(count.get() > 5)
    interrupted.awaitSuccess(2000)
  }

  @Test
  fun `test async builder`() {
    val async = GlobalScope.async<Long>(vertx.dispatcher()) {
      assertTrue(Context.isOnEventLoopThread())
      val thread1 = Thread.currentThread()
      val thread2 = AtomicReference<Thread>()
      awaitEvent<Long> {
        thread2.set(Thread.currentThread())
        vertx.setTimer(100, it)
      }
      assertEquals(thread1, Thread.currentThread())
      assertEquals(thread2.get(), Thread.currentThread())
      5
    }
    while (!async.isCompleted) {
      Thread.sleep(10)
    }
    assertEquals(5, async.getCompleted())
  }

  @Test
  fun `test runBlocking builder`() {
    val async = runBlocking<Long>(vertx.dispatcher()) {
      assertTrue(Context.isOnEventLoopThread())
      val thread1 = Thread.currentThread()
      val thread2 = AtomicReference<Thread>()
      awaitEvent<Long> {
        thread2.set(Thread.currentThread())
        vertx.setTimer(100, it)
      }
      assertEquals(thread1, Thread.currentThread())
      assertEquals(thread2.get(), Thread.currentThread())
      5
    }
    assertEquals(5, async)
  }

  @Test
  fun `test error in runBlocking builder`() {
    val expected = Exception()
    var caught: Exception? = null
    try {
      runBlocking<Long>(vertx.dispatcher()) {
        throw expected
      }
    } catch (e: Exception) {
      caught = e
    }
    assertEquals(expected, caught)
  }

  @Test
  fun `test failure in runBlocking builder`() {
    var caught: AssertionError? = null
    try {
      runBlocking(vertx.dispatcher()) {
        assertFalse("it was true", true)
      }
    } catch (e: AssertionError) {
      caught = e
    }
    assertNotNull(caught)
    assertEquals("it was true", caught!!.message)
  }

  @Test
  fun `coroutine dispatcher executes commands on duplicated context`(testContext: TestContext) {
    val latch = testContext.async()
    val context = (vertx as VertxInternal).getOrCreateContext()
    val duplicatedContext = context.duplicate()
    duplicatedContext.runOnContext {
      duplicatedContext.putLocal("foo", "bar")
      GlobalScope.launch(context.dispatcher()) {
        delay(100)
        testContext.assertEquals(duplicatedContext, ContextInternal.current())
        testContext.assertEquals(duplicatedContext.getLocal("foo"), "bar")
        latch.complete()
      }
    }
  }
}
