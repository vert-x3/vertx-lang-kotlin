package io.vertx.kotlin.core.net

import io.vertx.core.net.NetClient
import io.vertx.core.net.NetSocket
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Open a connection to a server at the specific <code>port</code> and <code>host</code>.
 * <p>
 * <code>host</code> can be a valid host name or IP address. The connect is done asynchronously and on success, a
 * [io.vertx.core.net.NetSocket] instance is supplied via the <code>connectHandler</code> instance
 *
 * @param port the port
 * @param host the host
 * @param connectHandler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetClient original] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(port : Int, host : String) : NetSocket {
  return awaitResult{
    this.connect(port, host, it)
  }
}

/**
 * Open a connection to a server at the specific <code>port</code> and <code>host</code>.
 * <p>
 * <code>host</code> can be a valid host name or IP address. The connect is done asynchronously and on success, a
 * [io.vertx.core.net.NetSocket] instance is supplied via the <code>connectHandler</code> instance
 *
 * @param port the port
 * @param host the host
 * @param serverName the SNI server name
 * @param connectHandler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetClient original] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(port : Int, host : String, serverName : String) : NetSocket {
  return awaitResult{
    this.connect(port, host, serverName, it)
  }
}

/**
 * Open a connection to a server at the specific <code>remoteAddress</code>.
 * <p>
 * The connect is done asynchronously and on success, a [io.vertx.core.net.NetSocket] instance is supplied via the <code>connectHandler</code> instance
 *
 * @param remoteAddress the remote address
 * @param connectHandler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetClient original] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(remoteAddress : SocketAddress) : NetSocket {
  return awaitResult{
    this.connect(remoteAddress, it)
  }
}

/**
 * Open a connection to a server at the specific <code>remoteAddress</code>.
 * <p>
 * The connect is done asynchronously and on success, a [io.vertx.core.net.NetSocket] instance is supplied via the <code>connectHandler</code> instance
 *
 * @param remoteAddress the remote address
 * @param serverName the SNI server name
 * @param connectHandler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.NetClient original] using Vert.x codegen.
 */
suspend fun NetClient.connectAwait(remoteAddress : SocketAddress, serverName : String) : NetSocket {
  return awaitResult{
    this.connect(remoteAddress, serverName, it)
  }
}

