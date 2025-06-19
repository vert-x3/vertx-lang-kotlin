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
import io.vertx.kafka.client.common.TopicPartitionInfo
import org.apache.kafka.common.acl.AclOperation

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.TopicDescription] objects.
 *
 * A detailed description of a single topic in the cluster
 *
 * @param authorizedOperations  Set the id of the consumer group
 * @param internal  Set whether the topic is internal to Kafka.
 * @param name  Set the name of the topic.
 * @param partitions  Set A list of partitions where the index represents the partition id and the element contains leadership and replica information for that partition.
 * @param topicId  Set the id of the topic.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.TopicDescription original] using Vert.x codegen.
 */
fun topicDescriptionOf(
  authorizedOperations: Iterable<AclOperation>? = null,
  internal: Boolean? = null,
  name: String? = null,
  partitions: Iterable<io.vertx.kafka.client.common.TopicPartitionInfo>? = null,
  topicId: org.apache.kafka.common.Uuid? = null): TopicDescription = io.vertx.kafka.admin.TopicDescription().apply {

  if (authorizedOperations != null) {
    this.setAuthorizedOperations(authorizedOperations.toSet())
  }
  if (internal != null) {
    this.setInternal(internal)
  }
  if (name != null) {
    this.setName(name)
  }
  if (partitions != null) {
    this.setPartitions(partitions.toList())
  }
  if (topicId != null) {
    this.setTopicId(topicId)
  }
}

