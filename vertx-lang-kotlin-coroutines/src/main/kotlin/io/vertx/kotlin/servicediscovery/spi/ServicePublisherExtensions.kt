package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.spi.ServicePublisher
import kotlin.String

/**
 *  Publishes a record.
 * @param record        the record */
suspend fun ServicePublisher.publish(record: Record): Record {
  return awaitResult { this.publish(record, it) }
}

/**
 *  Un-publishes a record.
 * @param id            the registration id */
suspend fun ServicePublisher.unpublish(id: String) {
  awaitResult<Void?> { this.unpublish(id, it) }
}

/**
 *  Updates an existing record.
 * @param record        the record */
suspend fun ServicePublisher.update(record: Record): Record {
  return awaitResult { this.update(record, it) }
}
