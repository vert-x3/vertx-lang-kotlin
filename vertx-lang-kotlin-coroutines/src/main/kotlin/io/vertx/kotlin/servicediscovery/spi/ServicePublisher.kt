package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.spi.ServicePublisher
import java.lang.Void

suspend fun ServicePublisher.publishAwait(record : Record) : Record? {
    return awaitResult{
        this.publish(record, it)
    }
}

suspend fun ServicePublisher.unpublishAwait(id : String) : Void? {
    return awaitResult{
        this.unpublish(id, it)
    }
}

suspend fun ServicePublisher.updateAwait(record : Record) : Record? {
    return awaitResult{
        this.update(record, it)
    }
}

