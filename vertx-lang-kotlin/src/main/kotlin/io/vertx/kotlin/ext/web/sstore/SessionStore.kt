package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult

suspend fun SessionStore.getAwait(id : String) : Session? {
    return awaitResult{
        this.get(id, it)
    }
}

suspend fun SessionStore.deleteAwait(id : String) : Unit {
    return awaitResult{
        this.delete(id, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun SessionStore.putAwait(session : Session) : Unit {
    return awaitResult{
        this.put(session, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun SessionStore.clearAwait() : Unit {
    return awaitResult{
        this.clear({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun SessionStore.sizeAwait() : Int {
    return awaitResult{
        this.size(it)
    }
}

