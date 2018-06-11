package io.vertx.kotlin.kafka.client.consumer

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.common.TopicPartition
import io.vertx.kafka.client.consumer.KafkaConsumer
import io.vertx.kafka.client.consumer.KafkaConsumerRecord
import io.vertx.kafka.client.consumer.KafkaConsumerRecords
import io.vertx.kafka.client.consumer.OffsetAndMetadata
import io.vertx.kafka.client.consumer.OffsetAndTimestamp
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun <K,V> KafkaConsumer<K,V>.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.handlerAwait() : KafkaConsumerRecord<K, V>? {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.endHandlerAwait() : Void? {
    return awaitEvent{
        this.endHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topic : String) : Void? {
    return awaitResult{
        this.subscribe(topic, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topics : Set<String>) : Void? {
    return awaitResult{
        this.subscribe(topics, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartition : TopicPartition) : Void? {
    return awaitResult{
        this.assign(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartitions : Set<TopicPartition>) : Void? {
    return awaitResult{
        this.assign(topicPartitions, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.assignmentAwait() : Set<TopicPartition>? {
    return awaitResult{
        this.assignment(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.unsubscribeAwait() : Void? {
    return awaitResult{
        this.unsubscribe(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.subscriptionAwait() : Set<String>? {
    return awaitResult{
        this.subscription(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartition : TopicPartition) : Void? {
    return awaitResult{
        this.pause(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartitions : Set<TopicPartition>) : Void? {
    return awaitResult{
        this.pause(topicPartitions, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.pausedAwait() : Set<TopicPartition>? {
    return awaitResult{
        this.paused(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartition : TopicPartition) : Void? {
    return awaitResult{
        this.resume(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartitions : Set<TopicPartition>) : Void? {
    return awaitResult{
        this.resume(topicPartitions, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.partitionsRevokedHandlerAwait() : Set<TopicPartition>? {
    return awaitEvent{
        this.partitionsRevokedHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.partitionsAssignedHandlerAwait() : Set<TopicPartition>? {
    return awaitEvent{
        this.partitionsAssignedHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.seekAwait(topicPartition : TopicPartition, offset : Long) : Void? {
    return awaitResult{
        this.seek(topicPartition, offset, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartition : TopicPartition) : Void? {
    return awaitResult{
        this.seekToBeginning(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartitions : Set<TopicPartition>) : Void? {
    return awaitResult{
        this.seekToBeginning(topicPartitions, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartition : TopicPartition) : Void? {
    return awaitResult{
        this.seekToEnd(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartitions : Set<TopicPartition>) : Void? {
    return awaitResult{
        this.seekToEnd(topicPartitions, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.commitAwait() : Void? {
    return awaitResult{
        this.commit(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.committedAwait(topicPartition : TopicPartition) : OffsetAndMetadata? {
    return awaitResult{
        this.committed(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.partitionsForAwait(topic : String) : List<PartitionInfo>? {
    return awaitResult{
        this.partitionsFor(topic, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.batchHandlerAwait() : KafkaConsumerRecords<K, V>? {
    return awaitEvent{
        this.batchHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.positionAwait(partition : TopicPartition) : Long? {
    return awaitResult{
        this.position(partition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.offsetsForTimesAwait(topicPartition : TopicPartition, timestamp : Long) : OffsetAndTimestamp? {
    return awaitResult{
        this.offsetsForTimes(topicPartition, timestamp, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.beginningOffsetsAwait(topicPartition : TopicPartition) : Long? {
    return awaitResult{
        this.beginningOffsets(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.endOffsetsAwait(topicPartition : TopicPartition) : Long? {
    return awaitResult{
        this.endOffsets(topicPartition, it)
    }
}

