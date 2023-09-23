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
 * @param status  Sets the status of the service. When published, the status is set to. When withdrawn, the status is set to .
 * @param registration  Sets the registration id. This method is called when the service is published.
 * @param type  Sets the type of service.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.Record original] using Vert.x codegen.
 */
fun recordOf(
  location: io.vertx.core.json.JsonObject? = null,
  metadata: io.vertx.core.json.JsonObject? = null,
  name: String? = null,
  status: Status? = null,
  registration: String? = null,
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
  if (status != null) {
    this.setStatus(status)
  }
  if (registration != null) {
    this.setRegistration(registration)
  }
  if (type != null) {
    this.setType(type)
  }
}

