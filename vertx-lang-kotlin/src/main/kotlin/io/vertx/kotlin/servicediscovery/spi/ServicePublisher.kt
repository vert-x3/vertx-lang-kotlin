package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.spi.ServicePublisher

suspend fun ServicePublisher.publishAwait(record : Record) : Record {
    return awaitResult{
        this.publish(record, it)
    }
}

suspend fun ServicePublisher.unpublishAwait(id : String) : Unit {
    return awaitResult{
        this.unpublish(id, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ServicePublisher.updateAwait(record : Record) : Record {
    return awaitResult{
        this.update(record, it)
    }
}

