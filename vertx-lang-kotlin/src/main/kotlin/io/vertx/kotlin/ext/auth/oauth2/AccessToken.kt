package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpMethod
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Response
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AccessToken.refreshAwait() : Unit {
    return awaitResult{
        this.refresh({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AccessToken.revokeAwait(token_type : String) : Unit {
    return awaitResult{
        this.revoke(token_type, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AccessToken.logoutAwait() : Unit {
    return awaitResult{
        this.logout({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AccessToken.introspectAwait() : Unit {
    return awaitResult{
        this.introspect({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AccessToken.introspectAwait(tokenType : String) : Unit {
    return awaitResult{
        this.introspect(tokenType, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun AccessToken.userInfoAwait() : JsonObject {
    return awaitResult{
        this.userInfo(it)
    }
}

suspend fun AccessToken.fetchAwait(resource : String) : OAuth2Response {
    return awaitResult{
        this.fetch(resource, it)
    }
}

suspend fun AccessToken.fetchAwait(method : HttpMethod, resource : String, headers : JsonObject, payload : Buffer) : OAuth2Response {
    return awaitResult{
        this.fetch(method, resource, headers, payload, it)
    }
}

