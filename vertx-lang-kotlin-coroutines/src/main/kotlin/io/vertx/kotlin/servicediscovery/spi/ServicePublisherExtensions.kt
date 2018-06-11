package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.spi.ServicePublisher
import kotlin.String

suspend fun ServicePublisher.publish(record: Record): Record = awaitResult { this.publish(record, it) }

suspend fun ServicePublisher.unpublish(id: String) {
  awaitResult<Void?> { this.unpublish(id, it) }
}

suspend fun ServicePublisher.update(record: Record): Record = awaitResult { this.update(record, it) }
