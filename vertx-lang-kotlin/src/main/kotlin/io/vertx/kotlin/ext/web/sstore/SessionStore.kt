package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Get the session with the specified ID.
 *
 * @param cookieValue the unique ID of the session
 * @param resultHandler will be called with a result holding the session, or a failure
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.getAwait(cookieValue : String) : Session? {
  return awaitResult{
    this.get(cookieValue, it)
  }
}

/**
 * Delete the session with the specified ID.
 *
 * @param id the session id
 * @param resultHandler will be called with a success or a failure
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.deleteAwait(id : String) : Unit {
  return awaitResult{
    this.delete(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Add a session with the specified ID.
 *
 * @param session the session
 * @param resultHandler will be called with a success or a failure
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.putAwait(session : Session) : Unit {
  return awaitResult{
    this.put(session, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Remove all sessions from the store.
 *
 * @param resultHandler will be called with a success or a failure
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.clearAwait() : Unit {
  return awaitResult{
    this.clear({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the number of sessions in the store.
 * <p>
 * Beware of the result which is just an estimate, in particular with distributed session stores.
 *
 * @param resultHandler will be called with the number, or a failure
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.sstore.SessionStore original] using Vert.x codegen.
 */
suspend fun SessionStore.sizeAwait() : Int {
  return awaitResult{
    this.size(it)
  }
}

