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
package io.vertx.kotlin.ext.consul

import io.vertx.core.json.JsonObject
import io.vertx.ext.consul.BlockingQueryOptions
import io.vertx.ext.consul.Check
import io.vertx.ext.consul.CheckList
import io.vertx.ext.consul.CheckOptions
import io.vertx.ext.consul.CheckQueryOptions
import io.vertx.ext.consul.CheckStatus
import io.vertx.ext.consul.ConsulClient
import io.vertx.ext.consul.CoordinateList
import io.vertx.ext.consul.DcCoordinates
import io.vertx.ext.consul.Event
import io.vertx.ext.consul.EventList
import io.vertx.ext.consul.EventListOptions
import io.vertx.ext.consul.EventOptions
import io.vertx.ext.consul.HealthState
import io.vertx.ext.consul.KeyValue
import io.vertx.ext.consul.KeyValueList
import io.vertx.ext.consul.KeyValueOptions
import io.vertx.ext.consul.MaintenanceOptions
import io.vertx.ext.consul.Node
import io.vertx.ext.consul.NodeList
import io.vertx.ext.consul.NodeQueryOptions
import io.vertx.ext.consul.PreparedQueryDefinition
import io.vertx.ext.consul.PreparedQueryExecuteOptions
import io.vertx.ext.consul.PreparedQueryExecuteResponse
import io.vertx.ext.consul.Service
import io.vertx.ext.consul.ServiceEntryList
import io.vertx.ext.consul.ServiceList
import io.vertx.ext.consul.ServiceOptions
import io.vertx.ext.consul.ServiceQueryOptions
import io.vertx.ext.consul.Session
import io.vertx.ext.consul.SessionList
import io.vertx.ext.consul.SessionOptions
import io.vertx.ext.consul.TxnRequest
import io.vertx.ext.consul.TxnResponse
import io.vertx.ext.consul.policy.AclPolicy
import io.vertx.ext.consul.token.AclToken
import io.vertx.ext.consul.token.CloneAclTokenOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.agentInfo]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use agentInfo returning a future and chain with await()", replaceWith = ReplaceWith("agentInfo().await()"))
suspend fun ConsulClient.agentInfoAwait(): JsonObject {
  return awaitResult {
    this.agentInfo(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.coordinateNodes]
 *
 * @return [CoordinateList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use coordinateNodes returning a future and chain with await()", replaceWith = ReplaceWith("coordinateNodes().await()"))
suspend fun ConsulClient.coordinateNodesAwait(): CoordinateList {
  return awaitResult {
    this.coordinateNodes(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.coordinateNodesWithOptions]
 *
 * @param options the blocking options
 * @return [CoordinateList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use coordinateNodesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("coordinateNodesWithOptions(options).await()"))
suspend fun ConsulClient.coordinateNodesWithOptionsAwait(options: BlockingQueryOptions): CoordinateList {
  return awaitResult {
    this.coordinateNodesWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.coordinateDatacenters]
 *
 * @return [List<DcCoordinates>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use coordinateDatacenters returning a future and chain with await()", replaceWith = ReplaceWith("coordinateDatacenters().await()"))
suspend fun ConsulClient.coordinateDatacentersAwait(): List<DcCoordinates> {
  return awaitResult {
    this.coordinateDatacenters(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getKeys]
 *
 * @param keyPrefix the prefix
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getKeys returning a future and chain with await()", replaceWith = ReplaceWith("getKeys(keyPrefix).await()"))
suspend fun ConsulClient.getKeysAwait(keyPrefix: String): List<String> {
  return awaitResult {
    this.getKeys(keyPrefix, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getKeysWithOptions]
 *
 * @param keyPrefix the prefix
 * @param options the blocking options
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getKeysWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("getKeysWithOptions(keyPrefix, options).await()"))
suspend fun ConsulClient.getKeysWithOptionsAwait(keyPrefix: String, options: BlockingQueryOptions): List<String> {
  return awaitResult {
    this.getKeysWithOptions(keyPrefix, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getValue]
 *
 * @param key the key
 * @return [KeyValue]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getValue returning a future and chain with await()", replaceWith = ReplaceWith("getValue(key).await()"))
suspend fun ConsulClient.getValueAwait(key: String): KeyValue {
  return awaitResult {
    this.getValue(key, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getValueWithOptions]
 *
 * @param key the key
 * @param options the blocking options
 * @return [KeyValue]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getValueWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("getValueWithOptions(key, options).await()"))
suspend fun ConsulClient.getValueWithOptionsAwait(key: String, options: BlockingQueryOptions): KeyValue {
  return awaitResult {
    this.getValueWithOptions(key, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deleteValue]
 *
 * @param key the key
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteValue returning a future and chain with await()", replaceWith = ReplaceWith("deleteValue(key).await()"))
suspend fun ConsulClient.deleteValueAwait(key: String): Unit {
  return awaitResult {
    this.deleteValue(key, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getValues]
 *
 * @param keyPrefix the prefix
 * @return [KeyValueList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getValues returning a future and chain with await()", replaceWith = ReplaceWith("getValues(keyPrefix).await()"))
suspend fun ConsulClient.getValuesAwait(keyPrefix: String): KeyValueList {
  return awaitResult {
    this.getValues(keyPrefix, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getValuesWithOptions]
 *
 * @param keyPrefix the prefix
 * @param options the blocking options
 * @return [KeyValueList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getValuesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("getValuesWithOptions(keyPrefix, options).await()"))
suspend fun ConsulClient.getValuesWithOptionsAwait(keyPrefix: String, options: BlockingQueryOptions): KeyValueList {
  return awaitResult {
    this.getValuesWithOptions(keyPrefix, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deleteValues]
 *
 * @param keyPrefix the prefix
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteValues returning a future and chain with await()", replaceWith = ReplaceWith("deleteValues(keyPrefix).await()"))
suspend fun ConsulClient.deleteValuesAwait(keyPrefix: String): Unit {
  return awaitResult {
    this.deleteValues(keyPrefix, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.putValue]
 *
 * @param key the key
 * @param value the value
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use putValue returning a future and chain with await()", replaceWith = ReplaceWith("putValue(key, value).await()"))
suspend fun ConsulClient.putValueAwait(key: String, value: String): Boolean {
  return awaitResult {
    this.putValue(key, value, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.putValueWithOptions]
 *
 * @param key the key
 * @param value the value
 * @param options options used to push pair
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use putValueWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("putValueWithOptions(key, value, options).await()"))
suspend fun ConsulClient.putValueWithOptionsAwait(key: String, value: String, options: KeyValueOptions): Boolean {
  return awaitResult {
    this.putValueWithOptions(key, value, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.transaction]
 *
 * @param request transaction request
 * @return [TxnResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use transaction returning a future and chain with await()", replaceWith = ReplaceWith("transaction(request).await()"))
suspend fun ConsulClient.transactionAwait(request: TxnRequest): TxnResponse {
  return awaitResult {
    this.transaction(request, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.createAclPolicy]
 *
 * @param policy properties of policy
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createAclPolicy returning a future and chain with await()", replaceWith = ReplaceWith("createAclPolicy(policy).await()"))
suspend fun ConsulClient.createAclPolicyAwait(policy: AclPolicy): String {
  return awaitResult {
    this.createAclPolicy(policy, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.readPolicy]
 *
 * @param id uuid policy
 * @return [AclPolicy]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readPolicy returning a future and chain with await()", replaceWith = ReplaceWith("readPolicy(id).await()"))
suspend fun ConsulClient.readPolicyAwait(id: String): AclPolicy {
  return awaitResult {
    this.readPolicy(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.readPolicyByName]
 *
 * @param name unique name of created policy
 * @return [AclPolicy]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readPolicyByName returning a future and chain with await()", replaceWith = ReplaceWith("readPolicyByName(name).await()"))
suspend fun ConsulClient.readPolicyByNameAwait(name: String): AclPolicy {
  return awaitResult {
    this.readPolicyByName(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.updatePolicy]
 *
 * @param id uuid of existing policy
 * @param policy options that will be applied to the existing policy
 * @return [AclPolicy]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updatePolicy returning a future and chain with await()", replaceWith = ReplaceWith("updatePolicy(id, policy).await()"))
suspend fun ConsulClient.updatePolicyAwait(id: String, policy: AclPolicy): AclPolicy {
  return awaitResult {
    this.updatePolicy(id, policy, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.createAclToken]
 *
 * @param token properties of the token
 * @return [AclToken]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createAclToken returning a future and chain with await()", replaceWith = ReplaceWith("createAclToken(token).await()"))
suspend fun ConsulClient.createAclTokenAwait(token: AclToken): AclToken {
  return awaitResult {
    this.createAclToken(token, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.updateAclToken]
 *
 * @param accessorId uuid of the token
 * @param token properties of the token
 * @return [AclToken]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateAclToken returning a future and chain with await()", replaceWith = ReplaceWith("updateAclToken(accessorId, token).await()"))
suspend fun ConsulClient.updateAclTokenAwait(accessorId: String, token: AclToken): AclToken {
  return awaitResult {
    this.updateAclToken(accessorId, token, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.cloneAclToken]
 *
 * @param accessorId uuid of the token
 * @param cloneAclToken properties of cloned token
 * @return [AclToken]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cloneAclToken returning a future and chain with await()", replaceWith = ReplaceWith("cloneAclToken(accessorId, cloneAclToken).await()"))
suspend fun ConsulClient.cloneAclTokenAwait(accessorId: String, cloneAclToken: CloneAclTokenOptions): AclToken {
  return awaitResult {
    this.cloneAclToken(accessorId, cloneAclToken, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getAclTokens]
 *
 * @return [List<AclToken>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getAclTokens returning a future and chain with await()", replaceWith = ReplaceWith("getAclTokens().await()"))
suspend fun ConsulClient.getAclTokensAwait(): List<AclToken> {
  return awaitResult {
    this.getAclTokens(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.readAclToken]
 *
 * @param accessorId uuid of token
 * @return [AclToken]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readAclToken returning a future and chain with await()", replaceWith = ReplaceWith("readAclToken(accessorId).await()"))
suspend fun ConsulClient.readAclTokenAwait(accessorId: String): AclToken {
  return awaitResult {
    this.readAclToken(accessorId, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deleteAclToken]
 *
 * @param accessorId uuid of token
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteAclToken returning a future and chain with await()", replaceWith = ReplaceWith("deleteAclToken(accessorId).await()"))
suspend fun ConsulClient.deleteAclTokenAwait(accessorId: String): Boolean {
  return awaitResult {
    this.deleteAclToken(accessorId, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.fireEvent]
 *
 * @param name name of event
 * @return [Event]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fireEvent returning a future and chain with await()", replaceWith = ReplaceWith("fireEvent(name).await()"))
suspend fun ConsulClient.fireEventAwait(name: String): Event {
  return awaitResult {
    this.fireEvent(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.fireEventWithOptions]
 *
 * @param name name of event
 * @param options options used to create event
 * @return [Event]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fireEventWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("fireEventWithOptions(name, options).await()"))
suspend fun ConsulClient.fireEventWithOptionsAwait(name: String, options: EventOptions): Event {
  return awaitResult {
    this.fireEventWithOptions(name, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.listEvents]
 *
 * @return [EventList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listEvents returning a future and chain with await()", replaceWith = ReplaceWith("listEvents().await()"))
suspend fun ConsulClient.listEventsAwait(): EventList {
  return awaitResult {
    this.listEvents(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.listEventsWithOptions]
 *
 * @param options the blocking options
 * @return [EventList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listEventsWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("listEventsWithOptions(options).await()"))
suspend fun ConsulClient.listEventsWithOptionsAwait(options: EventListOptions): EventList {
  return awaitResult {
    this.listEventsWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.registerService]
 *
 * @param serviceOptions the options of new service
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use registerService returning a future and chain with await()", replaceWith = ReplaceWith("registerService(serviceOptions).await()"))
suspend fun ConsulClient.registerServiceAwait(serviceOptions: ServiceOptions): Unit {
  return awaitResult {
    this.registerService(serviceOptions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.maintenanceService]
 *
 * @param maintenanceOptions the maintenance options
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use maintenanceService returning a future and chain with await()", replaceWith = ReplaceWith("maintenanceService(maintenanceOptions).await()"))
suspend fun ConsulClient.maintenanceServiceAwait(maintenanceOptions: MaintenanceOptions): Unit {
  return awaitResult {
    this.maintenanceService(maintenanceOptions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deregisterService]
 *
 * @param id the ID of service
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deregisterService returning a future and chain with await()", replaceWith = ReplaceWith("deregisterService(id).await()"))
suspend fun ConsulClient.deregisterServiceAwait(id: String): Unit {
  return awaitResult {
    this.deregisterService(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogServiceNodes]
 *
 * @param service name of service
 * @return [ServiceList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogServiceNodes returning a future and chain with await()", replaceWith = ReplaceWith("catalogServiceNodes(service).await()"))
suspend fun ConsulClient.catalogServiceNodesAwait(service: String): ServiceList {
  return awaitResult {
    this.catalogServiceNodes(service, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogServiceNodesWithOptions]
 *
 * @param service name of service
 * @param options options used to request services
 * @return [ServiceList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogServiceNodesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("catalogServiceNodesWithOptions(service, options).await()"))
suspend fun ConsulClient.catalogServiceNodesWithOptionsAwait(service: String, options: ServiceQueryOptions): ServiceList {
  return awaitResult {
    this.catalogServiceNodesWithOptions(service, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogDatacenters]
 *
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogDatacenters returning a future and chain with await()", replaceWith = ReplaceWith("catalogDatacenters().await()"))
suspend fun ConsulClient.catalogDatacentersAwait(): List<String> {
  return awaitResult {
    this.catalogDatacenters(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogNodes]
 *
 * @return [NodeList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogNodes returning a future and chain with await()", replaceWith = ReplaceWith("catalogNodes().await()"))
suspend fun ConsulClient.catalogNodesAwait(): NodeList {
  return awaitResult {
    this.catalogNodes(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogNodesWithOptions]
 *
 * @param options options used to request nodes
 * @return [NodeList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogNodesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("catalogNodesWithOptions(options).await()"))
suspend fun ConsulClient.catalogNodesWithOptionsAwait(options: NodeQueryOptions): NodeList {
  return awaitResult {
    this.catalogNodesWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.healthChecks]
 *
 * @param service the service name
 * @return [CheckList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use healthChecks returning a future and chain with await()", replaceWith = ReplaceWith("healthChecks(service).await()"))
suspend fun ConsulClient.healthChecksAwait(service: String): CheckList {
  return awaitResult {
    this.healthChecks(service, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.healthChecksWithOptions]
 *
 * @param service the service name
 * @param options options used to request checks
 * @return [CheckList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use healthChecksWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("healthChecksWithOptions(service, options).await()"))
suspend fun ConsulClient.healthChecksWithOptionsAwait(service: String, options: CheckQueryOptions): CheckList {
  return awaitResult {
    this.healthChecksWithOptions(service, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.healthState]
 *
 * @param healthState the health state
 * @return [CheckList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use healthState returning a future and chain with await()", replaceWith = ReplaceWith("healthState(healthState).await()"))
suspend fun ConsulClient.healthStateAwait(healthState: HealthState): CheckList {
  return awaitResult {
    this.healthState(healthState, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.healthStateWithOptions]
 *
 * @param healthState the health state
 * @param options options used to request checks
 * @return [CheckList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use healthStateWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("healthStateWithOptions(healthState, options).await()"))
suspend fun ConsulClient.healthStateWithOptionsAwait(healthState: HealthState, options: CheckQueryOptions): CheckList {
  return awaitResult {
    this.healthStateWithOptions(healthState, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.healthServiceNodes]
 *
 * @param service the service name
 * @param passing if true, filter results to only nodes with all checks in the passing state
 * @return [ServiceEntryList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use healthServiceNodes returning a future and chain with await()", replaceWith = ReplaceWith("healthServiceNodes(service, passing).await()"))
suspend fun ConsulClient.healthServiceNodesAwait(service: String, passing: Boolean): ServiceEntryList {
  return awaitResult {
    this.healthServiceNodes(service, passing, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.healthServiceNodesWithOptions]
 *
 * @param service the service name
 * @param passing if true, filter results to only nodes with all checks in the passing state
 * @param options options used to request services
 * @return [ServiceEntryList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use healthServiceNodesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("healthServiceNodesWithOptions(service, passing, options).await()"))
suspend fun ConsulClient.healthServiceNodesWithOptionsAwait(service: String, passing: Boolean, options: ServiceQueryOptions): ServiceEntryList {
  return awaitResult {
    this.healthServiceNodesWithOptions(service, passing, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.healthNodesWithOptions]
 *
 * @param node the node name or ID
 * @param options options used to request node health checks
 * @return [CheckList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use healthNodesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("healthNodesWithOptions(node, options).await()"))
suspend fun ConsulClient.healthNodesWithOptionsAwait(node: String, options: CheckQueryOptions): CheckList {
  return awaitResult {
    this.healthNodesWithOptions(node, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogServices]
 *
 * @return [ServiceList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogServices returning a future and chain with await()", replaceWith = ReplaceWith("catalogServices().await()"))
suspend fun ConsulClient.catalogServicesAwait(): ServiceList {
  return awaitResult {
    this.catalogServices(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogServicesWithOptions]
 *
 * @param options the blocking options
 * @return [ServiceList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogServicesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("catalogServicesWithOptions(options).await()"))
suspend fun ConsulClient.catalogServicesWithOptionsAwait(options: BlockingQueryOptions): ServiceList {
  return awaitResult {
    this.catalogServicesWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogNodeServices]
 *
 * @param node node name
 * @return [ServiceList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogNodeServices returning a future and chain with await()", replaceWith = ReplaceWith("catalogNodeServices(node).await()"))
suspend fun ConsulClient.catalogNodeServicesAwait(node: String): ServiceList {
  return awaitResult {
    this.catalogNodeServices(node, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogNodeServicesWithOptions]
 *
 * @param node node name
 * @param options the blocking options
 * @return [ServiceList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use catalogNodeServicesWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("catalogNodeServicesWithOptions(node, options).await()"))
suspend fun ConsulClient.catalogNodeServicesWithOptionsAwait(node: String, options: BlockingQueryOptions): ServiceList {
  return awaitResult {
    this.catalogNodeServicesWithOptions(node, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.localServices]
 *
 * @return [List<Service>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use localServices returning a future and chain with await()", replaceWith = ReplaceWith("localServices().await()"))
suspend fun ConsulClient.localServicesAwait(): List<Service> {
  return awaitResult {
    this.localServices(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.localChecks]
 *
 * @return [List<Check>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use localChecks returning a future and chain with await()", replaceWith = ReplaceWith("localChecks().await()"))
suspend fun ConsulClient.localChecksAwait(): List<Check> {
  return awaitResult {
    this.localChecks(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.registerCheck]
 *
 * @param checkOptions options used to register new check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use registerCheck returning a future and chain with await()", replaceWith = ReplaceWith("registerCheck(checkOptions).await()"))
suspend fun ConsulClient.registerCheckAwait(checkOptions: CheckOptions): Unit {
  return awaitResult {
    this.registerCheck(checkOptions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deregisterCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deregisterCheck returning a future and chain with await()", replaceWith = ReplaceWith("deregisterCheck(checkId).await()"))
suspend fun ConsulClient.deregisterCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.deregisterCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.passCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use passCheck returning a future and chain with await()", replaceWith = ReplaceWith("passCheck(checkId).await()"))
suspend fun ConsulClient.passCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.passCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.passCheckWithNote]
 *
 * @param checkId the ID of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use passCheckWithNote returning a future and chain with await()", replaceWith = ReplaceWith("passCheckWithNote(checkId, note).await()"))
suspend fun ConsulClient.passCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.passCheckWithNote(checkId, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.warnCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use warnCheck returning a future and chain with await()", replaceWith = ReplaceWith("warnCheck(checkId).await()"))
suspend fun ConsulClient.warnCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.warnCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.warnCheckWithNote]
 *
 * @param checkId the ID of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use warnCheckWithNote returning a future and chain with await()", replaceWith = ReplaceWith("warnCheckWithNote(checkId, note).await()"))
suspend fun ConsulClient.warnCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.warnCheckWithNote(checkId, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.failCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use failCheck returning a future and chain with await()", replaceWith = ReplaceWith("failCheck(checkId).await()"))
suspend fun ConsulClient.failCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.failCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.failCheckWithNote]
 *
 * @param checkId the ID of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use failCheckWithNote returning a future and chain with await()", replaceWith = ReplaceWith("failCheckWithNote(checkId, note).await()"))
suspend fun ConsulClient.failCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.failCheckWithNote(checkId, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.updateCheck]
 *
 * @param checkId the ID of check
 * @param status new status of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateCheck returning a future and chain with await()", replaceWith = ReplaceWith("updateCheck(checkId, status).await()"))
suspend fun ConsulClient.updateCheckAwait(checkId: String, status: CheckStatus): Unit {
  return awaitResult {
    this.updateCheck(checkId, status, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.updateCheckWithNote]
 *
 * @param checkId the ID of check
 * @param status new status of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateCheckWithNote returning a future and chain with await()", replaceWith = ReplaceWith("updateCheckWithNote(checkId, status, note).await()"))
suspend fun ConsulClient.updateCheckWithNoteAwait(checkId: String, status: CheckStatus, note: String): Unit {
  return awaitResult {
    this.updateCheckWithNote(checkId, status, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.leaderStatus]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use leaderStatus returning a future and chain with await()", replaceWith = ReplaceWith("leaderStatus().await()"))
suspend fun ConsulClient.leaderStatusAwait(): String {
  return awaitResult {
    this.leaderStatus(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.peersStatus]
 *
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use peersStatus returning a future and chain with await()", replaceWith = ReplaceWith("peersStatus().await()"))
suspend fun ConsulClient.peersStatusAwait(): List<String> {
  return awaitResult {
    this.peersStatus(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.createSession]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createSession returning a future and chain with await()", replaceWith = ReplaceWith("createSession().await()"))
suspend fun ConsulClient.createSessionAwait(): String {
  return awaitResult {
    this.createSession(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.createSessionWithOptions]
 *
 * @param options options used to create session
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createSessionWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("createSessionWithOptions(options).await()"))
suspend fun ConsulClient.createSessionWithOptionsAwait(options: SessionOptions): String {
  return awaitResult {
    this.createSessionWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.infoSession]
 *
 * @param id the ID of requested session
 * @return [Session]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use infoSession returning a future and chain with await()", replaceWith = ReplaceWith("infoSession(id).await()"))
suspend fun ConsulClient.infoSessionAwait(id: String): Session {
  return awaitResult {
    this.infoSession(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.infoSessionWithOptions]
 *
 * @param id the ID of requested session
 * @param options the blocking options
 * @return [Session]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use infoSessionWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("infoSessionWithOptions(id, options).await()"))
suspend fun ConsulClient.infoSessionWithOptionsAwait(id: String, options: BlockingQueryOptions): Session {
  return awaitResult {
    this.infoSessionWithOptions(id, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.renewSession]
 *
 * @param id the ID of session that should be renewed
 * @return [Session]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use renewSession returning a future and chain with await()", replaceWith = ReplaceWith("renewSession(id).await()"))
suspend fun ConsulClient.renewSessionAwait(id: String): Session {
  return awaitResult {
    this.renewSession(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.listSessions]
 *
 * @return [SessionList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listSessions returning a future and chain with await()", replaceWith = ReplaceWith("listSessions().await()"))
suspend fun ConsulClient.listSessionsAwait(): SessionList {
  return awaitResult {
    this.listSessions(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.listSessionsWithOptions]
 *
 * @param options the blocking options
 * @return [SessionList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listSessionsWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("listSessionsWithOptions(options).await()"))
suspend fun ConsulClient.listSessionsWithOptionsAwait(options: BlockingQueryOptions): SessionList {
  return awaitResult {
    this.listSessionsWithOptions(options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.listNodeSessions]
 *
 * @param nodeId the ID of node
 * @return [SessionList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listNodeSessions returning a future and chain with await()", replaceWith = ReplaceWith("listNodeSessions(nodeId).await()"))
suspend fun ConsulClient.listNodeSessionsAwait(nodeId: String): SessionList {
  return awaitResult {
    this.listNodeSessions(nodeId, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.listNodeSessionsWithOptions]
 *
 * @param nodeId the ID of node
 * @param options the blocking options
 * @return [SessionList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use listNodeSessionsWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("listNodeSessionsWithOptions(nodeId, options).await()"))
suspend fun ConsulClient.listNodeSessionsWithOptionsAwait(nodeId: String, options: BlockingQueryOptions): SessionList {
  return awaitResult {
    this.listNodeSessionsWithOptions(nodeId, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.destroySession]
 *
 * @param id the ID of session
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use destroySession returning a future and chain with await()", replaceWith = ReplaceWith("destroySession(id).await()"))
suspend fun ConsulClient.destroySessionAwait(id: String): Unit {
  return awaitResult {
    this.destroySession(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.createPreparedQuery]
 *
 * @param definition definition of the prepare query
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createPreparedQuery returning a future and chain with await()", replaceWith = ReplaceWith("createPreparedQuery(definition).await()"))
suspend fun ConsulClient.createPreparedQueryAwait(definition: PreparedQueryDefinition): String {
  return awaitResult {
    this.createPreparedQuery(definition, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getPreparedQuery]
 *
 * @param id the id of the query to read
 * @return [PreparedQueryDefinition]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getPreparedQuery returning a future and chain with await()", replaceWith = ReplaceWith("getPreparedQuery(id).await()"))
suspend fun ConsulClient.getPreparedQueryAwait(id: String): PreparedQueryDefinition {
  return awaitResult {
    this.getPreparedQuery(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.getAllPreparedQueries]
 *
 * @return [List<PreparedQueryDefinition>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getAllPreparedQueries returning a future and chain with await()", replaceWith = ReplaceWith("getAllPreparedQueries().await()"))
suspend fun ConsulClient.getAllPreparedQueriesAwait(): List<PreparedQueryDefinition> {
  return awaitResult {
    this.getAllPreparedQueries(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.updatePreparedQuery]
 *
 * @param definition definition of the prepare query
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updatePreparedQuery returning a future and chain with await()", replaceWith = ReplaceWith("updatePreparedQuery(definition).await()"))
suspend fun ConsulClient.updatePreparedQueryAwait(definition: PreparedQueryDefinition): Unit {
  return awaitResult {
    this.updatePreparedQuery(definition, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deletePreparedQuery]
 *
 * @param id the id of the query to delete
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deletePreparedQuery returning a future and chain with await()", replaceWith = ReplaceWith("deletePreparedQuery(id).await()"))
suspend fun ConsulClient.deletePreparedQueryAwait(id: String): Unit {
  return awaitResult {
    this.deletePreparedQuery(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.executePreparedQuery]
 *
 * @param query the ID of the query to execute. This can also be the name of an existing prepared query, or a name that matches a prefix name for a prepared query template.
 * @return [PreparedQueryExecuteResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executePreparedQuery returning a future and chain with await()", replaceWith = ReplaceWith("executePreparedQuery(query).await()"))
suspend fun ConsulClient.executePreparedQueryAwait(query: String): PreparedQueryExecuteResponse {
  return awaitResult {
    this.executePreparedQuery(query, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.executePreparedQueryWithOptions]
 *
 * @param query the ID of the query to execute. This can also be the name of an existing prepared query, or a name that matches a prefix name for a prepared query template.
 * @param options the options used to execute prepared query
 * @return [PreparedQueryExecuteResponse]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use executePreparedQueryWithOptions returning a future and chain with await()", replaceWith = ReplaceWith("executePreparedQueryWithOptions(query, options).await()"))
suspend fun ConsulClient.executePreparedQueryWithOptionsAwait(query: String, options: PreparedQueryExecuteOptions): PreparedQueryExecuteResponse {
  return awaitResult {
    this.executePreparedQueryWithOptions(query, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.registerCatalogService]
 *
 * @param nodeOptions the options of new node
 * @param serviceOptions the options of new service
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use registerCatalogService returning a future and chain with await()", replaceWith = ReplaceWith("registerCatalogService(nodeOptions, serviceOptions).await()"))
suspend fun ConsulClient.registerCatalogServiceAwait(nodeOptions: Node, serviceOptions: ServiceOptions): Unit {
  return awaitResult {
    this.registerCatalogService(nodeOptions, serviceOptions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deregisterCatalogService]
 *
 * @param nodeId the ID of node
 * @param serviceId the ID of the service to de-registered; if it is null, the node itself will be de-registered (as well as the entities that belongs to that node)
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deregisterCatalogService returning a future and chain with await()", replaceWith = ReplaceWith("deregisterCatalogService(nodeId, serviceId).await()"))
suspend fun ConsulClient.deregisterCatalogServiceAwait(nodeId: String, serviceId: String): Unit {
  return awaitResult {
    this.deregisterCatalogService(nodeId, serviceId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

