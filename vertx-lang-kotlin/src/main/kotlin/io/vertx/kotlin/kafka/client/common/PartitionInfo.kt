package io.vertx.kotlin.kafka.client.common

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.common.Node

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.PartitionInfo] objects.
 *
 * Information about a specific Kafka topic partition
 *
 * @param inSyncReplicas  Set the subset of the replicas that are in sync
 * @param leader  Set the node id of the node currently acting as a leader
 * @param partition  Set the partition id
 * @param replicas  Set the complete set of replicas for this partition
 * @param topic  Set the topic name
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.PartitionInfo original] using Vert.x codegen.
 */
fun partitionInfoOf(
  inSyncReplicas: Iterable<io.vertx.kafka.client.common.Node>? = null,
  leader: io.vertx.kafka.client.common.Node? = null,
  partition: Int? = null,
  replicas: Iterable<io.vertx.kafka.client.common.Node>? = null,
  topic: String? = null): PartitionInfo = io.vertx.kafka.client.common.PartitionInfo().apply {

  if (inSyncReplicas != null) {
    this.setInSyncReplicas(inSyncReplicas.toList())
  }
  if (leader != null) {
    this.setLeader(leader)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (replicas != null) {
    this.setReplicas(replicas.toList())
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.client.common.PartitionInfo] objects.
 *
 * Information about a specific Kafka topic partition
 *
 * @param inSyncReplicas  Set the subset of the replicas that are in sync
 * @param leader  Set the node id of the node currently acting as a leader
 * @param partition  Set the partition id
 * @param replicas  Set the complete set of replicas for this partition
 * @param topic  Set the topic name
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.common.PartitionInfo original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("partitionInfoOf(inSyncReplicas, leader, partition, replicas, topic)")
)
fun PartitionInfo(
  inSyncReplicas: Iterable<io.vertx.kafka.client.common.Node>? = null,
  leader: io.vertx.kafka.client.common.Node? = null,
  partition: Int? = null,
  replicas: Iterable<io.vertx.kafka.client.common.Node>? = null,
  topic: String? = null): PartitionInfo = io.vertx.kafka.client.common.PartitionInfo().apply {

  if (inSyncReplicas != null) {
    this.setInSyncReplicas(inSyncReplicas.toList())
  }
  if (leader != null) {
    this.setLeader(leader)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (replicas != null) {
    this.setReplicas(replicas.toList())
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

