package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Auth
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun OAuth2Auth.getTokenAwait(params : JsonObject) : AccessToken {
    return awaitResult{
        this.getToken(params, it)
    }
}

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

suspend fun OAuth2Auth.loadJWKAwait() : Void {
    return awaitResult{
        this.loadJWK(it)
    }
}

