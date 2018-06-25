package io.vertx.kotlin.amqpbridge

import io.vertx.amqpbridge.AmqpBridge
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AmqpBridge.startAwait(hostname : String, port : Int, username : String, password : String) : AmqpBridge {
    return awaitResult{
        this.start(hostname, port, username, password, it)
    }
}

suspend fun AmqpBridge.startAwait(hostname : String, port : Int) : AmqpBridge {
    return awaitResult{
        this.start(hostname, port, it)
    }
}

suspend fun AmqpBridge.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AmqpBridge.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

