package io.vertx.kotlin.core.net

import io.vertx.core.net.NetServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun NetServer.listenAwait() : NetServer {
    return awaitResult{
        this.listen(it)
    }
}

suspend fun NetServer.listenAwait(port : Int, host : String) : NetServer {
    return awaitResult{
        this.listen(port, host, it)
    }
}

suspend fun NetServer.listenAwait(port : Int) : NetServer {
    return awaitResult{
        this.listen(port, it)
    }
}

suspend fun NetServer.listenAwait(localAddress : SocketAddress) : NetServer {
    return awaitResult{
        this.listen(localAddress, it)
    }
}

suspend fun NetServer.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun NetServer.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

