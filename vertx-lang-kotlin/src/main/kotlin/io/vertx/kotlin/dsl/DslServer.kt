package io.vertx.kotlin.dsl

import io.vertx.core.Future
import io.vertx.core.Vertx
import io.vertx.core.http.HttpServer
import io.vertx.core.http.HttpServerOptions
import io.vertx.kotlin.core.http.listenAwait
import io.vertx.kotlin.coroutines.dispatcher
import kotlinx.coroutines.CoroutineScope
import kotlin.coroutines.CoroutineContext

class DslServer(vertx: Vertx, options:HttpServerOptions?): CoroutineScope {
  /**
   * The context of this scope.
   * Context is encapsulated by the scope and used for implementation of coroutine builders that are extensions on the scope.
   * Accessing this property in general code is not recommended for any purposes except accessing [Job] instance for advanced usages.
   *
   * By convention, should contain an instance of a [job][Job] to enforce structured concurrency.
   */
  override val coroutineContext: CoroutineContext = vertx.orCreateContext.dispatcher()
  internal val httpServer: HttpServer
  internal val vertx: Vertx = vertx
  internal val masterRouter: KotlinDslRouter
  init {

    httpServer = if(options != null){
      vertx.createHttpServer(options)
    } else {
      vertx.createHttpServer()
    }

    masterRouter = KotlinDslRouter(vertx)
  }

  fun listen(x: Int): Future<HttpServer>? {
    return this.httpServer.router(masterRouter).listen(x)
  }

  suspend  fun listenAwait(x: Int): HttpServer {
    return this.httpServer.router(masterRouter).listenAwait(x)
  }


}

fun HttpServer.router(router: KotlinDslRouter): HttpServer {
  return router.mount(this)
}
