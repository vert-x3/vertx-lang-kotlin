/*
 * Copyright 2023 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.coroutines

import io.vertx.core.Future
import io.vertx.core.Handler
import io.vertx.core.Vertx
import io.vertx.core.http.HttpMethod
import io.vertx.core.http.HttpServerRequest
import io.vertx.core.impl.ContextInternal
import io.vertx.ext.web.AllowForwardHeaders
import io.vertx.ext.web.Route
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import java.util.function.Function
import kotlin.coroutines.CoroutineContext


/**
 * A Vert.x Web [Router] that provides support for suspending functions.
 *
 * This router implements [CoroutineScope] to define a scope for new coroutines.
 * Typically, this is the scope of [CoroutineVerticle].
 *
 * @param vertx the Vert.x instance
 * @param scope the scope for new coroutines
 */
class CoroutineRouter(
  vertx: Vertx,
  scope: CoroutineScope
) : Router, CoroutineScope by scope {

  private val router = Router.router(vertx)

  override fun route(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.route(path), coroutineContext)
  }

  override fun handle(event: HttpServerRequest?) {
    router.handle(event)
  }

  override fun putMetadata(key: String?, value: Any?): CoroutineRouter {
    router.putMetadata(key, value)
    return this
  }

  override fun metadata(): MutableMap<String, Any> {
    return router.metadata()
  }

  override fun route(): CoroutineRoute {
    return CoroutineRouteImpl(router.route(), coroutineContext)
  }

  override fun route(method: HttpMethod, path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.route(method, path), coroutineContext)
  }

  override fun routeWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.routeWithRegex(regex), coroutineContext)
  }

  override fun routeWithRegex(method: HttpMethod, regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.routeWithRegex(method, regex), coroutineContext)
  }

  override fun get(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.get(path), coroutineContext)
  }

  override fun get(): CoroutineRoute {
    return CoroutineRouteImpl(router.get(), coroutineContext)
  }

  override fun getWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.getWithRegex(regex), coroutineContext)
  }

  override fun head(): CoroutineRoute {
    return CoroutineRouteImpl(router.head(), coroutineContext)
  }

  override fun head(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.head(path), coroutineContext)
  }

  override fun headWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.headWithRegex(regex), coroutineContext)
  }

  override fun options(): CoroutineRoute {
    return CoroutineRouteImpl(router.options(), coroutineContext)
  }

  override fun options(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.options(path), coroutineContext)
  }

  override fun optionsWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.optionsWithRegex(regex), coroutineContext)
  }

  override fun put(): CoroutineRoute {
    return CoroutineRouteImpl(router.put(), coroutineContext)
  }

  override fun put(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.put(path), coroutineContext)
  }

  override fun putWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.putWithRegex(regex), coroutineContext)
  }

  override fun post(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.post(path), coroutineContext)
  }

  override fun post(): CoroutineRoute {
    return CoroutineRouteImpl(router.post(), coroutineContext)
  }

  override fun postWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.postWithRegex(regex), coroutineContext)
  }

  override fun delete(): CoroutineRoute {
    return CoroutineRouteImpl(router.delete(), coroutineContext)
  }

  override fun delete(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.delete(path), coroutineContext)
  }

  override fun deleteWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.deleteWithRegex(regex), coroutineContext)
  }

  override fun trace(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.trace(path), coroutineContext)
  }

  override fun trace(): CoroutineRoute {
    return CoroutineRouteImpl(router.trace(), coroutineContext)
  }

  override fun traceWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.traceWithRegex(regex), coroutineContext)
  }

  override fun connect(): CoroutineRoute {
    return CoroutineRouteImpl(router.connect(), coroutineContext)
  }

  override fun connect(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.connect(path), coroutineContext)
  }

  override fun connectWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.connectWithRegex(regex), coroutineContext)
  }

  override fun patch(path: String): CoroutineRoute {
    return CoroutineRouteImpl(router.patch(path), coroutineContext)
  }

  override fun patch(): CoroutineRoute {
    return CoroutineRouteImpl(router.patch(), coroutineContext)
  }

  override fun patchWithRegex(regex: String): CoroutineRoute {
    return CoroutineRouteImpl(router.patchWithRegex(regex), coroutineContext)
  }

  override fun getRoutes(): MutableList<Route> {
    return router.routes
  }

  override fun clear(): CoroutineRouter {
    router.clear()
    return this
  }

  override fun errorHandler(statusCode: Int, errorHandler: Handler<RoutingContext>?): CoroutineRouter {
    router.errorHandler(statusCode, errorHandler)
    return this
  }

  /**
   * Similar to [Router.errorHandler] but using a suspended [errorHandler].
   */
  fun coErrorHandler(statusCode: Int, errorHandler: CoroutineRouteHandler): CoroutineRouter {
    router.errorHandler(statusCode) {
      launch { errorHandler.handle(it) }
    }
    return this
  }

  override fun handleContext(context: RoutingContext?) {
    router.handleContext(context)
  }

  override fun handleFailure(context: RoutingContext?) {
    router.handleFailure(context)
  }

  override fun modifiedHandler(handler: Handler<Router>?): CoroutineRouter {
    router.modifiedHandler(handler)
    return this
  }

  override fun allowForward(allowForwardHeaders: AllowForwardHeaders?): CoroutineRouter {
    router.allowForward(allowForwardHeaders)
    return this
  }
}

/**
 * A Vert.x Web [Route] that provides support for suspending functions.
 *
 * @see [coHandler]
 * @see [coFailureHandler]
 * @see [coRespond]
 */
sealed interface CoroutineRoute : Route, CoroutineScope {

  override fun handler(requestHandler: Handler<RoutingContext>?): CoroutineRoute

  /**
   * Similar to [Route.handler] but using a suspended [requestHandler].
   */
  fun coHandler(requestHandler: CoroutineRouteHandler): CoroutineRoute

  override fun failureHandler(failureHandler: Handler<RoutingContext>?): CoroutineRoute

  /**
   * Similar to [Route.failureHandler] but using a suspended [failureHandler].
   */
  fun coFailureHandler(failureHandler: CoroutineRouteHandler): CoroutineRoute

  override fun putMetadata(key: String?, value: Any?): CoroutineRoute

  override fun method(method: HttpMethod?): CoroutineRoute

  override fun path(path: String?): CoroutineRoute

  override fun pathRegex(path: String?): CoroutineRoute

  override fun produces(contentType: String?): CoroutineRoute

  override fun consumes(contentType: String?): CoroutineRoute

  override fun virtualHost(hostnamePattern: String?): CoroutineRoute

  override fun order(order: Int): CoroutineRoute

  override fun last(): CoroutineRoute

  override fun blockingHandler(requestHandler: Handler<RoutingContext>?): CoroutineRoute

  override fun blockingHandler(requestHandler: Handler<RoutingContext>?, ordered: Boolean): CoroutineRoute

  override fun subRouter(subRouter: Router?): CoroutineRoute

  override fun remove(): CoroutineRoute

  override fun disable(): CoroutineRoute

  override fun enable(): CoroutineRoute

  override fun useNormalizedPath(useNormalizedPath: Boolean): CoroutineRoute

  override fun setRegexGroupsNames(groups: MutableList<String>?): CoroutineRoute

  override fun setName(name: String?): CoroutineRoute

  override fun <T : Any?> respond(function: Function<RoutingContext, Future<T>>): CoroutineRoute

  /**
   * Similar to [Route.respond] but using a suspended [function].
   */
  fun <T : Any?> coRespond(function: CoroutineRouteFunction<T>): CoroutineRoute
}

private class CoroutineRouteImpl(
  private val route: Route,
  override val coroutineContext: CoroutineContext
) : CoroutineRoute {

  override fun handler(requestHandler: Handler<RoutingContext>?): CoroutineRoute {
    route.handler(requestHandler)
    return this
  }

  override fun coHandler(requestHandler: CoroutineRouteHandler): CoroutineRoute {
    route.handler {
      launch { requestHandler.handle(it) }
    }
    return this
  }

  override fun failureHandler(failureHandler: Handler<RoutingContext>?): CoroutineRoute {
    route.failureHandler(failureHandler)
    return this
  }

  override fun coFailureHandler(failureHandler: CoroutineRouteHandler): CoroutineRoute {
    route.failureHandler {
      launch { failureHandler.handle(it) }
    }
    return this
  }

  override fun putMetadata(key: String?, value: Any?): CoroutineRoute {
    route.putMetadata(key, value)
    return this
  }

  override fun method(method: HttpMethod?): CoroutineRoute {
    route.method(method)
    return this
  }

  override fun path(path: String?): CoroutineRoute {
    route.path(path)
    return this
  }

  override fun pathRegex(path: String?): CoroutineRoute {
    route.pathRegex(path)
    return this
  }

  override fun produces(contentType: String?): CoroutineRoute {
    route.produces(contentType)
    return this
  }

  override fun consumes(contentType: String?): CoroutineRoute {
    route.consumes(contentType)
    return this
  }

  override fun virtualHost(hostnamePattern: String?): CoroutineRoute {
    route.virtualHost(hostnamePattern)
    return this
  }

  override fun order(order: Int): CoroutineRoute {
    route.order(order)
    return this
  }

  override fun last(): CoroutineRoute {
    route.last()
    return this
  }

  override fun blockingHandler(requestHandler: Handler<RoutingContext>?): CoroutineRoute {
    route.blockingHandler(requestHandler)
    return this
  }

  override fun blockingHandler(requestHandler: Handler<RoutingContext>?, ordered: Boolean): CoroutineRoute {
    route.blockingHandler(requestHandler, ordered)
    return this
  }

  override fun subRouter(subRouter: Router?): CoroutineRoute {
    route.subRouter(subRouter)
    return this
  }

  override fun remove(): CoroutineRoute {
    route.remove()
    return this
  }

  override fun disable(): CoroutineRoute {
    route.disable()
    return this
  }

  override fun enable(): CoroutineRoute {
    route.enable()
    return this
  }

  override fun useNormalizedPath(useNormalizedPath: Boolean): CoroutineRoute {
    route.useNormalizedPath(useNormalizedPath)
    return this
  }

  override fun setRegexGroupsNames(groups: MutableList<String>?): CoroutineRoute {
    route.setRegexGroupsNames(groups)
    return this
  }

  override fun setName(name: String?): CoroutineRoute {
    route.setName(name)
    return this
  }

  override fun <T> respond(function: Function<RoutingContext, Future<T>>): CoroutineRoute {
    route.respond(function)
    return this
  }

  override fun <T> coRespond(function: CoroutineRouteFunction<T>): CoroutineRoute {
    route.respond { rc ->
      val ctx = rc.vertx().getOrCreateContext() as ContextInternal
      val promise = ctx.promise<T>()
      launch {
        try {
          promise.tryComplete(function.apply(rc))
        } catch (ex: Exception) {
          promise.tryFail(ex)
        }
      }
      promise.future()
    }
    return this
  }

  override fun metadata(): MutableMap<String, Any> {
    return route.metadata()
  }

  override fun getPath(): String {
    return route.path
  }

  override fun isRegexPath(): Boolean {
    return route.isRegexPath
  }

  override fun isExactPath(): Boolean {
    return route.isExactPath
  }

  override fun methods(): MutableSet<HttpMethod> {
    return route.methods()
  }

  override fun getName(): String {
    return route.name
  }
}

/**
 * A suspending Vert.x Web [CoroutineRoute] handler.
 */
fun interface CoroutineRouteHandler {
  suspend fun handle(rc: RoutingContext)
}

/**
 * A suspending Vert.x Web [CoroutineRoute.respond] function.
 */
fun interface CoroutineRouteFunction<T> {
  suspend fun apply(rc: RoutingContext): T
}
