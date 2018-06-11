package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.ServerFrame
import io.vertx.ext.stomp.StompServer
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun StompServer.listenAwait() : StompServer? {
    return awaitResult{
        this.listen(it)
    }
}

suspend fun StompServer.listenAwait(port : Int) : StompServer? {
    return awaitResult{
        this.listen(port, it)
    }
}

suspend fun StompServer.listenAwait(port : Int, host : String) : StompServer? {
    return awaitResult{
        this.listen(port, host, it)
    }
}

suspend fun StompServer.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

suspend fun StompServer.writingFrameHandlerAwait() : ServerFrame? {
    return awaitEvent{
        this.writingFrameHandler(it)
    }
}

