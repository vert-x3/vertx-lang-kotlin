package io.vertx.kotlin.cassandra

import io.vertx.cassandra.CassandraClientOptions

/**
 * A function providing a DSL for building [io.vertx.cassandra.CassandraClientOptions] objects.
 *
 * Eclipse Vert.x Cassandra client options.
 *
 * @param contactPoints  Set a list of hosts, where some of cluster nodes is located.
 * @param port  Set which port should be used for all the hosts to connect to a cassandra service.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.cassandra.CassandraClientOptions original] using Vert.x codegen.
 */
fun cassandraClientOptionsOf(
  contactPoints: Iterable<String>? = null,
  port: Int? = null): CassandraClientOptions = io.vertx.cassandra.CassandraClientOptions().apply {

  if (contactPoints != null) {
    this.setContactPoints(contactPoints.toList())
  }
  if (port != null) {
    this.setPort(port)
  }
}

