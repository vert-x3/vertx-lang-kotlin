package io.vertx.kotlin.coroutines.ext.web

import io.vertx.core.Vertx
import io.vertx.core.http.HttpServer
import io.vertx.ext.unit.junit.RunTestOnContext
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.client.WebClient
import io.vertx.ext.web.client.WebClientOptions
import io.vertx.kotlin.coroutines.await
import io.vertx.kotlin.coroutines.runTest
import org.junit.Before
import org.junit.Rule
import kotlin.test.Test
import kotlin.test.assertEquals

class ExtendedWebCoroutineVerticleTest {
  @Rule
  @JvmField
  val rule = RunTestOnContext()

  private lateinit var vertx: Vertx

  @Before
  fun before() {
    vertx = rule.vertx()
  }

  companion object {
    object MethodNames {
      const val coroutineHandler = "coroutineHandler"
      const val coroutineHandlerInline = "coroutineHandlerInline"
      const val checkedCoroutineHandler = "checkedCoroutineHandler"
      const val checkedCoroutineHandlerInline = "checkedCoroutineHandlerInline"
    }
  }

  class Verticle : ExtendedWebCoroutineVerticle() {
    lateinit var httpServer: HttpServer

    override suspend fun start() {
      httpServer = vertx.createHttpServer()
        .requestHandler(Router.router(vertx).apply {
          val handler: suspend (RoutingContext) -> Unit = {
            if (it.queryParam("throws").run { size == 1 && single() == "true" })
              throw Throwable()
            it.end()
          }

          with(MethodNames) {
            get("/$coroutineHandler").coroutineHandler(handler)
            get("/$coroutineHandlerInline").coroutineHandlerInline(handler)
            get("/$checkedCoroutineHandler").checkedCoroutineHandler(handler)
            get("/$checkedCoroutineHandlerInline").checkedCoroutineHandlerInline(handler)
          }
        })
        .listen(0).await()
    }

    override suspend fun stop() {
      httpServer.close().await()
    }
  }

  @Test
  fun `test ExtendedCoroutineVerticle`() = runTest {
    val verticle = Verticle()
    val deploymentId = vertx.deployVerticle(verticle).await()

    val webClient = WebClient.create(vertx, WebClientOptions().apply { defaultPort = verticle.httpServer.actualPort() })
    suspend fun testOk(methodName: String) {
      assertEquals(200, webClient.get("/$methodName").send().await().statusCode())
    }

    suspend fun testThrowable(methodName: String) {
      testOk(methodName)
      assertEquals(500, webClient.get("/$methodName?throws=true").send().await().statusCode())
    }

    with(MethodNames) {
      listOf(coroutineHandler, coroutineHandlerInline, checkedCoroutineHandler, checkedCoroutineHandlerInline)
        .forEach { testOk(it) }
      listOf(checkedCoroutineHandler, checkedCoroutineHandlerInline).forEach { testThrowable(it) }
    }

    webClient.close()

    vertx.undeploy(deploymentId).await()
  }
}
