package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun AsyncFile.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun AsyncFile.endHandlerAwait() : Void {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun AsyncFile.drainHandlerAwait() : Void {
    return awaitEvent{
        this.drainHandler(it)
    }
}

suspend fun AsyncFile.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun AsyncFile.closeAwait() : Void {
    return awaitResult{
        this.close(it)
    }
}

suspend fun AsyncFile.writeAwait(buffer : Buffer, position : Long) : Void {
    return awaitResult{
        this.write(buffer, position, it)
    }
}

suspend fun AsyncFile.readAwait(buffer : Buffer, offset : Int, position : Long, length : Int) : Buffer {
    return awaitResult{
        this.read(buffer, offset, position, length, it)
    }
}

suspend fun AsyncFile.flushAwait() : Void {
    return awaitResult{
        this.flush(it)
    }
}

