package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.AdminUtils
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.kafka.admin.AdminUtils.createTopic]
 *
 * @param topicName Name of the to-be-created topic
 * @param partitionCount Number of partitions
 * @param replicationFactor Number of replicates. Must be lower or equal to the number of available Brokers
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.AdminUtils] using Vert.x codegen.
 */
suspend fun AdminUtils.createTopicAwait(topicName: String, partitionCount: Int, replicationFactor: Int): Unit {
  return awaitResult {
    this.createTopic(topicName, partitionCount, replicationFactor) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.AdminUtils.createTopic]
 *
 * @param topicName Name of the to-be-created topic
 * @param partitionCount Number of partitions
 * @param replicationFactor Number of replicates. Must be lower or equal to the number of available Brokers
 * @param topicConfig map with additional topic configuration parameters
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.AdminUtils] using Vert.x codegen.
 */
suspend fun AdminUtils.createTopicAwait(topicName: String, partitionCount: Int, replicationFactor: Int, topicConfig: Map<String,String>): Unit {
  return awaitResult {
    this.createTopic(topicName, partitionCount, replicationFactor, topicConfig) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.AdminUtils.deleteTopic]
 *
 * @param topicName Name of the topic to be deleted
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.AdminUtils] using Vert.x codegen.
 */
suspend fun AdminUtils.deleteTopicAwait(topicName: String): Unit {
  return awaitResult {
    this.deleteTopic(topicName) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.AdminUtils.topicExists]
 *
 * @param topicName Name of the topic
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.AdminUtils] using Vert.x codegen.
 */
suspend fun AdminUtils.topicExistsAwait(topicName: String): Boolean {
  return awaitResult {
    this.topicExists(topicName, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.AdminUtils.changeTopicConfig]
 *
 * @param topicName topic to be configured
 * @param topicConfig Map with configuration items
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.AdminUtils] using Vert.x codegen.
 */
suspend fun AdminUtils.changeTopicConfigAwait(topicName: String, topicConfig: Map<String,String>): Unit {
  return awaitResult {
    this.changeTopicConfig(topicName, topicConfig) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.AdminUtils.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.AdminUtils] using Vert.x codegen.
 */
suspend fun AdminUtils.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

