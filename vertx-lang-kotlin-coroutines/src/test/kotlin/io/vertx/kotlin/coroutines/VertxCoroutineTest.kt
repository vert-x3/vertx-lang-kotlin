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

import io.vertx.core.AbstractVerticle
import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.Promise
import io.vertx.core.Vertx
import io.vertx.core.http.HttpClientOptions
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerOptions
import io.vertx.core.impl.NoStackTraceThrowable
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.RunTestOnContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

/**
 * @author <a href="http://www.streamis.me">Stream Liu</a>
 */
@RunWith(VertxUnitRunner::class)
class VertxCoroutineTest {

  @Rule
  @JvmField
  val rule = RunTestOnContext()

  private lateinit var vertx: Vertx
  private lateinit var ai: AsyncInterface

  @Before
  fun before() {
    vertx = rule.vertx()
    ai = AsyncInterfaceImpl(vertx)
  }

  @Test
  fun `test context`(testContext: TestContext) {
    val async = testContext.async()
    val ctx = vertx.getOrCreateContext()
    assertTrue(ctx.isEventLoopContext)
    async.complete()
  }

  @Test
  fun `test sleep`(testContext: TestContext) {
    val async = testContext.async(2)
    val job: Job = GlobalScope.launch(vertx.dispatcher()) {
      val th = Thread.currentThread()
      val cnt = AtomicInteger()
      val periodicTimer = vertx.periodicStream(1L).handler {
        assertSame(Thread.currentThread(), th)
        cnt.incrementAndGet()
      }
      assertSame(Thread.currentThread(), th)
      awaitEvent<Long> { h -> vertx.setTimer(1000L, h) }
      assertTrue(cnt.get() > 900)
      assertSame(Thread.currentThread(), th)
      periodicTimer.cancel()
      async.countDown()
    }
    job.invokeOnCompletion {
      async.countDown()
    }
  }

  @Test
  fun `test fiber Handler`(testContext: TestContext) {
    val async = testContext.async()
    val server = vertx.createHttpServer(HttpServerOptions().setPort(8080))
    server.requestHandler { req ->
      GlobalScope.launch(vertx.dispatcher()) {
        val res = awaitResult<String> { ai.methodWithParamsAndHandlerNoReturn("oranges", 23, it) }
        assertEquals("oranges23", res)
        req.response().end()
      }
    }
    server.listen { res ->
      assertTrue(res.succeeded())
      val client = vertx.createHttpClient(HttpClientOptions().setDefaultPort(8080))
      client.request(HttpMethod.GET, "/somepath") { ar1 ->
        assertTrue(ar1.succeeded())
        val req = ar1.result()
        req.send { ar2 ->
          assertTrue(ar2.succeeded())
          val resp = ar2.result()
          assertTrue(resp.statusCode() == 200)
          client.close()
          server.close { async.complete() }
        }
      }
    }
  }

  @Test
  fun `test synchronous execution of methodWithParamsAndHandlerNoReturn`(testContext: TestContext) {
    val async = testContext.async()
    val th = Thread.currentThread()
    GlobalScope.launch(vertx.dispatcher()) {
      val res = awaitResult<String> { ai.methodWithParamsAndHandlerNoReturn("oranges", 23, it) }
      assertEquals("oranges23", res)
      assertSame(Thread.currentThread(), th)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithNoParamsAndHandlerNoReturn`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = awaitResult<String> { ai.methodWithNoParamsAndHandlerNoReturn(it) }
      assertEquals("wibble", res)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithParamsAndHandlerWithReturn`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = awaitResult<String> { ai.methodWithParamsAndHandlerWithReturn("oranges", 23, it) }
      assertEquals("oranges23", res)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithNoParamsAndHandlerWithReturn`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = awaitResult<String> { ai.methodWithNoParamsAndHandlerWithReturn(it) }
      assertEquals("wibble", res)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithNoParamsAndHandlerWithReturnNoTimeout`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = withTimeout(2000) {
        awaitResult<String> { ai.methodWithNoParamsAndHandlerWithReturnTimeout(it, 1000) }
      }
      testContext.assertEquals("wibble", res)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithNoParamsAndHandlerWithReturnTimeout`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      try {
        withTimeout(500) {
          awaitResult<String> { ai.methodWithNoParamsAndHandlerWithReturnTimeout(it, 1000) }
        }
        testContext.fail()
      } catch (e: CancellationException) {
        testContext.assertTrue(Context.isOnEventLoopThread())
        async.complete()
      }
    }
  }

  @Test
  fun `test synchronous execution of methodWithParamsAndHandlerInterface`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val returned = awaitResult<ReturnedInterface> { ai.methodWithParamsAndHandlerInterface("apples", 123, it) }
      assertNotNull(returned)
      val res = awaitResult<String> { returned.methodWithParamsAndHandlerNoReturn("bananas", 100, it) }
      testContext.assertEquals(res, "bananas100")
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodThatFails`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      try {
        awaitResult<String> { ai.methodThatFails("oranges", it) }
        testContext.fail("Should throw exception")
      } catch (e: Exception) {
        testContext.assertEquals("oranges", e.message)
        async.complete()
      }
    }
  }

  @Test
  fun `test synchronous execution of methodThatThrowsException`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      try {
        awaitResult<String> { ai.methodThatThrowsException("oranges", it) }
        testContext.fail("Should throw exception")
      } catch (e: Exception) {
        testContext.assertEquals("ouch", e.message)
        async.complete()
      }
    }
  }

  @Test
  fun `test synchronous execution of methodThatCompleteTwice`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async(2)
      val v = awaitResult<String> { h ->
        vertx.runOnContext {
          h.handle(Future.succeededFuture("one"))
          try {
            h.handle(Future.succeededFuture("two"))
          } catch (ignore: IllegalStateException) {
            async.countDown()
          }
        }
      }
      testContext.assertEquals("one", v)
      async.countDown()
    }
  }

  @Test
  fun `test receive event`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val start = System.currentTimeMillis()
      val tid = awaitEvent<Long> { vertx.setTimer(500, it) }
      val end = System.currentTimeMillis()
      assertTrue(end - start >= 500)
      assertTrue(tid >= 0)
      async.complete()
    }
  }

  @Test
  fun `test timeout receive event`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      try {
        withTimeout(250) {
          awaitEvent<Long> { vertx.setTimer(500, it) }
        }
        fail()
      } catch (e: CancellationException) {
        testContext.assertTrue(Context.isOnEventLoopThread())
        async.complete()
      }
    }
  }

  @Test
  fun `test no timeout receive event`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val start = System.currentTimeMillis()
      val tid = withTimeout(1000L) {
        awaitEvent<Long> { vertx.setTimer(500, it) }
      }
      val end = System.currentTimeMillis()
      assertTrue(end - start >= 500)
      assertTrue(tid >= 0)
      async.complete()
    }
  }

  @Test
  fun `test failure event method`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val cause = RuntimeException()
      try {
        awaitEvent<Any> { throw cause }
        testContext.fail()
      } catch (e: Exception) {
        testContext.assertEquals(cause, e.cause)
      }
      async.complete()
    }
  }

  @Test
  fun `test timeout failure event method`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val cause = RuntimeException()
      try {
        withTimeout(1000L) {
          awaitEvent<Any> { throw cause }
        }
        testContext.fail()
      } catch (e: Exception) {
        testContext.assertEquals(cause, e.cause)
      }
      async.complete()
    }
  }

  @Test
  fun `test receive event twice`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async(2)
      val v = awaitEvent<String> { h ->
        vertx.runOnContext {
          h.handle("one")
          try {
            h.handle("two")
          } catch (ignore: IllegalStateException) {
            async.countDown()
          }
        }
      }
      testContext.assertEquals("one", v)
      async.countDown()
    }
  }

  @Test
  fun `test await of succeeded future`(testContext: TestContext) {
    val async = testContext.async()
    val fut = Promise.promise<String>()
    GlobalScope.launch(vertx.dispatcher()) {
      val s = fut.future().await()
      testContext.assertEquals("the-string", s)
      async.complete()
    }
    vertx.runOnContext {
      fut.complete("the-string")
    }
  }

  @Test
  fun `test await of failed future`(testContext: TestContext) {
    val async = testContext.async()
    val fut = Promise.promise<String>()
    val cause = RuntimeException()
    GlobalScope.launch(vertx.dispatcher()) {
      try {
        fut.future().await()
        testContext.fail()
      } catch (e: Exception) {
        testContext.assertEquals(cause, e.cause)
        async.complete()
      }
    }
    vertx.runOnContext {
      fut.fail(cause)
    }
  }

  private fun `test awaitBlocking or awaitBlockingSuspend`(
    testContext: TestContext, callAwaitBlocking: suspend (block: () -> String) -> String
  ) {
    val async = testContext.async()
    val isOnWorkerThread = AtomicBoolean()
    GlobalScope.launch(vertx.dispatcher()) {
      val ctx = Vertx.currentContext()
      val thread = Thread.currentThread()
      val result = callAwaitBlocking {
        isOnWorkerThread.set(Context.isOnWorkerThread())
        "the-string"
      }
      testContext.assertEquals(thread, Thread.currentThread())
      testContext.assertEquals(ctx, Vertx.currentContext())
      testContext.assertEquals("the-string", result)
      testContext.assertTrue(isOnWorkerThread.get())
      async.complete()
    }
  }

  @Test
  fun `test awaitBlocking`(testContext: TestContext) =
    `test awaitBlocking or awaitBlockingSuspend`(testContext) { block ->
      awaitBlocking(block)
    }

  @Test
  fun `test awaitBlockingSuspend`(testContext: TestContext) =
    `test awaitBlocking or awaitBlockingSuspend`(testContext) { block ->
      awaitBlockingSuspend { block() }
    }

  private fun `test failure of awaitBlocking or awaitBlockingSuspend`(
    testContext: TestContext, callAwaitBlocking: suspend (block: () -> String) -> String
  ) {
    val async = testContext.async()
    GlobalScope.launch(vertx.dispatcher()) {
      val cause = Exception()
      val ctx = Vertx.currentContext()
      val thread = Thread.currentThread()
      var failure: Throwable? = null
      try {
        callAwaitBlocking {
          throw cause
        }
      } catch (e: Exception) {
        failure = e
      }
      testContext.assertEquals(thread, Thread.currentThread())
      testContext.assertEquals(ctx, Vertx.currentContext())
      testContext.assertEquals(cause, failure)
      async.complete()
    }
  }

  @Test
  fun `test failure of awaitBlocking`(testContext: TestContext) =
    `test failure of awaitBlocking or awaitBlockingSuspend`(testContext) { block ->
      awaitBlocking(block)
    }

  @Test
  fun `test failure of awaitBlockingSuspend`(testContext: TestContext) =
    `test failure of awaitBlocking or awaitBlockingSuspend`(testContext) { block ->
      awaitBlockingSuspend { block() }
    }

  class DummyVerticle : AbstractVerticle()

  suspend fun assertClosed(vertx: Vertx) {
    try {
      vertx.deployVerticle(DummyVerticle()).await()
      fail()
    } catch (_: NoStackTraceThrowable) {
    }
  }

  @Test
  fun `test use`() = runTest {
    val vertx = Vertx.vertx()
    vertx.use {
      vertx.deployVerticle(DummyVerticle()).await()
    }

    assertClosed(vertx)
  }

  private class SomeThrowable : Throwable()

  @Test
  fun `test use with a throwable thrown inside`() = runTest {
    val vertx = Vertx.vertx()
    try {
      vertx.use {
        throw SomeThrowable()
      }
    } catch (_: SomeThrowable) {
    }

    assertClosed(vertx)
  }

  companion object {
    const val DEFAULT_SLEEP_OR_DELAY_DURATION = 1000L
  }

  @Test
  fun `test coroutineToFuture`() = runTest {
    assertTrue(measureTimeMillis {
      coroutineToFuture {
        delay(DEFAULT_SLEEP_OR_DELAY_DURATION)
      }.await()
    } >= DEFAULT_SLEEP_OR_DELAY_DURATION)

    assertTrue(measureTimeMillis {
      coroutineToFuture {
        @Suppress("BlockingMethodInNonBlockingContext")
        Thread.sleep(DEFAULT_SLEEP_OR_DELAY_DURATION)
      }.await()
    } >= DEFAULT_SLEEP_OR_DELAY_DURATION)
  }
}
