package io.vertx.kotlin.ext.consul

import io.vertx.core.json.JsonObject
import io.vertx.ext.consul.AclToken
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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.MutableList

suspend fun ConsulClient.agentInfo(): JsonObject = awaitResult { this.agentInfo(it) }

suspend fun ConsulClient.coordinateNodes(): CoordinateList = awaitResult { this.coordinateNodes(it) }

suspend fun ConsulClient.coordinateNodesWithOptions(options: BlockingQueryOptions): CoordinateList = awaitResult { this.coordinateNodesWithOptions(options, it) }

suspend fun ConsulClient.coordinateDatacenters(): MutableList<DcCoordinates> = awaitResult { this.coordinateDatacenters(it) }

suspend fun ConsulClient.getKeys(keyPrefix: String): MutableList<String> = awaitResult { this.getKeys(keyPrefix, it) }

suspend fun ConsulClient.getKeysWithOptions(keyPrefix: String, options: BlockingQueryOptions): MutableList<String> = awaitResult { this.getKeysWithOptions(keyPrefix, options, it) }

suspend fun ConsulClient.getValue(key: String): KeyValue = awaitResult { this.getValue(key, it) }

suspend fun ConsulClient.getValueWithOptions(key: String, options: BlockingQueryOptions): KeyValue = awaitResult { this.getValueWithOptions(key, options, it) }

suspend fun ConsulClient.deleteValue(key: String) {
  awaitResult<Void?> { this.deleteValue(key, it) }
}

suspend fun ConsulClient.getValues(keyPrefix: String): KeyValueList = awaitResult { this.getValues(keyPrefix, it) }

suspend fun ConsulClient.getValuesWithOptions(keyPrefix: String, options: BlockingQueryOptions): KeyValueList = awaitResult { this.getValuesWithOptions(keyPrefix, options, it) }

suspend fun ConsulClient.deleteValues(keyPrefix: String) {
  awaitResult<Void?> { this.deleteValues(keyPrefix, it) }
}

suspend fun ConsulClient.putValue(key: String, value: String): Boolean = awaitResult { this.putValue(key, value, it) }

suspend fun ConsulClient.putValueWithOptions(
    key: String,
    value: String,
    options: KeyValueOptions
): Boolean = awaitResult { this.putValueWithOptions(key, value, options, it) }

suspend fun ConsulClient.transaction(request: TxnRequest): TxnResponse = awaitResult { this.transaction(request, it) }

suspend fun ConsulClient.createAclToken(token: AclToken): String = awaitResult { this.createAclToken(token, it) }

suspend fun ConsulClient.updateAclToken(token: AclToken): String = awaitResult { this.updateAclToken(token, it) }

suspend fun ConsulClient.cloneAclToken(id: String): String = awaitResult { this.cloneAclToken(id, it) }

suspend fun ConsulClient.listAclTokens(): MutableList<AclToken> = awaitResult { this.listAclTokens(it) }

suspend fun ConsulClient.infoAclToken(id: String): AclToken = awaitResult { this.infoAclToken(id, it) }

suspend fun ConsulClient.destroyAclToken(id: String) {
  awaitResult<Void?> { this.destroyAclToken(id, it) }
}

suspend fun ConsulClient.fireEvent(name: String): Event = awaitResult { this.fireEvent(name, it) }

suspend fun ConsulClient.fireEventWithOptions(name: String, options: EventOptions): Event = awaitResult { this.fireEventWithOptions(name, options, it) }

suspend fun ConsulClient.listEvents(): EventList = awaitResult { this.listEvents(it) }

suspend fun ConsulClient.listEventsWithOptions(options: EventListOptions): EventList = awaitResult { this.listEventsWithOptions(options, it) }

suspend fun ConsulClient.registerService(serviceOptions: ServiceOptions) {
  awaitResult<Void?> { this.registerService(serviceOptions, it) }
}

suspend fun ConsulClient.maintenanceService(maintenanceOptions: MaintenanceOptions) {
  awaitResult<Void?> { this.maintenanceService(maintenanceOptions, it) }
}

suspend fun ConsulClient.deregisterService(id: String) {
  awaitResult<Void?> { this.deregisterService(id, it) }
}

suspend fun ConsulClient.catalogServiceNodes(service: String): ServiceList = awaitResult { this.catalogServiceNodes(service, it) }

suspend fun ConsulClient.catalogServiceNodesWithOptions(service: String, options: ServiceQueryOptions): ServiceList = awaitResult { this.catalogServiceNodesWithOptions(service, options, it) }

suspend fun ConsulClient.catalogDatacenters(): MutableList<String> = awaitResult { this.catalogDatacenters(it) }

suspend fun ConsulClient.catalogNodes(): NodeList = awaitResult { this.catalogNodes(it) }

suspend fun ConsulClient.catalogNodesWithOptions(options: NodeQueryOptions): NodeList = awaitResult { this.catalogNodesWithOptions(options, it) }

suspend fun ConsulClient.healthChecks(service: String): CheckList = awaitResult { this.healthChecks(service, it) }

suspend fun ConsulClient.healthChecksWithOptions(service: String, options: CheckQueryOptions): CheckList = awaitResult { this.healthChecksWithOptions(service, options, it) }

suspend fun ConsulClient.healthState(checkStatus: CheckStatus): CheckList = awaitResult { this.healthState(checkStatus, it) }

suspend fun ConsulClient.healthStateWithOptions(checkStatus: CheckStatus, options: CheckQueryOptions): CheckList = awaitResult { this.healthStateWithOptions(checkStatus, options, it) }

suspend fun ConsulClient.healthServiceNodes(service: String, passing: Boolean): ServiceEntryList = awaitResult { this.healthServiceNodes(service, passing, it) }

suspend fun ConsulClient.healthServiceNodesWithOptions(
    service: String,
    passing: Boolean,
    options: ServiceQueryOptions
): ServiceEntryList = awaitResult { this.healthServiceNodesWithOptions(service, passing, options, it) }

suspend fun ConsulClient.catalogServices(): ServiceList = awaitResult { this.catalogServices(it) }

suspend fun ConsulClient.catalogServicesWithOptions(options: BlockingQueryOptions): ServiceList = awaitResult { this.catalogServicesWithOptions(options, it) }

suspend fun ConsulClient.catalogNodeServices(node: String): ServiceList = awaitResult { this.catalogNodeServices(node, it) }

suspend fun ConsulClient.catalogNodeServicesWithOptions(node: String, options: BlockingQueryOptions): ServiceList = awaitResult { this.catalogNodeServicesWithOptions(node, options, it) }

suspend fun ConsulClient.localServices(): MutableList<Service> = awaitResult { this.localServices(it) }

suspend fun ConsulClient.localChecks(): MutableList<Check> = awaitResult { this.localChecks(it) }

suspend fun ConsulClient.registerCheck(checkOptions: CheckOptions) {
  awaitResult<Void?> { this.registerCheck(checkOptions, it) }
}

suspend fun ConsulClient.deregisterCheck(checkId: String) {
  awaitResult<Void?> { this.deregisterCheck(checkId, it) }
}

suspend fun ConsulClient.passCheck(checkId: String) {
  awaitResult<Void?> { this.passCheck(checkId, it) }
}

suspend fun ConsulClient.passCheckWithNote(checkId: String, note: String) {
  awaitResult<Void?> { this.passCheckWithNote(checkId, note, it) }
}

suspend fun ConsulClient.warnCheck(checkId: String) {
  awaitResult<Void?> { this.warnCheck(checkId, it) }
}

suspend fun ConsulClient.warnCheckWithNote(checkId: String, note: String) {
  awaitResult<Void?> { this.warnCheckWithNote(checkId, note, it) }
}

suspend fun ConsulClient.failCheck(checkId: String) {
  awaitResult<Void?> { this.failCheck(checkId, it) }
}

suspend fun ConsulClient.failCheckWithNote(checkId: String, note: String) {
  awaitResult<Void?> { this.failCheckWithNote(checkId, note, it) }
}

suspend fun ConsulClient.updateCheck(checkId: String, status: CheckStatus) {
  awaitResult<Void?> { this.updateCheck(checkId, status, it) }
}

suspend fun ConsulClient.updateCheckWithNote(
    checkId: String,
    status: CheckStatus,
    note: String
) {
  awaitResult<Void?> { this.updateCheckWithNote(checkId, status, note, it) }
}

suspend fun ConsulClient.leaderStatus(): String = awaitResult { this.leaderStatus(it) }

suspend fun ConsulClient.peersStatus(): MutableList<String> = awaitResult { this.peersStatus(it) }

suspend fun ConsulClient.createSession(): String = awaitResult { this.createSession(it) }

suspend fun ConsulClient.createSessionWithOptions(options: SessionOptions): String = awaitResult { this.createSessionWithOptions(options, it) }

suspend fun ConsulClient.infoSession(id: String): Session = awaitResult { this.infoSession(id, it) }

suspend fun ConsulClient.infoSessionWithOptions(id: String, options: BlockingQueryOptions): Session = awaitResult { this.infoSessionWithOptions(id, options, it) }

suspend fun ConsulClient.renewSession(id: String): Session = awaitResult { this.renewSession(id, it) }

suspend fun ConsulClient.listSessions(): SessionList = awaitResult { this.listSessions(it) }

suspend fun ConsulClient.listSessionsWithOptions(options: BlockingQueryOptions): SessionList = awaitResult { this.listSessionsWithOptions(options, it) }

suspend fun ConsulClient.listNodeSessions(nodeId: String): SessionList = awaitResult { this.listNodeSessions(nodeId, it) }

suspend fun ConsulClient.listNodeSessionsWithOptions(nodeId: String, options: BlockingQueryOptions): SessionList = awaitResult { this.listNodeSessionsWithOptions(nodeId, options, it) }

suspend fun ConsulClient.destroySession(id: String) {
  awaitResult<Void?> { this.destroySession(id, it) }
}

suspend fun ConsulClient.createPreparedQuery(definition: PreparedQueryDefinition): String = awaitResult { this.createPreparedQuery(definition, it) }

suspend fun ConsulClient.getPreparedQuery(id: String): PreparedQueryDefinition = awaitResult { this.getPreparedQuery(id, it) }

suspend fun ConsulClient.getAllPreparedQueries(): MutableList<PreparedQueryDefinition> = awaitResult { this.getAllPreparedQueries(it) }

suspend fun ConsulClient.updatePreparedQuery(definition: PreparedQueryDefinition) {
  awaitResult<Void?> { this.updatePreparedQuery(definition, it) }
}

suspend fun ConsulClient.deletePreparedQuery(id: String) {
  awaitResult<Void?> { this.deletePreparedQuery(id, it) }
}

suspend fun ConsulClient.executePreparedQuery(query: String): PreparedQueryExecuteResponse = awaitResult { this.executePreparedQuery(query, it) }

suspend fun ConsulClient.executePreparedQueryWithOptions(query: String, options: PreparedQueryExecuteOptions): PreparedQueryExecuteResponse = awaitResult { this.executePreparedQueryWithOptions(query, options, it) }
