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

/**
 *  Subscribe to the given topic to get dynamically assigned partitions.
 *  <p>
 *  Due to internal buffering of messages, when changing the subscribed topic  
 *  the old topic may remain in effect 
 *  (as observed by the {@linkplain #handler(Handler)} record handler}) 
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new topic.
 * @param topic  topic to subscribe to
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.subscribeSuspending(topic: String) {
  awaitResult<Void?> { this.subscribe(topic, it) }
}

/**
 *  Subscribe to the given list of topics to get dynamically assigned partitions.
 *  <p>
 *  Due to internal buffering of messages, when changing the subscribed topics  
 *  the old set of topics may remain in effect 
 *  (as observed by the {@linkplain #handler(Handler)} record handler}) 
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new set of topics.
 * @param topics  topics to subscribe to
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.subscribeSuspending(topics: MutableSet<String>) {
  awaitResult<Void?> { this.subscribe(topics, it) }
}

/**
 *  Manually assign a partition to this consumer.
 *  <p>
 *  Due to internal buffering of messages, when reassigning
 *  the old partition may remain in effect 
 *  (as observed by the {@linkplain #handler(Handler)} record handler)} 
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new partition.
 * @param topicPartition  partition which want assigned
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.assignSuspending(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.assign(topicPartition, it) }
}

/**
 *  Manually assign a list of partition to this consumer.
 *  <p>
 *  Due to internal buffering of messages, when reassigning
 *  the old set of partitions may remain in effect 
 *  (as observed by the {@linkplain #handler(Handler)} record handler)} 
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new set of partitions.
 * @param topicPartitions  partitions which want assigned
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.assignSuspending(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.assign(topicPartitions, it) }
}

/**
 *  Get the set of partitions currently assigned to this consumer.
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.assignment(): MutableSet<TopicPartition> {
  return awaitResult { this.assignment(it) }
}

/**
 *  Unsubscribe from topics currently subscribed with subscribe.
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.unsubscribeSuspending() {
  awaitResult<Void?> { this.unsubscribe(it) }
}

/**
 *  Get the current subscription.
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.subscription(): MutableSet<String> {
  return awaitResult { this.subscription(it) }
}

/**
 *  Suspend fetching from the requested partition.
 *  <p>
 *  Due to internal buffering of messages,
 *  the {@linkplain #handler(Handler) record handler} will 
 *  continue to observe messages from the given `topicParation` 
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will not see messages 
 *  from the given `topicParation`.
 * @param topicPartition topic partition from which suspend fetching
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.pauseSuspending(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.pause(topicPartition, it) }
}

/**
 *  Suspend fetching from the requested partitions.
 *  <p>
 *  Due to internal buffering of messages,
 *  the {@linkplain #handler(Handler) record handler} will 
 *  continue to observe messages from the given `topicParations` 
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will not see messages 
 *  from the given `topicParations`.
 * @param topicPartitions topic partition from which suspend fetching
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.pauseSuspending(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.pause(topicPartitions, it) }
}

/**
 *  Get the set of partitions that were previously paused by a call to pause(Set). */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.paused(): MutableSet<TopicPartition> {
  return awaitResult { this.paused(it) }
}

/**
 *  Resume specified partition which have been paused with pause.
 * @param topicPartition topic partition from which resume fetching
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.resumeSuspending(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.resume(topicPartition, it) }
}

/**
 *  Resume specified partitions which have been paused with pause.
 * @param topicPartitions topic partition from which resume fetching
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.resumeSuspending(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.resume(topicPartitions, it) }
}

/**
 *  Overrides the fetch offsets that the consumer will use on the next poll.
 *  <p>
 *  Due to internal buffering of messages,
 *  the {@linkplain #handler(Handler) record handler} will 
 *  continue to observe messages fetched with respect to the old offset  
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new offset.
 * @param topicPartition  topic partition for which seek
 * @param offset  offset to seek inside the topic partition
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekSuspending(topicPartition: TopicPartition, offset: Long) {
  awaitResult<Void?> { this.seek(topicPartition, offset, it) }
}

/**
 *  Seek to the first offset for each of the given partition.
 *  <p>
 *  Due to internal buffering of messages,
 *  the {@linkplain #handler(Handler) record handler} will 
 *  continue to observe messages fetched with respect to the old offset  
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new offset.
 * @param topicPartition topic partition for which seek
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToBeginningSuspending(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.seekToBeginning(topicPartition, it) }
}

/**
 *  Seek to the first offset for each of the given partitions.
 *  <p>
 *  Due to internal buffering of messages,
 *  the {@linkplain #handler(Handler) record handler} will 
 *  continue to observe messages fetched with respect to the old offset  
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new offset.
 * @param topicPartitions topic partition for which seek
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToBeginningSuspending(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.seekToBeginning(topicPartitions, it) }
}

/**
 *  Seek to the last offset for each of the given partition.
 *  <p>
 *  Due to internal buffering of messages,
 *  the {@linkplain #handler(Handler) record handler} will 
 *  continue to observe messages fetched with respect to the old offset  
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new offset.
 * @param topicPartition topic partition for which seek
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToEndSuspending(topicPartition: TopicPartition) {
  awaitResult<Void?> { this.seekToEnd(topicPartition, it) }
}

/**
 *  Seek to the last offset for each of the given partitions.
 *  <p>
 *  Due to internal buffering of messages,
 *  the {@linkplain #handler(Handler) record handler} will 
 *  continue to observe messages fetched with respect to the old offset  
 *  until some time <em>after</em> the given `completionHandler` 
 *  is called. In contrast, the once the given `completionHandler` 
 *  is called the [KafkaConsumer.batchHandler] will only see messages 
 *  consistent with the new offset.
 * @param topicPartitions topic partition for which seek
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.seekToEndSuspending(topicPartitions: MutableSet<TopicPartition>) {
  awaitResult<Void?> { this.seekToEnd(topicPartitions, it) }
}

/**
 *  Commit current offsets for all the subscribed list of topics and partition. */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.commitSuspending() {
  awaitResult<Void?> { this.commit(it) }
}

/**
 *  Get the last committed offset for the given partition (whether the commit happened by this process or another).
 * @param topicPartition  topic partition for getting last committed offset */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.committed(topicPartition: TopicPartition): OffsetAndMetadata {
  return awaitResult { this.committed(topicPartition, it) }
}

/**
 *  Get metadata about the partitions for a given topic.
 * @param topic topic partition for which getting partitions info
 * @return  current KafkaConsumer instance
 */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.partitionsFor(topic: String): MutableList<PartitionInfo> {
  return awaitResult { this.partitionsFor(topic, it) }
}

/**
 *  Close the consumer */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Get the offset of the next record that will be fetched (if a record with that offset exists).
 * @param partition The partition to get the position for */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.position(partition: TopicPartition): Long {
  return awaitResult { this.position(partition, it) }
}

/**
 *  Look up the offset for the given partition by timestamp. Note: the result might be null in case
 *  for the given timestamp no offset can be found -- e.g., when the timestamp refers to the future
 * @param topicPartition TopicPartition to query.
 * @param timestamp Timestamp to be used in the query. */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.offsetsForTimes(topicPartition: TopicPartition, timestamp: Long): OffsetAndTimestamp {
  return awaitResult { this.offsetsForTimes(topicPartition, timestamp, it) }
}

/**
 *  Get the first offset for the given partitions.
 * @param topicPartition the partition to get the earliest offset. */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.beginningOffsets(topicPartition: TopicPartition): Long {
  return awaitResult { this.beginningOffsets(topicPartition, it) }
}

/**
 *  Get the last offset for the given partition. The last offset of a partition is the offset
 *  of the upcoming message, i.e. the offset of the last available message + 1.
 * @param topicPartition the partition to get the end offset. */
suspend fun <K : Any, V : Any> KafkaConsumer<K, V>.endOffsets(topicPartition: TopicPartition): Long {
  return awaitResult { this.endOffsets(topicPartition, it) }
}
