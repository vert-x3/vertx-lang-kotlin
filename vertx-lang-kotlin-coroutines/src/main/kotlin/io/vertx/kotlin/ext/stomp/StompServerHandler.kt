package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.Acknowledgement
import io.vertx.ext.stomp.ServerFrame
import io.vertx.ext.stomp.StompServerConnection
import io.vertx.ext.stomp.StompServerHandler
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun StompServerHandler.receivedFrameHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.receivedFrameHandler(it)
    }
}

suspend fun StompServerHandler.connectHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.connectHandler(it)
    }
}

suspend fun StompServerHandler.stompHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.stompHandler(it)
    }
}

suspend fun StompServerHandler.subscribeHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.subscribeHandler(it)
    }
}

suspend fun StompServerHandler.unsubscribeHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.unsubscribeHandler(it)
    }
}

suspend fun StompServerHandler.sendHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.sendHandler(it)
    }
}

suspend fun StompServerHandler.closeHandlerAwait() : StompServerConnection {
    return awaitEvent{
        this.closeHandler(it)
    }
}

suspend fun StompServerHandler.commitHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.commitHandler(it)
    }
}

suspend fun StompServerHandler.abortHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.abortHandler(it)
    }
}

suspend fun StompServerHandler.beginHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.beginHandler(it)
    }
}

suspend fun StompServerHandler.disconnectHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.disconnectHandler(it)
    }
}

suspend fun StompServerHandler.ackHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.ackHandler(it)
    }
}

suspend fun StompServerHandler.nackHandlerAwait() : ServerFrame {
    return awaitEvent{
        this.nackHandler(it)
    }
}

suspend fun StompServerHandler.onAuthenticationRequestAwait(connection : StompServerConnection, login : String, passcode : String) : Boolean {
    return awaitResult{
        this.onAuthenticationRequest(connection, login, passcode, it)
    }
}

suspend fun StompServerHandler.onAckHandlerAwait() : Acknowledgement {
    return awaitEvent{
        this.onAckHandler(it)
    }
}

suspend fun StompServerHandler.onNackHandlerAwait() : Acknowledgement {
    return awaitEvent{
        this.onNackHandler(it)
    }
}

suspend fun StompServerHandler.pingHandlerAwait() : StompServerConnection {
    return awaitEvent{
        this.pingHandler(it)
    }
}

