package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.NetSocket
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun NetSocket.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun NetSocket.handlerAwait() : Buffer? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun NetSocket.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun NetSocket.drainHandlerAwait() : Void? {
    return awaitEvent{
        this.drainHandler(it)
    }
}

suspend fun NetSocket.sendFileAwait(filename : String) : Void? {
    return awaitResult{
        this.sendFile(filename, it)
    }
}

suspend fun NetSocket.sendFileAwait(filename : String, offset : Long) : Void? {
    return awaitResult{
        this.sendFile(filename, offset, it)
    }
}

suspend fun NetSocket.sendFileAwait(filename : String, offset : Long, length : Long) : Void? {
    return awaitResult{
        this.sendFile(filename, offset, length, it)
    }
}

suspend fun NetSocket.closeHandlerAwait() : Void? {
    return awaitEvent{
        this.closeHandler(it)
    }
}

suspend fun NetSocket.upgradeToSslAwait() : Void? {
    return awaitEvent{
        this.upgradeToSsl(it)
    }
}

suspend fun NetSocket.upgradeToSslAwait(serverName : String) : Void? {
    return awaitEvent{
        this.upgradeToSsl(serverName, it)
    }
}

