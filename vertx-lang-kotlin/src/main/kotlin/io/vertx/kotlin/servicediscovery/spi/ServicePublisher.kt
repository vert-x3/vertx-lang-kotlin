package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.spi.ServicePublisher

/**
 * Publishes a record.
 *
 * @param record the record
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServicePublisher original] using Vert.x codegen.
 */
suspend fun ServicePublisher.publishAwait(record : Record) : Record {
  return awaitResult{
    this.publish(record, it)
  }
}

/**
 * Un-publishes a record.
 *
 * @param id the registration id
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServicePublisher original] using Vert.x codegen.
 */
suspend fun ServicePublisher.unpublishAwait(id : String) : Unit {
  return awaitResult{
    this.unpublish(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Updates an existing record.
 *
 * @param record the record
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServicePublisher original] using Vert.x codegen.
 */
suspend fun ServicePublisher.updateAwait(record : Record) : Record {
  return awaitResult{
    this.update(record, it)
  }
}

