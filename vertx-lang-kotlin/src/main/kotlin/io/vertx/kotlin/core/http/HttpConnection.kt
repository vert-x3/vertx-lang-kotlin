package io.vertx.kotlin.core.http

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.GoAway
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpConnection
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun HttpConnection.goAwayHandlerAwait() : GoAway {
    return awaitEvent{
        this.goAwayHandler(it)
    }
}

suspend fun HttpConnection.shutdownHandlerAwait() : Unit {
    return awaitEvent{
        this.shutdownHandler({ v -> it.handle(null) })}
}

suspend fun HttpConnection.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun HttpConnection.updateSettingsAwait(settings : Http2Settings) : Unit {
    return awaitResult{
        this.updateSettings(settings, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun HttpConnection.remoteSettingsHandlerAwait() : Http2Settings {
    return awaitEvent{
        this.remoteSettingsHandler(it)
    }
}

suspend fun HttpConnection.pingAwait(data : Buffer) : Buffer {
    return awaitResult{
        this.ping(data, it)
    }
}

suspend fun HttpConnection.pingHandlerAwait() : Buffer {
    return awaitEvent{
        this.pingHandler(it)
    }
}

suspend fun HttpConnection.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

