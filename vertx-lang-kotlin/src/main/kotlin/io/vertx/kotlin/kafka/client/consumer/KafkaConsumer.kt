/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
 * Pipe this <code>ReadStream</code> to the <code>WriteStream</code>.
 * <p>
 * Elements emitted by this stream will be written to the write stream until this stream ends or fails.
 * <p>
 * Once this stream has ended or failed, the write stream will be ended and the <code>handler</code> will be
 * called with the result.
 *
 * @param dst the destination write stream
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pipeToAwait(dst : WriteStream<KafkaConsumerRecord<K,V>>) : Unit {
  return awaitResult{
    this.pipeTo(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Subscribe to the given topic to get dynamically assigned partitions.
 * <p>
 * Due to internal buffering of messages, when changing the subscribed topic
 * the old topic may remain in effect
 * (as observed by the  record handler})
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new topic.
 *
 * @param topic topic to subscribe to
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topic : String) : Unit {
  return awaitResult{
    this.subscribe(topic, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Subscribe to the given list of topics to get dynamically assigned partitions.
 * <p>
 * Due to internal buffering of messages, when changing the subscribed topics
 * the old set of topics may remain in effect
 * (as observed by the  record handler})
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new set of topics.
 *
 * @param topics topics to subscribe to
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.subscribeAwait(topics : Set<String>) : Unit {
  return awaitResult{
    this.subscribe(topics, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Manually assign a partition to this consumer.
 * <p>
 * Due to internal buffering of messages, when reassigning
 * the old partition may remain in effect
 * (as observed by the  record handler)}
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new partition.
 *
 * @param topicPartition partition which want assigned
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartition : TopicPartition) : Unit {
  return awaitResult{
    this.assign(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Manually assign a list of partition to this consumer.
 * <p>
 * Due to internal buffering of messages, when reassigning
 * the old set of partitions may remain in effect
 * (as observed by the  record handler)}
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new set of partitions.
 *
 * @param topicPartitions partitions which want assigned
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.assignAwait(topicPartitions : Set<TopicPartition>) : Unit {
  return awaitResult{
    this.assign(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the set of partitions currently assigned to this consumer.
 *
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.assignmentAwait() : Set<TopicPartition> {
  return awaitResult{
    this.assignment(it)
  }
}

/**
 * Unsubscribe from topics currently subscribed with subscribe.
 *
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.unsubscribeAwait() : Unit {
  return awaitResult{
    this.unsubscribe({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the current subscription.
 *
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.subscriptionAwait() : Set<String> {
  return awaitResult{
    this.subscription(it)
  }
}

/**
 * Suspend fetching from the requested partition.
 * <p>
 * Due to internal buffering of messages,
 * the  will
 * continue to observe messages from the given <code>topicPartition</code>
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will not see messages
 * from the given <code>topicPartition</code>.
 *
 * @param topicPartition topic partition from which suspend fetching
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartition : TopicPartition) : Unit {
  return awaitResult{
    this.pause(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Suspend fetching from the requested partitions.
 * <p>
 * Due to internal buffering of messages,
 * the  will
 * continue to observe messages from the given <code>topicPartitions</code>
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will not see messages
 * from the given <code>topicPartitions</code>.
 *
 * @param topicPartitions topic partition from which suspend fetching
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pauseAwait(topicPartitions : Set<TopicPartition>) : Unit {
  return awaitResult{
    this.pause(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the set of partitions that were previously paused by a call to pause(Set).
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pausedAwait() : Set<TopicPartition> {
  return awaitResult{
    this.paused(it)
  }
}

/**
 * Resume specified partition which have been paused with pause.
 *
 * @param topicPartition topic partition from which resume fetching
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartition : TopicPartition) : Unit {
  return awaitResult{
    this.resume(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Resume specified partitions which have been paused with pause.
 *
 * @param topicPartitions topic partition from which resume fetching
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.resumeAwait(topicPartitions : Set<TopicPartition>) : Unit {
  return awaitResult{
    this.resume(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Overrides the fetch offsets that the consumer will use on the next poll.
 * <p>
 * Due to internal buffering of messages,
 * the  will
 * continue to observe messages fetched with respect to the old offset
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new offset.
 *
 * @param topicPartition topic partition for which seek
 * @param offset offset to seek inside the topic partition
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekAwait(topicPartition : TopicPartition, offset : Long) : Unit {
  return awaitResult{
    this.seek(topicPartition, offset, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Seek to the first offset for each of the given partition.
 * <p>
 * Due to internal buffering of messages,
 * the  will
 * continue to observe messages fetched with respect to the old offset
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new offset.
 *
 * @param topicPartition topic partition for which seek
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartition : TopicPartition) : Unit {
  return awaitResult{
    this.seekToBeginning(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Seek to the first offset for each of the given partitions.
 * <p>
 * Due to internal buffering of messages,
 * the  will
 * continue to observe messages fetched with respect to the old offset
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new offset.
 *
 * @param topicPartitions topic partition for which seek
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToBeginningAwait(topicPartitions : Set<TopicPartition>) : Unit {
  return awaitResult{
    this.seekToBeginning(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Seek to the last offset for each of the given partition.
 * <p>
 * Due to internal buffering of messages,
 * the  will
 * continue to observe messages fetched with respect to the old offset
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new offset.
 *
 * @param topicPartition topic partition for which seek
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartition : TopicPartition) : Unit {
  return awaitResult{
    this.seekToEnd(topicPartition, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Seek to the last offset for each of the given partitions.
 * <p>
 * Due to internal buffering of messages,
 * the  will
 * continue to observe messages fetched with respect to the old offset
 * until some time <em>after</em> the given <code>completionHandler</code>
 * is called. In contrast, the once the given <code>completionHandler</code>
 * is called the [io.vertx.kafka.client.consumer.KafkaConsumer] will only see messages
 * consistent with the new offset.
 *
 * @param topicPartitions topic partition for which seek
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.seekToEndAwait(topicPartitions : Set<TopicPartition>) : Unit {
  return awaitResult{
    this.seekToEnd(topicPartitions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Commit current offsets for all the subscribed list of topics and partition.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.commitAwait() : Unit {
  return awaitResult{
    this.commit({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the last committed offset for the given partition (whether the commit happened by this process or another).
 *
 * @param topicPartition topic partition for getting last committed offset
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.committedAwait(topicPartition : TopicPartition) : OffsetAndMetadata {
  return awaitResult{
    this.committed(topicPartition, it)
  }
}

/**
 * Get metadata about the partitions for a given topic.
 *
 * @param topic topic partition for which getting partitions info
 * @return current KafkaConsumer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.partitionsForAwait(topic : String) : List<PartitionInfo> {
  return awaitResult{
    this.partitionsFor(topic, it)
  }
}

/**
 * Close the consumer
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the offset of the next record that will be fetched (if a record with that offset exists).
 *
 * @param partition The partition to get the position for
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.positionAwait(partition : TopicPartition) : Long {
  return awaitResult{
    this.position(partition, it)
  }
}

/**
 * Look up the offset for the given partition by timestamp. Note: the result might be null in case
 * for the given timestamp no offset can be found -- e.g., when the timestamp refers to the future
 *
 * @param topicPartition TopicPartition to query.
 * @param timestamp Timestamp to be used in the query.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.offsetsForTimesAwait(topicPartition : TopicPartition, timestamp : Long) : OffsetAndTimestamp {
  return awaitResult{
    this.offsetsForTimes(topicPartition, timestamp, it)
  }
}

/**
 * Get the first offset for the given partitions.
 *
 * @param topicPartition the partition to get the earliest offset.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.beginningOffsetsAwait(topicPartition : TopicPartition) : Long {
  return awaitResult{
    this.beginningOffsets(topicPartition, it)
  }
}

/**
 * Get the last offset for the given partition. The last offset of a partition is the offset
 * of the upcoming message, i.e. the offset of the last available message + 1.
 *
 * @param topicPartition the partition to get the end offset.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.endOffsetsAwait(topicPartition : TopicPartition) : Long {
  return awaitResult{
    this.endOffsets(topicPartition, it)
  }
}

/**
 * Executes a poll for getting messages from Kafka
 *
 * @param timeout The time, in milliseconds, spent waiting in poll if data is not available in the buffer. If 0, returns immediately with any records that are available currently in the native Kafka consumer's buffer, else returns empty. Must not be negative.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.KafkaConsumer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaConsumer<K,V>.pollAwait(timeout : Long) : KafkaConsumerRecords<K,V> {
  return awaitResult{
    this.poll(timeout, it)
  }
}

