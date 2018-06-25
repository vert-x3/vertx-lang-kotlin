package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.CommandProcess
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun CommandProcess.stdinHandlerAwait() : String {
    return awaitEvent{
        this.stdinHandler(it)
    }
}

suspend fun CommandProcess.interruptHandlerAwait() : Unit {
    return awaitEvent{
        this.interruptHandler({ v -> it.handle(null) })}
}

suspend fun CommandProcess.suspendHandlerAwait() : Unit {
    return awaitEvent{
        this.suspendHandler({ v -> it.handle(null) })}
}

suspend fun CommandProcess.resumeHandlerAwait() : Unit {
    return awaitEvent{
        this.resumeHandler({ v -> it.handle(null) })}
}

suspend fun CommandProcess.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun CommandProcess.backgroundHandlerAwait() : Unit {
    return awaitEvent{
        this.backgroundHandler({ v -> it.handle(null) })}
}

suspend fun CommandProcess.foregroundHandlerAwait() : Unit {
    return awaitEvent{
        this.foregroundHandler({ v -> it.handle(null) })}
}

suspend fun CommandProcess.resizehandlerAwait() : Unit {
    return awaitEvent{
        this.resizehandler({ v -> it.handle(null) })}
}

