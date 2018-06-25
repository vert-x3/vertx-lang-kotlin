package io.vertx.kotlin.servicediscovery

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import java.util.function.Function

suspend fun ServiceDiscovery.publishAwait(record : Record) : Record {
    return awaitResult{
        this.publish(record, it)
    }
}

suspend fun ServiceDiscovery.unpublishAwait(id : String) : Unit {
    return awaitResult{
        this.unpublish(id, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ServiceDiscovery.getRecordAwait(filter : JsonObject) : Record? {
    return awaitResult{
        this.getRecord(filter, it)
    }
}

suspend fun ServiceDiscovery.getRecordAwait(filter : Function<Record,Boolean>) : Record? {
    return awaitResult{
        this.getRecord(filter, it)
    }
}

suspend fun ServiceDiscovery.getRecordAwait(filter : Function<Record,Boolean>, includeOutOfService : Boolean) : Record? {
    return awaitResult{
        this.getRecord(filter, includeOutOfService, it)
    }
}

suspend fun ServiceDiscovery.getRecordsAwait(filter : JsonObject) : List<Record> {
    return awaitResult{
        this.getRecords(filter, it)
    }
}

suspend fun ServiceDiscovery.getRecordsAwait(filter : Function<Record,Boolean>) : List<Record> {
    return awaitResult{
        this.getRecords(filter, it)
    }
}

suspend fun ServiceDiscovery.getRecordsAwait(filter : Function<Record,Boolean>, includeOutOfService : Boolean) : List<Record> {
    return awaitResult{
        this.getRecords(filter, includeOutOfService, it)
    }
}

suspend fun ServiceDiscovery.updateAwait(record : Record) : Record {
    return awaitResult{
        this.update(record, it)
    }
}

