package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.servicediscovery.spi.ServiceImporter

suspend fun ServiceImporter.closeAwait() : Unit {
    return awaitEvent{
        this.close({ v -> it.handle(null) })}
}

