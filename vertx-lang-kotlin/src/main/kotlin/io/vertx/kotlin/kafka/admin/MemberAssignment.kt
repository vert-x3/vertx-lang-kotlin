package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.MemberAssignment
import io.vertx.kafka.client.common.TopicPartition

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.MemberAssignment] objects.
 *
 * A description of the assignments of a specific group member
 *
 * @param topicPartitions  Set the list of topic partitions
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.MemberAssignment original] using Vert.x codegen.
 */
fun memberAssignmentOf(
  topicPartitions: Iterable<io.vertx.kafka.client.common.TopicPartition>? = null): MemberAssignment = io.vertx.kafka.admin.MemberAssignment().apply {

  if (topicPartitions != null) {
    this.setTopicPartitions(topicPartitions.toSet())
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.MemberAssignment] objects.
 *
 * A description of the assignments of a specific group member
 *
 * @param topicPartitions  Set the list of topic partitions
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.MemberAssignment original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("memberAssignmentOf(topicPartitions)")
)
fun MemberAssignment(
  topicPartitions: Iterable<io.vertx.kafka.client.common.TopicPartition>? = null): MemberAssignment = io.vertx.kafka.admin.MemberAssignment().apply {

  if (topicPartitions != null) {
    this.setTopicPartitions(topicPartitions.toSet())
  }
}

