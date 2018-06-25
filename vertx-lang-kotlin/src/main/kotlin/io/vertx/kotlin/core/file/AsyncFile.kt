package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AsyncFile.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun AsyncFile.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun AsyncFile.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun AsyncFile.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun AsyncFile.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AsyncFile.writeAwait(buffer : Buffer, position : Long) : Unit {
    return awaitResult{
        this.write(buffer, position, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AsyncFile.readAwait(buffer : Buffer, offset : Int, position : Long, length : Int) : Buffer {
    return awaitResult{
        this.read(buffer, offset, position, length, it)
    }
}

suspend fun AsyncFile.flushAwait() : Unit {
    return awaitResult{
        this.flush({ ar -> it.handle(ar.mapEmpty()) })}
}

