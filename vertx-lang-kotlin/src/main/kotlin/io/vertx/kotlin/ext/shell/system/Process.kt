package io.vertx.kotlin.ext.shell.system

import io.vertx.ext.shell.system.Process
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun Process.terminatedHandlerAwait() : Int {
    return awaitEvent{
        this.terminatedHandler(it)
    }
}

suspend fun Process.resumeAwait() : Unit {
    return awaitEvent{
        this.resume({ v -> it.handle(null) })}
}

suspend fun Process.resumeAwait(foreground : Boolean) : Unit {
    return awaitEvent{
        this.resume(foreground, { v -> it.handle(null) })}
}

suspend fun Process.suspendAwait() : Unit {
    return awaitEvent{
        this.suspend({ v -> it.handle(null) })}
}

suspend fun Process.terminateAwait() : Unit {
    return awaitEvent{
        this.terminate({ v -> it.handle(null) })}
}

suspend fun Process.toBackgroundAwait() : Unit {
    return awaitEvent{
        this.toBackground({ v -> it.handle(null) })}
}

suspend fun Process.toForegroundAwait() : Unit {
    return awaitEvent{
        this.toForeground({ v -> it.handle(null) })}
}

