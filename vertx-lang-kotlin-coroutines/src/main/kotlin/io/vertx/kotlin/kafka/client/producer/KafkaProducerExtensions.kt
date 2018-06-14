package io.vertx.kotlin.kafka.client.producer

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.producer.KafkaProducer
import io.vertx.kafka.client.producer.KafkaProducerRecord
import io.vertx.kafka.client.producer.RecordMetadata
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Long
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Asynchronously write a record to a topic
 * @param record  record to write
 * @return  current KafkaWriteStream instance
 */
suspend fun <K : Any, V : Any> KafkaProducer<K, V>.writeSuspending(record: KafkaProducerRecord<K, V>): RecordMetadata {
  return awaitResult { this.write(record, it) }
}

/**
 *  Get the partition metadata for the give topic.
 * @param topic topic partition for which getting partitions info
 * @return  current KafkaProducer instance
 */
suspend fun <K : Any, V : Any> KafkaProducer<K, V>.partitionsFor(topic: String): MutableList<PartitionInfo> {
  return awaitResult { this.partitionsFor(topic, it) }
}

/**
 *  Close the producer */
suspend fun <K : Any, V : Any> KafkaProducer<K, V>.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Close the producer
 * @param timeout timeout to wait for closing */
suspend fun <K : Any, V : Any> KafkaProducer<K, V>.close(timeout: Long) {
  awaitResult<Void?> { this.close(timeout, it) }
}
