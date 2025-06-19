/*
 * Copyright 2019 Red Hat, Inc.
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
package io.vertx.kotlin.ext.web.handler

import io.vertx.ext.auth.User
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.SessionHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.handler.SessionHandler.flush]
 *
 * @param ctx the current context
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.SessionHandler] using Vert.x codegen.
 */
@Deprecated(message = "Instead use flush returning a future and chain with coAwait()", replaceWith = ReplaceWith("flush(ctx).coAwait()"))
suspend fun SessionHandler.flushAwait(ctx: RoutingContext): Unit {
  return awaitResult {
    this.flush(ctx, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.handler.SessionHandler.flush]
 *
 * @param ctx the current context
 * @param ignoreStatus flush regardless of response status code
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.SessionHandler] using Vert.x codegen.
 */
@Deprecated(message = "Instead use flush returning a future and chain with coAwait()", replaceWith = ReplaceWith("flush(ctx, ignoreStatus).coAwait()"))
suspend fun SessionHandler.flushAwait(ctx: RoutingContext, ignoreStatus: Boolean): Unit {
  return awaitResult {
    this.flush(ctx, ignoreStatus, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.handler.SessionHandler.setUser]
 *
 * @param context the routing context
 * @param user the user
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.SessionHandler] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setUser returning a future and chain with coAwait()", replaceWith = ReplaceWith("setUser(context, user).coAwait()"))
suspend fun SessionHandler.setUserAwait(context: RoutingContext, user: User): Unit {
  return awaitResult {
    this.setUser(context, user, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

