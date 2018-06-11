package io.vertx.kotlin.kafka.client.consumer

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.common.TopicPartition
import io.vertx.kafka.client.consumer.KafkaConsumer
import io.vertx.kafka.client.consumer.OffsetAndMetadata
import io.vertx.kafka.client.consumer.OffsetAndTimestamp
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.collections.MutableList
import kotlin.collections.MutableSet

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.subscribe(topic: String) {
  awaitResult<Void?> { this.subscribe(topic, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.subscribe(topics: MutableSet<String>) {
  awaitResult<Void?> { this.subscribe(topics, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.assign(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.assign(topicPartition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.assign(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.assign(topicPartitions, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.assignment(): MutableSet<TopicPartition> {
  return awaitResult { this.assignment(it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.unsubscribe() {
  awaitResult<Void?> { this.unsubscribe(it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.subscription(): MutableSet<String> {
  return awaitResult { this.subscription(it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.pause(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.pause(topicPartition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.pause(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.pause(topicPartitions, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.paused(): MutableSet<TopicPartition> {
  return awaitResult { this.paused(it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.resume(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.resume(topicPartition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.resume(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.resume(topicPartitions, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seek(topicPartition: TopicPartition, offset: Long) {
  awaitResult<Void?> { this.seek(topicPartition, offset, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToBeginning(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.seekToBeginning(topicPartition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToBeginning(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.seekToBeginning(topicPartitions, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToEnd(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.seekToEnd(topicPartition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToEnd(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.seekToEnd(topicPartitions, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.commit() {
  awaitResult<Void?> { this.commit(it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.committed(topicPartition: TopicPartition): OffsetAndMetadata {
  return awaitResult { this.committed(topicPartition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.partitionsFor(topic: String): MutableList<PartitionInfo> {
  return awaitResult { this.partitionsFor(topic, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.position(partition: TopicPartition): Long {
  return awaitResult { this.position(partition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.offsetsForTimes(topicPartition: TopicPartition, timestamp: Long): OffsetAndTimestamp {
  return awaitResult { this.offsetsForTimes(topicPartition, timestamp, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.beginningOffsets(topicPartition: TopicPartition): Long {
  return awaitResult { this.beginningOffsets(topicPartition, it) }
}

suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.endOffsets(topicPartition: TopicPartition): Long {
  return awaitResult { this.endOffsets(topicPartition, it) }
}
