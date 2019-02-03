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

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.agentInfo]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
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
suspend fun ConsulClient.deleteValueAwait(key: String): Unit {
  return awaitResult {
    this.deleteValue(key) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.deleteValuesAwait(keyPrefix: String): Unit {
  return awaitResult {
    this.deleteValues(keyPrefix) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.transactionAwait(request: TxnRequest): TxnResponse {
  return awaitResult {
    this.transaction(request, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.createAclToken]
 *
 * @param token properties of the token
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.createAclTokenAwait(token: AclToken): String {
  return awaitResult {
    this.createAclToken(token, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.updateAclToken]
 *
 * @param token properties of the token to be updated
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.updateAclTokenAwait(token: AclToken): String {
  return awaitResult {
    this.updateAclToken(token, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.cloneAclToken]
 *
 * @param id the ID of token to be cloned
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.cloneAclTokenAwait(id: String): String {
  return awaitResult {
    this.cloneAclToken(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.listAclTokens]
 *
 * @return [List<AclToken>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.listAclTokensAwait(): List<AclToken> {
  return awaitResult {
    this.listAclTokens(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.infoAclToken]
 *
 * @param id the ID of token
 * @return [AclToken]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.infoAclTokenAwait(id: String): AclToken {
  return awaitResult {
    this.infoAclToken(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.destroyAclToken]
 *
 * @param id the ID of token
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.destroyAclTokenAwait(id: String): Unit {
  return awaitResult {
    this.destroyAclToken(id) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.registerServiceAwait(serviceOptions: ServiceOptions): Unit {
  return awaitResult {
    this.registerService(serviceOptions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.maintenanceService]
 *
 * @param maintenanceOptions the maintenance options
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.maintenanceServiceAwait(maintenanceOptions: MaintenanceOptions): Unit {
  return awaitResult {
    this.maintenanceService(maintenanceOptions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deregisterService]
 *
 * @param id the ID of service
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.deregisterServiceAwait(id: String): Unit {
  return awaitResult {
    this.deregisterService(id) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.healthServiceNodesWithOptionsAwait(service: String, passing: Boolean, options: ServiceQueryOptions): ServiceEntryList {
  return awaitResult {
    this.healthServiceNodesWithOptions(service, passing, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.catalogServices]
 *
 * @return [ServiceList]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
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
suspend fun ConsulClient.registerCheckAwait(checkOptions: CheckOptions): Unit {
  return awaitResult {
    this.registerCheck(checkOptions) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deregisterCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.deregisterCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.deregisterCheck(checkId) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.passCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.passCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.passCheck(checkId) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.passCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.passCheckWithNote(checkId, note) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.warnCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.warnCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.warnCheck(checkId) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.warnCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.warnCheckWithNote(checkId, note) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.failCheck]
 *
 * @param checkId the ID of check
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.failCheckAwait(checkId: String): Unit {
  return awaitResult {
    this.failCheck(checkId) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.failCheckWithNoteAwait(checkId: String, note: String): Unit {
  return awaitResult {
    this.failCheckWithNote(checkId, note) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.updateCheckAwait(checkId: String, status: CheckStatus): Unit {
  return awaitResult {
    this.updateCheck(checkId, status) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.updateCheckWithNoteAwait(checkId: String, status: CheckStatus, note: String): Unit {
  return awaitResult {
    this.updateCheckWithNote(checkId, status, note) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.leaderStatus]
 *
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
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
suspend fun ConsulClient.destroySessionAwait(id: String): Unit {
  return awaitResult {
    this.destroySession(id) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.updatePreparedQueryAwait(definition: PreparedQueryDefinition): Unit {
  return awaitResult {
    this.updatePreparedQuery(definition) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.consul.ConsulClient.deletePreparedQuery]
 *
 * @param id the id of the query to delete
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.consul.ConsulClient] using Vert.x codegen.
 */
suspend fun ConsulClient.deletePreparedQueryAwait(id: String): Unit {
  return awaitResult {
    this.deletePreparedQuery(id) { ar -> it.handle(ar.mapEmpty()) }
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
suspend fun ConsulClient.executePreparedQueryWithOptionsAwait(query: String, options: PreparedQueryExecuteOptions): PreparedQueryExecuteResponse {
  return awaitResult {
    this.executePreparedQueryWithOptions(query, options, it)
  }
}

