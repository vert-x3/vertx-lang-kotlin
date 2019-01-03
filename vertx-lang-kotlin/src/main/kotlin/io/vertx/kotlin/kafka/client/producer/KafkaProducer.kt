package io.vertx.kotlin.kafka.client.producer

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.producer.KafkaProducer
import io.vertx.kafka.client.producer.KafkaProducerRecord
import io.vertx.kafka.client.producer.RecordMetadata
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Asynchronously write a record to a topic
 *
 * @param record record to write
 * @returncurrent KafkaWriteStream instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.producer.KafkaProducer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.writeAwait(record : KafkaProducerRecord<K,V>) : RecordMetadata {
  return awaitResult{
    this.write(record, it)
  }
}

/**
 * Get the partition metadata for the give topic.
 *
 * @param topic topic partition for which getting partitions info
 * @returncurrent KafkaProducer instance *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.producer.KafkaProducer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.partitionsForAwait(topic : String) : List<PartitionInfo> {
  return awaitResult{
    this.partitionsFor(topic, it)
  }
}

/**
 * Close the producer
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.producer.KafkaProducer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Close the producer
 *
 * @param timeout timeout to wait for closing
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.producer.KafkaProducer original] using Vert.x codegen.
 */
suspend fun <K,V> KafkaProducer<K,V>.closeAwait(timeout : Long) : Unit {
  return awaitResult{
    this.close(timeout, { ar -> it.handle(ar.mapEmpty()) })}
}

