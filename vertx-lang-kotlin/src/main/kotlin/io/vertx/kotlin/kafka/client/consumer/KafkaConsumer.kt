package io.vertx.kotlin.kafka.client.consumer

import io.vertx.core.streams.WriteStream
import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.common.TopicPartition
import io.vertx.kafka.client.consumer.KafkaConsumer
import io.vertx.kafka.client.consumer.KafkaConsumerRecord
import io.vertx.kafka.client.consumer.KafkaConsumerRecords
import io.vertx.kafka.client.consumer.OffsetAndMetadata
import io.vertx.kafka.client.consumer.OffsetAndTimestamp
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pipeToAwait(dst: WriteStream<KafkaConsumerRecord<K,V>>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.subscribe]
 *
 * @param topic topic to subscribe to
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topic: String): Unit {
  return awaitResult {
    this.subscribe(topic) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.subscribe]
 *
 * @param topics topics to subscribe to
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topics: Set<String>): Unit {
  return awaitResult {
    this.subscribe(topics) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.assign]
 *
 * @param topicPartition partition which want assigned
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartition: TopicPartition): Unit {
  return awaitResult {
    this.assign(topicPartition) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.assign]
 *
 * @param topicPartitions partitions which want assigned
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartitions: Set<TopicPartition>): Unit {
  return awaitResult {
    this.assign(topicPartitions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.assignment]
 *
 * @return [Set<TopicPartition>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.assignmentAwait(): Set<TopicPartition> {
  return awaitResult {
    this.assignment(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.unsubscribe]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.unsubscribeAwait(): Unit {
  return awaitResult {
    this.unsubscribe { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.subscription]
 *
 * @return [Set<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.subscriptionAwait(): Set<String> {
  return awaitResult {
    this.subscription(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.pause]
 *
 * @param topicPartition topic partition from which suspend fetching
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartition: TopicPartition): Unit {
  return awaitResult {
    this.pause(topicPartition) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.pause]
 *
 * @param topicPartitions topic partition from which suspend fetching
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartitions: Set<TopicPartition>): Unit {
  return awaitResult {
    this.pause(topicPartitions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.paused]
 *
 * @return [Set<TopicPartition>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pausedAwait(): Set<TopicPartition> {
  return awaitResult {
    this.paused(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.resume]
 *
 * @param topicPartition topic partition from which resume fetching
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartition: TopicPartition): Unit {
  return awaitResult {
    this.resume(topicPartition) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.resume]
 *
 * @param topicPartitions topic partition from which resume fetching
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartitions: Set<TopicPartition>): Unit {
  return awaitResult {
    this.resume(topicPartitions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.seek]
 *
 * @param topicPartition topic partition for which seek
 * @param offset offset to seek inside the topic partition
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekAwait(topicPartition: TopicPartition, offset: Long): Unit {
  return awaitResult {
    this.seek(topicPartition, offset) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.seekToBeginning]
 *
 * @param topicPartition topic partition for which seek
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartition: TopicPartition): Unit {
  return awaitResult {
    this.seekToBeginning(topicPartition) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.seekToBeginning]
 *
 * @param topicPartitions topic partition for which seek
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartitions: Set<TopicPartition>): Unit {
  return awaitResult {
    this.seekToBeginning(topicPartitions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.seekToEnd]
 *
 * @param topicPartition topic partition for which seek
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartition: TopicPartition): Unit {
  return awaitResult {
    this.seekToEnd(topicPartition) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.seekToEnd]
 *
 * @param topicPartitions topic partition for which seek
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartitions: Set<TopicPartition>): Unit {
  return awaitResult {
    this.seekToEnd(topicPartitions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.commit]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.commitAwait(): Unit {
  return awaitResult {
    this.commit { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.committed]
 *
 * @param topicPartition topic partition for getting last committed offset
 * @return [OffsetAndMetadata]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.committedAwait(topicPartition: TopicPartition): OffsetAndMetadata {
  return awaitResult {
    this.committed(topicPartition, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.partitionsFor]
 *
 * @param topic topic partition for which getting partitions info
 * @return [List<PartitionInfo>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.partitionsForAwait(topic: String): List<PartitionInfo> {
  return awaitResult {
    this.partitionsFor(topic, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.position]
 *
 * @param partition The partition to get the position for
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.positionAwait(partition: TopicPartition): Long {
  return awaitResult {
    this.position(partition, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.offsetsForTimes]
 *
 * @param topicPartition TopicPartition to query.
 * @param timestamp Timestamp to be used in the query.
 * @return [OffsetAndTimestamp]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.offsetsForTimesAwait(topicPartition: TopicPartition, timestamp: Long): OffsetAndTimestamp {
  return awaitResult {
    this.offsetsForTimes(topicPartition, timestamp, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.beginningOffsets]
 *
 * @param topicPartition the partition to get the earliest offset.
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.beginningOffsetsAwait(topicPartition: TopicPartition): Long {
  return awaitResult {
    this.beginningOffsets(topicPartition, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.endOffsets]
 *
 * @param topicPartition the partition to get the end offset.
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.endOffsetsAwait(topicPartition: TopicPartition): Long {
  return awaitResult {
    this.endOffsets(topicPartition, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.consumer.KafkaConsumer.poll]
 *
 * @param timeout The time, in milliseconds, spent waiting in poll if data is not available in the buffer. If 0, returns immediately with any records that are available currently in the native Kafka consumer's buffer, else returns empty. Must not be negative.
 * @return [KafkaConsumerRecords<K,V>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.consumer.KafkaConsumer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pollAwait(timeout: Long): KafkaConsumerRecords<K,V> {
  return awaitResult {
    this.poll(timeout, it)
  }
}

