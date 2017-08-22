package io.vertx.kotlin.coroutines

import io.reactivex.Flowable
import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.junit.VertxUnitRunner
import io.vertx.reactivex.core.Vertx
import kotlinx.coroutines.experimental.reactive.open
import kotlinx.coroutines.experimental.rx2.await
import kotlinx.coroutines.experimental.rx2.rxSingle
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner::class)
class RxTest {

  private lateinit var vertx: Vertx

  @Before
  fun before() {
    vertx = Vertx.vertx()
  }

  @After
  fun after() {
    vertx.close()
  }

  @Test
  fun testFlowable(testContext: TestContext) {
    val async = testContext.async()
    val source = vertx.eventBus().consumer<Long>("the-address").toFlowable()
    vertx.delegate.runCoroutine {
      source.open().use { channel ->
        var cnt = 0
        for (x in channel) {
          testContext.assertEquals(x.body(), cnt)
          if (++cnt >= 3) {
            break
          }
        }
        async.complete()
      }
    }
    for (i in 0..4) {
      vertx.eventBus().send("the-address", i)
    }
  }

  @Test
  fun testAwait(testContext: TestContext) {
    val async = testContext.async()
    val single = vertx.createHttpServer().requestHandler({ req -> req.response().end("hello") }).rxListen(8080)
    vertx.delegate.runCoroutine {
      val server = single.await()
      server.rxClose().await()
      async.complete()
    }
  }
}
