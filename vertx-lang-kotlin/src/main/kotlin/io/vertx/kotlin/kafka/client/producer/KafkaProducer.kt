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
 * @return current KafkaWriteStream instance *
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
 * @return current KafkaProducer instance *
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

