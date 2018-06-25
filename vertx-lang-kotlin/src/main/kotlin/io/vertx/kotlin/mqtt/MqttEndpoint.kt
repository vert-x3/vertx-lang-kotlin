package io.vertx.kotlin.mqtt

import io.netty.handler.codec.mqtt.MqttQoS
import io.vertx.core.buffer.Buffer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.mqtt.MqttEndpoint
import io.vertx.mqtt.messages.MqttPublishMessage
import io.vertx.mqtt.messages.MqttSubscribeMessage
import io.vertx.mqtt.messages.MqttUnsubscribeMessage

suspend fun MqttEndpoint.disconnectHandlerAwait() : Unit {
    return awaitEvent{
        this.disconnectHandler({ v -> it.handle(null) })}
}

suspend fun MqttEndpoint.subscribeHandlerAwait() : MqttSubscribeMessage {
    return awaitEvent{
        this.subscribeHandler(it)
    }
}

suspend fun MqttEndpoint.unsubscribeHandlerAwait() : MqttUnsubscribeMessage {
    return awaitEvent{
        this.unsubscribeHandler(it)
    }
}

suspend fun MqttEndpoint.publishHandlerAwait() : MqttPublishMessage {
    return awaitEvent{
        this.publishHandler(it)
    }
}

suspend fun MqttEndpoint.publishAcknowledgeHandlerAwait() : Int {
    return awaitEvent{
        this.publishAcknowledgeHandler(it)
    }
}

suspend fun MqttEndpoint.publishReceivedHandlerAwait() : Int {
    return awaitEvent{
        this.publishReceivedHandler(it)
    }
}

suspend fun MqttEndpoint.publishReleaseHandlerAwait() : Int {
    return awaitEvent{
        this.publishReleaseHandler(it)
    }
}

suspend fun MqttEndpoint.publishCompletionHandlerAwait() : Int {
    return awaitEvent{
        this.publishCompletionHandler(it)
    }
}

suspend fun MqttEndpoint.pingHandlerAwait() : Unit {
    return awaitEvent{
        this.pingHandler({ v -> it.handle(null) })}
}

suspend fun MqttEndpoint.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun MqttEndpoint.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun MqttEndpoint.publishAwait(topic : String, payload : Buffer, qosLevel : MqttQoS, isDup : Boolean, isRetain : Boolean) : Int {
    return awaitResult{
        this.publish(topic, payload, qosLevel, isDup, isRetain, it)
    }
}

