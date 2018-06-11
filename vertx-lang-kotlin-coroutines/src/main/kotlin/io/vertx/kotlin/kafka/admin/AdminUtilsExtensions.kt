package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.AdminUtils
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.MutableMap

suspend fun AdminUtils.createTopic(
    topicName: String,
    partitionCount: Int,
    replicationFactor: Int
) {
  awaitResult<Void?> { this.createTopic(topicName, partitionCount, replicationFactor, it) }
}

suspend fun AdminUtils.createTopic(
    topicName: String,
    partitionCount: Int,
    replicationFactor: Int,
    topicConfig: MutableMap<String, String>
) {
  awaitResult<Void?> { this.createTopic(topicName, partitionCount, replicationFactor, topicConfig, it) }
}

suspend fun AdminUtils.deleteTopic(topicName: String) {
  awaitResult<Void?> { this.deleteTopic(topicName, it) }
}

suspend fun AdminUtils.topicExists(topicName: String): Boolean = awaitResult { this.topicExists(topicName, it) }

suspend fun AdminUtils.changeTopicConfig(topicName: String, topicConfig: MutableMap<String, String>) {
  awaitResult<Void?> { this.changeTopicConfig(topicName, topicConfig, it) }
}

suspend fun AdminUtils.close() {
  awaitResult<Void?> { this.close(it) }
}
