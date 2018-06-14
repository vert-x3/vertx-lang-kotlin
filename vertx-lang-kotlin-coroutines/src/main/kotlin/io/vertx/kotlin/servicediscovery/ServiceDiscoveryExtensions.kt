package io.vertx.kotlin.servicediscovery

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import java.util.function.Function
import kotlin.Boolean
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Publishes a record.
 * @param record        the record */
suspend fun ServiceDiscovery.publish(record: Record): Record {
  return awaitResult { this.publish(record, it) }
}

/**
 *  Un-publishes a record.
 * @param id            the registration id */
suspend fun ServiceDiscovery.unpublish(id: String) {
  awaitResult<Void?> { this.unpublish(id, it) }
}

/**
 *  Lookups for a single record.
 *  <p>
 *  Filters are expressed using a Json object. Each entry of the given filter will be checked against the record.
 *  All entry must match exactly the record. The entry can use the special "*" value to denotes a requirement on the
 *  key, but not on the value.
 *  <p>
 *  Let's take some example:
 *  <pre>
 *    { "name" = "a" } => matches records with name set fo "a"
 *    { "color" = "*" } => matches records with "color" set
 *    { "color" = "red" } => only matches records with "color" set to "red"
 *    { "color" = "red", "name" = "a"} => only matches records with name set to "a", and color set to "red"
 *  </pre>
 *  <p>
 *  If the filter is not set (`null` or empty), it accepts all records.
 *  <p>
 *  This method returns the first matching record.
 * @param filter        the filter. */
suspend fun ServiceDiscovery.getRecord(filter: JsonObject): Record? {
  return awaitResult { this.getRecord(filter, it) }
}

/**
 *  Lookups for a single record.
 *  <p>
 *  The filter is a [Function] taking a [Record] as argument and returning a boolean. You should see it
 *  as an `accept` method of a filter. This method return a record passing the filter.
 *  <p>
 *  This method only looks for records with a `UP` status.
 * @param filter        the filter, must not be `null`. To return all records, use a function accepting all records */
suspend fun ServiceDiscovery.getRecord(filter: Function<Record, Boolean>): Record? {
  return awaitResult { this.getRecord(filter, it) }
}

/**
 *  Lookups for a single record.
 *  <p>
 *  The filter is a [Function] taking a [Record] as argument and returning a boolean. You should see it
 *  as an `accept` method of a filter. This method return a record passing the filter.
 *  <p>
 *  Unlike [ServiceDiscovery.getRecord], this method may accept records with a `OUT OF SERVICE`
 *  status, if the `includeOutOfService` parameter is set to `true`.
 * @param filter              the filter, must not be `null`. To return all records, use a function accepting all records
 * @param includeOutOfService whether or not the filter accepts  `OUT OF SERVICE` records */
suspend fun ServiceDiscovery.getRecord(filter: Function<Record, Boolean>, includeOutOfService: Boolean): Record? {
  return awaitResult { this.getRecord(filter, includeOutOfService, it) }
}

/**
 *  Lookups for a set of records. Unlike [ServiceDiscovery.getRecord], this method returns all matching
 *  records.
 * @param filter        the filter - see [ServiceDiscovery.getRecord] */
suspend fun ServiceDiscovery.getRecords(filter: JsonObject): MutableList<Record> {
  return awaitResult { this.getRecords(filter, it) }
}

/**
 *  Lookups for a set of records. Unlike [ServiceDiscovery.getRecord], this method returns all matching
 *  records.
 *  <p>
 *  The filter is a [Function] taking a [Record] as argument and returning a boolean. You should see it
 *  as an `accept` method of a filter. This method return a record passing the filter.
 *  <p>
 *  This method only looks for records with a `UP` status.
 * @param filter        the filter, must not be `null`. To return all records, use a function accepting all records */
suspend fun ServiceDiscovery.getRecords(filter: Function<Record, Boolean>): MutableList<Record> {
  return awaitResult { this.getRecords(filter, it) }
}

/**
 *  Lookups for a set of records. Unlike [ServiceDiscovery.getRecord], this method returns all matching
 *  records.
 *  <p>
 *  The filter is a [Function] taking a [Record] as argument and returning a boolean. You should see it
 *  as an `accept` method of a filter. This method return a record passing the filter.
 *  <p>
 *  Unlike [ServiceDiscovery.getRecords], this method may accept records with a `OUT OF SERVICE`
 *  status, if the `includeOutOfService` parameter is set to `true`.
 * @param filter              the filter, must not be `null`. To return all records, use a function accepting all records
 * @param includeOutOfService whether or not the filter accepts  `OUT OF SERVICE` records */
suspend fun ServiceDiscovery.getRecords(filter: Function<Record, Boolean>, includeOutOfService: Boolean): MutableList<Record> {
  return awaitResult { this.getRecords(filter, includeOutOfService, it) }
}

/**
 *  Updates the given record. The record must has been published, and has it's registration id set.
 * @param record        the updated record */
suspend fun ServiceDiscovery.update(record: Record): Record {
  return awaitResult { this.update(record, it) }
}
