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
import io.vertx.kafka.admin.KafkaAdminClient
import io.vertx.kafka.admin.NewTopic
import io.vertx.kotlin.coroutines.awaitResult

/**
 * List the topics available in the cluster with the default options.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.KafkaAdminClient original] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.listTopicsAwait() : Set<String> {
  return awaitResult{
    this.listTopics(it)
  }
}

/**
 * Creates a batch of new Kafka topics
 *
 * @param topics topics to create
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.KafkaAdminClient original] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.createTopicsAwait(topics : List<NewTopic>) : Unit {
  return awaitResult{
    this.createTopics(topics, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Deletes a batch of Kafka topics
 *
 * @param topicNames the names of the topics to delete
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.KafkaAdminClient original] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.deleteTopicsAwait(topicNames : List<String>) : Unit {
  return awaitResult{
    this.deleteTopics(topicNames, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the the consumer groups available in the cluster with the default options
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.KafkaAdminClient original] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.listConsumerGroupsAwait() : List<ConsumerGroupListing> {
  return awaitResult{
    this.listConsumerGroups(it)
  }
}

