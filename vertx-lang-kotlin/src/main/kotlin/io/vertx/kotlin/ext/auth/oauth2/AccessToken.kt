/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.core.buffer.Buffer
import io.vertx.core.http.HttpMethod
import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2Response
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Refresh the access token
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.refreshAwait() : Unit {
  return awaitResult{
    this.refresh({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Revoke access or refresh token
 *
 * @param token_type - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token".
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.revokeAwait(token_type : String) : Unit {
  return awaitResult{
    this.revoke(token_type, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Revoke refresh token and calls the logout endpoint. This is a openid-connect extension and might not be
 * available on all providers.
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.logoutAwait() : Unit {
  return awaitResult{
    this.logout({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Introspect access token. This is an OAuth2 extension that allow to verify if an access token is still valid.
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.introspectAwait() : Unit {
  return awaitResult{
    this.introspect({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Introspect access token. This is an OAuth2 extension that allow to verify if an access token is still valid.
 *
 * @param tokenType - A String containing the type of token to revoke. Should be either "access_token" or "refresh_token".
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.introspectAwait(tokenType : String) : Unit {
  return awaitResult{
    this.introspect(tokenType, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Load the user info as per OIDC spec.
 *
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.userInfoAwait() : JsonObject {
  return awaitResult{
    this.userInfo(it)
  }
}

/**
 * Fetches a JSON resource using this Access Token.
 *
 * @param resource - the resource to fetch.
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.fetchAwait(resource : String) : OAuth2Response {
  return awaitResult{
    this.fetch(resource, it)
  }
}

/**
 * Fetches a JSON resource using this Access Token.
 *
 * @param method - the HTTP method to user.
 * @param resource - the resource to fetch.
 * @param headers - extra headers to pass to the request.
 * @param payload - payload to send to the server.
 * @return  *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.AccessToken original] using Vert.x codegen.
 */
suspend fun AccessToken.fetchAwait(method : HttpMethod, resource : String, headers : JsonObject, payload : Buffer) : OAuth2Response {
  return awaitResult{
    this.fetch(method, resource, headers, payload, it)
  }
}

