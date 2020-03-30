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
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.listTopics]
 *
 * @return [Set<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.listTopicsAwait(): Set<String> {
  return awaitResult {
    this.listTopics(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.createTopics]
 *
 * @param topics topics to create
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.createTopicsAwait(topics: List<NewTopic>): Unit {
  return awaitResult {
    this.createTopics(topics, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.deleteTopics]
 *
 * @param topicNames the names of the topics to delete
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.deleteTopicsAwait(topicNames: List<String>): Unit {
  return awaitResult {
    this.deleteTopics(topicNames, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.listConsumerGroups]
 *
 * @return [List<ConsumerGroupListing>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.listConsumerGroupsAwait(): List<ConsumerGroupListing> {
  return awaitResult {
    this.listConsumerGroups(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.close]
 *
 * @param timeout timeout to wait for closing
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
suspend fun KafkaAdminClient.closeAwait(timeout: Long): Unit {
  return awaitResult {
    this.close(timeout, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

