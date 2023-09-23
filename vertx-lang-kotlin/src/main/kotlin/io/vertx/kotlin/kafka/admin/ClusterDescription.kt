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
package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.ClusterDescription
import io.vertx.kafka.client.common.Node
import org.apache.kafka.common.acl.AclOperation

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.ClusterDescription] objects.
 *
 * A detailed description of the cluster
 *
 * @param nodes  Set the nodes belonging to this cluster
 * @param controller  Set the controller node.
 * @param clusterId  Set the cluster ID
 * @param authorizedOperations  Set the authorizedOperations
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.ClusterDescription original] using Vert.x codegen.
 */
fun clusterDescriptionOf(
  nodes: Iterable<io.vertx.kafka.client.common.Node>? = null,
  controller: io.vertx.kafka.client.common.Node? = null,
  clusterId: String? = null,
  authorizedOperations: Iterable<AclOperation>? = null): ClusterDescription = io.vertx.kafka.admin.ClusterDescription().apply {

  if (nodes != null) {
    this.setNodes(nodes.toList())
  }
  if (controller != null) {
    this.setController(controller)
  }
  if (clusterId != null) {
    this.setClusterId(clusterId)
  }
  if (authorizedOperations != null) {
    this.setAuthorizedOperations(authorizedOperations.toSet())
  }
}

