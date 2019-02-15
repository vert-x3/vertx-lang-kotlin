package io.vertx.kotlin.servicediscovery

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import java.util.function.Function

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.publish]
 *
 * @param record the record
 * @return [Record]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.publishAwait(record: Record): Record {
  return awaitResult {
    this.publish(record, it)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.unpublish]
 *
 * @param id the registration id
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.unpublishAwait(id: String): Unit {
  return awaitResult {
    this.unpublish(id) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.getRecord]
 *
 * @param filter the filter.
 * @return [Record?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordAwait(filter: JsonObject): Record? {
  return awaitResult {
    this.getRecord(filter, it)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.getRecord]
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @return [Record?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordAwait(filter: (Record) -> Boolean): Record? {
  return awaitResult {
    this.getRecord(filter, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.getRecord]
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @param includeOutOfService whether or not the filter accepts <code>OUT OF SERVICE</code> records
 * @return [Record?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordAwait(filter: (Record) -> Boolean, includeOutOfService: Boolean): Record? {
  return awaitResult {
    this.getRecord(filter, includeOutOfService, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.getRecords]
 *
 * @param filter the filter - see [io.vertx.servicediscovery.ServiceDiscovery]
 * @return [List<Record>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordsAwait(filter: JsonObject): List<Record> {
  return awaitResult {
    this.getRecords(filter, it)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.getRecords]
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @return [List<Record>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordsAwait(filter: (Record) -> Boolean): List<Record> {
  return awaitResult {
    this.getRecords(filter, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.getRecords]
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @param includeOutOfService whether or not the filter accepts <code>OUT OF SERVICE</code> records
 * @return [List<Record>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordsAwait(filter: (Record) -> Boolean, includeOutOfService: Boolean): List<Record> {
  return awaitResult {
    this.getRecords(filter, includeOutOfService, it::handle)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.update]
 *
 * @param record the updated record
 * @return [Record]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.updateAwait(record: Record): Record {
  return awaitResult {
    this.update(record, it)
  }
}

