package io.vertx.kotlin.amqpbridge

import io.vertx.amqpbridge.AmqpBridge
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun AmqpBridge.startAwait(hostname : String, port : Int, username : String, password : String) : AmqpBridge? {
    return awaitResult{
        this.start(hostname, port, username, password, it)
    }
}

suspend fun AmqpBridge.startAwait(hostname : String, port : Int) : AmqpBridge? {
    return awaitResult{
        this.start(hostname, port, it)
    }
}

suspend fun AmqpBridge.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

suspend fun AmqpBridge.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

