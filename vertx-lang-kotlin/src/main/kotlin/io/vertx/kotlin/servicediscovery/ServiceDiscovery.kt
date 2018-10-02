package io.vertx.kotlin.servicediscovery

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import java.util.function.Function

/**
 * Publishes a record.
 *
 * @param record the record
 * @param resultHandler handler called when the operation has completed (successfully or not). In case of success, the passed record has a registration id required to modify and un-register the service.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.publishAwait(record : Record) : Record {
  return awaitResult{
    this.publish(record, it)
  }
}

/**
 * Un-publishes a record.
 *
 * @param id the registration id
 * @param resultHandler handler called when the operation has completed (successfully or not).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.unpublishAwait(id : String) : Unit {
  return awaitResult{
    this.unpublish(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Lookups for a single record.
 * <p>
 * Filters are expressed using a Json object. Each entry of the given filter will be checked against the record.
 * All entry must match exactly the record. The entry can use the special "*" value to denotes a requirement on the
 * key, but not on the value.
 * <p>
 * Let's take some example:
 * <pre>
 *   { "name" = "a" } => matches records with name set fo "a"
 *   { "color" = "*" } => matches records with "color" set
 *   { "color" = "red" } => only matches records with "color" set to "red"
 *   { "color" = "red", "name" = "a"} => only matches records with name set to "a", and color set to "red"
 * </pre>
 * <p>
 * If the filter is not set (<code>null</code> or empty), it accepts all records.
 * <p>
 * This method returns the first matching record.
 *
 * @param filter the filter.
 * @param resultHandler handler called when the lookup has been completed. When there are no matching record, the operation succeeds, but the async result has no result (<code>null</code>).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordAwait(filter : JsonObject) : Record? {
  return awaitResult{
    this.getRecord(filter, it)
  }
}

/**
 * Lookups for a single record.
 * <p>
 * The filter is a  taking a [io.vertx.servicediscovery.Record] as argument and returning a boolean. You should see it
 * as an <code>accept</code> method of a filter. This method return a record passing the filter.
 * <p>
 * This method only looks for records with a <code>UP</code> status.
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @param resultHandler the result handler called when the lookup has been completed. When there are no matching record, the operation succeed, but the async result has no result.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordAwait(filter : Function<Record,Boolean>) : Record? {
  return awaitResult{
    this.getRecord(filter, it)
  }
}

/**
 * Lookups for a single record.
 * <p>
 * The filter is a  taking a [io.vertx.servicediscovery.Record] as argument and returning a boolean. You should see it
 * as an <code>accept</code> method of a filter. This method return a record passing the filter.
 * <p>
 * Unlike [io.vertx.servicediscovery.ServiceDiscovery], this method may accept records with a <code>OUT OF SERVICE</code>
 * status, if the <code>includeOutOfService</code> parameter is set to <code>true</code>.
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @param includeOutOfService whether or not the filter accepts <code>OUT OF SERVICE</code> records
 * @param resultHandler the result handler called when the lookup has been completed. When there are no matching record, the operation succeed, but the async result has no result.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordAwait(filter : Function<Record,Boolean>, includeOutOfService : Boolean) : Record? {
  return awaitResult{
    this.getRecord(filter, includeOutOfService, it)
  }
}

/**
 * Lookups for a set of records. Unlike [io.vertx.servicediscovery.ServiceDiscovery], this method returns all matching
 * records.
 *
 * @param filter the filter - see [io.vertx.servicediscovery.ServiceDiscovery]
 * @param resultHandler handler called when the lookup has been completed. When there are no matching record, the operation succeed, but the async result has an empty list as result.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordsAwait(filter : JsonObject) : List<Record> {
  return awaitResult{
    this.getRecords(filter, it)
  }
}

/**
 * Lookups for a set of records. Unlike [io.vertx.servicediscovery.ServiceDiscovery], this method returns all matching
 * records.
 * <p>
 * The filter is a  taking a [io.vertx.servicediscovery.Record] as argument and returning a boolean. You should see it
 * as an <code>accept</code> method of a filter. This method return a record passing the filter.
 * <p>
 * This method only looks for records with a <code>UP</code> status.
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @param resultHandler handler called when the lookup has been completed. When there are no matching record, the operation succeed, but the async result has an empty list as result.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordsAwait(filter : Function<Record,Boolean>) : List<Record> {
  return awaitResult{
    this.getRecords(filter, it)
  }
}

/**
 * Lookups for a set of records. Unlike [io.vertx.servicediscovery.ServiceDiscovery], this method returns all matching
 * records.
 * <p>
 * The filter is a  taking a [io.vertx.servicediscovery.Record] as argument and returning a boolean. You should see it
 * as an <code>accept</code> method of a filter. This method return a record passing the filter.
 * <p>
 * Unlike [io.vertx.servicediscovery.ServiceDiscovery], this method may accept records with a <code>OUT OF SERVICE</code>
 * status, if the <code>includeOutOfService</code> parameter is set to <code>true</code>.
 *
 * @param filter the filter, must not be <code>null</code>. To return all records, use a function accepting all records
 * @param includeOutOfService whether or not the filter accepts <code>OUT OF SERVICE</code> records
 * @param resultHandler handler called when the lookup has been completed. When there are no matching record, the operation succeed, but the async result has an empty list as result.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.getRecordsAwait(filter : Function<Record,Boolean>, includeOutOfService : Boolean) : List<Record> {
  return awaitResult{
    this.getRecords(filter, includeOutOfService, it)
  }
}

/**
 * Updates the given record. The record must has been published, and has it's registration id set.
 *
 * @param record the updated record
 * @param resultHandler handler called when the lookup has been completed.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.ServiceDiscovery original] using Vert.x codegen.
 */
suspend fun ServiceDiscovery.updateAwait(record : Record) : Record {
  return awaitResult{
    this.update(record, it)
  }
}

