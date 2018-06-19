package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.AdminUtils
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AdminUtils.createTopicAwait(topicName : String, partitionCount : Int, replicationFactor : Int) : Void? {
    return awaitResult{
        this.createTopic(topicName, partitionCount, replicationFactor, it)
    }
}

suspend fun AdminUtils.createTopicAwait(topicName : String, partitionCount : Int, replicationFactor : Int, topicConfig : Map<String,String>) : Void? {
    return awaitResult{
        this.createTopic(topicName, partitionCount, replicationFactor, topicConfig, it)
    }
}

suspend fun AdminUtils.deleteTopicAwait(topicName : String) : Void? {
    return awaitResult{
        this.deleteTopic(topicName, it)
    }
}

suspend fun AdminUtils.topicExistsAwait(topicName : String) : Boolean? {
    return awaitResult{
        this.topicExists(topicName, it)
    }
}

suspend fun AdminUtils.changeTopicConfigAwait(topicName : String, topicConfig : Map<String,String>) : Void? {
    return awaitResult{
        this.changeTopicConfig(topicName, topicConfig, it)
    }
}

suspend fun AdminUtils.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

