package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

/**
 *  Get the session with the specified ID
 * @param id  the unique ID of the session */
suspend fun SessionStore.get(id: String): Session? {
  return awaitResult { this.get(id, it) }
}

/**
 *  Delete the session with the specified ID
 * @param id  the unique ID of the session */
suspend fun SessionStore.delete(id: String) {
  awaitResult<Void?> { this.delete(id, it) }
}

/**
 *  Add a session with the specified ID
 * @param session  the session */
suspend fun SessionStore.put(session: Session) {
  awaitResult<Void?> { this.put(session, it) }
}

/**
 *  Remove all sessions from the store */
suspend fun SessionStore.clear() {
  awaitResult<Void?> { this.clear(it) }
}

/**
 *  Get the number of sessions in the store */
suspend fun SessionStore.size(): Int {
  return awaitResult { this.size(it) }
}
