package io.vertx.kotlin.ext.web

import io.vertx.core.Vertx
import io.vertx.ext.unit.junit.RunTestOnContext
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.client.WebClient
import io.vertx.junit5.VertxTestContext
import io.vertx.kotlin.coroutines.await
import org.junit.Before
import org.junit.Rule
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/* Consider getting the vertx-web tests dependency to resolve correctly and extending WebTestBase.
See io.vertx.ext.web.impl.RoutingContextImplTest in vertx-web test for a reference. */

abstract class RoutingContextBaseTest {
  @Rule
  @JvmField
  val rule = RunTestOnContext()

  protected lateinit var vertx: Vertx

  @Before
  fun before() {
    vertx = rule.vertx()
  }

  companion object {
    const val IN_LAUNCH_CHECKED_MESSAGE = "in launchChecked"
  }

  protected suspend inline fun testChecked(crossinline failWithThrowable: RoutingContext.(Throwable) -> Unit) {
    //val mutex = Mutex()
    val testContext = VertxTestContext()
    val httpServer = vertx.createHttpServer().requestHandler(Router.router(vertx).apply {
      route().handler {
        it.failWithThrowable(Throwable(IN_LAUNCH_CHECKED_MESSAGE))
      }
        .failureHandler {
          val throwable = it.failure()
          assertTrue(throwable is Throwable && throwable.message == IN_LAUNCH_CHECKED_MESSAGE)
          testContext.completeNow()

          it.next()
        }
    }).listen(0).await()

    val port = httpServer.actualPort()
    val webClient = WebClient.create(vertx)
    assertEquals(500, webClient.get(port, "localhost", "").send().await().statusCode())
    webClient.close()
    httpServer.close().await()
  }
}
