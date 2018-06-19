package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpMethod
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Response
import io.vertx.kotlin.coroutines.awaitResult

suspend fun AccessToken.refreshAwait() : Void? {
    return awaitResult{
        this.refresh(it)
    }
}

suspend fun AccessToken.revokeAwait(token_type : String) : Void? {
    return awaitResult{
        this.revoke(token_type, it)
    }
}

suspend fun AccessToken.logoutAwait() : Void? {
    return awaitResult{
        this.logout(it)
    }
}

suspend fun AccessToken.introspectAwait() : Void? {
    return awaitResult{
        this.introspect(it)
    }
}

suspend fun AccessToken.introspectAwait(tokenType : String) : Void? {
    return awaitResult{
        this.introspect(tokenType, it)
    }
}

suspend fun AccessToken.userInfoAwait() : JsonObject? {
    return awaitResult{
        this.userInfo(it)
    }
}

suspend fun AccessToken.fetchAwait(resource : String) : OAuth2Response? {
    return awaitResult{
        this.fetch(resource, it)
    }
}

suspend fun AccessToken.fetchAwait(method : HttpMethod, resource : String, headers : JsonObject, payload : Buffer) : OAuth2Response? {
    return awaitResult{
        this.fetch(method, resource, headers, payload, it)
    }
}

