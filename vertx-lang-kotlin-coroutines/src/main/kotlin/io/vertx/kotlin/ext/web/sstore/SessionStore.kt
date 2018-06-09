package io.vertx.kotlin.ext.web.sstore

import io.vertx.ext.web.Session
import io.vertx.ext.web.sstore.SessionStore
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun SessionStore.getAwait(id : String) : Session {
    return awaitResult{
        this.get(id, it)
    }
}

suspend fun SessionStore.deleteAwait(id : String) : Void {
    return awaitResult{
        this.delete(id, it)
    }
}

suspend fun SessionStore.putAwait(session : Session) : Void {
    return awaitResult{
        this.put(session, it)
    }
}

suspend fun SessionStore.clearAwait() : Void {
    return awaitResult{
        this.clear(it)
    }
}

suspend fun SessionStore.sizeAwait() : Int {
    return awaitResult{
        this.size(it)
    }
}

