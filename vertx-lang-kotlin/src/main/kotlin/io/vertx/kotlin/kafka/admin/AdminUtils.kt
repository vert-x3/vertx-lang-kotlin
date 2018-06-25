package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.AdminUtils
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AdminUtils.createTopicAwait(topicName : String, partitionCount : Int, replicationFactor : Int) : Unit {
    return awaitResult{
        this.createTopic(topicName, partitionCount, replicationFactor, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AdminUtils.createTopicAwait(topicName : String, partitionCount : Int, replicationFactor : Int, topicConfig : Map<String,String>) : Unit {
    return awaitResult{
        this.createTopic(topicName, partitionCount, replicationFactor, topicConfig, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AdminUtils.deleteTopicAwait(topicName : String) : Unit {
    return awaitResult{
        this.deleteTopic(topicName, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AdminUtils.topicExistsAwait(topicName : String) : Boolean {
    return awaitResult{
        this.topicExists(topicName, it)
    }
}

suspend fun AdminUtils.changeTopicConfigAwait(topicName : String, topicConfig : Map<String,String>) : Unit {
    return awaitResult{
        this.changeTopicConfig(topicName, topicConfig, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AdminUtils.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

