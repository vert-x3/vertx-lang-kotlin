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

import io.vertx.kafka.admin.ConsumerGroupDescription
import io.vertx.kafka.admin.MemberDescription
import io.vertx.kafka.client.common.Node
import org.apache.kafka.common.ConsumerGroupState
import org.apache.kafka.common.acl.AclOperation

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.ConsumerGroupDescription] objects.
 *
 * A detailed description of a single consumer group in the cluster
 *
 * @param groupId  Set the id of the consumer group
 * @param simpleConsumerGroup  Set if consumer group is simple or not
 * @param coordinator  Set the consumer group coordinator, or null if the coordinator is not known
 * @param members  Set a list of the members of the consumer group
 * @param partitionAssignor  Set the consumer group partition assignor
 * @param state  Set the consumer group state, or UNKNOWN if the state is too new for us to parse
 * @param authorizedOperations  Set the id of the consumer group
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.ConsumerGroupDescription original] using Vert.x codegen.
 */
fun consumerGroupDescriptionOf(
  groupId: String? = null,
  simpleConsumerGroup: Boolean? = null,
  coordinator: io.vertx.kafka.client.common.Node? = null,
  members: Iterable<io.vertx.kafka.admin.MemberDescription>? = null,
  partitionAssignor: String? = null,
  state: ConsumerGroupState? = null,
  authorizedOperations: Iterable<AclOperation>? = null): ConsumerGroupDescription = io.vertx.kafka.admin.ConsumerGroupDescription().apply {

  if (groupId != null) {
    this.setGroupId(groupId)
  }
  if (simpleConsumerGroup != null) {
    this.setSimpleConsumerGroup(simpleConsumerGroup)
  }
  if (coordinator != null) {
    this.setCoordinator(coordinator)
  }
  if (members != null) {
    this.setMembers(members.toList())
  }
  if (partitionAssignor != null) {
    this.setPartitionAssignor(partitionAssignor)
  }
  if (state != null) {
    this.setState(state)
  }
  if (authorizedOperations != null) {
    this.setAuthorizedOperations(authorizedOperations.toSet())
  }
}

