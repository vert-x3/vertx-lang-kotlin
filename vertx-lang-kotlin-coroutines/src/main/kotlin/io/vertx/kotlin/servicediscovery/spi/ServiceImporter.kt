package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.servicediscovery.spi.ServiceImporter
import java.lang.Void

suspend fun ServiceImporter.closeAwait() : Void? {
    return awaitEvent{
        this.close(it)
    }
}

