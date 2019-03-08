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

import io.vertx.kafka.client.producer.RecordMetadata

/**
 * A function providing a DSL for building [io.vertx.kafka.client.producer.RecordMetadata] objects.
 *
 * Metadata related to a Kafka record
 *
 * @param checksum  Set the checksum (CRC32) of the record.
 * @param offset  Set the offset of the record in the topic/partition.
 * @param partition  Set the partition the record was sent to
 * @param timestamp  Set the timestamp of the record in the topic/partition
 * @param topic  Set the topic the record was appended to
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.producer.RecordMetadata original] using Vert.x codegen.
 */
fun recordMetadataOf(
  checksum: Long? = null,
  offset: Long? = null,
  partition: Int? = null,
  timestamp: Long? = null,
  topic: String? = null): RecordMetadata = io.vertx.kafka.client.producer.RecordMetadata().apply {

  if (checksum != null) {
    this.setChecksum(checksum)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.client.producer.RecordMetadata] objects.
 *
 * Metadata related to a Kafka record
 *
 * @param checksum  Set the checksum (CRC32) of the record.
 * @param offset  Set the offset of the record in the topic/partition.
 * @param partition  Set the partition the record was sent to
 * @param timestamp  Set the timestamp of the record in the topic/partition
 * @param topic  Set the topic the record was appended to
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.producer.RecordMetadata original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("recordMetadataOf(checksum, offset, partition, timestamp, topic)")
)
fun RecordMetadata(
  checksum: Long? = null,
  offset: Long? = null,
  partition: Int? = null,
  timestamp: Long? = null,
  topic: String? = null): RecordMetadata = io.vertx.kafka.client.producer.RecordMetadata().apply {

  if (checksum != null) {
    this.setChecksum(checksum)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (partition != null) {
    this.setPartition(partition)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
  if (topic != null) {
    this.setTopic(topic)
  }
}

