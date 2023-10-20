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

import io.vertx.core.Vertx
import io.vertx.core.impl.VertxInternal
import io.vertx.ext.web.Route
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

fun CoroutineScope.coroutineRouter(
  vertx: Vertx,
  block: CoroutineRouterSupport.() -> Unit
) = with(object : CoroutineRouterSupport {
  override fun getVertx() = vertx
  override val coroutineContext = this@coroutineRouter.coroutineContext
}) { block() }

/**
 * Adds support for suspending function in the Vert.x Web [Router].
 *
 * Objects of this type implement [CoroutineScope] to define a scope for new coroutines.
 * Typically, this is the scope of [CoroutineVerticle].
 */
interface CoroutineRouterSupport : CoroutineScope {

  /**
   * The [Vertx] instance related to this scope.
   */
  fun getVertx(): Vertx

  /**
   * The [CoroutineDispatcher] used to dispatch new coroutines.
   *
   * By default, this is the [Vertx.dispatcher].
   */
  fun getDispatcher(): CoroutineDispatcher = getVertx().dispatcher()

  /**
   * Similar to [Router.errorHandler] but using a suspended [errorHandler].
   */
  fun Router.coErrorHandler(statusCode: Int, errorHandler: suspend (RoutingContext) -> Unit): Router =
    errorHandler(statusCode) {
      launch(getDispatcher()) {
        try {
          errorHandler(it)
        } catch (t: Throwable) {
          it.fail(t)
        }
      }
    }

  /**
   * Similar to [Route.handler] but using a suspended [requestHandler].
   */
  fun Route.coHandler(requestHandler: suspend (RoutingContext) -> Unit): Route = handler {
    launch(getDispatcher()) {
      try {
        requestHandler(it)
      } catch (t: Throwable) {
        it.fail(t)
      }
    }
  }

  /**
   * Similar to [Route.failureHandler] but using a suspended [failureHandler].
   */
  fun Route.coFailureHandler(failureHandler: suspend (RoutingContext) -> Unit): Route = failureHandler {
    launch(getDispatcher()) {
      try {
        failureHandler(it)
      } catch (t: Throwable) {
        it.fail(t)
      }
    }
  }

  /**
   * Similar to [Route.respond] but using a suspended [function].
   */
  fun <T> Route.coRespond(function: suspend (RoutingContext) -> T): Route = respond {
    val vertx = it.vertx() as VertxInternal
    val promise = vertx.promise<T>()
    launch(getDispatcher()) {
      try {
        promise.complete(function.invoke(it))
      } catch (t: Throwable) {
        it.fail(t)
      }
    }
    promise.future()
  }
}
