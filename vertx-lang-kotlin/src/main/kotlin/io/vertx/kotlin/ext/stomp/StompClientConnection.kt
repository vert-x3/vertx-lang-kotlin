package io.vertx.kotlin.ext.stomp

import io.vertx.core.buffer.Buffer
import io.vertx.ext.stomp.Frame
import io.vertx.ext.stomp.StompClientConnection
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun StompClientConnection.sendAwait(headers : Map<String,String>, body : Buffer) : Frame {
    return awaitEvent{
        this.send(headers, body, it)
    }
}

suspend fun StompClientConnection.sendAwait(destination : String, body : Buffer) : Frame {
    return awaitEvent{
        this.send(destination, body, it)
    }
}

suspend fun StompClientConnection.sendAwait(frame : Frame) : Frame {
    return awaitEvent{
        this.send(frame, it)
    }
}

suspend fun StompClientConnection.sendAwait(destination : String, headers : Map<String,String>, body : Buffer) : Frame {
    return awaitEvent{
        this.send(destination, headers, body, it)
    }
}

suspend fun StompClientConnection.unsubscribeAwait(destination : String) : Frame {
    return awaitEvent{
        this.unsubscribe(destination, it)
    }
}

suspend fun StompClientConnection.unsubscribeAwait(destination : String, headers : Map<String,String>) : Frame {
    return awaitEvent{
        this.unsubscribe(destination, headers, it)
    }
}

suspend fun StompClientConnection.errorHandlerAwait() : Frame {
    return awaitEvent{
        this.errorHandler(it)
    }
}

suspend fun StompClientConnection.closeHandlerAwait() : StompClientConnection {
    return awaitEvent{
        this.closeHandler(it)
    }
}

suspend fun StompClientConnection.connectionDroppedHandlerAwait() : StompClientConnection {
    return awaitEvent{
        this.connectionDroppedHandler(it)
    }
}

suspend fun StompClientConnection.pingHandlerAwait() : StompClientConnection {
    return awaitEvent{
        this.pingHandler(it)
    }
}

suspend fun StompClientConnection.beginTXAwait(id : String) : Frame {
    return awaitEvent{
        this.beginTX(id, it)
    }
}

suspend fun StompClientConnection.beginTXAwait(id : String, headers : Map<String,String>) : Frame {
    return awaitEvent{
        this.beginTX(id, headers, it)
    }
}

suspend fun StompClientConnection.commitAwait(id : String) : Frame {
    return awaitEvent{
        this.commit(id, it)
    }
}

suspend fun StompClientConnection.commitAwait(id : String, headers : Map<String,String>) : Frame {
    return awaitEvent{
        this.commit(id, headers, it)
    }
}

suspend fun StompClientConnection.abortAwait(id : String) : Frame {
    return awaitEvent{
        this.abort(id, it)
    }
}

suspend fun StompClientConnection.abortAwait(id : String, headers : Map<String,String>) : Frame {
    return awaitEvent{
        this.abort(id, headers, it)
    }
}

suspend fun StompClientConnection.disconnectAwait() : Frame {
    return awaitEvent{
        this.disconnect(it)
    }
}

suspend fun StompClientConnection.disconnectAwait(frame : Frame) : Frame {
    return awaitEvent{
        this.disconnect(frame, it)
    }
}

suspend fun StompClientConnection.ackAwait(id : String) : Frame {
    return awaitEvent{
        this.ack(id, it)
    }
}

suspend fun StompClientConnection.nackAwait(id : String) : Frame {
    return awaitEvent{
        this.nack(id, it)
    }
}

suspend fun StompClientConnection.ackAwait(id : String, txId : String) : Frame {
    return awaitEvent{
        this.ack(id, txId, it)
    }
}

suspend fun StompClientConnection.nackAwait(id : String, txId : String) : Frame {
    return awaitEvent{
        this.nack(id, txId, it)
    }
}

suspend fun StompClientConnection.receivedFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.receivedFrameHandler(it)
    }
}

suspend fun StompClientConnection.writingFrameHandlerAwait() : Frame {
    return awaitEvent{
        this.writingFrameHandler(it)
    }
}

suspend fun StompClientConnection.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

