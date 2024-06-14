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
import io.vertx.ext.auth.jose.JWTOptions
import io.vertx.ext.auth.jose.PubSecKeyOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.OAuth2Options] objects.
 *
 * Options describing how an OAuth2  will make connections.
 *
 * @param site  Root URL for the provider without trailing slashes
 * @param authorizationPath  Get the Oauth2 authorization resource path. e.g.: /oauth/authorize
 * @param tokenPath  Get the Oauth2 token resource path. e.g.: /oauth/token
 * @param revocationPath  Set the Oauth2 revocation resource path. e.g.: /oauth/revoke
 * @param clientId  Set the provider client id
 * @param clientSecret  Set the provider client secret
 * @param useBasicAuthorization 
 * @param clientAssertionType 
 * @param clientAssertion 
 * @param userAgent  Set a custom user agent to use when communicating to a provider
 * @param headers  Set custom headers to be sent with every request to the provider
 * @param pubSecKeys  The provider PubSec key options
 * @param logoutPath  Set the provider logout path
 * @param userInfoPath  Set the provider userInfo resource path
 * @param scopeSeparator  Set the provider scope separator
 * @param extraParameters  Set extra parameters to be sent to the provider on each request
 * @param introspectionPath  Set the provider token introspection resource path
 * @param userInfoParameters  Set custom parameters to be sent during the userInfo resource request
 * @param jwkPath 
 * @param jwtOptions 
 * @param validateIssuer 
 * @param tenant  Sets an optional tenant. Tenants are used in some OpenID servers as placeholders for the URLs. The tenant should be set prior to any URL as it affects the way the URLs will be stored. <p> Some provders may name this differently, for example: `realm`.
 * @param supportedGrantTypes  The provider supported grant types
 * @param httpClientOptions 
 * @param jwkMaxAgeInSeconds  -1 means no rotation for JWKs
 * @param jwks  Sets the initial local JWKs
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2Options original] using Vert.x codegen.
 */
fun oAuth2OptionsOf(
  site: String? = null,
  authorizationPath: String? = null,
  tokenPath: String? = null,
  revocationPath: String? = null,
  clientId: String? = null,
  clientSecret: String? = null,
  useBasicAuthorization: Boolean? = null,
  clientAssertionType: String? = null,
  clientAssertion: String? = null,
  userAgent: String? = null,
  headers: io.vertx.core.json.JsonObject? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.jose.PubSecKeyOptions>? = null,
  logoutPath: String? = null,
  userInfoPath: String? = null,
  scopeSeparator: String? = null,
  extraParameters: io.vertx.core.json.JsonObject? = null,
  introspectionPath: String? = null,
  userInfoParameters: io.vertx.core.json.JsonObject? = null,
  jwkPath: String? = null,
  jwtOptions: io.vertx.ext.auth.jose.JWTOptions? = null,
  validateIssuer: Boolean? = null,
  tenant: String? = null,
  supportedGrantTypes: Iterable<String>? = null,
  httpClientOptions: io.vertx.core.http.HttpClientOptions? = null,
  jwkMaxAgeInSeconds: Long? = null,
  jwks: Iterable<io.vertx.core.json.JsonObject>? = null): OAuth2Options = io.vertx.ext.auth.oauth2.OAuth2Options().apply {

  if (site != null) {
    this.setSite(site)
  }
  if (authorizationPath != null) {
    this.setAuthorizationPath(authorizationPath)
  }
  if (tokenPath != null) {
    this.setTokenPath(tokenPath)
  }
  if (revocationPath != null) {
    this.setRevocationPath(revocationPath)
  }
  if (clientId != null) {
    this.setClientId(clientId)
  }
  if (clientSecret != null) {
    this.setClientSecret(clientSecret)
  }
  if (useBasicAuthorization != null) {
    this.setUseBasicAuthorization(useBasicAuthorization)
  }
  if (clientAssertionType != null) {
    this.setClientAssertionType(clientAssertionType)
  }
  if (clientAssertion != null) {
    this.setClientAssertion(clientAssertion)
  }
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (logoutPath != null) {
    this.setLogoutPath(logoutPath)
  }
  if (userInfoPath != null) {
    this.setUserInfoPath(userInfoPath)
  }
  if (scopeSeparator != null) {
    this.setScopeSeparator(scopeSeparator)
  }
  if (extraParameters != null) {
    this.setExtraParameters(extraParameters)
  }
  if (introspectionPath != null) {
    this.setIntrospectionPath(introspectionPath)
  }
  if (userInfoParameters != null) {
    this.setUserInfoParameters(userInfoParameters)
  }
  if (jwkPath != null) {
    this.setJwkPath(jwkPath)
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (validateIssuer != null) {
    this.setValidateIssuer(validateIssuer)
  }
  if (tenant != null) {
    this.setTenant(tenant)
  }
  if (supportedGrantTypes != null) {
    this.setSupportedGrantTypes(supportedGrantTypes.toList())
  }
  if (httpClientOptions != null) {
    this.setHttpClientOptions(httpClientOptions)
  }
  if (jwkMaxAgeInSeconds != null) {
    this.setJwkMaxAgeInSeconds(jwkMaxAgeInSeconds)
  }
  if (jwks != null) {
    this.setJwks(jwks.toList())
  }
}

