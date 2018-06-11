package io.vertx.kotlin.core.net

import io.vertx.core.net.NetServer
import io.vertx.core.net.SocketAddress
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.String

suspend fun NetServer.listen(): NetServer {
  return awaitResult { this.listen(it) }
}

suspend fun NetServer.listen(port: Int, host: String): NetServer {
  return awaitResult { this.listen(port, host, it) }
}

suspend fun NetServer.listen(port: Int): NetServer {
  return awaitResult { this.listen(port, it) }
}

suspend fun NetServer.listen(localAddress: SocketAddress): NetServer {
  return awaitResult { this.listen(localAddress, it) }
}

suspend fun NetServer.close() {
  awaitResult<Void?> { this.close(it) }
}
