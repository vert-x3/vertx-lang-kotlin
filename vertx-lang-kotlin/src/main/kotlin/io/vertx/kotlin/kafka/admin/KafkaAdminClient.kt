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
import io.vertx.kafka.admin.DescribeClusterOptions
import io.vertx.kafka.admin.DescribeConsumerGroupsOptions
import io.vertx.kafka.admin.DescribeTopicsOptions
import io.vertx.kafka.admin.KafkaAdminClient
import io.vertx.kafka.admin.NewPartitions
import io.vertx.kafka.admin.NewTopic
import io.vertx.kafka.admin.TopicDescription
import io.vertx.kafka.client.common.TopicPartition
import io.vertx.kotlin.coroutines.awaitResult
import org.apache.kafka.common.acl.AclBinding
import org.apache.kafka.common.acl.AclBindingFilter

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.listTopics]
 *
 * @return [Set<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listTopics returning a future and chain with coAwait()", replaceWith = ReplaceWith("listTopics().coAwait()"))
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
@Deprecated(message = "Instead use describeTopics returning a future and chain with coAwait()", replaceWith = ReplaceWith("describeTopics(topicNames).coAwait()"))
suspend fun KafkaAdminClient.describeTopicsAwait(topicNames: List<String>): Map<String,TopicDescription> {
  return awaitResult {
    this.describeTopics(topicNames, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeTopics]
 *
 * @param topicNames 
 * @param options 
 * @return [Map<String,TopicDescription>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeTopics returning a future and chain with coAwait()", replaceWith = ReplaceWith("describeTopics(topicNames, options).coAwait()"))
suspend fun KafkaAdminClient.describeTopicsAwait(topicNames: List<String>, options: DescribeTopicsOptions): Map<String,TopicDescription> {
  return awaitResult {
    this.describeTopics(topicNames, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.createTopics]
 *
 * @param topics topics to create
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTopics returning a future and chain with coAwait()", replaceWith = ReplaceWith("createTopics(topics).coAwait()"))
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
@Deprecated(message = "Instead use deleteTopics returning a future and chain with coAwait()", replaceWith = ReplaceWith("deleteTopics(topicNames).coAwait()"))
suspend fun KafkaAdminClient.deleteTopicsAwait(topicNames: List<String>): Unit {
  return awaitResult {
    this.deleteTopics(topicNames, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.createPartitions]
 *
 * @param partitions partitions to create
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createPartitions returning a future and chain with coAwait()", replaceWith = ReplaceWith("createPartitions(partitions).coAwait()"))
suspend fun KafkaAdminClient.createPartitionsAwait(partitions: Map<String,NewPartitions>): Unit {
  return awaitResult {
    this.createPartitions(partitions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.listConsumerGroups]
 *
 * @return [List<ConsumerGroupListing>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listConsumerGroups returning a future and chain with coAwait()", replaceWith = ReplaceWith("listConsumerGroups().coAwait()"))
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
@Deprecated(message = "Instead use describeConsumerGroups returning a future and chain with coAwait()", replaceWith = ReplaceWith("describeConsumerGroups(groupIds).coAwait()"))
suspend fun KafkaAdminClient.describeConsumerGroupsAwait(groupIds: List<String>): Map<String,ConsumerGroupDescription> {
  return awaitResult {
    this.describeConsumerGroups(groupIds, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeConsumerGroups]
 *
 * @param groupIds 
 * @param options 
 * @return [Map<String,ConsumerGroupDescription>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeConsumerGroups returning a future and chain with coAwait()", replaceWith = ReplaceWith("describeConsumerGroups(groupIds, options).coAwait()"))
suspend fun KafkaAdminClient.describeConsumerGroupsAwait(groupIds: List<String>, options: DescribeConsumerGroupsOptions): Map<String,ConsumerGroupDescription> {
  return awaitResult {
    this.describeConsumerGroups(groupIds, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeCluster]
 *
 * @return [ClusterDescription]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeCluster returning a future and chain with coAwait()", replaceWith = ReplaceWith("describeCluster().coAwait()"))
suspend fun KafkaAdminClient.describeClusterAwait(): ClusterDescription {
  return awaitResult {
    this.describeCluster(it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeCluster]
 *
 * @param options 
 * @return [ClusterDescription]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeCluster returning a future and chain with coAwait()", replaceWith = ReplaceWith("describeCluster(options).coAwait()"))
suspend fun KafkaAdminClient.describeClusterAwait(options: DescribeClusterOptions): ClusterDescription {
  return awaitResult {
    this.describeCluster(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.deleteConsumerGroups]
 *
 * @param groupIds the ids of the groups to delete
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteConsumerGroups returning a future and chain with coAwait()", replaceWith = ReplaceWith("deleteConsumerGroups(groupIds).coAwait()"))
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
@Deprecated(message = "Instead use deleteConsumerGroupOffsets returning a future and chain with coAwait()", replaceWith = ReplaceWith("deleteConsumerGroupOffsets(groupId, partitions).coAwait()"))
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
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
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
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close(timeout).coAwait()"))
suspend fun KafkaAdminClient.closeAwait(timeout: Long): Unit {
  return awaitResult {
    this.close(timeout, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.describeAcls]
 *
 * @param aclBindingFilter The filter to use.
 * @return [List<AclBinding>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use describeAcls returning a future and chain with coAwait()", replaceWith = ReplaceWith("describeAcls(aclBindingFilter).coAwait()"))
suspend fun KafkaAdminClient.describeAclsAwait(aclBindingFilter: AclBindingFilter): List<AclBinding> {
  return awaitResult {
    this.describeAcls(aclBindingFilter, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.createAcls]
 *
 * @param aclBindings The ACL to create.
 * @return [List<AclBinding>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createAcls returning a future and chain with coAwait()", replaceWith = ReplaceWith("createAcls(aclBindings).coAwait()"))
suspend fun KafkaAdminClient.createAclsAwait(aclBindings: List<AclBinding>): List<AclBinding> {
  return awaitResult {
    this.createAcls(aclBindings, it)
  }
}

/**
 * Suspending version of method [io.vertx.kafka.admin.KafkaAdminClient.deleteAcls]
 *
 * @param aclBindings The filter to delete matching ACLs.
 * @return [List<AclBinding>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.kafka.admin.KafkaAdminClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteAcls returning a future and chain with coAwait()", replaceWith = ReplaceWith("deleteAcls(aclBindings).coAwait()"))
suspend fun KafkaAdminClient.deleteAclsAwait(aclBindings: List<AclBindingFilter>): List<AclBinding> {
  return awaitResult {
    this.deleteAcls(aclBindings, it)
  }
}

