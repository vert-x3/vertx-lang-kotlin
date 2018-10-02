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
 * Returns the configuration and member information of the local agent
 *
 * @param resultHandler will be provided with the configuration and member information of the local agent
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.agentInfoAwait() : JsonObject {
  return awaitResult{
    this.agentInfo(it)
  }
}

/**
 * Returns the LAN network coordinates for all nodes in a given DC
 *
 * @param resultHandler will be provided with network coordinates of nodes in datacenter
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.coordinateNodesAwait() : CoordinateList {
  return awaitResult{
    this.coordinateNodes(it)
  }
}

/**
 * Returns the LAN network coordinates for all nodes in a given DC
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param options the blocking options
 * @param resultHandler will be provided with network coordinates of nodes in datacenter
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.coordinateNodesWithOptionsAwait(options : BlockingQueryOptions) : CoordinateList {
  return awaitResult{
    this.coordinateNodesWithOptions(options, it)
  }
}

/**
 * Returns the WAN network coordinates for all Consul servers, organized by DCs
 *
 * @param resultHandler will be provided with network coordinates for all Consul servers
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.coordinateDatacentersAwait() : List<DcCoordinates> {
  return awaitResult{
    this.coordinateDatacenters(it)
  }
}

/**
 * Returns the list of keys that corresponding to the specified key prefix.
 *
 * @param keyPrefix the prefix
 * @param resultHandler will be provided with keys list
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getKeysAwait(keyPrefix : String) : List<String> {
  return awaitResult{
    this.getKeys(keyPrefix, it)
  }
}

/**
 * Returns the list of keys that corresponding to the specified key prefix.
 *
 * @param keyPrefix the prefix
 * @param options the blocking options
 * @param resultHandler will be provided with keys list
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getKeysWithOptionsAwait(keyPrefix : String, options : BlockingQueryOptions) : List<String> {
  return awaitResult{
    this.getKeysWithOptions(keyPrefix, options, it)
  }
}

/**
 * Returns key/value pair that corresponding to the specified key.
 * An empty [io.vertx.ext.consul.KeyValue] object will be returned if no such key is found.
 *
 * @param key the key
 * @param resultHandler will be provided with key/value pair
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getValueAwait(key : String) : KeyValue {
  return awaitResult{
    this.getValue(key, it)
  }
}

/**
 * Returns key/value pair that corresponding to the specified key.
 * An empty [io.vertx.ext.consul.KeyValue] object will be returned if no such key is found.
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param key the key
 * @param options the blocking options
 * @param resultHandler will be provided with key/value pair
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getValueWithOptionsAwait(key : String, options : BlockingQueryOptions) : KeyValue {
  return awaitResult{
    this.getValueWithOptions(key, options, it)
  }
}

/**
 * Remove the key/value pair that corresponding to the specified key
 *
 * @param key the key
 * @param resultHandler will be called on complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.deleteValueAwait(key : String) : Unit {
  return awaitResult{
    this.deleteValue(key, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Returns the list of key/value pairs that corresponding to the specified key prefix.
 * An empty [io.vertx.ext.consul.KeyValueList] object will be returned if no such key prefix is found.
 *
 * @param keyPrefix the prefix
 * @param resultHandler will be provided with list of key/value pairs
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getValuesAwait(keyPrefix : String) : KeyValueList {
  return awaitResult{
    this.getValues(keyPrefix, it)
  }
}

/**
 * Returns the list of key/value pairs that corresponding to the specified key prefix.
 * An empty [io.vertx.ext.consul.KeyValueList] object will be returned if no such key prefix is found.
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param keyPrefix the prefix
 * @param options the blocking options
 * @param resultHandler will be provided with list of key/value pairs
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getValuesWithOptionsAwait(keyPrefix : String, options : BlockingQueryOptions) : KeyValueList {
  return awaitResult{
    this.getValuesWithOptions(keyPrefix, options, it)
  }
}

/**
 * Removes all the key/value pair that corresponding to the specified key prefix
 *
 * @param keyPrefix the prefix
 * @param resultHandler will be called on complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.deleteValuesAwait(keyPrefix : String) : Unit {
  return awaitResult{
    this.deleteValues(keyPrefix, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Adds specified key/value pair
 *
 * @param key the key
 * @param value the value
 * @param resultHandler will be provided with success of operation
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.putValueAwait(key : String, value : String) : Boolean {
  return awaitResult{
    this.putValue(key, value, it)
  }
}

/**
 *
 * @param key the key
 * @param value the value
 * @param options options used to push pair
 * @param resultHandler will be provided with success of operation
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.putValueWithOptionsAwait(key : String, value : String, options : KeyValueOptions) : Boolean {
  return awaitResult{
    this.putValueWithOptions(key, value, options, it)
  }
}

/**
 * Manages multiple operations inside a single, atomic transaction.
 *
 * @param request transaction request
 * @param resultHandler will be provided with result of transaction
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.transactionAwait(request : TxnRequest) : TxnResponse {
  return awaitResult{
    this.transaction(request, it)
  }
}

/**
 * Create new Acl token
 *
 * @param token properties of the token
 * @param idHandler will be provided with ID of created token
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.createAclTokenAwait(token : AclToken) : String {
  return awaitResult{
    this.createAclToken(token, it)
  }
}

/**
 * Update Acl token
 *
 * @param token properties of the token to be updated
 * @param idHandler will be provided with ID of updated
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.updateAclTokenAwait(token : AclToken) : String {
  return awaitResult{
    this.updateAclToken(token, it)
  }
}

/**
 * Clone Acl token
 *
 * @param id the ID of token to be cloned
 * @param idHandler will be provided with ID of cloned token
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.cloneAclTokenAwait(id : String) : String {
  return awaitResult{
    this.cloneAclToken(id, it)
  }
}

/**
 * Get list of Acl token
 *
 * @param resultHandler will be provided with list of tokens
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.listAclTokensAwait() : List<AclToken> {
  return awaitResult{
    this.listAclTokens(it)
  }
}

/**
 * Get info of Acl token
 *
 * @param id the ID of token
 * @param tokenHandler will be provided with token
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.infoAclTokenAwait(id : String) : AclToken {
  return awaitResult{
    this.infoAclToken(id, it)
  }
}

/**
 * Destroy Acl token
 *
 * @param id the ID of token
 * @param resultHandler will be called on complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.destroyAclTokenAwait(id : String) : Unit {
  return awaitResult{
    this.destroyAclToken(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Fires a new user event
 *
 * @param name name of event
 * @param resultHandler will be provided with properties of event
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.fireEventAwait(name : String) : Event {
  return awaitResult{
    this.fireEvent(name, it)
  }
}

/**
 * Fires a new user event
 *
 * @param name name of event
 * @param options options used to create event
 * @param resultHandler will be provided with properties of event
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.fireEventWithOptionsAwait(name : String, options : EventOptions) : Event {
  return awaitResult{
    this.fireEventWithOptions(name, options, it)
  }
}

/**
 * Returns the most recent events known by the agent
 *
 * @param resultHandler will be provided with list of events
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.listEventsAwait() : EventList {
  return awaitResult{
    this.listEvents(it)
  }
}

/**
 * Returns the most recent events known by the agent.
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]. However, the semantics of this endpoint
 * are slightly different. Most blocking queries provide a monotonic index and block until a newer index is available.
 * This can be supported as a consequence of the total ordering of the consensus protocol. With gossip,
 * there is no ordering, and instead <code>X-Consul-Index</code> maps to the newest event that matches the query.
 * <p>
 * In practice, this means the index is only useful when used against a single agent and has no meaning globally.
 * Because Consul defines the index as being opaque, clients should not be expecting a natural ordering either.
 *
 * @param options the blocking options
 * @param resultHandler will be provided with list of events
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.listEventsWithOptionsAwait(options : EventListOptions) : EventList {
  return awaitResult{
    this.listEventsWithOptions(options, it)
  }
}

/**
 * Adds a new service, with an optional health check, to the local agent.
 *
 * @param serviceOptions the options of new service
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.registerServiceAwait(serviceOptions : ServiceOptions) : Unit {
  return awaitResult{
    this.registerService(serviceOptions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Places a given service into "maintenance mode"
 *
 * @param maintenanceOptions the maintenance options
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.maintenanceServiceAwait(maintenanceOptions : MaintenanceOptions) : Unit {
  return awaitResult{
    this.maintenanceService(maintenanceOptions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Remove a service from the local agent. The agent will take care of deregistering the service with the Catalog.
 * If there is an associated check, that is also deregistered.
 *
 * @param id the ID of service
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.deregisterServiceAwait(id : String) : Unit {
  return awaitResult{
    this.deregisterService(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Returns the nodes providing a service
 *
 * @param service name of service
 * @param resultHandler will be provided with list of nodes providing given service
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogServiceNodesAwait(service : String) : ServiceList {
  return awaitResult{
    this.catalogServiceNodes(service, it)
  }
}

/**
 * Returns the nodes providing a service
 *
 * @param service name of service
 * @param options options used to request services
 * @param resultHandler will be provided with list of nodes providing given service
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogServiceNodesWithOptionsAwait(service : String, options : ServiceQueryOptions) : ServiceList {
  return awaitResult{
    this.catalogServiceNodesWithOptions(service, options, it)
  }
}

/**
 * Return all the datacenters that are known by the Consul server
 *
 * @param resultHandler will be provided with list of datacenters
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogDatacentersAwait() : List<String> {
  return awaitResult{
    this.catalogDatacenters(it)
  }
}

/**
 * Returns the nodes registered in a datacenter
 *
 * @param resultHandler will be provided with list of nodes
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogNodesAwait() : NodeList {
  return awaitResult{
    this.catalogNodes(it)
  }
}

/**
 * Returns the nodes registered in a datacenter
 *
 * @param options options used to request nodes
 * @param resultHandler will be provided with list of nodes
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogNodesWithOptionsAwait(options : NodeQueryOptions) : NodeList {
  return awaitResult{
    this.catalogNodesWithOptions(options, it)
  }
}

/**
 * Returns the checks associated with the service
 *
 * @param service the service name
 * @param resultHandler will be provided with list of checks
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.healthChecksAwait(service : String) : CheckList {
  return awaitResult{
    this.healthChecks(service, it)
  }
}

/**
 * Returns the checks associated with the service
 *
 * @param service the service name
 * @param options options used to request checks
 * @param resultHandler will be provided with list of checks
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.healthChecksWithOptionsAwait(service : String, options : CheckQueryOptions) : CheckList {
  return awaitResult{
    this.healthChecksWithOptions(service, options, it)
  }
}

/**
 * Returns the checks in the specified status
 *
 * @param healthState the health state
 * @param resultHandler will be provided with list of checks
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.healthStateAwait(healthState : HealthState) : CheckList {
  return awaitResult{
    this.healthState(healthState, it)
  }
}

/**
 * Returns the checks in the specified status
 *
 * @param healthState the health state
 * @param options options used to request checks
 * @param resultHandler will be provided with list of checks
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.healthStateWithOptionsAwait(healthState : HealthState, options : CheckQueryOptions) : CheckList {
  return awaitResult{
    this.healthStateWithOptions(healthState, options, it)
  }
}

/**
 * Returns the nodes providing the service. This endpoint is very similar to the [io.vertx.ext.consul.ConsulClient] endpoint;
 * however, this endpoint automatically returns the status of the associated health check as well as any system level health checks.
 *
 * @param service the service name
 * @param passing if true, filter results to only nodes with all checks in the passing state
 * @param resultHandler will be provided with list of services
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.healthServiceNodesAwait(service : String, passing : Boolean) : ServiceEntryList {
  return awaitResult{
    this.healthServiceNodes(service, passing, it)
  }
}

/**
 * Returns the nodes providing the service. This endpoint is very similar to the [io.vertx.ext.consul.ConsulClient] endpoint;
 * however, this endpoint automatically returns the status of the associated health check as well as any system level health checks.
 *
 * @param service the service name
 * @param passing if true, filter results to only nodes with all checks in the passing state
 * @param options options used to request services
 * @param resultHandler will be provided with list of services
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.healthServiceNodesWithOptionsAwait(service : String, passing : Boolean, options : ServiceQueryOptions) : ServiceEntryList {
  return awaitResult{
    this.healthServiceNodesWithOptions(service, passing, options, it)
  }
}

/**
 * Returns the services registered in a datacenter
 *
 * @param resultHandler will be provided with list of services
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogServicesAwait() : ServiceList {
  return awaitResult{
    this.catalogServices(it)
  }
}

/**
 * Returns the services registered in a datacenter
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param options the blocking options
 * @param resultHandler will be provided with list of services
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogServicesWithOptionsAwait(options : BlockingQueryOptions) : ServiceList {
  return awaitResult{
    this.catalogServicesWithOptions(options, it)
  }
}

/**
 * Returns the node's registered services
 *
 * @param node node name
 * @param resultHandler will be provided with list of services
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogNodeServicesAwait(node : String) : ServiceList {
  return awaitResult{
    this.catalogNodeServices(node, it)
  }
}

/**
 * Returns the node's registered services
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param node node name
 * @param options the blocking options
 * @param resultHandler will be provided with list of services
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.catalogNodeServicesWithOptionsAwait(node : String, options : BlockingQueryOptions) : ServiceList {
  return awaitResult{
    this.catalogNodeServicesWithOptions(node, options, it)
  }
}

/**
 * Returns list of services registered with the local agent.
 *
 * @param resultHandler will be provided with list of services
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.localServicesAwait() : List<Service> {
  return awaitResult{
    this.localServices(it)
  }
}

/**
 * Return all the checks that are registered with the local agent.
 *
 * @param resultHandler will be provided with list of checks
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.localChecksAwait() : List<Check> {
  return awaitResult{
    this.localChecks(it)
  }
}

/**
 * Add a new check to the local agent. The agent is responsible for managing the status of the check
 * and keeping the Catalog in sync.
 *
 * @param checkOptions options used to register new check
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.registerCheckAwait(checkOptions : CheckOptions) : Unit {
  return awaitResult{
    this.registerCheck(checkOptions, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Remove a check from the local agent. The agent will take care of deregistering the check from the Catalog.
 *
 * @param checkId the ID of check
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.deregisterCheckAwait(checkId : String) : Unit {
  return awaitResult{
    this.deregisterCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to "passing". Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.passCheckAwait(checkId : String) : Unit {
  return awaitResult{
    this.passCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to "passing". Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.passCheckWithNoteAwait(checkId : String, note : String) : Unit {
  return awaitResult{
    this.passCheckWithNote(checkId, note, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to "warning". Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.warnCheckAwait(checkId : String) : Unit {
  return awaitResult{
    this.warnCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to "warning". Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.warnCheckWithNoteAwait(checkId : String, note : String) : Unit {
  return awaitResult{
    this.warnCheckWithNote(checkId, note, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to "critical". Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.failCheckAwait(checkId : String) : Unit {
  return awaitResult{
    this.failCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to "critical". Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.failCheckWithNoteAwait(checkId : String, note : String) : Unit {
  return awaitResult{
    this.failCheckWithNote(checkId, note, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to given status. Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param status new status of check
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.updateCheckAwait(checkId : String, status : CheckStatus) : Unit {
  return awaitResult{
    this.updateCheck(checkId, status, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Set status of the check to given status. Used with a check that is of the TTL type. The TTL clock will be reset.
 *
 * @param checkId the ID of check
 * @param status new status of check
 * @param note specifies a human-readable message. This will be passed through to the check's <code>Output</code> field.
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.updateCheckWithNoteAwait(checkId : String, status : CheckStatus, note : String) : Unit {
  return awaitResult{
    this.updateCheckWithNote(checkId, status, note, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Get the Raft leader for the datacenter in which the agent is running.
 * It returns an address in format "<code>10.1.10.12:8300</code>"
 *
 * @param resultHandler will be provided with address of cluster leader
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.leaderStatusAwait() : String {
  return awaitResult{
    this.leaderStatus(it)
  }
}

/**
 * Retrieves the Raft peers for the datacenter in which the the agent is running.
 * It returns a list of addresses "<code>10.1.10.12:8300</code>", "<code>10.1.10.13:8300</code>"
 *
 * @param resultHandler will be provided with list of peers
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.peersStatusAwait() : List<String> {
  return awaitResult{
    this.peersStatus(it)
  }
}

/**
 * Initialize a new session
 *
 * @param idHandler will be provided with ID of new session
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.createSessionAwait() : String {
  return awaitResult{
    this.createSession(it)
  }
}

/**
 * Initialize a new session
 *
 * @param options options used to create session
 * @param idHandler will be provided with ID of new session
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.createSessionWithOptionsAwait(options : SessionOptions) : String {
  return awaitResult{
    this.createSessionWithOptions(options, it)
  }
}

/**
 * Returns the requested session information
 *
 * @param id the ID of requested session
 * @param resultHandler will be provided with info of requested session
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.infoSessionAwait(id : String) : Session {
  return awaitResult{
    this.infoSession(id, it)
  }
}

/**
 * Returns the requested session information
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param id the ID of requested session
 * @param options the blocking options
 * @param resultHandler will be provided with info of requested session
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.infoSessionWithOptionsAwait(id : String, options : BlockingQueryOptions) : Session {
  return awaitResult{
    this.infoSessionWithOptions(id, options, it)
  }
}

/**
 * Renews the given session. This is used with sessions that have a TTL, and it extends the expiration by the TTL
 *
 * @param id the ID of session that should be renewed
 * @param resultHandler will be provided with info of renewed session
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.renewSessionAwait(id : String) : Session {
  return awaitResult{
    this.renewSession(id, it)
  }
}

/**
 * Returns the active sessions
 *
 * @param resultHandler will be provided with list of sessions
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.listSessionsAwait() : SessionList {
  return awaitResult{
    this.listSessions(it)
  }
}

/**
 * Returns the active sessions
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param options the blocking options
 * @param resultHandler will be provided with list of sessions
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.listSessionsWithOptionsAwait(options : BlockingQueryOptions) : SessionList {
  return awaitResult{
    this.listSessionsWithOptions(options, it)
  }
}

/**
 * Returns the active sessions for a given node
 *
 * @param nodeId the ID of node
 * @param resultHandler will be provided with list of sessions
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.listNodeSessionsAwait(nodeId : String) : SessionList {
  return awaitResult{
    this.listNodeSessions(nodeId, it)
  }
}

/**
 * Returns the active sessions for a given node
 * This is blocking query unlike [io.vertx.ext.consul.ConsulClient]
 *
 * @param nodeId the ID of node
 * @param options the blocking options
 * @param resultHandler will be provided with list of sessions
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.listNodeSessionsWithOptionsAwait(nodeId : String, options : BlockingQueryOptions) : SessionList {
  return awaitResult{
    this.listNodeSessionsWithOptions(nodeId, options, it)
  }
}

/**
 * Destroys the given session
 *
 * @param id the ID of session
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.destroySessionAwait(id : String) : Unit {
  return awaitResult{
    this.destroySession(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 *
 * @param definition definition of the prepare query
 * @param resultHandler will be provided with id of created prepare query
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.createPreparedQueryAwait(definition : PreparedQueryDefinition) : String {
  return awaitResult{
    this.createPreparedQuery(definition, it)
  }
}

/**
 * Returns an existing prepared query
 *
 * @param id the id of the query to read
 * @param resultHandler will be provided with definition of the prepare query
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getPreparedQueryAwait(id : String) : PreparedQueryDefinition {
  return awaitResult{
    this.getPreparedQuery(id, it)
  }
}

/**
 * Returns a list of all prepared queries.
 *
 * @param resultHandler will be provided with list of definitions of the all prepare queries
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.getAllPreparedQueriesAwait() : List<PreparedQueryDefinition> {
  return awaitResult{
    this.getAllPreparedQueries(it)
  }
}

/**
 *
 * @param definition definition of the prepare query
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.updatePreparedQueryAwait(definition : PreparedQueryDefinition) : Unit {
  return awaitResult{
    this.updatePreparedQuery(definition, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Deletes an existing prepared query
 *
 * @param id the id of the query to delete
 * @param resultHandler will be called when complete
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.deletePreparedQueryAwait(id : String) : Unit {
  return awaitResult{
    this.deletePreparedQuery(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Executes an existing prepared query.
 *
 * @param query the ID of the query to execute. This can also be the name of an existing prepared query, or a name that matches a prefix name for a prepared query template.
 * @param resultHandler will be provided with response
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.executePreparedQueryAwait(query : String) : PreparedQueryExecuteResponse {
  return awaitResult{
    this.executePreparedQuery(query, it)
  }
}

/**
 * Executes an existing prepared query.
 *
 * @param query the ID of the query to execute. This can also be the name of an existing prepared query, or a name that matches a prefix name for a prepared query template.
 * @param options the options used to execute prepared query
 * @param resultHandler will be provided with response
 * @returnreference to this, for fluency *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.ConsulClient original] using Vert.x codegen.
 */
suspend fun ConsulClient.executePreparedQueryWithOptionsAwait(query : String, options : PreparedQueryExecuteOptions) : PreparedQueryExecuteResponse {
  return awaitResult{
    this.executePreparedQueryWithOptions(query, options, it)
  }
}

