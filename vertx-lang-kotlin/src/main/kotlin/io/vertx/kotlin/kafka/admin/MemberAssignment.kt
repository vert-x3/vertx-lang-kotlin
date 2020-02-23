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

import io.vertx.kafka.admin.MemberAssignment

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.MemberAssignment] objects.
 *
 * A description of the assignments of a specific group member
 *
 * @param topicPartitions  Set the list of topic partitions
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.MemberAssignment original] using Vert.x codegen.
 */
fun memberAssignmentOf(
  topicPartitions: Iterable<io.vertx.kafka.client.common.TopicPartition>? = null): MemberAssignment = io.vertx.kafka.admin.MemberAssignment().apply {

  if (topicPartitions != null) {
    this.setTopicPartitions(topicPartitions.toSet())
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.MemberAssignment] objects.
 *
 * A description of the assignments of a specific group member
 *
 * @param topicPartitions  Set the list of topic partitions
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.MemberAssignment original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("memberAssignmentOf(topicPartitions)")
)
fun MemberAssignment(
  topicPartitions: Iterable<io.vertx.kafka.client.common.TopicPartition>? = null): MemberAssignment = io.vertx.kafka.admin.MemberAssignment().apply {

  if (topicPartitions != null) {
    this.setTopicPartitions(topicPartitions.toSet())
  }
}

