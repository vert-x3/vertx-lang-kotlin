package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.ConsumerGroupListing

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.ConsumerGroupListing] objects.
 *
 * A listing of a consumer group in the cluster.
 *
 * @param groupId  Set the consumer group id
 * @param simpleConsumerGroup  Set if consumer group is simple or not
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.ConsumerGroupListing original] using Vert.x codegen.
 */
fun consumerGroupListingOf(
  groupId: String? = null,
  simpleConsumerGroup: Boolean? = null): ConsumerGroupListing = io.vertx.kafka.admin.ConsumerGroupListing().apply {

  if (groupId != null) {
    this.setGroupId(groupId)
  }
  if (simpleConsumerGroup != null) {
    this.setSimpleConsumerGroup(simpleConsumerGroup)
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.ConsumerGroupListing] objects.
 *
 * A listing of a consumer group in the cluster.
 *
 * @param groupId  Set the consumer group id
 * @param simpleConsumerGroup  Set if consumer group is simple or not
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.ConsumerGroupListing original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("consumerGroupListingOf(groupId, simpleConsumerGroup)")
)
fun ConsumerGroupListing(
  groupId: String? = null,
  simpleConsumerGroup: Boolean? = null): ConsumerGroupListing = io.vertx.kafka.admin.ConsumerGroupListing().apply {

  if (groupId != null) {
    this.setGroupId(groupId)
  }
  if (simpleConsumerGroup != null) {
    this.setSimpleConsumerGroup(simpleConsumerGroup)
  }
}

