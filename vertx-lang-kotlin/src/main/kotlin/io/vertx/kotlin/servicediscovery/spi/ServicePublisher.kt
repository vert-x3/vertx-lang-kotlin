package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.spi.ServicePublisher

/**
 * Suspending version of method [io.vertx.servicediscovery.spi.ServicePublisher.publish]
 *
 * @param record the record
 * @return [Record]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.spi.ServicePublisher] using Vert.x codegen.
 */
suspend fun ServicePublisher.publishAwait(record: Record): Record {
  return awaitResult {
    this.publish(record, it)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.spi.ServicePublisher.unpublish]
 *
 * @param id the registration id
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.spi.ServicePublisher] using Vert.x codegen.
 */
suspend fun ServicePublisher.unpublishAwait(id: String): Unit {
  return awaitResult {
    this.unpublish(id) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.spi.ServicePublisher.update]
 *
 * @param record the record
 * @return [Record]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.spi.ServicePublisher] using Vert.x codegen.
 */
suspend fun ServicePublisher.updateAwait(record: Record): Record {
  return awaitResult {
    this.update(record, it)
  }
}

