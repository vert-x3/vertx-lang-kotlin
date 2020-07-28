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
package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.get]
 *
 * @param cookieValue the unique ID of the session
 * @return [Session?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use get returning a future that can yield a result ", replaceWith = ReplaceWith("get(cookieValue).await()"))
suspend fun SessionStore.getAwait(cookieValue: String): Session? {
  return awaitResult {
    this.get(cookieValue, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.delete]
 *
 * @param id the session id
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use delete returning a future that can yield a result ", replaceWith = ReplaceWith("delete(id).await()"))
suspend fun SessionStore.deleteAwait(id: String): Unit {
  return awaitResult {
    this.delete(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.put]
 *
 * @param session the session
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use put returning a future that can yield a result ", replaceWith = ReplaceWith("put(session).await()"))
suspend fun SessionStore.putAwait(session: Session): Unit {
  return awaitResult {
    this.put(session, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.clear]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use clear returning a future that can yield a result ", replaceWith = ReplaceWith("clear().await()"))
suspend fun SessionStore.clearAwait(): Unit {
  return awaitResult {
    this.clear(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.size]
 *
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use size returning a future that can yield a result ", replaceWith = ReplaceWith("size().await()"))
suspend fun SessionStore.sizeAwait(): Int {
  return awaitResult {
    this.size(it)
  }
}

