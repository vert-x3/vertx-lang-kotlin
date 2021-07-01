/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.servicediscovery

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.spi.ServiceExporter
import io.vertx.servicediscovery.spi.ServiceImporter
import java.util.function.Function

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.registerServiceImporter]
 *
 * @param importer the service importer
 * @param configuration the optional configuration
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
@Deprecated(message = "Instead use registerServiceImporter returning a future and chain with await()", replaceWith = ReplaceWith("registerServiceImporter(importer, configuration).await()"))
suspend fun ServiceDiscovery.registerServiceImporterAwait(importer: ServiceImporter, configuration: JsonObject): Unit {
  return awaitResult {
    this.registerServiceImporter(importer, configuration, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.registerServiceExporter]
 *
 * @param exporter the service exporter
 * @param configuration the optional configuration
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
@Deprecated(message = "Instead use registerServiceExporter returning a future and chain with await()", replaceWith = ReplaceWith("registerServiceExporter(exporter, configuration).await()"))
suspend fun ServiceDiscovery.registerServiceExporterAwait(exporter: ServiceExporter, configuration: JsonObject): Unit {
  return awaitResult {
    this.registerServiceExporter(exporter, configuration, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.publish]
 *
 * @param record the record
 * @return [Record]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
@Deprecated(message = "Instead use publish returning a future and chain with await()", replaceWith = ReplaceWith("publish(record).await()"))
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
@Deprecated(message = "Instead use unpublish returning a future and chain with await()", replaceWith = ReplaceWith("unpublish(id).await()"))
suspend fun ServiceDiscovery.unpublishAwait(id: String): Unit {
  return awaitResult {
    this.unpublish(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
@Deprecated(message = "Instead use getRecord returning a future and chain with await()", replaceWith = ReplaceWith("getRecord(filter).await()"))
suspend fun ServiceDiscovery.getRecordAwait(filter: JsonObject): Record? {
  return awaitResult {
    this.getRecord(filter, it)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.ServiceDiscovery.getRecord]
 *
 * @param id the registration id
 * @return [Record?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.ServiceDiscovery] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getRecord returning a future and chain with await()", replaceWith = ReplaceWith("getRecord(id).await()"))
suspend fun ServiceDiscovery.getRecordAwait(id: String): Record? {
  return awaitResult {
    this.getRecord(id, it)
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
@Deprecated(message = "Instead use getRecord returning a future and chain with await()", replaceWith = ReplaceWith("getRecord(filter).await()"))
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
@Deprecated(message = "Instead use getRecord returning a future and chain with await()", replaceWith = ReplaceWith("getRecord(filter, includeOutOfService).await()"))
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
@Deprecated(message = "Instead use getRecords returning a future and chain with await()", replaceWith = ReplaceWith("getRecords(filter).await()"))
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
@Deprecated(message = "Instead use getRecords returning a future and chain with await()", replaceWith = ReplaceWith("getRecords(filter).await()"))
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
@Deprecated(message = "Instead use getRecords returning a future and chain with await()", replaceWith = ReplaceWith("getRecords(filter, includeOutOfService).await()"))
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
@Deprecated(message = "Instead use update returning a future and chain with await()", replaceWith = ReplaceWith("update(record).await()"))
suspend fun ServiceDiscovery.updateAwait(record: Record): Record {
  return awaitResult {
    this.update(record, it)
  }
}

