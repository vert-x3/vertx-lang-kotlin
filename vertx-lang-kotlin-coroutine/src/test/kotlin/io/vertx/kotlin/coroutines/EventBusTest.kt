package io.vertx.kotlin.coroutines

import io.vertx.core.Vertx
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

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
    val channel = toChannel(vertx, consumer.bodyStream())
    val async = testContext.async()
    vertx.runCoroutine {
      val list = ArrayList<Int>()
      for (msg in channel) {
        list += msg
      }
      testContext.assertEquals(listOf(0, 1, 2, 3, 4), list)
      async.complete()
    }
    for (index in listOf(0, 1, 2, 3, 4)) {
      bus.send("the-address", index)
    }
    vertx.setTimer(50) {
      consumer.unregister()
    }
  }
}
