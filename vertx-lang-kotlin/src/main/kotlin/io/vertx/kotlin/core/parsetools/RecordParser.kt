package io.vertx.kotlin.core.parsetools

import io.vertx.core.buffer.Buffer
import io.vertx.core.parsetools.RecordParser
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun RecordParser.setOutputAwait() : Buffer {
    return awaitEvent{
        this.setOutput(it)
    }
}

suspend fun RecordParser.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun RecordParser.handlerAwait() : Buffer {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun RecordParser.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

