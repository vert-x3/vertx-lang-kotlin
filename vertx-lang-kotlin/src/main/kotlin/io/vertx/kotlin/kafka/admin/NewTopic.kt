package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.NewTopic

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.NewTopic] objects.
 *
 * A new topic to be created
 *
 * @param config  Set the configuration for the new topic or null if no configs ever specified
 * @param name  Set the name of the topic to be created
 * @param numPartitions  Set the number of partitions for the new topic or -1 if a replica assignment has been specified
 * @param replicationFactor  Set the replication factor for the new topic or -1 if a replica assignment has been specified
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.NewTopic original] using Vert.x codegen.
 */
fun newTopicOf(
  config: Map<String, String>? = null,
  name: String? = null,
  numPartitions: Int? = null,
  replicationFactor: Short? = null): NewTopic = io.vertx.kafka.admin.NewTopic().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (name != null) {
    this.setName(name)
  }
  if (numPartitions != null) {
    this.setNumPartitions(numPartitions)
  }
  if (replicationFactor != null) {
    this.setReplicationFactor(replicationFactor)
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.NewTopic] objects.
 *
 * A new topic to be created
 *
 * @param config  Set the configuration for the new topic or null if no configs ever specified
 * @param name  Set the name of the topic to be created
 * @param numPartitions  Set the number of partitions for the new topic or -1 if a replica assignment has been specified
 * @param replicationFactor  Set the replication factor for the new topic or -1 if a replica assignment has been specified
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.NewTopic original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("newTopicOf(config, name, numPartitions, replicationFactor)")
)
fun NewTopic(
  config: Map<String, String>? = null,
  name: String? = null,
  numPartitions: Int? = null,
  replicationFactor: Short? = null): NewTopic = io.vertx.kafka.admin.NewTopic().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (name != null) {
    this.setName(name)
  }
  if (numPartitions != null) {
    this.setNumPartitions(numPartitions)
  }
  if (replicationFactor != null) {
    this.setReplicationFactor(replicationFactor)
  }
}

