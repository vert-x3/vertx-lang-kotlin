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
package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.Node

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.Node] objects.
 *
 * Information about a Kafka cluster node
 *
 * @param hasRack  Set if this node has a defined rack
 * @param host  Set the host name for this node
 * @param id  Set the node id of this node
 * @param idString  Set the string representation of the node id
 * @param isEmpty  Set if this node is empty
 * @param port  Set the port for this node
 * @param rack  Set the rack for this node
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.Node original] using Vert.x codegen.
 */
fun nodeOf(
  hasRack: Boolean? = null,
  host: String? = null,
  id: Int? = null,
  idString: String? = null,
  isEmpty: Boolean? = null,
  port: Int? = null,
  rack: String? = null): Node = io.vertx.kafka.client.common.Node().apply {

  if (hasRack != null) {
    this.setHasRack(hasRack)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (id != null) {
    this.setId(id)
  }
  if (idString != null) {
    this.setIdString(idString)
  }
  if (isEmpty != null) {
    this.setIsEmpty(isEmpty)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (rack != null) {
    this.setRack(rack)
  }
}

