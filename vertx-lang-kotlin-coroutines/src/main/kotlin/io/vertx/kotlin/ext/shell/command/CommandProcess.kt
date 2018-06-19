package io.vertx.kotlin.ext.shell.command

import io.vertx.ext.shell.command.CommandProcess
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun CommandProcess.stdinHandlerAwait() : String? {
    return awaitEvent{
        this.stdinHandler(it)
    }
}

suspend fun CommandProcess.interruptHandlerAwait() : Void? {
    return awaitEvent{
        this.interruptHandler(it)
    }
}

suspend fun CommandProcess.suspendHandlerAwait() : Void? {
    return awaitEvent{
        this.suspendHandler(it)
    }
}

suspend fun CommandProcess.resumeHandlerAwait() : Void? {
    return awaitEvent{
        this.resumeHandler(it)
    }
}

suspend fun CommandProcess.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun CommandProcess.backgroundHandlerAwait() : Void? {
    return awaitEvent{
        this.backgroundHandler(it)
    }
}

suspend fun CommandProcess.foregroundHandlerAwait() : Void? {
    return awaitEvent{
        this.foregroundHandler(it)
    }
}

suspend fun CommandProcess.resizehandlerAwait() : Void? {
    return awaitEvent{
        this.resizehandler(it)
    }
}

