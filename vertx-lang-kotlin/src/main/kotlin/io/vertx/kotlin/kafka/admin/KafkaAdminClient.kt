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

import io.vertx.kafka.admin.ClusterDescription
import io.vertx.kafka.admin.ConsumerGroupDescription
import io.vertx.kafka.admin.ConsumerGroupListing
import io.vertx.kafka.admin.KafkaAdminClient
import io.vertx.kafka.admin.NewTopic
import io.vertx.kafka.admin.TopicDescription
import io.vertx.kafka.client.common.TopicPartition
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.listTopics]
 *
 * @return [Set<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listTopics returning a future and chain with await()", replaceWith = ReplaceWith("listTopics().await()"))
suspend fun KafkaAdminClient.listTopicsAwait(): Set<String> {
  return awaitResult {
    this.listTopics(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeTopics]
 *
 * @param topicNames the names of the topics to describe
 * @return [Map<String,TopicDescription>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeTopics returning a future and chain with await()", replaceWith = ReplaceWith("describeTopics(topicNames).await()"))
suspend fun KafkaAdminClient.describeTopicsAwait(topicNames: List<String>): Map<String,TopicDescription> {
  return awaitResult {
    this.describeTopics(topicNames, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.createTopics]
 *
 * @param topics topics to create
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTopics returning a future and chain with await()", replaceWith = ReplaceWith("createTopics(topics).await()"))
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
@Deprecated(message = "Instead use deleteTopics returning a future and chain with await()", replaceWith = ReplaceWith("deleteTopics(topicNames).await()"))
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
@Deprecated(message = "Instead use listConsumerGroups returning a future and chain with await()", replaceWith = ReplaceWith("listConsumerGroups().await()"))
suspend fun KafkaAdminClient.listConsumerGroupsAwait(): List<ConsumerGroupListing> {
  return awaitResult {
    this.listConsumerGroups(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeConsumerGroups]
 *
 * @param groupIds the ids of the groups to describe
 * @return [Map<String,ConsumerGroupDescription>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeConsumerGroups returning a future and chain with await()", replaceWith = ReplaceWith("describeConsumerGroups(groupIds).await()"))
suspend fun KafkaAdminClient.describeConsumerGroupsAwait(groupIds: List<String>): Map<String,ConsumerGroupDescription> {
  return awaitResult {
    this.describeConsumerGroups(groupIds, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeCluster]
 *
 * @return [ClusterDescription]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeCluster returning a future and chain with await()", replaceWith = ReplaceWith("describeCluster().await()"))
suspend fun KafkaAdminClient.describeClusterAwait(): ClusterDescription {
  return awaitResult {
    this.describeCluster(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.deleteConsumerGroups]
 *
 * @param groupIds the ids of the groups to delete
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteConsumerGroups returning a future and chain with await()", replaceWith = ReplaceWith("deleteConsumerGroups(groupIds).await()"))
suspend fun KafkaAdminClient.deleteConsumerGroupsAwait(groupIds: List<String>): Unit {
  return awaitResult {
    this.deleteConsumerGroups(groupIds, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.deleteConsumerGroupOffsets]
 *
 * @param groupId The group id of the group whose offsets will be deleted
 * @param partitions The set of partitions in the consumer group whose offsets will be deleted
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteConsumerGroupOffsets returning a future and chain with await()", replaceWith = ReplaceWith("deleteConsumerGroupOffsets(groupId, partitions).await()"))
suspend fun KafkaAdminClient.deleteConsumerGroupOffsetsAwait(groupId: String, partitions: Set<TopicPartition>): Unit {
  return awaitResult {
    this.deleteConsumerGroupOffsets(groupId, partitions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
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
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close(timeout).await()"))
suspend fun KafkaAdminClient.closeAwait(timeout: Long): Unit {
  return awaitResult {
    this.close(timeout, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

