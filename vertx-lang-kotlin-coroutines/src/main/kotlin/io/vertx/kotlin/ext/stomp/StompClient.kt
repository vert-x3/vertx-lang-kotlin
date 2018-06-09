package io.vertx.kotlin.ext.stomp

import io.vertx.core.net.NetClient
import io.vertx.ext.stomp.Frame
import io.vertx.ext.stomp.StompClient
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun StompClient.connectAwait(port : Int, host : String) : StompClientConnection {
    return awaitResult{
        this.connect(port, host, it)
    }
}

suspend fun StompClient.connectAwait(net : NetClient) : StompClientConnection {
    return awaitResult{
        this.connect(net, it)
    }
}

suspend fun StompClient.connectAwait(port : Int, host : String, net : NetClient) : StompClientConnection {
    return awaitResult{
        this.connect(port, host, net, it)
    }
}

suspend fun StompClient.connectAwait() : StompClientConnection {
    return awaitResult{
        this.connect(it)
    }
}

suspend fun StompClient.receivedFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.receivedFrameHandler(it)
    }
}

suspend fun StompClient.writingFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.writingFrameHandler(it)
    }
}

suspend fun StompClient.errorFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.errorFrameHandler(it)
    }
}

suspend fun StompClient.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

