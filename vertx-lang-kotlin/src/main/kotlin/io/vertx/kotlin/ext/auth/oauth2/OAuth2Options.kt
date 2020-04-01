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

import io.vertx.ext.auth.oauth2.OAuth2Options
import io.vertx.core.http.HttpClientOptions
import io.vertx.ext.auth.PubSecKeyOptions
import io.vertx.ext.auth.oauth2.OAuth2FlowType
import io.vertx.ext.jwt.JWTOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.OAuth2Options] objects.
 *
 * Options describing how an OAuth2  will make connections.
 *
 * @param authorizationPath  Get the Oauth2 authorization resource path. e.g.: /oauth/authorize
 * @param clientID  Set the provider client id
 * @param clientSecret  Set the provider client secret
 * @param clientSecretParameterName  Override the HTTP form field name for client secret
 * @param extraParameters  Set extra parameters to be sent to the provider on each request
 * @param flow 
 * @param headers  Set custom headers to be sent with every request to the provider
 * @param httpClientOptions 
 * @param introspectionPath  Set the provider token introspection resource path
 * @param jwkPath 
 * @param jwtOptions 
 * @param logoutPath  Set the provider logout path
 * @param pubSecKeys  The provider PubSec key options
 * @param revocationPath  Set the Oauth2 revocation resource path. e.g.: /oauth/revoke
 * @param scopeSeparator  Set the provider scope separator
 * @param site  Root URL for the provider without trailing slashes
 * @param tenant  Sets an optional tenant. Tenants are used in some OpenID servers as placeholders for the URLs. The tenant should be set prior to any URL as it affects the way the URLs will be stored. Some provders may name this differently, for example: `realm`.
 * @param tokenPath  Get the Oauth2 token resource path. e.g.: /oauth/token
 * @param useBasicAuthorizationHeader  Flag to use HTTP basic auth header with client id, client secret.
 * @param userAgent  Set a custom user agent to use when communicating to a provider
 * @param userInfoParameters  Set custom parameters to be sent during the userInfo resource request
 * @param userInfoPath  Set the provider userInfo resource path
 * @param validateIssuer 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2Options original] using Vert.x codegen.
 */
fun oAuth2OptionsOf(
  authorizationPath: String? = null,
  clientID: String? = null,
  clientSecret: String? = null,
  clientSecretParameterName: String? = null,
  extraParameters: io.vertx.core.json.JsonObject? = null,
  flow: OAuth2FlowType? = null,
  headers: io.vertx.core.json.JsonObject? = null,
  httpClientOptions: io.vertx.core.http.HttpClientOptions? = null,
  introspectionPath: String? = null,
  jwkPath: String? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  logoutPath: String? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null,
  revocationPath: String? = null,
  scopeSeparator: String? = null,
  site: String? = null,
  tenant: String? = null,
  tokenPath: String? = null,
  useBasicAuthorizationHeader: Boolean? = null,
  userAgent: String? = null,
  userInfoParameters: io.vertx.core.json.JsonObject? = null,
  userInfoPath: String? = null,
  validateIssuer: Boolean? = null): OAuth2Options = io.vertx.ext.auth.oauth2.OAuth2Options().apply {

  if (authorizationPath != null) {
    this.setAuthorizationPath(authorizationPath)
  }
  if (clientID != null) {
    this.setClientID(clientID)
  }
  if (clientSecret != null) {
    this.setClientSecret(clientSecret)
  }
  if (clientSecretParameterName != null) {
    this.setClientSecretParameterName(clientSecretParameterName)
  }
  if (extraParameters != null) {
    this.setExtraParameters(extraParameters)
  }
  if (flow != null) {
    this.setFlow(flow)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (httpClientOptions != null) {
    this.setHttpClientOptions(httpClientOptions)
  }
  if (introspectionPath != null) {
    this.setIntrospectionPath(introspectionPath)
  }
  if (jwkPath != null) {
    this.setJwkPath(jwkPath)
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (logoutPath != null) {
    this.setLogoutPath(logoutPath)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (revocationPath != null) {
    this.setRevocationPath(revocationPath)
  }
  if (scopeSeparator != null) {
    this.setScopeSeparator(scopeSeparator)
  }
  if (site != null) {
    this.setSite(site)
  }
  if (tenant != null) {
    this.setTenant(tenant)
  }
  if (tokenPath != null) {
    this.setTokenPath(tokenPath)
  }
  if (useBasicAuthorizationHeader != null) {
    this.setUseBasicAuthorizationHeader(useBasicAuthorizationHeader)
  }
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (userInfoParameters != null) {
    this.setUserInfoParameters(userInfoParameters)
  }
  if (userInfoPath != null) {
    this.setUserInfoPath(userInfoPath)
  }
  if (validateIssuer != null) {
    this.setValidateIssuer(validateIssuer)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.OAuth2Options] objects.
 *
 * Options describing how an OAuth2  will make connections.
 *
 * @param authorizationPath  Get the Oauth2 authorization resource path. e.g.: /oauth/authorize
 * @param clientID  Set the provider client id
 * @param clientSecret  Set the provider client secret
 * @param clientSecretParameterName  Override the HTTP form field name for client secret
 * @param extraParameters  Set extra parameters to be sent to the provider on each request
 * @param flow 
 * @param headers  Set custom headers to be sent with every request to the provider
 * @param httpClientOptions 
 * @param introspectionPath  Set the provider token introspection resource path
 * @param jwkPath 
 * @param jwtOptions 
 * @param logoutPath  Set the provider logout path
 * @param pubSecKeys  The provider PubSec key options
 * @param revocationPath  Set the Oauth2 revocation resource path. e.g.: /oauth/revoke
 * @param scopeSeparator  Set the provider scope separator
 * @param site  Root URL for the provider without trailing slashes
 * @param tenant  Sets an optional tenant. Tenants are used in some OpenID servers as placeholders for the URLs. The tenant should be set prior to any URL as it affects the way the URLs will be stored. Some provders may name this differently, for example: `realm`.
 * @param tokenPath  Get the Oauth2 token resource path. e.g.: /oauth/token
 * @param useBasicAuthorizationHeader  Flag to use HTTP basic auth header with client id, client secret.
 * @param userAgent  Set a custom user agent to use when communicating to a provider
 * @param userInfoParameters  Set custom parameters to be sent during the userInfo resource request
 * @param userInfoPath  Set the provider userInfo resource path
 * @param validateIssuer 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2Options original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("oAuth2OptionsOf(authorizationPath, clientID, clientSecret, clientSecretParameterName, extraParameters, flow, headers, httpClientOptions, introspectionPath, jwkPath, jwtOptions, logoutPath, pubSecKeys, revocationPath, scopeSeparator, site, tenant, tokenPath, useBasicAuthorizationHeader, userAgent, userInfoParameters, userInfoPath, validateIssuer)")
)
fun OAuth2Options(
  authorizationPath: String? = null,
  clientID: String? = null,
  clientSecret: String? = null,
  clientSecretParameterName: String? = null,
  extraParameters: io.vertx.core.json.JsonObject? = null,
  flow: OAuth2FlowType? = null,
  headers: io.vertx.core.json.JsonObject? = null,
  httpClientOptions: io.vertx.core.http.HttpClientOptions? = null,
  introspectionPath: String? = null,
  jwkPath: String? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  logoutPath: String? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null,
  revocationPath: String? = null,
  scopeSeparator: String? = null,
  site: String? = null,
  tenant: String? = null,
  tokenPath: String? = null,
  useBasicAuthorizationHeader: Boolean? = null,
  userAgent: String? = null,
  userInfoParameters: io.vertx.core.json.JsonObject? = null,
  userInfoPath: String? = null,
  validateIssuer: Boolean? = null): OAuth2Options = io.vertx.ext.auth.oauth2.OAuth2Options().apply {

  if (authorizationPath != null) {
    this.setAuthorizationPath(authorizationPath)
  }
  if (clientID != null) {
    this.setClientID(clientID)
  }
  if (clientSecret != null) {
    this.setClientSecret(clientSecret)
  }
  if (clientSecretParameterName != null) {
    this.setClientSecretParameterName(clientSecretParameterName)
  }
  if (extraParameters != null) {
    this.setExtraParameters(extraParameters)
  }
  if (flow != null) {
    this.setFlow(flow)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (httpClientOptions != null) {
    this.setHttpClientOptions(httpClientOptions)
  }
  if (introspectionPath != null) {
    this.setIntrospectionPath(introspectionPath)
  }
  if (jwkPath != null) {
    this.setJwkPath(jwkPath)
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (logoutPath != null) {
    this.setLogoutPath(logoutPath)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (revocationPath != null) {
    this.setRevocationPath(revocationPath)
  }
  if (scopeSeparator != null) {
    this.setScopeSeparator(scopeSeparator)
  }
  if (site != null) {
    this.setSite(site)
  }
  if (tenant != null) {
    this.setTenant(tenant)
  }
  if (tokenPath != null) {
    this.setTokenPath(tokenPath)
  }
  if (useBasicAuthorizationHeader != null) {
    this.setUseBasicAuthorizationHeader(useBasicAuthorizationHeader)
  }
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (userInfoParameters != null) {
    this.setUserInfoParameters(userInfoParameters)
  }
  if (userInfoPath != null) {
    this.setUserInfoPath(userInfoPath)
  }
  if (validateIssuer != null) {
    this.setValidateIssuer(validateIssuer)
  }
}

