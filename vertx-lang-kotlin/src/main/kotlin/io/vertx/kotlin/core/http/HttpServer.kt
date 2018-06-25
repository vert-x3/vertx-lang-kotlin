package io.vertx.kotlin.core.http

import io.vertx.core.http.HttpConnection
import io.vertx.core.http.HttpServer
import io.vertx.core.http.HttpServerRequest
import io.vertx.core.http.ServerWebSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun HttpServer.requestHandlerAwait() : HttpServerRequest {
    return awaitEvent{
        this.requestHandler(it)
    }
}

suspend fun HttpServer.connectionHandlerAwait() : HttpConnection {
    return awaitEvent{
        this.connectionHandler(it)
    }
}

suspend fun HttpServer.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun HttpServer.websocketHandlerAwait() : ServerWebSocket {
    return awaitEvent{
        this.websocketHandler(it)
    }
}

suspend fun HttpServer.listenAwait(port : Int, host : String) : HttpServer {
    return awaitResult{
        this.listen(port, host, it)
    }
}

suspend fun HttpServer.listenAwait(address : SocketAddress) : HttpServer {
    return awaitResult{
        this.listen(address, it)
    }
}

suspend fun HttpServer.listenAwait(port : Int) : HttpServer {
    return awaitResult{
        this.listen(port, it)
    }
}

suspend fun HttpServer.listenAwait() : HttpServer {
    return awaitResult{
        this.listen(it)
    }
}

suspend fun HttpServer.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

