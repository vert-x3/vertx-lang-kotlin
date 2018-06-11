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

suspend fun <K : Any, V : Any> KafkaProducer<K, V>.write(record: KafkaProducerRecord<K, V>): RecordMetadata {
  return awaitResult { this.write(record, it) }
}

suspend fun <K : Any, V : Any> KafkaProducer<K, V>.partitionsFor(topic: String): MutableList<PartitionInfo> {
  return awaitResult { this.partitionsFor(topic, it) }
}

suspend fun <K : Any, V : Any> KafkaProducer<K, V>.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun <K : Any, V : Any> KafkaProducer<K, V>.close(timeout: Long) {
  awaitResult<Void?> { this.close(timeout, it) }
}
