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
import io.vertx.core.tracing.TracingPolicy

/**
 * A function providing a DSL for building [io.vertx.cassandra.CassandraClientOptions] objects.
 *
 * Eclipse Vert.x Cassandra client options.
 *
 * @param contactPoints  Adds a contact point to use for the initial connection to the cluster
 * @param keyspace  Set the keyspace to use when creating the Cassandra session. Defaults to <code>null</code>.
 * @param password  Set the password for plaintext authentication. Defaults to <code>null</code>.
 * @param tracingPolicy  Set the tracing policy for the client behavior when Vert.x has tracing enabled.
 * @param username  Set the username for plaintext authentication. Defaults to <code>null</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClientOptions original] using Vert.x codegen.
 */
fun cassandraClientOptionsOf(
  contactPoints: Map<String, Int>? = null,
  keyspace: String? = null,
  password: String? = null,
  tracingPolicy: TracingPolicy? = null,
  username: String? = null): CassandraClientOptions = io.vertx.cassandra.CassandraClientOptions().apply {

  if (contactPoints != null) {
    for (item in contactPoints) {
      this.addContactPoint(item.key, item.value)
    }
  }
  if (keyspace != null) {
    this.setKeyspace(keyspace)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (tracingPolicy != null) {
    this.setTracingPolicy(tracingPolicy)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

