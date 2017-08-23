package io.vertx.kotlin.coroutines

import io.vertx.core.Context
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
import kotlinx.coroutines.experimental.withTimeout
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicInteger
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Created by stream.
 */
@RunWith(VertxUnitRunner::class)
class VertxCoroutineTest {

  @Rule
  @JvmField val rule = RunTestOnContext()
  private val ADDRESS1 = "address1"
  private val ADDRESS2 = "address2"
  private val ADDRESS3 = "address3"

  private lateinit var vertx: Vertx
  private lateinit var ai: AsyncInterface

  @Before
  fun before() {
    vertx = rule.vertx()
    ai = AsyncInterfaceImpl(vertx)
  }

  @Test
  fun testContext(testContext: TestContext) {
    val async = testContext.async()
    val ctx = vertx.getOrCreateContext()
    Assert.assertTrue(ctx.isEventLoopContext)
    async.complete()
  }

  @Test
  fun testSleep(testContext: TestContext) {
    val async = testContext.async()
    vertx.runCoroutine {
      val th = Thread.currentThread()
      val cnt = AtomicInteger()
      val periodicTimer = vertx.periodicStream(1L).handler {
        Assert.assertSame(Thread.currentThread(), th)
        cnt.incrementAndGet()
      }
      Assert.assertSame(Thread.currentThread(), th)
      asyncEvent<Long> { h -> vertx.setTimer(1000L, h) }
      Assert.assertTrue(cnt.get() > 900)
      Assert.assertSame(Thread.currentThread(), th)
      periodicTimer.cancel()
      async.complete()
    }
  }

  @Test
  fun testFiberHandler(testContext: TestContext) {
    val async = testContext.async()
    val server = vertx.createHttpServer(HttpServerOptions().setPort(8080))
    server.requestHandler({ req ->
      vertx.runCoroutine {
        val res = asyncResult<String> { h -> ai.methodWithParamsAndHandlerNoReturn("oranges", 23, h) }
        Assert.assertEquals("oranges23", res)
        req.response().end()
      }
    })
    server.listen { res ->
      Assert.assertTrue(res.succeeded())
      val client = vertx.createHttpClient(HttpClientOptions().setDefaultPort(8080))
      client.getNow("/somepath") { resp ->
        Assert.assertTrue(resp.statusCode() == 200)
        client.close()
        server.close { _ -> async.complete() }
      }
    }
  }

  @Test
  fun testExecSyncMethodWithParamsAndHandlerNoReturn(testContext: TestContext) {
    val async = testContext.async()
    val th = Thread.currentThread()
    vertx.runCoroutine {
      val res = asyncResult<String> { h -> ai.methodWithParamsAndHandlerNoReturn("oranges", 23, h) }
      Assert.assertEquals("oranges23", res)
      Assert.assertSame(Thread.currentThread(), th)
      async.complete()
    }
  }

  @Test
  fun testExecSyncMethodWithNoParamsAndHandlerNoReturn(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val res = asyncResult<String> { h -> ai.methodWithNoParamsAndHandlerNoReturn(h) }
    Assert.assertEquals("wibble", res)
    async.complete()
  }

  @Test
  fun testExecSyncMethodWithParamsAndHandlerWithReturn(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val res = asyncResult<String> { h -> ai.methodWithParamsAndHandlerWithReturn("oranges", 23, h) }
    Assert.assertEquals("oranges23", res)
    async.complete()
  }

  @Test
  fun testExecSyncMethodWithNoParamsAndHandlerWithReturn(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val res = asyncResult<String> { h -> ai.methodWithNoParamsAndHandlerWithReturn(h) }
    Assert.assertEquals("wibble", res)
    async.complete()
  }

  @Test
  fun testExecSyncMethodWithNoParamsAndHandlerWithReturnNoTimeout(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val res = withTimeout(2000) {
      asyncResult<String> { h -> ai.methodWithNoParamsAndHandlerWithReturnTimeout(h, 1000) }
    }
    testContext.assertEquals("wibble", res)
    async.complete()
  }

  @Test
  fun testExecSyncMethodWithNoParamsAndHandlerWithReturnTimeout(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    try {
      withTimeout(500) {
        asyncResult<String> { h -> ai.methodWithNoParamsAndHandlerWithReturnTimeout(h, 1000)
        }
      }
      testContext.fail()
    } catch(e: CancellationException) {
      testContext.assertTrue(Context.isOnEventLoopThread())
      async.complete()
    }
  }

  @Test
  fun testExecSyncMethodWithParamsAndHandlerInterface(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val returned = asyncResult<ReturnedInterface> { h -> ai.methodWithParamsAndHandlerInterface("apples", 123, h) }
    Assert.assertNotNull(returned)
    val res = asyncResult<String> { h -> returned.methodWithParamsAndHandlerNoReturn("bananas", 100, h) }
    testContext.assertEquals(res, "bananas100")
    async.complete()
  }

  @Test
  fun testExecSyncMethodThatFails(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    try {
      asyncResult<String> { h -> ai.methodThatFails("oranges", h) }
      testContext.fail("Should throw exception")
    } catch (e: Exception) {
      testContext.assertEquals("oranges", e?.message)
      async.complete()
    }
  }

  @Test
  fun testReceiveEvent(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val start = System.currentTimeMillis()
    val tid = asyncEvent<Long> { h -> vertx.setTimer(500, h) }
    val end = System.currentTimeMillis()
    Assert.assertTrue(end - start >= 500)
    Assert.assertTrue(tid >= 0)
    async.complete()
  }

  @Test
  fun testReceiveEventTimeout(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    try {
      withTimeout(250) {
        asyncEvent<Long> { h -> vertx.setTimer(500, h) }
      }
      Assert.fail()
    } catch (e: CancellationException) {
      testContext.assertTrue(Context.isOnEventLoopThread())
      async.complete()
    }
  }

  @Test
  fun testReceiveEventNoTimeout(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val start = System.currentTimeMillis()
    val tid = withTimeout(1000L) {
      asyncEvent<Long>() { h -> vertx.setTimer(500, h) }    }
    val end = System.currentTimeMillis()
    Assert.assertTrue(end - start >= 500)
    if (tid is Long) Assert.assertTrue(tid >= 0)
    else Assert.fail("can not cast tid type")
    async.complete()
  }

  @Test
  fun testEventMethodFailure(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val cause = RuntimeException()
    try {
      asyncEvent<Any> { h -> throw cause }
      testContext.fail()
    } catch(e: Exception) {
      testContext.assertEquals(cause, e)
    }
    async.complete()
  }

  @Test
  fun testEventMethodFailureNoTimeout(testContext: TestContext) = vertx.runCoroutine {
    val async = testContext.async()
    val cause = RuntimeException()
    try {
      withTimeout(1000L) {
        asyncEvent<Any>() { h -> throw cause }
      }
      testContext.fail()
    } catch(e: Exception) {
      testContext.assertEquals(cause, e)
    }
    async.complete()
  }

  @Test
  fun testReadStreamToChannel(testContext: TestContext) {
    val stream = TestStream<Int>()
    val capacity = 3;
    val expected = LinkedList<Int>()
    for (i in 0 until capacity) {
      expected.add(i);
    }
    val readStream : ReadStream<Int> = stream;
    val channel = toChannel(vertx, readStream, capacity)
    for (i in expected) {
      testContext.assertFalse(stream.writeQueueFull())
      stream.write(i)
    }
    assertTrue(stream.writeQueueFull());
    val list = LinkedList<Int>()
    vertx.runCoroutine {
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
    vertx.runCoroutine {
      var count = -1
      for (item in channel) {
        assertEquals(count--, item);
      }
      testContext.assertEquals(-3, count)
      ended.set(true)
    }
    testContext.assertTrue(ended.get())
  }

  @Test
  fun testWriteStreamToChannel(testContext: TestContext) {
    val stream = TestStream<Int>()
    val capacity = 3;
    val expected = LinkedList<Int>()
    for (i in 0 until capacity) {
      expected.add(i);
    }
    val writeStream : WriteStream<Int> = stream;
    val channel = toChannel(vertx, writeStream, capacity)
    val received = LinkedList<Int>()
    stream.handler { elt -> received.add(elt) }
    vertx.runCoroutine {
      for (elt in expected) {
        channel.send(elt)
        assertFalse(channel.isFull)
      }
    }
    testContext.assertEquals(expected, received)
    received.clear()
    stream.pause()
    val async = testContext.async()
    vertx.runCoroutine {
      for (elt in expected) {
        channel.send(elt)
        testContext.assertFalse(channel.isFull)
      }
      channel.send(capacity) // Need an extra element for the inflight
      testContext.assertTrue(channel.isFull)
    }
    testContext.assertEquals(emptyList<Int>(), received)
    stream.resume()
    testContext.assertEquals(listOf(0, 1, 2, 3), received)
    vertx.runCoroutine {
      channel.send(4)
    }
    testContext.assertEquals(listOf(0, 1, 2, 3, 4), received)
    testContext.assertFalse(stream.isEnded)
    channel.close()
    testContext.assertTrue(stream.isEnded)
    async.complete()
  }

  @Test
  fun testHandlerAdaptor(testContext: TestContext) {
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
    vertx.runCoroutine {
      for (i in 0..9) {
        val received1 = adaptor1.receive()
        Assert.assertEquals("wibble", received1.body())
        val received2 = adaptor2.receive()
        Assert.assertEquals("flibble", received2.body())
      }

      val end = System.currentTimeMillis()
      Assert.assertTrue(end - start >= 100)

      // Try a receive with timeout
      var received1: Message<String>? = null
      try {
        received1 = withTimeout(1000) { adaptor1.receive() }
      } catch(e: CancellationException) {
      }

      if (received1 is Message<*>) Assert.assertEquals("wibble", received1.body())
      else Assert.fail("received1 cast type failed.")

      // And timing out
      val adaptor3 = vertx.receiveChannelHandler<Message<String>>()
      eb.consumer<String>(ADDRESS3).handler(adaptor3)
      try {
        withTimeout(100) { adaptor3.receive() }
        testContext.fail()
      } catch(e: CancellationException) {
        async.complete()
      }
    }
  }
}
