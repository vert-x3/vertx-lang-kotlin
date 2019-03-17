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
package io.vertx.kotlin.cassandra

import io.vertx.cassandra.CassandraClientOptions

/**
 * A function providing a DSL for building [io.vertx.cassandra.CassandraClientOptions] objects.
 *
 * Eclipse Vert.x Cassandra client options.
 *
 * @param contactPoints  Set a list of hosts, where some of cluster nodes is located.
 * @param keyspace  Set the keyspace to use when creating the Cassandra session. Defaults to <code>null</code>.
 * @param port  Set which port should be used for all the hosts to connect to a cassandra service.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClientOptions original] using Vert.x codegen.
 */
fun cassandraClientOptionsOf(
  contactPoints: Iterable<String>? = null,
  keyspace: String? = null,
  port: Int? = null): CassandraClientOptions = io.vertx.cassandra.CassandraClientOptions().apply {

  if (contactPoints != null) {
    this.setContactPoints(contactPoints.toList())
  }
  if (keyspace != null) {
    this.setKeyspace(keyspace)
  }
  if (port != null) {
    this.setPort(port)
  }
}

/**
 * A function providing a DSL for building [io.vertx.cassandra.CassandraClientOptions] objects.
 *
 * Eclipse Vert.x Cassandra client options.
 *
 * @param contactPoints  Set a list of hosts, where some of cluster nodes is located.
 * @param keyspace  Set the keyspace to use when creating the Cassandra session. Defaults to <code>null</code>.
 * @param port  Set which port should be used for all the hosts to connect to a cassandra service.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClientOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("cassandraClientOptionsOf(contactPoints, keyspace, port)")
)
fun CassandraClientOptions(
  contactPoints: Iterable<String>? = null,
  keyspace: String? = null,
  port: Int? = null): CassandraClientOptions = io.vertx.cassandra.CassandraClientOptions().apply {

  if (contactPoints != null) {
    this.setContactPoints(contactPoints.toList())
  }
  if (keyspace != null) {
    this.setKeyspace(keyspace)
  }
  if (port != null) {
    this.setPort(port)
  }
}

