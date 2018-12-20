package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.TopicPartition

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.TopicPartition] objects.
 *
 * Represent information related to a partition for a topic
 *
 * @param partition  Set the partition number
 * @param topic  Set the topic name
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.TopicPartition original] using Vert.x codegen.
 */
fun topicPartitionOf(
  partition: Int? = null,
  topic: String? = null): TopicPartition = io.vertx.kafka.client.common.TopicPartition().apply {

  if (partition != null) {
    this.setPartition(partition)
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

