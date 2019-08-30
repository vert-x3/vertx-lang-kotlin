package io.vertx.kotlin.dsl

import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.http.HttpServer
import io.vertx.ext.web.Route
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import io.vertx.kotlin.coroutines.dispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class KotlinDslRouter(vertx: Vertx): CoroutineScope {
  override val coroutineContext: CoroutineContext = vertx.orCreateContext.dispatcher()
  val router: Router = Router.router(vertx)


  protected fun Route.coroutineHandler(fn: suspend (RoutingContext) -> Unit) {
    handler { ctx ->
      //add it to this context
      launch(coroutineContext) {
        try {
          fn(ctx)
        } catch (e: Exception) {
          ctx.fail(e)
        }
      }
    }
  }

  fun post(path: String, handler: Handler<RoutingContext>) {
    this.router.post(path).handler(handler)
  }

  fun post(path: String, handler: (RoutingContext) -> Unit) {
    this.router.post(path).handler(handler)
  }
  fun postAwait(path: String, handler: suspend (RoutingContext) -> Unit) {
    this.router.post(path).coroutineHandler(handler)
  }

  fun get(path: String, handler: (RoutingContext) -> Unit){
    this.router.get(path).handler(handler)
  }
  fun get( handler: (RoutingContext) -> Unit){
    this.router.get().handler(handler)
  }

  fun getAwait( handler: suspend (RoutingContext) -> Unit){
    this.router.get().coroutineHandler(handler)
  }

  fun getAwait( path: String, handler: suspend (RoutingContext) -> Unit){
    this.router.get(path).coroutineHandler(handler)
  }

  fun put(path: String, handler: Handler<RoutingContext>) {
    this.router.put(path).handler(handler)
  }

  fun put(path: String, handler: (RoutingContext) -> Unit) {
    this.router.put(path).handler(handler)
  }
  fun putAwait(path: String, handler: suspend (RoutingContext) -> Unit) {
    this.router.put(path).coroutineHandler(handler)
  }

  fun patch(path: String, handler: Handler<RoutingContext>) {
    this.router.patch(path).handler(handler)
  }

  fun patch(path: String, handler: (RoutingContext) -> Unit) {
    this.router.patch(path).handler(handler)
  }
  fun patchAwait(path: String, handler: suspend (RoutingContext) -> Unit) {
    this.router.patch(path).coroutineHandler(handler)
  }

  fun delete(path: String, handler: Handler<RoutingContext>) {
    this.router.delete(path).handler(handler)
  }

  fun delete(path: String, handler: (RoutingContext) -> Unit) {
    this.router.delete(path).handler(handler)
  }
  fun delete(path: String, handler: suspend (RoutingContext) -> Unit) {
    this.router.delete(path).coroutineHandler(handler)
  }


  fun route(path: String, routeBuilder: (Route) -> Route): CoroutineRoute {
    val route = CoroutineRoute(this.router.route(path), this.coroutineContext)
    routeBuilder(route)
    return route
  }
  fun route(routeBuilder: (Route) -> Route): CoroutineRoute {
    val route = CoroutineRoute(this.router.route(), this.coroutineContext)
    routeBuilder(route)
    return route
  }
  suspend fun routeAwait(path: String, routeBuilder: suspend (Route) -> Route): CoroutineRoute {
    val route = CoroutineRoute(this.router.route(path), this.coroutineContext)
    routeBuilder(route)
    return route
  }
  suspend fun routeAwait(routeBuilder: suspend (Route) -> Route): CoroutineRoute {
    val route = CoroutineRoute(this.router.route(), this.coroutineContext)
    routeBuilder(route)
    return route
  }




  //DSL chaining methods
  fun mountToParentRouter(x: String, parent: Router): Unit {
    parent.mountSubRouter(x, this.router)
  }

  fun mountToParentRouter(x: String, parent: KotlinDslRouter): Unit {
    parent.router.mountSubRouter(x, this.router)
  }

  fun mount(x: HttpServer): HttpServer {
    return x.requestHandler(this.router)
  }

}

