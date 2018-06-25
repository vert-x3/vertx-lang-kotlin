package io.vertx.kotlin.mqtt

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttEndpoint
import io.vertx.mqtt.MqttServer

suspend fun MqttServer.listenAwait(port : Int, host : String) : MqttServer {
    return awaitResult{
        this.listen(port, host, it)
    }
}

suspend fun MqttServer.listenAwait(port : Int) : MqttServer {
    return awaitResult{
        this.listen(port, it)
    }
}

suspend fun MqttServer.listenAwait() : MqttServer {
    return awaitResult{
        this.listen(it)
    }
}

suspend fun MqttServer.endpointHandlerAwait() : MqttEndpoint {
    return awaitEvent{
        this.endpointHandler(it)
    }
}

suspend fun MqttServer.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun MqttServer.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

