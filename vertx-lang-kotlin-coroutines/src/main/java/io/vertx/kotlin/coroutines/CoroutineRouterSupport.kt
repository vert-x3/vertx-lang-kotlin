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

import io.vertx.core.impl.VertxInternal
import io.vertx.ext.web.Route
import io.vertx.ext.web.Router
import io.vertx.ext.web.RoutingContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Calls the specified function [block] with a [CoroutineRouterSupport] object as its receiver.
 *
 * The receiver's scope is the [CoroutineScope] of the caller.
 */
fun CoroutineScope.coroutineRouter(
  block: CoroutineRouterSupport.() -> Unit
) = with(object : CoroutineRouterSupport {
  override val coroutineContext = this@coroutineRouter.coroutineContext
}) { block() }

/**
 * Adds support for suspending functions to the Vert.x Web [Router].
 *
 * Objects of this type implement [CoroutineScope] to define a scope for new coroutines.
 * Typically, this is the scope of a [CoroutineVerticle].
 */
interface CoroutineRouterSupport : CoroutineScope {

  /**
   * Similar to [Router.errorHandler] but using a suspended [errorHandler].
   */
  fun Router.coErrorHandler(
    statusCode: Int,
    context: CoroutineContext = EmptyCoroutineContext,
    errorHandler: suspend (RoutingContext) -> Unit
  ): Router =
    errorHandler(statusCode) {
      launch(context) {
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
  fun Route.coHandler(
    context: CoroutineContext = EmptyCoroutineContext,
    requestHandler: suspend (RoutingContext) -> Unit
  ): Route = handler {
    launch(context) {
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
  fun Route.coFailureHandler(
    context: CoroutineContext = EmptyCoroutineContext,
    failureHandler: suspend (RoutingContext) -> Unit
  ): Route = failureHandler {
    launch(context) {
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
  fun <T> Route.coRespond(
    context: CoroutineContext = EmptyCoroutineContext,
    function: suspend (RoutingContext) -> T
  ): Route = respond {
    val vertx = it.vertx() as VertxInternal
    val promise = vertx.promise<T>()
    launch(context) {
      try {
        promise.complete(function.invoke(it))
      } catch (t: Throwable) {
        it.fail(t)
      }
    }
    promise.future()
  }
}
