package io.vertx.kotlin.core.net

import io.vertx.core.buffer.Buffer
import io.vertx.core.net.NetSocket
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun NetSocket.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun NetSocket.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun NetSocket.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun NetSocket.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun NetSocket.sendFileAwait(filename : String) : Unit {
    return awaitResult{
        this.sendFile(filename, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun NetSocket.sendFileAwait(filename : String, offset : Long) : Unit {
    return awaitResult{
        this.sendFile(filename, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun NetSocket.sendFileAwait(filename : String, offset : Long, length : Long) : Unit {
    return awaitResult{
        this.sendFile(filename, offset, length, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun NetSocket.closeHandlerAwait() : Unit {
    return awaitEvent{
        this.closeHandler({ v -> it.handle(null) })}
}

suspend fun NetSocket.upgradeToSslAwait() : Unit {
    return awaitEvent{
        this.upgradeToSsl({ v -> it.handle(null) })}
}

suspend fun NetSocket.upgradeToSslAwait(serverName : String) : Unit {
    return awaitEvent{
        this.upgradeToSsl(serverName, { v -> it.handle(null) })}
}

