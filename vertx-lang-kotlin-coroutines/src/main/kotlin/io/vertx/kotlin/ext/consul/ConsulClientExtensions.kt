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

suspend fun ConsulClient.agentInfo(): JsonObject {
  return awaitResult { this.agentInfo(it) }
}

suspend fun ConsulClient.coordinateNodes(): CoordinateList {
  return awaitResult { this.coordinateNodes(it) }
}

suspend fun ConsulClient.coordinateNodesWithOptions(options: BlockingQueryOptions): CoordinateList {
  return awaitResult { this.coordinateNodesWithOptions(options, it) }
}

suspend fun ConsulClient.coordinateDatacenters(): MutableList<DcCoordinates> {
  return awaitResult { this.coordinateDatacenters(it) }
}

suspend fun ConsulClient.getKeys(keyPrefix: String): MutableList<String> {
  return awaitResult { this.getKeys(keyPrefix, it) }
}

suspend fun ConsulClient.getKeysWithOptions(keyPrefix: String, options: BlockingQueryOptions): MutableList<String> {
  return awaitResult { this.getKeysWithOptions(keyPrefix, options, it) }
}

suspend fun ConsulClient.getValue(key: String): KeyValue {
  return awaitResult { this.getValue(key, it) }
}

suspend fun ConsulClient.getValueWithOptions(key: String, options: BlockingQueryOptions): KeyValue {
  return awaitResult { this.getValueWithOptions(key, options, it) }
}

suspend fun ConsulClient.deleteValue(key: String) {
  awaitResult<Void?> { this.deleteValue(key, it) }
}

suspend fun ConsulClient.getValues(keyPrefix: String): KeyValueList {
  return awaitResult { this.getValues(keyPrefix, it) }
}

suspend fun ConsulClient.getValuesWithOptions(keyPrefix: String, options: BlockingQueryOptions): KeyValueList {
  return awaitResult { this.getValuesWithOptions(keyPrefix, options, it) }
}

suspend fun ConsulClient.deleteValues(keyPrefix: String) {
  awaitResult<Void?> { this.deleteValues(keyPrefix, it) }
}

suspend fun ConsulClient.putValue(key: String, value: String): Boolean {
  return awaitResult { this.putValue(key, value, it) }
}

suspend fun ConsulClient.putValueWithOptions(
  key: String,
  value: String,
  options: KeyValueOptions
): Boolean {
  return awaitResult { this.putValueWithOptions(key, value, options, it) }
}

suspend fun ConsulClient.transaction(request: TxnRequest): TxnResponse {
  return awaitResult { this.transaction(request, it) }
}

suspend fun ConsulClient.createAclToken(token: AclToken): String {
  return awaitResult { this.createAclToken(token, it) }
}

suspend fun ConsulClient.updateAclToken(token: AclToken): String {
  return awaitResult { this.updateAclToken(token, it) }
}

suspend fun ConsulClient.cloneAclToken(id: String): String {
  return awaitResult { this.cloneAclToken(id, it) }
}

suspend fun ConsulClient.listAclTokens(): MutableList<AclToken> {
  return awaitResult { this.listAclTokens(it) }
}

suspend fun ConsulClient.infoAclToken(id: String): AclToken {
  return awaitResult { this.infoAclToken(id, it) }
}

suspend fun ConsulClient.destroyAclToken(id: String) {
  awaitResult<Void?> { this.destroyAclToken(id, it) }
}

suspend fun ConsulClient.fireEvent(name: String): Event {
  return awaitResult { this.fireEvent(name, it) }
}

suspend fun ConsulClient.fireEventWithOptions(name: String, options: EventOptions): Event {
  return awaitResult { this.fireEventWithOptions(name, options, it) }
}

suspend fun ConsulClient.listEvents(): EventList {
  return awaitResult { this.listEvents(it) }
}

suspend fun ConsulClient.listEventsWithOptions(options: EventListOptions): EventList {
  return awaitResult { this.listEventsWithOptions(options, it) }
}

suspend fun ConsulClient.registerService(serviceOptions: ServiceOptions) {
  awaitResult<Void?> { this.registerService(serviceOptions, it) }
}

suspend fun ConsulClient.maintenanceService(maintenanceOptions: MaintenanceOptions) {
  awaitResult<Void?> { this.maintenanceService(maintenanceOptions, it) }
}

suspend fun ConsulClient.deregisterService(id: String) {
  awaitResult<Void?> { this.deregisterService(id, it) }
}

suspend fun ConsulClient.catalogServiceNodes(service: String): ServiceList {
  return awaitResult { this.catalogServiceNodes(service, it) }
}

suspend fun ConsulClient.catalogServiceNodesWithOptions(service: String, options: ServiceQueryOptions): ServiceList {
  return awaitResult { this.catalogServiceNodesWithOptions(service, options, it) }
}

suspend fun ConsulClient.catalogDatacenters(): MutableList<String> {
  return awaitResult { this.catalogDatacenters(it) }
}

suspend fun ConsulClient.catalogNodes(): NodeList {
  return awaitResult { this.catalogNodes(it) }
}

suspend fun ConsulClient.catalogNodesWithOptions(options: NodeQueryOptions): NodeList {
  return awaitResult { this.catalogNodesWithOptions(options, it) }
}

suspend fun ConsulClient.healthChecks(service: String): CheckList {
  return awaitResult { this.healthChecks(service, it) }
}

suspend fun ConsulClient.healthChecksWithOptions(service: String, options: CheckQueryOptions): CheckList {
  return awaitResult { this.healthChecksWithOptions(service, options, it) }
}

suspend fun ConsulClient.healthState(checkStatus: CheckStatus): CheckList {
  return awaitResult { this.healthState(checkStatus, it) }
}

suspend fun ConsulClient.healthStateWithOptions(checkStatus: CheckStatus, options: CheckQueryOptions): CheckList {
  return awaitResult { this.healthStateWithOptions(checkStatus, options, it) }
}

suspend fun ConsulClient.healthServiceNodes(service: String, passing: Boolean): ServiceEntryList {
  return awaitResult { this.healthServiceNodes(service, passing, it) }
}

suspend fun ConsulClient.healthServiceNodesWithOptions(
  service: String,
  passing: Boolean,
  options: ServiceQueryOptions
): ServiceEntryList {
  return awaitResult { this.healthServiceNodesWithOptions(service, passing, options, it) }
}

suspend fun ConsulClient.catalogServices(): ServiceList {
  return awaitResult { this.catalogServices(it) }
}

suspend fun ConsulClient.catalogServicesWithOptions(options: BlockingQueryOptions): ServiceList {
  return awaitResult { this.catalogServicesWithOptions(options, it) }
}

suspend fun ConsulClient.catalogNodeServices(node: String): ServiceList {
  return awaitResult { this.catalogNodeServices(node, it) }
}

suspend fun ConsulClient.catalogNodeServicesWithOptions(node: String, options: BlockingQueryOptions): ServiceList {
  return awaitResult { this.catalogNodeServicesWithOptions(node, options, it) }
}

suspend fun ConsulClient.localServices(): MutableList<Service> {
  return awaitResult { this.localServices(it) }
}

suspend fun ConsulClient.localChecks(): MutableList<Check> {
  return awaitResult { this.localChecks(it) }
}

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

suspend fun ConsulClient.leaderStatus(): String {
  return awaitResult { this.leaderStatus(it) }
}

suspend fun ConsulClient.peersStatus(): MutableList<String> {
  return awaitResult { this.peersStatus(it) }
}

suspend fun ConsulClient.createSession(): String {
  return awaitResult { this.createSession(it) }
}

suspend fun ConsulClient.createSessionWithOptions(options: SessionOptions): String {
  return awaitResult { this.createSessionWithOptions(options, it) }
}

suspend fun ConsulClient.infoSession(id: String): Session {
  return awaitResult { this.infoSession(id, it) }
}

suspend fun ConsulClient.infoSessionWithOptions(id: String, options: BlockingQueryOptions): Session {
  return awaitResult { this.infoSessionWithOptions(id, options, it) }
}

suspend fun ConsulClient.renewSession(id: String): Session {
  return awaitResult { this.renewSession(id, it) }
}

suspend fun ConsulClient.listSessions(): SessionList {
  return awaitResult { this.listSessions(it) }
}

suspend fun ConsulClient.listSessionsWithOptions(options: BlockingQueryOptions): SessionList {
  return awaitResult { this.listSessionsWithOptions(options, it) }
}

suspend fun ConsulClient.listNodeSessions(nodeId: String): SessionList {
  return awaitResult { this.listNodeSessions(nodeId, it) }
}

suspend fun ConsulClient.listNodeSessionsWithOptions(nodeId: String, options: BlockingQueryOptions): SessionList {
  return awaitResult { this.listNodeSessionsWithOptions(nodeId, options, it) }
}

suspend fun ConsulClient.destroySession(id: String) {
  awaitResult<Void?> { this.destroySession(id, it) }
}

suspend fun ConsulClient.createPreparedQuery(definition: PreparedQueryDefinition): String {
  return awaitResult { this.createPreparedQuery(definition, it) }
}

suspend fun ConsulClient.getPreparedQuery(id: String): PreparedQueryDefinition {
  return awaitResult { this.getPreparedQuery(id, it) }
}

suspend fun ConsulClient.getAllPreparedQueries(): MutableList<PreparedQueryDefinition> {
  return awaitResult { this.getAllPreparedQueries(it) }
}

suspend fun ConsulClient.updatePreparedQuery(definition: PreparedQueryDefinition) {
  awaitResult<Void?> { this.updatePreparedQuery(definition, it) }
}

suspend fun ConsulClient.deletePreparedQuery(id: String) {
  awaitResult<Void?> { this.deletePreparedQuery(id, it) }
}

suspend fun ConsulClient.executePreparedQuery(query: String): PreparedQueryExecuteResponse {
  return awaitResult { this.executePreparedQuery(query, it) }
}

suspend fun ConsulClient.executePreparedQueryWithOptions(query: String, options: PreparedQueryExecuteOptions): PreparedQueryExecuteResponse {
  return awaitResult { this.executePreparedQueryWithOptions(query, options, it) }
}
