package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.servicediscovery.spi.ServiceExporter

suspend fun ServiceExporter.closeAwait() : Void? {
    return awaitEvent{
        this.close(it)
    }
}

