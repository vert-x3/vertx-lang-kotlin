package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.Process
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun Process.terminatedHandlerAwait() : Int {
    return awaitEvent{
        this.terminatedHandler(it)
    }
}

suspend fun Process.resumeAwait() : Void {
    return awaitEvent{
        this.resume(it)
    }
}

suspend fun Process.resumeAwait(foreground : Boolean) : Void {
    return awaitEvent{
        this.resume(foreground, it)
    }
}

suspend fun Process.suspendAwait() : Void {
    return awaitEvent{
        this.suspend(it)
    }
}

suspend fun Process.terminateAwait() : Void {
    return awaitEvent{
        this.terminate(it)
    }
}

suspend fun Process.toBackgroundAwait() : Void {
    return awaitEvent{
        this.toBackground(it)
    }
}

suspend fun Process.toForegroundAwait() : Void {
    return awaitEvent{
        this.toForeground(it)
    }
}

