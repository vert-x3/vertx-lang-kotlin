package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.AdminUtils
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Creates a new Kafka topic on all Brokers managed by the given Zookeeper instance(s)
 *
 * @param topicName Name of the to-be-created topic
 * @param partitionCount Number of partitions
 * @param replicationFactor Number of replicates. Must be lower or equal to the number of available Brokers
 * @param completionHandler vert.x callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.AdminUtils original] using Vert.x codegen.
 */
suspend fun AdminUtils.createTopicAwait(topicName : String, partitionCount : Int, replicationFactor : Int) : Unit {
  return awaitResult{
    this.createTopic(topicName, partitionCount, replicationFactor, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Creates a new Kafka topic on all Brokers managed by the given Zookeeper instance(s). In contrast
 * to @see [io.vertx.kafka.admin.AdminUtils], one can pass in additional configuration
 * parameters as a map (String -> String).
 *
 * @param topicName Name of the to-be-created topic
 * @param partitionCount Number of partitions
 * @param replicationFactor Number of replicates. Must be lower or equal to the number of available Brokers
 * @param topicConfig map with additional topic configuration parameters
 * @param completionHandler vert.x callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.AdminUtils original] using Vert.x codegen.
 */
suspend fun AdminUtils.createTopicAwait(topicName : String, partitionCount : Int, replicationFactor : Int, topicConfig : Map<String,String>) : Unit {
  return awaitResult{
    this.createTopic(topicName, partitionCount, replicationFactor, topicConfig, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Delete the Kafka topic given by the topicName.
 *
 * @param topicName Name of the topic to be deleted
 * @param completionHandler vert.x callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.AdminUtils original] using Vert.x codegen.
 */
suspend fun AdminUtils.deleteTopicAwait(topicName : String) : Unit {
  return awaitResult{
    this.deleteTopic(topicName, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Checks if the Kafka topic given by topicName does exist.
 *
 * @param topicName Name of the topic
 * @param completionHandler vert.x callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.AdminUtils original] using Vert.x codegen.
 */
suspend fun AdminUtils.topicExistsAwait(topicName : String) : Boolean {
  return awaitResult{
    this.topicExists(topicName, it)
  }
}

/**
 * Updates the configuration of the topic given by topicName. Configuration parameters
 * are passed in as a Map (Key -> Value) of Strings.
 *
 * @param topicName topic to be configured
 * @param topicConfig Map with configuration items
 * @param completionHandler vert.x callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.AdminUtils original] using Vert.x codegen.
 */
suspend fun AdminUtils.changeTopicConfigAwait(topicName : String, topicConfig : Map<String,String>) : Unit {
  return awaitResult{
    this.changeTopicConfig(topicName, topicConfig, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Closes the underlying connection to Zookeeper. It is required to call the method for cleanup
 * purposes if AdminUtils was not created with autoClose set to true.
 *
 * @param completionHandler vert.x callback
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.AdminUtils original] using Vert.x codegen.
 */
suspend fun AdminUtils.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

