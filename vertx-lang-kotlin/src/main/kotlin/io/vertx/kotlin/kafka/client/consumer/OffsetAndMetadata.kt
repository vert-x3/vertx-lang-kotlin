package io.vertx.kotlin.kafka.client.consumer

import io.vertx.kafka.client.consumer.OffsetAndMetadata

/**
 * A function providing a DSL for building [io.vertx.kafka.client.consumer.OffsetAndMetadata] objects.
 *
 * Provide additional metadata when an offset is committed
 *
 * @param metadata  Set additional metadata for the offset committed
 * @param offset  Set the offset to commit
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.client.consumer.OffsetAndMetadata original] using Vert.x codegen.
 */
fun offsetAndMetadataOf(
  metadata: String? = null,
  offset: Long? = null): OffsetAndMetadata = io.vertx.kafka.client.consumer.OffsetAndMetadata().apply {

  if (metadata != null) {
    this.setMetadata(metadata)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

