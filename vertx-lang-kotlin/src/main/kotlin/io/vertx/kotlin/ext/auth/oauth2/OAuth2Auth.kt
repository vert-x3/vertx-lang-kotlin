package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.kotlin.coroutines.awaitResult

suspend fun OAuth2Auth.decodeTokenAwait(token : String) : AccessToken {
    return awaitResult{
        this.decodeToken(token, it)
    }
}

suspend fun OAuth2Auth.introspectTokenAwait(token : String) : AccessToken {
    return awaitResult{
        this.introspectToken(token, it)
    }
}

suspend fun OAuth2Auth.introspectTokenAwait(token : String, tokenType : String) : AccessToken {
    return awaitResult{
        this.introspectToken(token, tokenType, it)
    }
}

suspend fun OAuth2Auth.loadJWKAwait() : Unit {
    return awaitResult{
        this.loadJWK({ ar -> it.handle(ar.mapEmpty()) })}
}

