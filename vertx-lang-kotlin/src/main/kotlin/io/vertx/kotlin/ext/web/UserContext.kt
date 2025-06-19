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
package io.vertx.kotlin.ext.web

import io.vertx.ext.web.UserContext
import io.vertx.kotlin.coroutines.awaitResult

@Deprecated(message = "Instead use impersonate returning a future and chain with coAwait()", replaceWith = ReplaceWith("impersonate().coAwait()"))
suspend fun UserContext.impersonateAwait(): Unit {
  return awaitResult {
    this.impersonate(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use impersonate returning a future and chain with coAwait()", replaceWith = ReplaceWith("impersonate(redirectUri).coAwait()"))
suspend fun UserContext.impersonateAwait(redirectUri: String): Unit {
  return awaitResult {
    this.impersonate(redirectUri, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use restore returning a future and chain with coAwait()", replaceWith = ReplaceWith("restore().coAwait()"))
suspend fun UserContext.restoreAwait(): Unit {
  return awaitResult {
    this.restore(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use restore returning a future and chain with coAwait()", replaceWith = ReplaceWith("restore(redirectUri).coAwait()"))
suspend fun UserContext.restoreAwait(redirectUri: String): Unit {
  return awaitResult {
    this.restore(redirectUri, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use logout returning a future and chain with coAwait()", replaceWith = ReplaceWith("logout(redirectUri).coAwait()"))
suspend fun UserContext.logoutAwait(redirectUri: String): Unit {
  return awaitResult {
    this.logout(redirectUri, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use logout returning a future and chain with coAwait()", replaceWith = ReplaceWith("logout().coAwait()"))
suspend fun UserContext.logoutAwait(): Unit {
  return awaitResult {
    this.logout(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

