package io.vertx.kotlin.servicediscovery

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import java.util.function.Function
import kotlin.Boolean
import kotlin.String
import kotlin.collections.MutableList

suspend fun ServiceDiscovery.publish(record: Record): Record = awaitResult { this.publish(record, it) }

suspend fun ServiceDiscovery.unpublish(id: String) {
  awaitResult<Void?> { this.unpublish(id, it) }
}

suspend fun ServiceDiscovery.getRecord(filter: JsonObject): Record? = awaitResult { this.getRecord(filter, it) }

suspend fun ServiceDiscovery.getRecord(filter: Function<Record, Boolean>): Record? = awaitResult { this.getRecord(filter, it) }

suspend fun ServiceDiscovery.getRecord(filter: Function<Record, Boolean>, includeOutOfService: Boolean): Record? = awaitResult { this.getRecord(filter, includeOutOfService, it) }

suspend fun ServiceDiscovery.getRecords(filter: JsonObject): MutableList<Record> = awaitResult { this.getRecords(filter, it) }

suspend fun ServiceDiscovery.getRecords(filter: Function<Record, Boolean>): MutableList<Record> = awaitResult { this.getRecords(filter, it) }

suspend fun ServiceDiscovery.getRecords(filter: Function<Record, Boolean>, includeOutOfService: Boolean): MutableList<Record> = awaitResult { this.getRecords(filter, includeOutOfService, it) }

suspend fun ServiceDiscovery.update(record: Record): Record = awaitResult { this.update(record, it) }
