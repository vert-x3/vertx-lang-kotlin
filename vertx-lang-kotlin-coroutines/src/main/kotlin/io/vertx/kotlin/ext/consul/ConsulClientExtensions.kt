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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Returns the configuration and member information of the local agent
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent.html#read-configuration">/v1/agent/self</a> endpoint
 */
suspend fun ConsulClient.agentInfo(): JsonObject {
  return awaitResult { this.agentInfo(it) }
}

/**
 *  Returns the LAN network coordinates for all nodes in a given DC
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/coordinate.html#read-lan-coordinates">/v1/coordinate/nodes</a> endpoint
 */
suspend fun ConsulClient.coordinateNodes(): CoordinateList {
  return awaitResult { this.coordinateNodes(it) }
}

/**
 *  Returns the LAN network coordinates for all nodes in a given DC
 *  This is blocking query unlike [ConsulClient.coordinateNodes]
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/coordinate.html#read-lan-coordinates">/v1/coordinate/nodes</a> endpoint
 */
suspend fun ConsulClient.coordinateNodesWithOptions(options: BlockingQueryOptions): CoordinateList {
  return awaitResult { this.coordinateNodesWithOptions(options, it) }
}

/**
 *  Returns the WAN network coordinates for all Consul servers, organized by DCs
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/coordinate.html#read-wan-coordinates">/v1/coordinate/datacenters</a> endpoint
 */
suspend fun ConsulClient.coordinateDatacenters(): MutableList<DcCoordinates> {
  return awaitResult { this.coordinateDatacenters(it) }
}

/**
 *  Returns the list of keys that corresponding to the specified key prefix.
 * @param keyPrefix     the prefix
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#read-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.getKeys(keyPrefix: String): MutableList<String> {
  return awaitResult { this.getKeys(keyPrefix, it) }
}

/**
 *  Returns the list of keys that corresponding to the specified key prefix.
 * @param keyPrefix     the prefix
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#read-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.getKeysWithOptions(keyPrefix: String, options: BlockingQueryOptions): MutableList<String> {
  return awaitResult { this.getKeysWithOptions(keyPrefix, options, it) }
}

/**
 *  Returns key/value pair that corresponding to the specified key.
 *  An empty [KeyValue] object will be returned if no such key is found.
 * @param key           the key
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#read-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.getValue(key: String): KeyValue {
  return awaitResult { this.getValue(key, it) }
}

/**
 *  Returns key/value pair that corresponding to the specified key.
 *  An empty [KeyValue] object will be returned if no such key is found.
 *  This is blocking query unlike [ConsulClient.getValue]
 * @param key           the key
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#read-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.getValueWithOptions(key: String, options: BlockingQueryOptions): KeyValue {
  return awaitResult { this.getValueWithOptions(key, options, it) }
}

/**
 *  Remove the key/value pair that corresponding to the specified key
 * @param key           the key
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#delete-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.deleteValue(key: String) {
  awaitResult<Void?> { this.deleteValue(key, it) }
}

/**
 *  Returns the list of key/value pairs that corresponding to the specified key prefix.
 *  An empty [KeyValueList] object will be returned if no such key prefix is found.
 * @param keyPrefix     the prefix
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#read-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.getValues(keyPrefix: String): KeyValueList {
  return awaitResult { this.getValues(keyPrefix, it) }
}

/**
 *  Returns the list of key/value pairs that corresponding to the specified key prefix.
 *  An empty [KeyValueList] object will be returned if no such key prefix is found.
 *  This is blocking query unlike [ConsulClient.getValues]
 * @param keyPrefix     the prefix
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#read-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.getValuesWithOptions(keyPrefix: String, options: BlockingQueryOptions): KeyValueList {
  return awaitResult { this.getValuesWithOptions(keyPrefix, options, it) }
}

/**
 *  Removes all the key/value pair that corresponding to the specified key prefix
 * @param keyPrefix     the prefix
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#delete-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.deleteValues(keyPrefix: String) {
  awaitResult<Void?> { this.deleteValues(keyPrefix, it) }
}

/**
 *  Adds specified key/value pair
 * @param key           the key
 * @param value         the value
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#create-update-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.putValue(key: String, value: String): Boolean {
  return awaitResult { this.putValue(key, value, it) }
}

/**
 *
 * @param key           the key
 * @param value         the value
 * @param options       options used to push pair
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/kv.html#create-update-key">/v1/kv/:key</a> endpoint
 */
suspend fun ConsulClient.putValueWithOptions(
  key: String,
  value: String,
  options: KeyValueOptions
): Boolean {
  return awaitResult { this.putValueWithOptions(key, value, options, it) }
}

/**
 *  Manages multiple operations inside a single, atomic transaction.
 * @param request       transaction request
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/txn.html">/v1/txn</a> endpoint
 */
suspend fun ConsulClient.transaction(request: TxnRequest): TxnResponse {
  return awaitResult { this.transaction(request, it) }
}

/**
 *  Create new Acl token
 * @param token     properties of the token
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/acl.html#create-acl-token">/v1/acl/create</a> endpoint
 */
suspend fun ConsulClient.createAclToken(token: AclToken): String {
  return awaitResult { this.createAclToken(token, it) }
}

/**
 *  Update Acl token
 * @param token     properties of the token to be updated
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/acl.html#update-acl-token">/v1/acl/update</a> endpoint
 */
suspend fun ConsulClient.updateAclToken(token: AclToken): String {
  return awaitResult { this.updateAclToken(token, it) }
}

/**
 *  Clone Acl token
 * @param id        the ID of token to be cloned
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/acl.html#clone-acl-token">/v1/acl/clone/:uuid</a> endpoint
 */
suspend fun ConsulClient.cloneAclToken(id: String): String {
  return awaitResult { this.cloneAclToken(id, it) }
}

/**
 *  Get list of Acl token
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/acl.html#list-acls">/v1/acl/list</a> endpoint
 */
suspend fun ConsulClient.listAclTokens(): MutableList<AclToken> {
  return awaitResult { this.listAclTokens(it) }
}

/**
 *  Get info of Acl token
 * @param id           the ID of token
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/acl.html#read-acl-token">/v1/acl/info/:uuid</a> endpoint
 */
suspend fun ConsulClient.infoAclToken(id: String): AclToken {
  return awaitResult { this.infoAclToken(id, it) }
}

/**
 *  Destroy Acl token
 * @param id            the ID of token
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/acl.html#delete-acl-token">/v1/acl/destroy/:uuid</a> endpoint
 */
suspend fun ConsulClient.destroyAclToken(id: String) {
  awaitResult<Void?> { this.destroyAclToken(id, it) }
}

/**
 *  Fires a new user event
 * @param name          name of event
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/event.html#fire-event">/v1/event/fire/:name</a> endpoint
 */
suspend fun ConsulClient.fireEvent(name: String): Event {
  return awaitResult { this.fireEvent(name, it) }
}

/**
 *  Fires a new user event
 * @param name          name of event
 * @param options       options used to create event
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/event.html#fire-event">/v1/event/fire/:name</a> endpoint
 */
suspend fun ConsulClient.fireEventWithOptions(name: String, options: EventOptions): Event {
  return awaitResult { this.fireEventWithOptions(name, options, it) }
}

/**
 *  Returns the most recent events known by the agent
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/event.html#list-events">/v1/event/list</a> endpoint
 */
suspend fun ConsulClient.listEvents(): EventList {
  return awaitResult { this.listEvents(it) }
}

/**
 *  Returns the most recent events known by the agent.
 *  This is blocking query unlike [ConsulClient.listEvents]. However, the semantics of this endpoint
 *  are slightly different. Most blocking queries provide a monotonic index and block until a newer index is available.
 *  This can be supported as a consequence of the total ordering of the consensus protocol. With gossip,
 *  there is no ordering, and instead `X-Consul-Index` maps to the newest event that matches the query.
 *  <p>
 *  In practice, this means the index is only useful when used against a single agent and has no meaning globally.
 *  Because Consul defines the index as being opaque, clients should not be expecting a natural ordering either.
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/event.html#list-events">/v1/event/list</a> endpoint
 */
suspend fun ConsulClient.listEventsWithOptions(options: EventListOptions): EventList {
  return awaitResult { this.listEventsWithOptions(options, it) }
}

/**
 *  Adds a new service, with an optional health check, to the local agent.
 * @param serviceOptions the options of new service
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/service.html#register-service">/v1/agent/service/register</a> endpoint
 * @see ServiceOptions
 */
suspend fun ConsulClient.registerService(serviceOptions: ServiceOptions) {
  awaitResult<Void?> { this.registerService(serviceOptions, it) }
}

/**
 *  Places a given service into "maintenance mode"
 * @param maintenanceOptions the maintenance options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/service.html#enable-maintenance-mode">/v1/agent/service/maintenance/:service_id</a> endpoint
 * @see MaintenanceOptions
 */
suspend fun ConsulClient.maintenanceService(maintenanceOptions: MaintenanceOptions) {
  awaitResult<Void?> { this.maintenanceService(maintenanceOptions, it) }
}

/**
 *  Remove a service from the local agent. The agent will take care of deregistering the service with the Catalog.
 *  If there is an associated check, that is also deregistered.
 * @param id            the ID of service
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/service.html#deregister-service">/v1/agent/service/deregister/:service_id</a> endpoint
 */
suspend fun ConsulClient.deregisterService(id: String) {
  awaitResult<Void?> { this.deregisterService(id, it) }
}

/**
 *  Returns the nodes providing a service
 * @param service       name of service
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-nodes-for-service">/v1/catalog/service/:service</a> endpoint
 */
suspend fun ConsulClient.catalogServiceNodes(service: String): ServiceList {
  return awaitResult { this.catalogServiceNodes(service, it) }
}

/**
 *  Returns the nodes providing a service
 * @param service       name of service
 * @param options       options used to request services
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-nodes-for-service">/v1/catalog/service/:service</a> endpoint
 */
suspend fun ConsulClient.catalogServiceNodesWithOptions(service: String, options: ServiceQueryOptions): ServiceList {
  return awaitResult { this.catalogServiceNodesWithOptions(service, options, it) }
}

/**
 *  Return all the datacenters that are known by the Consul server
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-datacenters">/v1/catalog/datacenters</a> endpoint
 */
suspend fun ConsulClient.catalogDatacenters(): MutableList<String> {
  return awaitResult { this.catalogDatacenters(it) }
}

/**
 *  Returns the nodes registered in a datacenter
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-nodes">/v1/catalog/nodes</a> endpoint
 */
suspend fun ConsulClient.catalogNodes(): NodeList {
  return awaitResult { this.catalogNodes(it) }
}

/**
 *  Returns the nodes registered in a datacenter
 * @param options       options used to request nodes
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-nodes">/v1/catalog/nodes</a> endpoint
 */
suspend fun ConsulClient.catalogNodesWithOptions(options: NodeQueryOptions): NodeList {
  return awaitResult { this.catalogNodesWithOptions(options, it) }
}

/**
 *  Returns the checks associated with the service
 * @param service       the service name
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/health.html#list-checks-for-service">/v1/health/checks/:service</a> endpoint
 */
suspend fun ConsulClient.healthChecks(service: String): CheckList {
  return awaitResult { this.healthChecks(service, it) }
}

/**
 *  Returns the checks associated with the service
 * @param service       the service name
 * @param options       options used to request checks
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/health.html#list-checks-for-service">/v1/health/checks/:service</a> endpoint
 */
suspend fun ConsulClient.healthChecksWithOptions(service: String, options: CheckQueryOptions): CheckList {
  return awaitResult { this.healthChecksWithOptions(service, options, it) }
}

/**
 *  Returns the checks in the specified status
 * @param healthState   the health state
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/health.html#list-checks-in-state">/v1/health/state/:state</a> endpoint
 */
suspend fun ConsulClient.healthState(healthState: HealthState): CheckList {
  return awaitResult { this.healthState(healthState, it) }
}

/**
 *  Returns the checks in the specified status
 * @param healthState   the health state
 * @param options       options used to request checks
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/health.html#list-checks-in-state">/v1/health/state/:state</a> endpoint
 */
suspend fun ConsulClient.healthStateWithOptions(healthState: HealthState, options: CheckQueryOptions): CheckList {
  return awaitResult { this.healthStateWithOptions(healthState, options, it) }
}

/**
 *  Returns the nodes providing the service. This endpoint is very similar to the [ConsulClient.catalogServiceNodes] endpoint;
 *  however, this endpoint automatically returns the status of the associated health check as well as any system level health checks.
 * @param service       the service name
 * @param passing       if true, filter results to only nodes with all checks in the passing state
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/health.html#list-nodes-for-service">/v1/health/service/:service</a> endpoint
 */
suspend fun ConsulClient.healthServiceNodes(service: String, passing: Boolean): ServiceEntryList {
  return awaitResult { this.healthServiceNodes(service, passing, it) }
}

/**
 *  Returns the nodes providing the service. This endpoint is very similar to the [ConsulClient.catalogServiceNodesWithOptions] endpoint;
 *  however, this endpoint automatically returns the status of the associated health check as well as any system level health checks.
 * @param service       the service name
 * @param passing       if true, filter results to only nodes with all checks in the passing state
 * @param options       options used to request services
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/health.html#list-nodes-for-service">/v1/health/service/:service</a> endpoint
 */
suspend fun ConsulClient.healthServiceNodesWithOptions(
  service: String,
  passing: Boolean,
  options: ServiceQueryOptions
): ServiceEntryList {
  return awaitResult { this.healthServiceNodesWithOptions(service, passing, options, it) }
}

/**
 *  Returns the services registered in a datacenter
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-services">/v1/catalog/services</a> endpoint
 */
suspend fun ConsulClient.catalogServices(): ServiceList {
  return awaitResult { this.catalogServices(it) }
}

/**
 *  Returns the services registered in a datacenter
 *  This is blocking query unlike [ConsulClient.catalogServices]
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-services">/v1/catalog/services</a> endpoint
 */
suspend fun ConsulClient.catalogServicesWithOptions(options: BlockingQueryOptions): ServiceList {
  return awaitResult { this.catalogServicesWithOptions(options, it) }
}

/**
 *  Returns the node's registered services
 * @param node          node name
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-services-for-node">/v1/catalog/node/:node</a> endpoint
 */
suspend fun ConsulClient.catalogNodeServices(node: String): ServiceList {
  return awaitResult { this.catalogNodeServices(node, it) }
}

/**
 *  Returns the node's registered services
 *  This is blocking query unlike [ConsulClient.catalogNodeServices]
 * @param node          node name
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/catalog.html#list-services-for-node">/v1/catalog/node/:node</a> endpoint
 */
suspend fun ConsulClient.catalogNodeServicesWithOptions(node: String, options: BlockingQueryOptions): ServiceList {
  return awaitResult { this.catalogNodeServicesWithOptions(node, options, it) }
}

/**
 *  Returns list of services registered with the local agent.
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/service.html#list-services">/v1/agent/services</a> endpoint
 */
suspend fun ConsulClient.localServices(): MutableList<Service> {
  return awaitResult { this.localServices(it) }
}

/**
 *  Return all the checks that are registered with the local agent.
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#list-checks">/v1/agent/checks</a> endpoint
 */
suspend fun ConsulClient.localChecks(): MutableList<Check> {
  return awaitResult { this.localChecks(it) }
}

/**
 *  Add a new check to the local agent. The agent is responsible for managing the status of the check
 *  and keeping the Catalog in sync.
 * @param checkOptions  options used to register new check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#register-check">/v1/agent/check/register</a> endpoint
 */
suspend fun ConsulClient.registerCheck(checkOptions: CheckOptions) {
  awaitResult<Void?> { this.registerCheck(checkOptions, it) }
}

/**
 *  Remove a check from the local agent. The agent will take care of deregistering the check from the Catalog.
 * @param checkId       the ID of check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#deregister-check">/v1/agent/check/deregister/:check_id</a> endpoint
 */
suspend fun ConsulClient.deregisterCheck(checkId: String) {
  awaitResult<Void?> { this.deregisterCheck(checkId, it) }
}

/**
 *  Set status of the check to "passing". Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-pass">/v1/agent/check/pass/:check_id</a> endpoint
 * @see CheckStatus
 */
suspend fun ConsulClient.passCheck(checkId: String) {
  awaitResult<Void?> { this.passCheck(checkId, it) }
}

/**
 *  Set status of the check to "passing". Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @param note          a human-readable message with the status of the check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-pass">/v1/agent/check/pass/:check_id</a> endpoint
 * @see CheckStatus
 */
suspend fun ConsulClient.passCheckWithNote(checkId: String, note: String) {
  awaitResult<Void?> { this.passCheckWithNote(checkId, note, it) }
}

/**
 *  Set status of the check to "warning". Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-warn">/v1/agent/check/warn/:check_id</a> endpoint
 * @see CheckStatus
 */
suspend fun ConsulClient.warnCheck(checkId: String) {
  awaitResult<Void?> { this.warnCheck(checkId, it) }
}

/**
 *  Set status of the check to "warning". Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @param note          a human-readable message with the status of the check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-warn">/v1/agent/check/warn/:check_id</a> endpoint
 * @see CheckStatus
 */
suspend fun ConsulClient.warnCheckWithNote(checkId: String, note: String) {
  awaitResult<Void?> { this.warnCheckWithNote(checkId, note, it) }
}

/**
 *  Set status of the check to "critical". Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-fail">/v1/agent/check/fail/:check_id</a> endpoint
 * @see CheckStatus
 */
suspend fun ConsulClient.failCheck(checkId: String) {
  awaitResult<Void?> { this.failCheck(checkId, it) }
}

/**
 *  Set status of the check to "critical". Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @param note          a human-readable message with the status of the check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-fail">/v1/agent/check/fail/:check_id</a> endpoint
 * @see CheckStatus
 */
suspend fun ConsulClient.failCheckWithNote(checkId: String, note: String) {
  awaitResult<Void?> { this.failCheckWithNote(checkId, note, it) }
}

/**
 *  Set status of the check to given status. Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @param status        new status of check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-update">/v1/agent/check/update/:check_id</a> endpoint
 */
suspend fun ConsulClient.updateCheck(checkId: String, status: CheckStatus) {
  awaitResult<Void?> { this.updateCheck(checkId, status, it) }
}

/**
 *  Set status of the check to given status. Used with a check that is of the TTL type. The TTL clock will be reset.
 * @param checkId       the ID of check
 * @param status        new status of check
 * @param note          a human-readable message with the status of the check
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/agent/check.html#ttl-check-update">/v1/agent/check/update/:check_id</a> endpoint
 */
suspend fun ConsulClient.updateCheckWithNote(
  checkId: String,
  status: CheckStatus,
  note: String
) {
  awaitResult<Void?> { this.updateCheckWithNote(checkId, status, note, it) }
}

/**
 *  Get the Raft leader for the datacenter in which the agent is running.
 *  It returns an address in format "<code>10.1.10.12:8300</code>"
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/status.html#get-raft-leader">/v1/status/leader</a> endpoint
 */
suspend fun ConsulClient.leaderStatus(): String {
  return awaitResult { this.leaderStatus(it) }
}

/**
 *  Retrieves the Raft peers for the datacenter in which the the agent is running.
 *  It returns a list of addresses "<code>10.1.10.12:8300</code>", "<code>10.1.10.13:8300</code>"
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/status.html#list-raft-peers">/v1/status/peers</a> endpoint
 */
suspend fun ConsulClient.peersStatus(): MutableList<String> {
  return awaitResult { this.peersStatus(it) }
}

/**
 *  Initialize a new session
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#create-session">/v1/session/create</a> endpoint
 */
suspend fun ConsulClient.createSession(): String {
  return awaitResult { this.createSession(it) }
}

/**
 *  Initialize a new session
 * @param options   options used to create session
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#create-session">/v1/session/create</a> endpoint
 */
suspend fun ConsulClient.createSessionWithOptions(options: SessionOptions): String {
  return awaitResult { this.createSessionWithOptions(options, it) }
}

/**
 *  Returns the requested session information
 * @param id            the ID of requested session
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#read-session">/v1/session/info/:uuid</a> endpoint
 */
suspend fun ConsulClient.infoSession(id: String): Session {
  return awaitResult { this.infoSession(id, it) }
}

/**
 *  Returns the requested session information
 *  This is blocking query unlike [ConsulClient.infoSession]
 * @param id            the ID of requested session
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#read-session">/v1/session/info/:uuid</a> endpoint
 */
suspend fun ConsulClient.infoSessionWithOptions(id: String, options: BlockingQueryOptions): Session {
  return awaitResult { this.infoSessionWithOptions(id, options, it) }
}

/**
 *  Renews the given session. This is used with sessions that have a TTL, and it extends the expiration by the TTL
 * @param id            the ID of session that should be renewed
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#renew-session">/v1/session/renew/:uuid</a> endpoint
 */
suspend fun ConsulClient.renewSession(id: String): Session {
  return awaitResult { this.renewSession(id, it) }
}

/**
 *  Returns the active sessions
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#list-sessions">/v1/session/list</a> endpoint
 */
suspend fun ConsulClient.listSessions(): SessionList {
  return awaitResult { this.listSessions(it) }
}

/**
 *  Returns the active sessions
 *  This is blocking query unlike [ConsulClient.listSessions]
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#list-sessions">/v1/session/list</a> endpoint
 */
suspend fun ConsulClient.listSessionsWithOptions(options: BlockingQueryOptions): SessionList {
  return awaitResult { this.listSessionsWithOptions(options, it) }
}

/**
 *  Returns the active sessions for a given node
 * @param nodeId        the ID of node
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#list-sessions-for-node">/v1/session/node/:node</a> endpoint
 */
suspend fun ConsulClient.listNodeSessions(nodeId: String): SessionList {
  return awaitResult { this.listNodeSessions(nodeId, it) }
}

/**
 *  Returns the active sessions for a given node
 *  This is blocking query unlike [ConsulClient.listNodeSessions]
 * @param nodeId        the ID of node
 * @param options       the blocking options
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#list-sessions-for-node">/v1/session/node/:node</a> endpoint
 */
suspend fun ConsulClient.listNodeSessionsWithOptions(nodeId: String, options: BlockingQueryOptions): SessionList {
  return awaitResult { this.listNodeSessionsWithOptions(nodeId, options, it) }
}

/**
 *  Destroys the given session
 * @param id            the ID of session
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/session.html#delete-session">/v1/session/destroy/:uuid</a> endpoint
 */
suspend fun ConsulClient.destroySession(id: String) {
  awaitResult<Void?> { this.destroySession(id, it) }
}

/**
 *
 * @param definition    definition of the prepare query
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/query.html#create-prepared-query">/v1/query</a> endpoint
 */
suspend fun ConsulClient.createPreparedQuery(definition: PreparedQueryDefinition): String {
  return awaitResult { this.createPreparedQuery(definition, it) }
}

/**
 *  Returns an existing prepared query
 * @param id            the id of the query to read
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/query.html#read-prepared-query-1">/v1/query/:uuid</a> endpoint
 */
suspend fun ConsulClient.getPreparedQuery(id: String): PreparedQueryDefinition {
  return awaitResult { this.getPreparedQuery(id, it) }
}

/**
 *  Returns a list of all prepared queries.
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/query.html#read-prepared-query">/v1/query</a> endpoint
 */
suspend fun ConsulClient.getAllPreparedQueries(): MutableList<PreparedQueryDefinition> {
  return awaitResult { this.getAllPreparedQueries(it) }
}

/**
 *
 * @param definition    definition of the prepare query
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/query.html#update-prepared-query">/v1/query/:uuid</a> endpoint
 */
suspend fun ConsulClient.updatePreparedQuery(definition: PreparedQueryDefinition) {
  awaitResult<Void?> { this.updatePreparedQuery(definition, it) }
}

/**
 *  Deletes an existing prepared query
 * @param id            the id of the query to delete
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/query.html#delete-prepared-query">/v1/query/:uuid</a> endpoint
 */
suspend fun ConsulClient.deletePreparedQuery(id: String) {
  awaitResult<Void?> { this.deletePreparedQuery(id, it) }
}

/**
 *  Executes an existing prepared query.
 * @param query         the ID of the query to execute. This can also be the name of an existing prepared query,
 *                       or a name that matches a prefix name for a prepared query template.
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/query.html#execute-prepared-query">/v1/query/:uuid/execute</a> endpoint
 */
suspend fun ConsulClient.executePreparedQuery(query: String): PreparedQueryExecuteResponse {
  return awaitResult { this.executePreparedQuery(query, it) }
}

/**
 *  Executes an existing prepared query.
 * @param query         the ID of the query to execute. This can also be the name of an existing prepared query,
 *                       or a name that matches a prefix name for a prepared query template.
 * @param options       the options used to execute prepared query
 * @return reference to this, for fluency
 * @see <a href="https://www.consul.io/api/query.html#execute-prepared-query">/v1/query/:uuid/execute</a> endpoint
 */
suspend fun ConsulClient.executePreparedQueryWithOptions(query: String, options: PreparedQueryExecuteOptions): PreparedQueryExecuteResponse {
  return awaitResult { this.executePreparedQueryWithOptions(query, options, it) }
}
