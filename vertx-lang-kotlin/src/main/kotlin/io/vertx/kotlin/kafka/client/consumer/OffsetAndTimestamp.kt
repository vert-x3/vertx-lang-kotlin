package io.vertx.kotlin.kafka.client.consumer

import io.vertx.kafka.client.consumer.OffsetAndTimestamp

/**
 * A function providing a DSL for building [io.vertx.kafka.client.consumer.OffsetAndTimestamp] objects.
 *
 * Represent information related to a Offset with timestamp information
 *
 * @param offset  Set the offset
 * @param timestamp  Set the timestamp
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.OffsetAndTimestamp original] using Vert.x codegen.
 */
fun offsetAndTimestampOf(
  offset: Long? = null,
  timestamp: Long? = null): OffsetAndTimestamp = io.vertx.kafka.client.consumer.OffsetAndTimestamp().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.client.consumer.OffsetAndTimestamp] objects.
 *
 * Represent information related to a Offset with timestamp information
 *
 * @param offset  Set the offset
 * @param timestamp  Set the timestamp
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.OffsetAndTimestamp original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("offsetAndTimestampOf(offset, timestamp)")
)
fun OffsetAndTimestamp(
  offset: Long? = null,
  timestamp: Long? = null): OffsetAndTimestamp = io.vertx.kafka.client.consumer.OffsetAndTimestamp().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
}

