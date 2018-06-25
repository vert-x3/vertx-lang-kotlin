package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttClient
import io.vertx.mqtt.messages.MqttConnAckMessage
import io.vertx.mqtt.messages.MqttPublishMessage
import io.vertx.mqtt.messages.MqttSubAckMessage

suspend fun MqttClient.connectAwait(port : Int, host : String) : MqttConnAckMessage {
    return awaitResult{
        this.connect(port, host, it)
    }
}

suspend fun MqttClient.connectAwait(port : Int, host : String, serverName : String) : MqttConnAckMessage {
    return awaitResult{
        this.connect(port, host, serverName, it)
    }
}

suspend fun MqttClient.disconnectAwait() : Unit {
    return awaitResult{
        this.disconnect({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun MqttClient.publishAwait(topic : String, payload : Buffer, qosLevel : MqttQoS, isDup : Boolean, isRetain : Boolean) : Int {
    return awaitResult{
        this.publish(topic, payload, qosLevel, isDup, isRetain, it)
    }
}

suspend fun MqttClient.publishCompletionHandlerAwait() : Int {
    return awaitEvent{
        this.publishCompletionHandler(it)
    }
}

suspend fun MqttClient.publishHandlerAwait() : MqttPublishMessage {
    return awaitEvent{
        this.publishHandler(it)
    }
}

suspend fun MqttClient.subscribeCompletionHandlerAwait() : MqttSubAckMessage {
    return awaitEvent{
        this.subscribeCompletionHandler(it)
    }
}

suspend fun MqttClient.subscribeAwait(topic : String, qos : Int) : Int {
    return awaitResult{
        this.subscribe(topic, qos, it)
    }
}

suspend fun MqttClient.subscribeAwait(topics : Map<String,Int>) : Int {
    return awaitResult{
        this.subscribe(topics, it)
    }
}

suspend fun MqttClient.unsubscribeCompletionHandlerAwait() : Int {
    return awaitEvent{
        this.unsubscribeCompletionHandler(it)
    }
}

suspend fun MqttClient.unsubscribeAwait(topic : String) : Int {
    return awaitResult{
        this.unsubscribe(topic, it)
    }
}

suspend fun MqttClient.pingResponseHandlerAwait() : Unit {
    return awaitEvent{
        this.pingResponseHandler({ v -> it.handle(null) })}
}

suspend fun MqttClient.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun MqttClient.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

