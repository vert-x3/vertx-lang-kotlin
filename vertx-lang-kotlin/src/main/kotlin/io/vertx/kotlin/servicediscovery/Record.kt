package io.vertx.kotlin.servicediscovery

import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.Status

/**
 * A function providing a DSL for building [io.vertx.servicediscovery.Record] objects.
 *
 * Describes a `service`. The record is the only piece of information shared between consumer and provider. It should
 * contains enough metadata to let consumer find the service they want.
 *
 * @param location  Sets the json object describing the location of the service. By convention, this json object should contain the [io.vertx.servicediscovery.Record] entry.
 * @param metadata  Gets the metadata attached to the record.
 * @param name  Sets the name of the service. It can reflect the service name of the name of the provider.
 * @param registration  Sets the registration id. This method is called when the service is published.
 * @param status  Sets the status of the service. When published, the status is set to. When withdrawn, the status is set to .
 * @param type  Sets the type of service.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.Record original] using Vert.x codegen.
 */
fun Record(
  location: io.vertx.core.json.JsonObject? = null,
  metadata: io.vertx.core.json.JsonObject? = null,
  name: String? = null,
  registration: String? = null,
  status: Status? = null,
  type: String? = null): Record = io.vertx.servicediscovery.Record().apply {

  if (location != null) {
    this.setLocation(location)
  }
  if (metadata != null) {
    this.setMetadata(metadata)
  }
  if (name != null) {
    this.setName(name)
  }
  if (registration != null) {
    this.setRegistration(registration)
  }
  if (status != null) {
    this.setStatus(status)
  }
  if (type != null) {
    this.setType(type)
  }
}

