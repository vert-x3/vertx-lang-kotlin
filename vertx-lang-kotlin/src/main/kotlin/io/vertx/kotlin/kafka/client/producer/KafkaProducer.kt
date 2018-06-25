package io.vertx.kotlin.kafka.client.producer

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.producer.KafkaProducer
import io.vertx.kafka.client.producer.KafkaProducerRecord
import io.vertx.kafka.client.producer.RecordMetadata
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <K,V> KafkaProducer<K,V>.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.drainHandlerAwait() : Unit {
    return awaitEvent{
        this.drainHandler({ v -> it.handle(null) })}
}

suspend fun <K,V> KafkaProducer<K,V>.writeAwait(record : KafkaProducerRecord<K,V>) : RecordMetadata {
    return awaitResult{
        this.write(record, it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.partitionsForAwait(topic : String) : List<PartitionInfo> {
    return awaitResult{
        this.partitionsFor(topic, it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.flushAwait() : Unit {
    return awaitEvent{
        this.flush({ v -> it.handle(null) })}
}

suspend fun <K,V> KafkaProducer<K,V>.closeAwait() : Unit {
    return awaitResult{
        this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> KafkaProducer<K,V>.closeAwait(timeout : Long) : Unit {
    return awaitResult{
        this.close(timeout, { ar -> it.handle(ar.mapEmpty()) })}
}

