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

import io.vertx.kafka.admin.TopicDescription

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.TopicDescription] objects.
 *
 * A detailed description of a single topic in the cluster
 *
 * @param internal  Set whether the topic is internal to Kafka.
 * @param name  Set the name of the topic.
 * @param partitions  Set A list of partitions where the index represents the partition id and the element contains leadership and replica information for that partition.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.TopicDescription original] using Vert.x codegen.
 */
fun topicDescriptionOf(
  internal: Boolean? = null,
  name: String? = null,
  partitions: Iterable<io.vertx.kafka.client.common.TopicPartitionInfo>? = null): TopicDescription = io.vertx.kafka.admin.TopicDescription().apply {

  if (internal != null) {
    this.setInternal(internal)
  }
  if (name != null) {
    this.setName(name)
  }
  if (partitions != null) {
    this.setPartitions(partitions.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.TopicDescription] objects.
 *
 * A detailed description of a single topic in the cluster
 *
 * @param internal  Set whether the topic is internal to Kafka.
 * @param name  Set the name of the topic.
 * @param partitions  Set A list of partitions where the index represents the partition id and the element contains leadership and replica information for that partition.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.TopicDescription original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("topicDescriptionOf(internal, name, partitions)")
)
fun TopicDescription(
  internal: Boolean? = null,
  name: String? = null,
  partitions: Iterable<io.vertx.kafka.client.common.TopicPartitionInfo>? = null): TopicDescription = io.vertx.kafka.admin.TopicDescription().apply {

  if (internal != null) {
    this.setInternal(internal)
  }
  if (name != null) {
    this.setName(name)
  }
  if (partitions != null) {
    this.setPartitions(partitions.toList())
  }
}

