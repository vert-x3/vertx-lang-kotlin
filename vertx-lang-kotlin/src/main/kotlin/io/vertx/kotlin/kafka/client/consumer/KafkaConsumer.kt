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

suspend fun <K,V> KafkaConsumer<K,V>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.handlerAwait() : KafkaConsumerRecord<K,V> {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topic : String) : Unit {
    return awaitResult{
        this.subscribe(topic, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topics : Set<String>) : Unit {
    return awaitResult{
        this.subscribe(topics, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartition : TopicPartition) : Unit {
    return awaitResult{
        this.assign(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartitions : Set<TopicPartition>) : Unit {
    return awaitResult{
        this.assign(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.assignmentAwait() : Set<TopicPartition> {
    return awaitResult{
        this.assignment(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.unsubscribeAwait() : Unit {
    return awaitResult{
        this.unsubscribe({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.subscriptionAwait() : Set<String> {
    return awaitResult{
        this.subscription(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartition : TopicPartition) : Unit {
    return awaitResult{
        this.pause(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartitions : Set<TopicPartition>) : Unit {
    return awaitResult{
        this.pause(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.pausedAwait() : Set<TopicPartition> {
    return awaitResult{
        this.paused(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartition : TopicPartition) : Unit {
    return awaitResult{
        this.resume(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartitions : Set<TopicPartition>) : Unit {
    return awaitResult{
        this.resume(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.partitionsRevokedHandlerAwait() : Set<TopicPartition> {
    return awaitEvent{
        this.partitionsRevokedHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.partitionsAssignedHandlerAwait() : Set<TopicPartition> {
    return awaitEvent{
        this.partitionsAssignedHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.seekAwait(topicPartition : TopicPartition, offset : Long) : Unit {
    return awaitResult{
        this.seek(topicPartition, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartition : TopicPartition) : Unit {
    return awaitResult{
        this.seekToBeginning(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartitions : Set<TopicPartition>) : Unit {
    return awaitResult{
        this.seekToBeginning(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartition : TopicPartition) : Unit {
    return awaitResult{
        this.seekToEnd(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartitions : Set<TopicPartition>) : Unit {
    return awaitResult{
        this.seekToEnd(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.commitAwait() : Unit {
    return awaitResult{
        this.commit({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.committedAwait(topicPartition : TopicPartition) : OffsetAndMetadata {
    return awaitResult{
        this.committed(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.partitionsForAwait(topic : String) : List<PartitionInfo> {
    return awaitResult{
        this.partitionsFor(topic, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.batchHandlerAwait() : KafkaConsumerRecords<K,V> {
    return awaitEvent{
        this.batchHandler(it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaConsumer<K,V>.positionAwait(partition : TopicPartition) : Long {
    return awaitResult{
        this.position(partition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.offsetsForTimesAwait(topicPartition : TopicPartition, timestamp : Long) : OffsetAndTimestamp {
    return awaitResult{
        this.offsetsForTimes(topicPartition, timestamp, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.beginningOffsetsAwait(topicPartition : TopicPartition) : Long {
    return awaitResult{
        this.beginningOffsets(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.endOffsetsAwait(topicPartition : TopicPartition) : Long {
    return awaitResult{
        this.endOffsets(topicPartition, it)
    }
}

suspend fun <K,V> KafkaConsumer<K,V>.pollAwait(timeout : Long) : KafkaConsumerRecords<K,V> {
    return awaitResult{
        this.poll(timeout, it)
    }
}

