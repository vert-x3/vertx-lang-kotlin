package io.vertx.kotlin.dsl

import io.vertx.core.Vertx
import io.vertx.core.http.HttpServerOptions


typealias RouterDeclarations = DslServer.() -> Unit

fun server(x: Vertx = Vertx.vertx(), options:HttpServerOptions? = null, routes: RouterDeclarations): DslServer {
  val server: DslServer = DslServer(x, options)
  routes(server)
  return server
}

typealias RouteDeclarations = KotlinDslRouter.() -> Unit
typealias SuspendRouteDeclaration = suspend KotlinDslRouter.() -> Unit

fun DslServer.router(routes: RouteDeclarations): Unit {
  routes(this.masterRouter)
}

suspend fun DslServer.routerAwait(routes: SuspendRouteDeclaration): Unit {
  routes(this.masterRouter)
}

fun DslServer.router(path: String, routes: RouteDeclarations): Unit {
  val r = KotlinDslRouter(this.vertx)
  routes(r)
  r.mountToParentRouter(path, this.masterRouter)

}

suspend fun DslServer.routerAwait(path: String, routes: SuspendRouteDeclaration): Unit {
  val r = KotlinDslRouter(this.vertx)
  routes(r)
  r.mountToParentRouter(path, this.masterRouter)
}
