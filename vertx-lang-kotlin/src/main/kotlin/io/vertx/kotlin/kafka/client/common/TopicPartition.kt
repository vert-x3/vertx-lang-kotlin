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

import io.vertx.kafka.client.common.TopicPartition

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.TopicPartition] objects.
 *
 * Represent information related to a partition for a topic
 *
 * @param topic  Set the topic name
 * @param partition  Set the partition number
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.TopicPartition original] using Vert.x codegen.
 */
fun topicPartitionOf(
  topic: String? = null,
  partition: Int? = null): TopicPartition = io.vertx.kafka.client.common.TopicPartition().apply {

  if (topic != null) {
    this.setTopic(topic)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
}

