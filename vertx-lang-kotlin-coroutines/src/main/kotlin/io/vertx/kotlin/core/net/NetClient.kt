package io.vertx.kotlin.core.net

import io.vertx.core.net.NetClient
import io.vertx.core.net.NetSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

suspend fun NetClient.connectAwait(port : Int, host : String) : NetSocket {
    return awaitResult{
        this.connect(port, host, it)
    }
}

suspend fun NetClient.connectAwait(port : Int, host : String, serverName : String) : NetSocket {
    return awaitResult{
        this.connect(port, host, serverName, it)
    }
}

suspend fun NetClient.connectAwait(remoteAddress : SocketAddress) : NetSocket {
    return awaitResult{
        this.connect(remoteAddress, it)
    }
}

suspend fun NetClient.connectAwait(remoteAddress : SocketAddress, serverName : String) : NetSocket {
    return awaitResult{
        this.connect(remoteAddress, serverName, it)
    }
}

