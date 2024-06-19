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
import io.vertx.core.Future
import io.vertx.core.Promise
import io.vertx.core.Vertx
import io.vertx.core.http.*
import io.vertx.core.internal.ContextInternal
import io.vertx.core.internal.VertxInternal
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.RunTestOnContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger

/**
 * @author <a href="http://www.streamis.me">Stream Liu</a>
 */
@OptIn(DelicateCoroutinesApi::class)
@RunWith(VertxUnitRunner::class)
class VertxCoroutineTest {

  @Rule
  @JvmField
  val rule = RunTestOnContext()

  private lateinit var vertx: Vertx
  private lateinit var ai: AsyncInterface
  private lateinit var client: HttpClient
  private lateinit var server: HttpServer

  @Before
  fun before() {
    vertx = rule.vertx()
    ai = AsyncInterfaceImpl(vertx)
    client = vertx.createHttpClient(HttpClientOptions().setDefaultPort(8080))
    server = vertx.createHttpServer(HttpServerOptions().setPort(8080))
  }

  @After
  fun tearDown(tc: TestContext) {
    client.close()
    server.close().onComplete(tc.asyncAssertSuccess())
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
      val periodicTimer = vertx.setPeriodic(1L) {
        assertSame(Thread.currentThread(), th)
        cnt.incrementAndGet()
      }
      assertSame(Thread.currentThread(), th)
      awaitEvent<Long> { h -> vertx.setTimer(1000L, h) }
      assertTrue(cnt.get() > 900)
      assertSame(Thread.currentThread(), th)
      vertx.cancelTimer(periodicTimer)
      async.countDown()
    }
    job.invokeOnCompletion {
      async.countDown()
    }
  }

  @Test
  fun `test fiber Handler`(tc: TestContext) {
    server.requestHandler { req ->
      GlobalScope.launch(vertx.dispatcher()) {
        val res = awaitResult { ai.methodWithParamsAndHandlerNoReturn("oranges", 23, it) }
        assertEquals("oranges23", res)
        req.response().end()
      }
    }
    server.listen().onComplete(tc.asyncAssertSuccess {
      client.request(HttpMethod.GET, "/somepath").onComplete(tc.asyncAssertSuccess { request ->
        request.send().onComplete(tc.asyncAssertSuccess { response ->
          assertEquals(200, response.statusCode())
        })
      })
    })
  }

  @Test
  fun `test synchronous execution of methodWithParamsAndHandlerNoReturn`(testContext: TestContext) {
    val async = testContext.async()
    val th = Thread.currentThread()
    GlobalScope.launch(vertx.dispatcher()) {
      val res = awaitResult { ai.methodWithParamsAndHandlerNoReturn("oranges", 23, it) }
      assertEquals("oranges23", res)
      assertSame(Thread.currentThread(), th)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithNoParamsAndHandlerNoReturn`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = awaitResult { ai.methodWithNoParamsAndHandlerNoReturn(it) }
      assertEquals("wibble", res)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithParamsAndHandlerWithReturn`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = awaitResult { ai.methodWithParamsAndHandlerWithReturn("oranges", 23, it) }
      assertEquals("oranges23", res)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithNoParamsAndHandlerWithReturn`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = awaitResult { ai.methodWithNoParamsAndHandlerWithReturn(it) }
      assertEquals("wibble", res)
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodWithNoParamsAndHandlerWithReturnNoTimeout`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      val res = withTimeout(2000) {
        awaitResult { ai.methodWithNoParamsAndHandlerWithReturnTimeout(it, 1000) }
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
          awaitResult { ai.methodWithNoParamsAndHandlerWithReturnTimeout(it, 1000) }
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
      val returned = awaitResult { ai.methodWithParamsAndHandlerInterface("apples", 123, it) }
      assertNotNull(returned)
      val res = awaitResult { returned.methodWithParamsAndHandlerNoReturn("bananas", 100, it) }
      testContext.assertEquals(res, "bananas100")
      async.complete()
    }
  }

  @Test
  fun `test synchronous execution of methodThatFails`(testContext: TestContext) {
    GlobalScope.launch(vertx.dispatcher()) {
      val async = testContext.async()
      try {
        awaitResult { ai.methodThatFails("oranges", it) }
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
        awaitResult { ai.methodThatThrowsException("oranges", it) }
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
      val s = fut.future().coAwait()
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
        fut.future().coAwait()
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

  @Test
  fun `test awaitBlocking`(testContext: TestContext) {
    val async = testContext.async()
    val isOnWorkerThread = AtomicBoolean()
    GlobalScope.launch(vertx.dispatcher()) {
      val ctx = Vertx.currentContext()
      val thread = Thread.currentThread()
      val result = awaitBlocking {
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
  fun `test failure of awaitBlocking`(testContext: TestContext) {
    val async = testContext.async()
    GlobalScope.launch(vertx.dispatcher()) {
      val cause = Exception()
      val ctx = Vertx.currentContext()
      val thread = Thread.currentThread()
      var failure: Throwable? = null
      try {
        awaitBlocking<String> {
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
  fun `test success of vertxFuture coroutine launcher`(testContext: TestContext) {
    val future = vertxFuture {
      delay(500)
      "3"
    }
    future.onComplete(testContext.asyncAssertSuccess {
      testContext.assertEquals(it, "3")
    })
  }

  @Test
  fun `test failure of vertxFuture coroutine launcher`(testContext: TestContext) {
    val future = vertxFuture {
      delay(500)
      throw java.lang.RuntimeException("Boom")
    }
    future.onComplete(testContext.asyncAssertFailure {
      testContext.assertEquals(it.message, "Boom")
    })
  }

  @Test
  fun `test no StackOverflowError caused by two yield calls`(testContext: TestContext) {
    val latch = testContext.async()
    GlobalScope.launch(vertx.dispatcher()) {
      repeat(1000) {
        yield()
        yield()
      }
      latch.complete()
    }
  }

  @Test
  fun `test Coroutine execution not always performed with dispatch`(tc: TestContext) {
    server.requestHandler { it.response().end() }.listen().onComplete(tc.asyncAssertSuccess {
      val latch = tc.async()
      val context = (vertx as VertxInternal).getOrCreateContext()
      val duplicatedContext = context.duplicate()
      duplicatedContext.runOnContext {
        GlobalScope.launch(Vertx.currentContext().dispatcher()) {
          val resp = client.request(HttpMethod.GET, "/")
            .coAwait().apply { end().coAwait() }
            .response()
            .coAwait()
          resp.body().coAwait()
          latch.complete()
        }
      }
    })
  }

  @Test
  fun `test Coroutine execution performed with dispatch in executeBlocking`(testContext: TestContext) {
    val latch = testContext.async(2)
    GlobalScope.launch(Vertx.currentContext().dispatcher()) {
      vertx.executeBlocking {
        val captured = ContextInternal.current()
        testContext.assertFalse(captured.isWorkerContext)
        launch {
          testContext.assertEquals(captured, ContextInternal.current())
          testContext.assertTrue(captured.inThread())
          latch.countDown()
        }
      }.coAwait()
      latch.countDown()
    }
  }
}
