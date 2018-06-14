package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.AdminUtils
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.MutableMap

/**
 *  Creates a new Kafka topic on all Brokers managed by the given Zookeeper instance(s)
 * @param topicName Name of the to-be-created topic
 * @param partitionCount Number of partitions
 * @param replicationFactor Number of replicates. Must be lower or equal to the number of available Brokers */
suspend fun AdminUtils.createTopic(
  topicName: String,
  partitionCount: Int,
  replicationFactor: Int
) {
  awaitResult<Void?> { this.createTopic(topicName, partitionCount, replicationFactor, it) }
}

/**
 *  Creates a new Kafka topic on all Brokers managed by the given Zookeeper instance(s). In contrast
 *  to @see [AdminUtils.createTopic], one can pass in additional configuration
 *  parameters as a map (String -> String).
 * @param topicName Name of the to-be-created topic
 * @param partitionCount Number of partitions
 * @param replicationFactor Number of replicates. Must be lower or equal to the number of available Brokers
 * @param topicConfig map with additional topic configuration parameters */
suspend fun AdminUtils.createTopic(
  topicName: String,
  partitionCount: Int,
  replicationFactor: Int,
  topicConfig: MutableMap<String, String>
) {
  awaitResult<Void?> { this.createTopic(topicName, partitionCount, replicationFactor, topicConfig, it) }
}

/**
 *  Delete the Kafka topic given by the topicName.
 * @param topicName Name of the topic to be deleted */
suspend fun AdminUtils.deleteTopic(topicName: String) {
  awaitResult<Void?> { this.deleteTopic(topicName, it) }
}

/**
 *  Checks if the Kafka topic given by topicName does exist.
 * @param topicName Name of the topic */
suspend fun AdminUtils.topicExists(topicName: String): Boolean {
  return awaitResult { this.topicExists(topicName, it) }
}

/**
 *  Updates the configuration of the topic given by topicName. Configuration parameters
 *  are passed in as a Map (Key -> Value) of Strings.
 * @param topicName topic to be configured
 * @param topicConfig Map with configuration items */
suspend fun AdminUtils.changeTopicConfig(topicName: String, topicConfig: MutableMap<String, String>) {
  awaitResult<Void?> { this.changeTopicConfig(topicName, topicConfig, it) }
}

/**
 *  Closes the underlying connection to Zookeeper. It is required to call the method for cleanup
 *  purposes if AdminUtils was not created with autoClose set to true. */
suspend fun AdminUtils.close() {
  awaitResult<Void?> { this.close(it) }
}
