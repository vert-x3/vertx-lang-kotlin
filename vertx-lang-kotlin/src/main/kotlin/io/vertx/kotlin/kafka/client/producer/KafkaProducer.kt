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
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.write]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use write returning a future and chain with await()", replaceWith = ReplaceWith("write(data).await()"))
suspend fun <K,V> KafkaProducer<K,V>.writeAwait(data: KafkaProducerRecord<K,V>): Unit {
  return awaitResult {
    this.write(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end().await()"))
suspend fun <K,V> KafkaProducer<K,V>.endAwait(): Unit {
  return awaitResult {
    this.end(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.end]
 *
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with await()", replaceWith = ReplaceWith("end(data).await()"))
suspend fun <K,V> KafkaProducer<K,V>.endAwait(data: KafkaProducerRecord<K,V>): Unit {
  return awaitResult {
    this.end(data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use initTransactions returning a future and chain with await()", replaceWith = ReplaceWith("initTransactions().await()"))
suspend fun <K,V> KafkaProducer<K,V>.initTransactionsAwait(): Unit {
  return awaitResult {
    this.initTransactions(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use beginTransaction returning a future and chain with await()", replaceWith = ReplaceWith("beginTransaction().await()"))
suspend fun <K,V> KafkaProducer<K,V>.beginTransactionAwait(): Unit {
  return awaitResult {
    this.beginTransaction(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use commitTransaction returning a future and chain with await()", replaceWith = ReplaceWith("commitTransaction().await()"))
suspend fun <K,V> KafkaProducer<K,V>.commitTransactionAwait(): Unit {
  return awaitResult {
    this.commitTransaction(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

@Deprecated(message = "Instead use abortTransaction returning a future and chain with await()", replaceWith = ReplaceWith("abortTransaction().await()"))
suspend fun <K,V> KafkaProducer<K,V>.abortTransactionAwait(): Unit {
  return awaitResult {
    this.abortTransaction(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.send]
 *
 * @param record record to write
 * @return [RecordMetadata]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with await()", replaceWith = ReplaceWith("send(record).await()"))
suspend fun <K,V> KafkaProducer<K,V>.sendAwait(record: KafkaProducerRecord<K,V>): RecordMetadata {
  return awaitResult {
    this.send(record, it)
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
@Deprecated(message = "Instead use partitionsFor returning a future and chain with await()", replaceWith = ReplaceWith("partitionsFor(topic).await()"))
suspend fun <K,V> KafkaProducer<K,V>.partitionsForAwait(topic: String): List<PartitionInfo> {
  return awaitResult {
    this.partitionsFor(topic, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.flush]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use flush returning a future and chain with await()", replaceWith = ReplaceWith("flush().await()"))
suspend fun <K,V> KafkaProducer<K,V>.flushAwait(): Unit {
  return awaitResult {
    this.flush(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun <K,V> KafkaProducer<K,V>.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.client.producer.KafkaProducer.close]
 *
 * @param timeout timeout to wait for closing
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.client.producer.KafkaProducer] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close(timeout).await()"))
suspend fun <K,V> KafkaProducer<K,V>.closeAwait(timeout: Long): Unit {
  return awaitResult {
    this.close(timeout, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

