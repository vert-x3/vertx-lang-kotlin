package io.vertx.kotlin.coroutines

import io.vertx.core.Context
import io.vertx.core.Future
import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.http.HttpClientOptions
import io.vertx.core.http.HttpServerOptions
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.RunTestOnContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.experimental.CancellationException
import kotlinx.coroutines.experimental.GlobalScope
import kotlinx.coroutines.experimental.Job
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.withTimeout
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue
import org.junit.Assert.fail
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.LinkedList
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.assertFalse

/**
 * @author <a href="http://www.streamis.me">Stream Liu</a>
 */
@RunWith(VertxUnitRunner::class)
class VertxCoroutineTest {

  companion object {
    private const val ADDRESS1 = "address1"
    private const val ADDRESS2 = "address2"
    private const val ADDRESS3 = "address3"
  }

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
      client.getNow("/somepath") { resp ->
        assertTrue(resp.statusCode() == 200)
        client.close()
        server.close { async.complete() }
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
        testContext.assertEquals(cause, e)
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
        testContext.assertEquals(cause, e)
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
  fun `test readStream to channel`(testContext: TestContext) {
    val stream = TestStream<Int>()
    val capacity = 3
    val expected = LinkedList<Int>()
    for (i in 0 until capacity) {
      expected.add(i)
    }
    val readStream: ReadStream<Int> = stream
    val channel = readStream.toChannel(vertx, capacity)
    for (i in expected) {
      testContext.assertFalse(stream.writeQueueFull())
      stream.write(i)
    }
    assertTrue(stream.writeQueueFull())
    val list = LinkedList<Int>()
    GlobalScope.launch(vertx.dispatcher()) {
      for (item in channel) {
        list.add(item)
        testContext.assertEquals((capacity - list.size) >= capacity / 2, stream.writeQueueFull())
        if (list.size == expected.size) {
          break
        }
      }
    }
    assertEquals(expected, list)
    stream.write(-1)
    stream.write(-2)
    stream.end()
    val ended = AtomicBoolean()
    GlobalScope.launch(vertx.dispatcher()) {
      var count = -1
      for (item in channel) {
        assertEquals(count--, item)
      }
      testContext.assertEquals(-3, count)
      ended.set(true)
    }
    testContext.assertTrue(ended.get())
  }

  @Test
  fun `test writeStream to channel`(testContext: TestContext) {
    val stream = TestStream<Int>()
    val capacity = 3
    val expected = LinkedList<Int>()
    for (i in 0 until capacity) {
      expected.add(i)
    }
    val writeStream: WriteStream<Int> = stream
    val channel = writeStream.toChannel(vertx, capacity)
    val received = LinkedList<Int>()
    stream.handler { elt -> received.add(elt) }
    GlobalScope.launch(vertx.dispatcher()) {
      for (elt in expected) {
        channel.send(elt)
        assertFalse(channel.isFull)
      }
    }
    testContext.assertEquals(expected, received)
    received.clear()
    stream.pause()
    val async = testContext.async()
    var foo = false
    GlobalScope.launch(vertx.dispatcher()) {
      for (elt in expected) {
        channel.send(elt)
        testContext.assertFalse(channel.isFull)
      }
      channel.send(capacity) // Need an extra element for the inflight
      testContext.assertTrue(channel.isFull)
      channel.send(capacity + 1) // Shall be suspended until resume
      foo = true
    }
    testContext.assertFalse(foo)
    testContext.assertEquals(emptyList<Int>(), received)
    stream.resume()
    testContext.assertTrue(foo)
    testContext.assertEquals(listOf(0, 1, 2, 3, 4), received)
    GlobalScope.launch(vertx.dispatcher()) {
      channel.send(5)
    }
    testContext.assertEquals(listOf(0, 1, 2, 3, 4, 5), received)
    testContext.assertFalse(stream.isEnded)
    channel.close()
    testContext.assertTrue(stream.isEnded)
    async.complete()
  }

  @Test
  fun `test handler adaptor`(testContext: TestContext) {
    val async = testContext.async()
    val eb = vertx.eventBus()
    // Create a couple of consumers on different addresses
    // The adaptor allows handler to be used as a Channel
    val adaptor1 = vertx.receiveChannelHandler<Message<String>>()
    eb.consumer<String>(ADDRESS1).handler(adaptor1)

    val adaptor2 = vertx.receiveChannelHandler<Message<String>>()
    eb.consumer<String>(ADDRESS2).handler(adaptor2)

    // Set up a periodic timer to send messages to these addresses
    val start = System.currentTimeMillis()
    vertx.setPeriodic(10) { _ ->
      eb.send(ADDRESS1, "wibble")
      eb.send(ADDRESS2, "flibble")
    }
    GlobalScope.launch(vertx.dispatcher()) {
      for (i in 0..9) {
        val received1 = adaptor1.receive()
        assertEquals("wibble", received1.body())
        val received2 = adaptor2.receive()
        assertEquals("flibble", received2.body())
      }

      val end = System.currentTimeMillis()
      assertTrue(end - start >= 100)

      // Try a receive with timeout
      var received1: Message<String>? = null
      try {
        received1 = withTimeout(1000) { adaptor1.receive() }
      } catch (e: CancellationException) {
      }

      if (received1 is Message<*>) assertEquals("wibble", received1.body())
      else fail("received1 cast type failed.")

      // And timing out
      val adaptor3 = vertx.receiveChannelHandler<Message<String>>()
      eb.consumer<String>(ADDRESS3).handler(adaptor3)
      try {
        withTimeout(100) { adaptor3.receive() }
        testContext.fail()
      } catch (e: CancellationException) {
        async.complete()
      }
    }
  }

  @Test
  fun `test await of succeeded future`(testContext: TestContext) {
    val async = testContext.async()
    val fut = Future.future<String>()
    GlobalScope.launch(vertx.dispatcher()) {
      val s = fut.await()
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
    val fut = Future.future<String>()
    val cause = RuntimeException()
    GlobalScope.launch(vertx.dispatcher()) {
      try {
        fut.await()
        testContext.fail()
      } catch (e: Exception) {
        testContext.assertEquals(cause, e)
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
}
