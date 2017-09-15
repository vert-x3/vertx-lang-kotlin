package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.core.eventbus.Message
import io.vertx.core.eventbus.ReplyException
import io.vertx.core.eventbus.ReplyFailure
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import kotlinx.coroutines.experimental.launch
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.util.*

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner::class)
class EventBusTest {

  private lateinit var vertx: Vertx

  @Before
  fun before() {
    vertx = Vertx.vertx()
  }

  @After
  fun after(testContext: TestContext) {
    vertx.close(testContext.asyncAssertSuccess())
  }

  @Test
  fun testUnregister(testContext: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = consumer.bodyStream().toChannel(vertx)
    val async = testContext.async()
    val list = Collections.synchronizedList(ArrayList<Int>())
    launch(vertx.dispatcher()) {
      for (msg in channel) {
        list += msg
      }
      testContext.assertEquals(listOf(0, 1, 2, 3, 4), list)
      async.complete()
    }
    for (index in listOf(0, 1, 2, 3, 4)) {
      bus.send("the-address", index)
    }
    vertx.setPeriodic(50) { id ->
      if (list.size == 5) {
        consumer.unregister()
        vertx.cancelTimer(id)
      }
    }
  }

  @Test
  fun testUnregister2(testCtx: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = consumer.bodyStream().toChannel(vertx)
    val async = testCtx.async()

    launch(vertx.dispatcher()) {
      val list = mutableListOf<Int>()

      println("Processing messages in channel...")
      for (msg in channel) list += msg
      println("List: $list")
      testCtx.assertEquals(listOf(0, 1, 2, 3, 4), list)
    }
    (0..4).forEachIndexed { index, _ ->
      bus.send("the-address", index)
    }
    vertx.setTimer(50L) {
      consumer.unregister()
      println("Unregistered consumer.")
    }
    async.complete()
    println(Thread.currentThread())
    Thread.sleep(1000)
    if (consumer.isRegistered) testCtx.fail("Consumer didn't get unregistered.")
  }

  @Test
  fun testReply(testContext: TestContext) {
    val bus = vertx.eventBus()
    val consumer = bus.consumer<Int>("the-address")
    val channel = consumer.bodyStream().toChannel(vertx)
    val async = testContext.async()
    bus.consumer<Int>("another-address") { msg ->
      val v = msg.body()
      if (v < 5) {
        println("replying")
        msg.reply(4)
      } else {
        println("ending")
        msg.reply(null)
      }
    }
    launch(vertx.dispatcher()) {
      var count = 0
      for (msg in channel) {
        val reply = awaitResult<Message<Int?>> {
          bus.send("another-address", msg, it);
        }
        val v = reply.body()
        if (v == null) {
          break
        } else {
          count += v
        }
      }
      async.complete()
    }
    for (index in listOf(0, 1, 2, 3, 4, 5)) {
      bus.send("the-address", index)
    }
  }

  @Test
  fun testReplyFailure(testContext: TestContext) {
    val bus = vertx.eventBus()
    val async = testContext.async()
    bus.consumer<Int>("the-address") { msg ->
      msg.fail(5, "it-failed")
    }
    launch(vertx.dispatcher()) {
      try {
        val reply = awaitResult<Message<Int?>> {
          bus.send("the-address", "the-body", it);
        }
      } catch(e: Exception) {
        testContext.assertTrue(e is ReplyException)
        val err : ReplyException = e as ReplyException
        testContext.assertEquals(5, err.failureCode())
        testContext.assertEquals(ReplyFailure.RECIPIENT_FAILURE, err.failureType())
        testContext.assertEquals("it-failed", err.message)
        async.complete()
      }
    }
  }
}
