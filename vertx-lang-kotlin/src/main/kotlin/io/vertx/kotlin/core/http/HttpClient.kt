package io.vertx.kotlin.core.http

import io.vertx.core.Handler
import io.vertx.core.MultiMap
import io.vertx.core.http.HttpClient
import io.vertx.core.http.HttpClientResponse
import io.vertx.core.http.RequestOptions
import io.vertx.core.http.WebSocket
import io.vertx.core.http.WebsocketVersion
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun HttpClient.getNowAwait(options : RequestOptions) : HttpClientResponse {
    return awaitEvent{
        this.getNow(options, it)
    }
}

suspend fun HttpClient.getNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.getNow(port, host, requestURI, it)
    }
}

suspend fun HttpClient.getNowAwait(host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.getNow(host, requestURI, it)
    }
}

suspend fun HttpClient.getNowAwait(requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.getNow(requestURI, it)
    }
}

suspend fun HttpClient.headNowAwait(options : RequestOptions) : HttpClientResponse {
    return awaitEvent{
        this.headNow(options, it)
    }
}

suspend fun HttpClient.headNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.headNow(port, host, requestURI, it)
    }
}

suspend fun HttpClient.headNowAwait(host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.headNow(host, requestURI, it)
    }
}

suspend fun HttpClient.headNowAwait(requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.headNow(requestURI, it)
    }
}

suspend fun HttpClient.optionsNowAwait(options : RequestOptions) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(options, it)
    }
}

suspend fun HttpClient.optionsNowAwait(port : Int, host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(port, host, requestURI, it)
    }
}

suspend fun HttpClient.optionsNowAwait(host : String, requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(host, requestURI, it)
    }
}

suspend fun HttpClient.optionsNowAwait(requestURI : String) : HttpClientResponse {
    return awaitEvent{
        this.optionsNow(requestURI, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions) : WebSocket {
    return awaitEvent{
        this.websocket(options, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(options, headers, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, headers, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, headers, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, headers, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(options, headers, version, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, headers, version, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(options, headers, version, subProtocols, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, subProtocols, it)
    }
}

suspend fun HttpClient.websocketAbsAwait(url : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocketAbs(url, headers, version, subProtocols, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(options : RequestOptions, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(options, headers, version, subProtocols, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(port : Int, host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(port, host, requestURI, headers, version, subProtocols, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, subProtocols, it)
    }
}

suspend fun HttpClient.websocketAwait(host : String, requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(host, requestURI, headers, version, subProtocols, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, headers, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, headers, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, headers, version, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, headers, version, wsConnect, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String) : WebSocket {
    return awaitEvent{
        this.websocket(requestURI, headers, version, subProtocols, it)
    }
}

suspend fun HttpClient.websocketAwait(requestURI : String, headers : MultiMap, version : WebsocketVersion, subProtocols : String, wsConnect : Handler<WebSocket>) : Throwable {
    return awaitEvent{
        this.websocket(requestURI, headers, version, subProtocols, wsConnect, it)
    }
}

