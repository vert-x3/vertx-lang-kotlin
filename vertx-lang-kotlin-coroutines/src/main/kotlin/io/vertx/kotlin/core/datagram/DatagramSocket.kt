package io.vertx.kotlin.core.datagram

import io.vertx.core.buffer.Buffer
import io.vertx.core.datagram.DatagramPacket
import io.vertx.core.datagram.DatagramSocket
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun DatagramSocket.sendAwait(packet : Buffer, port : Int, host : String) : DatagramSocket? {
    return awaitResult{
        this.send(packet, port, host, it)
    }
}

suspend fun DatagramSocket.sendAwait(str : String, port : Int, host : String) : DatagramSocket? {
    return awaitResult{
        this.send(str, port, host, it)
    }
}

suspend fun DatagramSocket.sendAwait(str : String, enc : String, port : Int, host : String) : DatagramSocket? {
    return awaitResult{
        this.send(str, enc, port, host, it)
    }
}

suspend fun DatagramSocket.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress : String) : DatagramSocket? {
    return awaitResult{
        this.listenMulticastGroup(multicastAddress, it)
    }
}

suspend fun DatagramSocket.listenMulticastGroupAwait(multicastAddress : String, networkInterface : String, source : String) : DatagramSocket? {
    return awaitResult{
        this.listenMulticastGroup(multicastAddress, networkInterface, source, it)
    }
}

suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress : String) : DatagramSocket? {
    return awaitResult{
        this.unlistenMulticastGroup(multicastAddress, it)
    }
}

suspend fun DatagramSocket.unlistenMulticastGroupAwait(multicastAddress : String, networkInterface : String, source : String) : DatagramSocket? {
    return awaitResult{
        this.unlistenMulticastGroup(multicastAddress, networkInterface, source, it)
    }
}

suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress : String, sourceToBlock : String) : DatagramSocket? {
    return awaitResult{
        this.blockMulticastGroup(multicastAddress, sourceToBlock, it)
    }
}

suspend fun DatagramSocket.blockMulticastGroupAwait(multicastAddress : String, networkInterface : String, sourceToBlock : String) : DatagramSocket? {
    return awaitResult{
        this.blockMulticastGroup(multicastAddress, networkInterface, sourceToBlock, it)
    }
}

suspend fun DatagramSocket.listenAwait(port : Int, host : String) : DatagramSocket? {
    return awaitResult{
        this.listen(port, host, it)
    }
}

suspend fun DatagramSocket.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun DatagramSocket.handlerAwait() : DatagramPacket? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun DatagramSocket.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

