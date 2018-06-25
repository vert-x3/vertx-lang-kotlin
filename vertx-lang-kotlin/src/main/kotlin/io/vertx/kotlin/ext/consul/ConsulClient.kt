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

suspend fun ConsulClient.agentInfoAwait() : JsonObject {
    return awaitResult{
        this.agentInfo(it)
    }
}

suspend fun ConsulClient.coordinateNodesAwait() : CoordinateList {
    return awaitResult{
        this.coordinateNodes(it)
    }
}

suspend fun ConsulClient.coordinateNodesWithOptionsAwait(options : BlockingQueryOptions) : CoordinateList {
    return awaitResult{
        this.coordinateNodesWithOptions(options, it)
    }
}

suspend fun ConsulClient.coordinateDatacentersAwait() : List<DcCoordinates> {
    return awaitResult{
        this.coordinateDatacenters(it)
    }
}

suspend fun ConsulClient.getKeysAwait(keyPrefix : String) : List<String> {
    return awaitResult{
        this.getKeys(keyPrefix, it)
    }
}

suspend fun ConsulClient.getKeysWithOptionsAwait(keyPrefix : String, options : BlockingQueryOptions) : List<String> {
    return awaitResult{
        this.getKeysWithOptions(keyPrefix, options, it)
    }
}

suspend fun ConsulClient.getValueAwait(key : String) : KeyValue {
    return awaitResult{
        this.getValue(key, it)
    }
}

suspend fun ConsulClient.getValueWithOptionsAwait(key : String, options : BlockingQueryOptions) : KeyValue {
    return awaitResult{
        this.getValueWithOptions(key, options, it)
    }
}

suspend fun ConsulClient.deleteValueAwait(key : String) : Unit {
    return awaitResult{
        this.deleteValue(key, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.getValuesAwait(keyPrefix : String) : KeyValueList {
    return awaitResult{
        this.getValues(keyPrefix, it)
    }
}

suspend fun ConsulClient.getValuesWithOptionsAwait(keyPrefix : String, options : BlockingQueryOptions) : KeyValueList {
    return awaitResult{
        this.getValuesWithOptions(keyPrefix, options, it)
    }
}

suspend fun ConsulClient.deleteValuesAwait(keyPrefix : String) : Unit {
    return awaitResult{
        this.deleteValues(keyPrefix, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.putValueAwait(key : String, value : String) : Boolean {
    return awaitResult{
        this.putValue(key, value, it)
    }
}

suspend fun ConsulClient.putValueWithOptionsAwait(key : String, value : String, options : KeyValueOptions) : Boolean {
    return awaitResult{
        this.putValueWithOptions(key, value, options, it)
    }
}

suspend fun ConsulClient.transactionAwait(request : TxnRequest) : TxnResponse {
    return awaitResult{
        this.transaction(request, it)
    }
}

suspend fun ConsulClient.createAclTokenAwait(token : AclToken) : String {
    return awaitResult{
        this.createAclToken(token, it)
    }
}

suspend fun ConsulClient.updateAclTokenAwait(token : AclToken) : String {
    return awaitResult{
        this.updateAclToken(token, it)
    }
}

suspend fun ConsulClient.cloneAclTokenAwait(id : String) : String {
    return awaitResult{
        this.cloneAclToken(id, it)
    }
}

suspend fun ConsulClient.listAclTokensAwait() : List<AclToken> {
    return awaitResult{
        this.listAclTokens(it)
    }
}

suspend fun ConsulClient.infoAclTokenAwait(id : String) : AclToken {
    return awaitResult{
        this.infoAclToken(id, it)
    }
}

suspend fun ConsulClient.destroyAclTokenAwait(id : String) : Unit {
    return awaitResult{
        this.destroyAclToken(id, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.fireEventAwait(name : String) : Event {
    return awaitResult{
        this.fireEvent(name, it)
    }
}

suspend fun ConsulClient.fireEventWithOptionsAwait(name : String, options : EventOptions) : Event {
    return awaitResult{
        this.fireEventWithOptions(name, options, it)
    }
}

suspend fun ConsulClient.listEventsAwait() : EventList {
    return awaitResult{
        this.listEvents(it)
    }
}

suspend fun ConsulClient.listEventsWithOptionsAwait(options : EventListOptions) : EventList {
    return awaitResult{
        this.listEventsWithOptions(options, it)
    }
}

suspend fun ConsulClient.registerServiceAwait(serviceOptions : ServiceOptions) : Unit {
    return awaitResult{
        this.registerService(serviceOptions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.maintenanceServiceAwait(maintenanceOptions : MaintenanceOptions) : Unit {
    return awaitResult{
        this.maintenanceService(maintenanceOptions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.deregisterServiceAwait(id : String) : Unit {
    return awaitResult{
        this.deregisterService(id, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.catalogServiceNodesAwait(service : String) : ServiceList {
    return awaitResult{
        this.catalogServiceNodes(service, it)
    }
}

suspend fun ConsulClient.catalogServiceNodesWithOptionsAwait(service : String, options : ServiceQueryOptions) : ServiceList {
    return awaitResult{
        this.catalogServiceNodesWithOptions(service, options, it)
    }
}

suspend fun ConsulClient.catalogDatacentersAwait() : List<String> {
    return awaitResult{
        this.catalogDatacenters(it)
    }
}

suspend fun ConsulClient.catalogNodesAwait() : NodeList {
    return awaitResult{
        this.catalogNodes(it)
    }
}

suspend fun ConsulClient.catalogNodesWithOptionsAwait(options : NodeQueryOptions) : NodeList {
    return awaitResult{
        this.catalogNodesWithOptions(options, it)
    }
}

suspend fun ConsulClient.healthChecksAwait(service : String) : CheckList {
    return awaitResult{
        this.healthChecks(service, it)
    }
}

suspend fun ConsulClient.healthChecksWithOptionsAwait(service : String, options : CheckQueryOptions) : CheckList {
    return awaitResult{
        this.healthChecksWithOptions(service, options, it)
    }
}

suspend fun ConsulClient.healthStateAwait(healthState : HealthState) : CheckList {
    return awaitResult{
        this.healthState(healthState, it)
    }
}

suspend fun ConsulClient.healthStateWithOptionsAwait(healthState : HealthState, options : CheckQueryOptions) : CheckList {
    return awaitResult{
        this.healthStateWithOptions(healthState, options, it)
    }
}

suspend fun ConsulClient.healthServiceNodesAwait(service : String, passing : Boolean) : ServiceEntryList {
    return awaitResult{
        this.healthServiceNodes(service, passing, it)
    }
}

suspend fun ConsulClient.healthServiceNodesWithOptionsAwait(service : String, passing : Boolean, options : ServiceQueryOptions) : ServiceEntryList {
    return awaitResult{
        this.healthServiceNodesWithOptions(service, passing, options, it)
    }
}

suspend fun ConsulClient.catalogServicesAwait() : ServiceList {
    return awaitResult{
        this.catalogServices(it)
    }
}

suspend fun ConsulClient.catalogServicesWithOptionsAwait(options : BlockingQueryOptions) : ServiceList {
    return awaitResult{
        this.catalogServicesWithOptions(options, it)
    }
}

suspend fun ConsulClient.catalogNodeServicesAwait(node : String) : ServiceList {
    return awaitResult{
        this.catalogNodeServices(node, it)
    }
}

suspend fun ConsulClient.catalogNodeServicesWithOptionsAwait(node : String, options : BlockingQueryOptions) : ServiceList {
    return awaitResult{
        this.catalogNodeServicesWithOptions(node, options, it)
    }
}

suspend fun ConsulClient.localServicesAwait() : List<Service> {
    return awaitResult{
        this.localServices(it)
    }
}

suspend fun ConsulClient.localChecksAwait() : List<Check> {
    return awaitResult{
        this.localChecks(it)
    }
}

suspend fun ConsulClient.registerCheckAwait(checkOptions : CheckOptions) : Unit {
    return awaitResult{
        this.registerCheck(checkOptions, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.deregisterCheckAwait(checkId : String) : Unit {
    return awaitResult{
        this.deregisterCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.passCheckAwait(checkId : String) : Unit {
    return awaitResult{
        this.passCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.passCheckWithNoteAwait(checkId : String, note : String) : Unit {
    return awaitResult{
        this.passCheckWithNote(checkId, note, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.warnCheckAwait(checkId : String) : Unit {
    return awaitResult{
        this.warnCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.warnCheckWithNoteAwait(checkId : String, note : String) : Unit {
    return awaitResult{
        this.warnCheckWithNote(checkId, note, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.failCheckAwait(checkId : String) : Unit {
    return awaitResult{
        this.failCheck(checkId, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.failCheckWithNoteAwait(checkId : String, note : String) : Unit {
    return awaitResult{
        this.failCheckWithNote(checkId, note, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.updateCheckAwait(checkId : String, status : CheckStatus) : Unit {
    return awaitResult{
        this.updateCheck(checkId, status, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.updateCheckWithNoteAwait(checkId : String, status : CheckStatus, note : String) : Unit {
    return awaitResult{
        this.updateCheckWithNote(checkId, status, note, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.leaderStatusAwait() : String {
    return awaitResult{
        this.leaderStatus(it)
    }
}

suspend fun ConsulClient.peersStatusAwait() : List<String> {
    return awaitResult{
        this.peersStatus(it)
    }
}

suspend fun ConsulClient.createSessionAwait() : String {
    return awaitResult{
        this.createSession(it)
    }
}

suspend fun ConsulClient.createSessionWithOptionsAwait(options : SessionOptions) : String {
    return awaitResult{
        this.createSessionWithOptions(options, it)
    }
}

suspend fun ConsulClient.infoSessionAwait(id : String) : Session {
    return awaitResult{
        this.infoSession(id, it)
    }
}

suspend fun ConsulClient.infoSessionWithOptionsAwait(id : String, options : BlockingQueryOptions) : Session {
    return awaitResult{
        this.infoSessionWithOptions(id, options, it)
    }
}

suspend fun ConsulClient.renewSessionAwait(id : String) : Session {
    return awaitResult{
        this.renewSession(id, it)
    }
}

suspend fun ConsulClient.listSessionsAwait() : SessionList {
    return awaitResult{
        this.listSessions(it)
    }
}

suspend fun ConsulClient.listSessionsWithOptionsAwait(options : BlockingQueryOptions) : SessionList {
    return awaitResult{
        this.listSessionsWithOptions(options, it)
    }
}

suspend fun ConsulClient.listNodeSessionsAwait(nodeId : String) : SessionList {
    return awaitResult{
        this.listNodeSessions(nodeId, it)
    }
}

suspend fun ConsulClient.listNodeSessionsWithOptionsAwait(nodeId : String, options : BlockingQueryOptions) : SessionList {
    return awaitResult{
        this.listNodeSessionsWithOptions(nodeId, options, it)
    }
}

suspend fun ConsulClient.destroySessionAwait(id : String) : Unit {
    return awaitResult{
        this.destroySession(id, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.createPreparedQueryAwait(definition : PreparedQueryDefinition) : String {
    return awaitResult{
        this.createPreparedQuery(definition, it)
    }
}

suspend fun ConsulClient.getPreparedQueryAwait(id : String) : PreparedQueryDefinition {
    return awaitResult{
        this.getPreparedQuery(id, it)
    }
}

suspend fun ConsulClient.getAllPreparedQueriesAwait() : List<PreparedQueryDefinition> {
    return awaitResult{
        this.getAllPreparedQueries(it)
    }
}

suspend fun ConsulClient.updatePreparedQueryAwait(definition : PreparedQueryDefinition) : Unit {
    return awaitResult{
        this.updatePreparedQuery(definition, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.deletePreparedQueryAwait(id : String) : Unit {
    return awaitResult{
        this.deletePreparedQuery(id, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun ConsulClient.executePreparedQueryAwait(query : String) : PreparedQueryExecuteResponse {
    return awaitResult{
        this.executePreparedQuery(query, it)
    }
}

suspend fun ConsulClient.executePreparedQueryWithOptionsAwait(query : String, options : PreparedQueryExecuteOptions) : PreparedQueryExecuteResponse {
    return awaitResult{
        this.executePreparedQueryWithOptions(query, options, it)
    }
}

