package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerConnection
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun StompServerConnection.configureHeartbeatAwait(ping : Long, pong : Long) : StompServerConnection {
    return awaitEvent{
        this.configureHeartbeat(ping, pong, it)
    }
}

