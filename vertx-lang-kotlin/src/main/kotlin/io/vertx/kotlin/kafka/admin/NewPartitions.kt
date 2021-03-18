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

import io.vertx.kafka.admin.NewPartitions

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.NewPartitions] objects.
 *
 * An update to the number of partitions including assignment.
 * Partitions can be increased only. If decrease, an exception from Kafka broker is received.
 * If no assignment is specifies brokers will randomly assign the partitions.
 *
 * @param totalCount  Set the number of partitions for the topic
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.NewPartitions original] using Vert.x codegen.
 */
fun newPartitionsOf(
  totalCount: Int? = null): NewPartitions = io.vertx.kafka.admin.NewPartitions().apply {

  if (totalCount != null) {
    this.setTotalCount(totalCount)
  }
}

