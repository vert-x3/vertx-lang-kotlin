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
package io.vertx.kotlin.servicediscovery.types

import io.vertx.servicediscovery.types.HttpLocation

/**
 * A function providing a DSL for building [io.vertx.servicediscovery.types.HttpLocation] objects.
 *
 * Represents the location of a HTTP endpoint. This object (its json representation) will be used as "location" in a
 * service record.
 *
 * @param endpoint  Sets the endpoint, which is the URL of the service. The endpoint is automatically computed when you use the other `setX` method.
 * @param host  Sets the host.
 * @param port  Sets the port
 * @param root  Sets the path of the service (root)
 * @param ssl  Sets whether or not the HTTP service is using <code>https</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.HttpLocation original] using Vert.x codegen.
 */
fun httpLocationOf(
  endpoint: String? = null,
  host: String? = null,
  port: Int? = null,
  root: String? = null,
  ssl: Boolean? = null): HttpLocation = io.vertx.servicediscovery.types.HttpLocation().apply {

  if (endpoint != null) {
    this.setEndpoint(endpoint)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (root != null) {
    this.setRoot(root)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
}

