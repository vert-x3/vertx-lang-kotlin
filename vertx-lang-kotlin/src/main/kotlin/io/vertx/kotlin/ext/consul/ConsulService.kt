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
import io.vertx.ext.consul.AclToken
import io.vertx.ext.consul.BlockingQueryOptions
import io.vertx.ext.consul.Check
import io.vertx.ext.consul.CheckList
import io.vertx.ext.consul.CheckOptions
import io.vertx.ext.consul.CheckQueryOptions
import io.vertx.ext.consul.CheckStatus
import io.vertx.ext.consul.ConsulService
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
import io.vertx.kotlin.coroutines.awaitResult

suspend fun ConsulService.agentInfoAwait(): JsonObject {
  return awaitResult {
    this.agentInfo(it)
  }
}

suspend fun ConsulService.coordinateNodesAwait(): CoordinateList {
  return awaitResult {
    this.coordinateNodes(it)
  }
}

suspend fun ConsulService.coordinateNodesWithOptionsAwait(options: BlockingQueryOptions): CoordinateList {
  return awaitResult {
    this.coordinateNodesWithOptions(options, it)
  }
}

suspend fun ConsulService.coordinateDatacentersAwait(): List<DcCoordinates> {
  return awaitResult {
    this.coordinateDatacenters(it)
  }
}

suspend fun ConsulService.getKeysAwait(keyPrefix: String): List<String> {
  return awaitResult {
    this.getKeys(keyPrefix, it)
  }
}

suspend fun ConsulService.getKeysWithOptionsAwait(keyPrefix: String, options: BlockingQueryOptions): List<String> {
  return awaitResult {
    this.getKeysWithOptions(keyPrefix, options, it)
  }
}

suspend fun ConsulService.getValueAwait(key: String): KeyValue {
  return awaitResult {
    this.getValue(key, it)
  }
}

suspend fun ConsulService.getValueWithOptionsAwait(key: String, options: BlockingQueryOptions): KeyValue {
  return awaitResult {
    this.getValueWithOptions(key, options, it)
  }
}

suspend fun ConsulService.deleteValueAwait(key: String): Unit {
  return awaitResult {
    this.deleteValue(key, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.getValuesAwait(keyPrefix: String): KeyValueList {
  return awaitResult {
    this.getValues(keyPrefix, it)
  }
}

suspend fun ConsulService.getValuesWithOptionsAwait(keyPrefix: String, options: BlockingQueryOptions): KeyValueList {
  return awaitResult {
    this.getValuesWithOptions(keyPrefix, options, it)
  }
}

suspend fun ConsulService.deleteValuesAwait(keyPrefix: String): Unit {
  return awaitResult {
    this.deleteValues(keyPrefix, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.putValueAwait(key: String, value: String): Boolean {
  return awaitResult {
    this.putValue(key, value, it)
  }
}

suspend fun ConsulService.putValueWithOptionsAwait(key: String, value: String, options: KeyValueOptions): Boolean {
  return awaitResult {
    this.putValueWithOptions(key, value, options, it)
  }
}

suspend fun ConsulService.transactionAwait(request: TxnRequest): TxnResponse {
  return awaitResult {
    this.transaction(request, it)
  }
}

suspend fun ConsulService.createAclTokenAwait(token: AclToken): String {
  return awaitResult {
    this.createAclToken(token, it)
  }
}

suspend fun ConsulService.updateAclTokenAwait(token: AclToken): String {
  return awaitResult {
    this.updateAclToken(token, it)
  }
}

suspend fun ConsulService.cloneAclTokenAwait(id: String): String {
  return awaitResult {
    this.cloneAclToken(id, it)
  }
}

suspend fun ConsulService.listAclTokensAwait(): List<AclToken> {
  return awaitResult {
    this.listAclTokens(it)
  }
}

suspend fun ConsulService.infoAclTokenAwait(id: String): AclToken {
  return awaitResult {
    this.infoAclToken(id, it)
  }
}

suspend fun ConsulService.destroyAclTokenAwait(id: String): Unit {
  return awaitResult {
    this.destroyAclToken(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.fireEventAwait(name: String): Event {
  return awaitResult {
    this.fireEvent(name, it)
  }
}

suspend fun ConsulService.fireEventWithOptionsAwait(name: String, options: EventOptions): Event {
  return awaitResult {
    this.fireEventWithOptions(name, options, it)
  }
}

suspend fun ConsulService.listEventsAwait(): EventList {
  return awaitResult {
    this.listEvents(it)
  }
}

suspend fun ConsulService.listEventsWithOptionsAwait(options: EventListOptions): EventList {
  return awaitResult {
    this.listEventsWithOptions(options, it)
  }
}

suspend fun ConsulService.registerServiceAwait(serviceOptions: ServiceOptions): Unit {
  return awaitResult {
    this.registerService(serviceOptions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.maintenanceServiceAwait(maintenanceOptions: MaintenanceOptions): Unit {
  return awaitResult {
    this.maintenanceService(maintenanceOptions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.deregisterServiceAwait(id: String): Unit {
  return awaitResult {
    this.deregisterService(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.healthChecksAwait(service: String): CheckList {
  return awaitResult {
    this.healthChecks(service, it)
  }
}

suspend fun ConsulService.healthChecksWithOptionsAwait(service: String, options: CheckQueryOptions): CheckList {
  return awaitResult {
    this.healthChecksWithOptions(service, options, it)
  }
}

suspend fun ConsulService.healthStateAwait(healthState: HealthState): CheckList {
  return awaitResult {
    this.healthState(healthState, it)
  }
}

suspend fun ConsulService.healthStateWithOptionsAwait(healthState: HealthState, checkQueryOptions: CheckQueryOptions): CheckList {
  return awaitResult {
    this.healthStateWithOptions(healthState, checkQueryOptions, it)
  }
}

suspend fun ConsulService.healthServiceNodesAwait(service: String, passing: Boolean): ServiceEntryList {
  return awaitResult {
    this.healthServiceNodes(service, passing, it)
  }
}

suspend fun ConsulService.healthServiceNodesWithOptionsAwait(service: String, passing: Boolean, options: ServiceQueryOptions): ServiceEntryList {
  return awaitResult {
    this.healthServiceNodesWithOptions(service, passing, options, it)
  }
}

suspend fun ConsulService.catalogServiceNodesAwait(service: String): ServiceList {
  return awaitResult {
    this.catalogServiceNodes(service, it)
  }
}

suspend fun ConsulService.catalogServiceNodesWithOptionsAwait(service: String, options: ServiceQueryOptions): ServiceList {
  return awaitResult {
    this.catalogServiceNodesWithOptions(service, options, it)
  }
}

suspend fun ConsulService.catalogDatacentersAwait(): List<String> {
  return awaitResult {
    this.catalogDatacenters(it)
  }
}

suspend fun ConsulService.catalogNodesAwait(): NodeList {
  return awaitResult {
    this.catalogNodes(it)
  }
}

suspend fun ConsulService.catalogNodesWithOptionsAwait(options: NodeQueryOptions): NodeList {
  return awaitResult {
    this.catalogNodesWithOptions(options, it)
  }
}

suspend fun ConsulService.catalogServicesAwait(): ServiceList {
  return awaitResult {
    this.catalogServices(it)
  }
}

suspend fun ConsulService.catalogServicesWithOptionsAwait(options: BlockingQueryOptions): ServiceList {
  return awaitResult {
    this.catalogServicesWithOptions(options, it)
  }
}

suspend fun ConsulService.localServicesAwait(): List<Service> {
  return awaitResult {
    this.localServices(it)
  }
}

suspend fun ConsulService.catalogNodeServicesAwait(node: String): ServiceList {
  return awaitResult {
    this.catalogNodeServices(node, it)
  }
}

suspend fun ConsulService.catalogNodeServicesWithOptionsAwait(node: String, options: BlockingQueryOptions): ServiceList {
  return awaitResult {
    this.catalogNodeServicesWithOptions(node, options, it)
  }
}

suspend fun ConsulService.localChecksAwait(): List<Check> {
  return awaitResult {
    this.localChecks(it)
  }
}

suspend fun ConsulService.registerCheckAwait(checkOptions: CheckOptions): Unit {
  return awaitResult {
    this.registerCheck(checkOptions, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.deregisterCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.deregisterCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.passCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.passCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.passCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.passCheckWithNote(checkId, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.warnCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.warnCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.warnCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.warnCheckWithNote(checkId, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.failCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.failCheck(checkId, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.failCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.failCheckWithNote(checkId, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.updateCheckAwait(checkId: String, status: CheckStatus): Unit {
  return awaitResult {
    this.updateCheck(checkId, status, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.updateCheckWithNoteAwait(checkId: String, status: CheckStatus, note: String): Unit {
  return awaitResult {
    this.updateCheckWithNote(checkId, status, note, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.leaderStatusAwait(): String {
  return awaitResult {
    this.leaderStatus(it)
  }
}

suspend fun ConsulService.peersStatusAwait(): List<String> {
  return awaitResult {
    this.peersStatus(it)
  }
}

suspend fun ConsulService.createSessionAwait(): String {
  return awaitResult {
    this.createSession(it)
  }
}

suspend fun ConsulService.createSessionWithOptionsAwait(options: SessionOptions): String {
  return awaitResult {
    this.createSessionWithOptions(options, it)
  }
}

suspend fun ConsulService.infoSessionAwait(id: String): Session {
  return awaitResult {
    this.infoSession(id, it)
  }
}

suspend fun ConsulService.infoSessionWithOptionsAwait(id: String, options: BlockingQueryOptions): Session {
  return awaitResult {
    this.infoSessionWithOptions(id, options, it)
  }
}

suspend fun ConsulService.renewSessionAwait(id: String): Session {
  return awaitResult {
    this.renewSession(id, it)
  }
}

suspend fun ConsulService.listSessionsAwait(): SessionList {
  return awaitResult {
    this.listSessions(it)
  }
}

suspend fun ConsulService.listSessionsWithOptionsAwait(options: BlockingQueryOptions): SessionList {
  return awaitResult {
    this.listSessionsWithOptions(options, it)
  }
}

suspend fun ConsulService.listNodeSessionsAwait(nodeId: String): SessionList {
  return awaitResult {
    this.listNodeSessions(nodeId, it)
  }
}

suspend fun ConsulService.listNodeSessionsWithOptionsAwait(nodeId: String, options: BlockingQueryOptions): SessionList {
  return awaitResult {
    this.listNodeSessionsWithOptions(nodeId, options, it)
  }
}

suspend fun ConsulService.destroySessionAwait(id: String): Unit {
  return awaitResult {
    this.destroySession(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.createPreparedQueryAwait(definition: PreparedQueryDefinition): String {
  return awaitResult {
    this.createPreparedQuery(definition, it)
  }
}

suspend fun ConsulService.getPreparedQueryAwait(id: String): PreparedQueryDefinition {
  return awaitResult {
    this.getPreparedQuery(id, it)
  }
}

suspend fun ConsulService.getAllPreparedQueriesAwait(): List<PreparedQueryDefinition> {
  return awaitResult {
    this.getAllPreparedQueries(it)
  }
}

suspend fun ConsulService.updatePreparedQueryAwait(definition: PreparedQueryDefinition): Unit {
  return awaitResult {
    this.updatePreparedQuery(definition, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.deletePreparedQueryAwait(id: String): Unit {
  return awaitResult {
    this.deletePreparedQuery(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

suspend fun ConsulService.executePreparedQueryAwait(query: String): PreparedQueryExecuteResponse {
  return awaitResult {
    this.executePreparedQuery(query, it)
  }
}

suspend fun ConsulService.executePreparedQueryWithOptionsAwait(query: String, options: PreparedQueryExecuteOptions): PreparedQueryExecuteResponse {
  return awaitResult {
    this.executePreparedQueryWithOptions(query, options, it)
  }
}

