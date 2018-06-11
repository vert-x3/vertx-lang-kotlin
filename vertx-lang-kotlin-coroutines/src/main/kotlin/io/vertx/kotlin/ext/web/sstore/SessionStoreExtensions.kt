package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun SessionStore.get(id: String): Session? = awaitResult { this.get(id, it) }

suspend fun SessionStore.delete(id: String) {
  awaitResult<Void?> { this.delete(id, it) }
}

suspend fun SessionStore.put(session: Session) {
  awaitResult<Void?> { this.put(session, it) }
}

suspend fun SessionStore.clear() {
  awaitResult<Void?> { this.clear(it) }
}

suspend fun SessionStore.size(): Int = awaitResult { this.size(it) }
