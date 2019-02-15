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
suspend fun SessionStore.deleteAwait(id: String): Unit {
  return awaitResult {
    this.delete(id) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.put]
 *
 * @param session the session
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.putAwait(session: Session): Unit {
  return awaitResult {
    this.put(session) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.clear]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.clearAwait(): Unit {
  return awaitResult {
    this.clear { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.sstore.SessionStore.size]
 *
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.sstore.SessionStore] using Vert.x codegen.
 */
suspend fun SessionStore.sizeAwait(): Int {
  return awaitResult {
    this.size(it)
  }
}

