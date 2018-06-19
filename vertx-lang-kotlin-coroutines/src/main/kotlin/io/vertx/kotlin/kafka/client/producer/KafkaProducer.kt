package io.vertx.kotlin.kafka.client.producer

import io.vertx.kafka.client.common.PartitionInfo
import io.vertx.kafka.client.producer.KafkaProducer
import io.vertx.kafka.client.producer.KafkaProducerRecord
import io.vertx.kafka.client.producer.RecordMetadata
import io.vertx.kotlin.coroutines.awaitEvent
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <K,V> KafkaProducer<K,V>.exceptionHandlerAwait() : Throwable? {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.drainHandlerAwait() : Void? {
    return awaitEvent{
        this.drainHandler(it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.writeAwait(record : KafkaProducerRecord<K,V>) : RecordMetadata? {
    return awaitResult{
        this.write(record, it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.partitionsForAwait(topic : String) : List<PartitionInfo>? {
    return awaitResult{
        this.partitionsFor(topic, it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.flushAwait() : Void? {
    return awaitEvent{
        this.flush(it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.closeAwait() : Void? {
    return awaitResult{
        this.close(it)
    }
}

suspend fun <K,V> KafkaProducer<K,V>.closeAwait(timeout : Long) : Void? {
    return awaitResult{
        this.close(timeout, it)
    }
}

