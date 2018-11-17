package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.streams.ReadStream
import io.vertx.core.streams.WriteStream
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.RunTestOnContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import io.vertx.test.fakestream.FakeStream
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeout
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.test.assertFalse

/**
 * @author <a href="http://www.streamis.me">Stream Liu</a>
 */
@RunWith(VertxUnitRunner::class)
class ReceiveChannelHandlerTest {
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
  fun `test toChannel extension on ReadStream using channel iterator`(testContext: TestContext) {
    val stream = FakeStream<Int>()
    val numItems = 3
    val expected = List(numItems) { it }
    val channel = (stream as ReadStream<Int>).toChannel(vertx)

    runBlocking {
      launch {
        expected.forEach {
          testContext.assertEquals(it > 0, stream.isPaused)
          stream.write(it)
        }
      }
    }

    Assert.assertTrue(stream.isPaused)
    val list = mutableListOf<Int>()
    runBlocking {
      for (item in channel) {
        list.add(item)
        val demand = stream.demand()
        testContext.assertEquals(
          if (item == 2) 1L else 0L,
          demand)
        if (list.size == expected.size) {
          break
        }
      }
    }
    Assert.assertEquals(expected, list)
    stream.write(-1)
    stream.write(-2)
    stream.end()
    var ended = false
    runBlocking {
      var count = -1
      for (item in channel) {
        Assert.assertEquals(count--, item)
      }
      testContext.assertEquals(-3, count)
      ended = true
    }
    testContext.assertTrue(ended)
  }

  @Test
  fun `test toChannel extension on ReadStream using channel receive`(testContext: TestContext) {
    val stream = FakeStream<Int>()
    val numItems = 3
    val expected = List(numItems) { it }
    val channel = (stream as ReadStream<Int>).toChannel(vertx)

    runBlocking {
      launch {
        expected.forEach {
          testContext.assertEquals(it > 0, stream.isPaused)
          stream.write(it)
        }
      }
    }

    Assert.assertTrue(stream.isPaused)
    val list = mutableListOf<Int>()
    runBlocking {
      expected.forEach {
        val item = channel.receive()
        list.add(item)
        val demand = stream.demand()
        testContext.assertEquals(
          if (item == 2) 1L else 0L,
          demand
        )
      }
      testContext.assertEquals(list.size, expected.size)
    }
    Assert.assertEquals(expected, list)
    stream.write(-1)
    stream.write(-2)
    runBlocking {
      var count = -1
      while (!channel.isEmpty) {
        val item = channel.receive()
        Assert.assertEquals(count--, item)
      }
      testContext.assertEquals(-3, count)
    }
    stream.end()
    testContext.assertTrue(channel.isClosedForReceive)
  }

  @Test
  fun `test toChannel extension on WriteStream`(testContext: TestContext) {
    val stream = TestStream<Int>()
    val capacity = 3
    val expected = List(capacity) { it }
    val channel = (stream as WriteStream<Int>).toChannel(vertx, capacity)
    val received = mutableListOf<Int>()

    stream.handler { elt -> received.add(elt) }
    runBlocking {
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
    vertx.setPeriodic(10) {
      eb.send(ADDRESS1, "wibble")
      eb.send(ADDRESS2, "flibble")
    }
    GlobalScope.launch(vertx.dispatcher()) {
      for (i in 0..9) {
        val received1 = adaptor1.receive()
        testContext.assertEquals("wibble", received1.body())
        val received2 = adaptor2.receive()
        testContext.assertEquals("flibble", received2.body())
      }

      val end = System.currentTimeMillis()
      testContext.assertTrue(end - start >= 100)

      // Try a receive with timeout
      var received1: Message<String>? = null
      try {
        received1 = withTimeout(1000) { adaptor1.receive() }
      } catch (e: CancellationException) {
      }

      if (received1 is Message<*>) Assert.assertEquals("wibble", received1.body())
      else testContext.fail("received1 cast type failed.")

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
}
