package io.vertx.kotlin.kafka.client.producer

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.producer.KafkaProducer
import io.vertx.kafka.client.producer.KafkaProducerRecord
import io.vertx.kafka.client.producer.RecordMetadata
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.write]
 *
 * @param record record to write
 * @return [RecordMetadata]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.writeAwait(record: KafkaProducerRecord<K,V>): RecordMetadata {
  return awaitResult {
    this.write(record, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.partitionsFor]
 *
 * @param topic topic partition for which getting partitions info
 * @return [List<PartitionInfo>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.partitionsForAwait(topic: String): List<PartitionInfo> {
  return awaitResult {
    this.partitionsFor(topic, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.close]
 *
 * @param timeout timeout to wait for closing
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.closeAwait(timeout: Long): Unit {
  return awaitResult {
    this.close(timeout) { ar -> it.handle(ar.mapEmpty()) }
  }
}

