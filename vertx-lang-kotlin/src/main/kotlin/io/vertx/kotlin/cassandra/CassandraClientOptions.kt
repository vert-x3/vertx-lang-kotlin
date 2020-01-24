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
 * @param contactPoints  Adds a contact point to use for the initial connection to the cluster
 * @param keyspace  Set the keyspace to use when creating the Cassandra session. Defaults to <code>null</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClientOptions original] using Vert.x codegen.
 */
fun cassandraClientOptionsOf(
  contactPoints: Map<String, Int>? = null,
  keyspace: String? = null): CassandraClientOptions = io.vertx.cassandra.CassandraClientOptions().apply {

  if (contactPoints != null) {
    for (item in contactPoints) {
      this.addContactPoint(item.key, item.value)
    }
  }
  if (keyspace != null) {
    this.setKeyspace(keyspace)
  }
}

/**
 * A function providing a DSL for building [io.vertx.cassandra.CassandraClientOptions] objects.
 *
 * Eclipse Vert.x Cassandra client options.
 *
 * @param contactPoints  Adds a contact point to use for the initial connection to the cluster
 * @param keyspace  Set the keyspace to use when creating the Cassandra session. Defaults to <code>null</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClientOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("cassandraClientOptionsOf(contactPoints, keyspace)")
)
fun CassandraClientOptions(
  contactPoints: Map<String, Int>? = null,
  keyspace: String? = null): CassandraClientOptions = io.vertx.cassandra.CassandraClientOptions().apply {

  if (contactPoints != null) {
    for (item in contactPoints) {
      this.addContactPoint(item.key, item.value)
    }
  }
  if (keyspace != null) {
    this.setKeyspace(keyspace)
  }
}

