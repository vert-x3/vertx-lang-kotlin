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

