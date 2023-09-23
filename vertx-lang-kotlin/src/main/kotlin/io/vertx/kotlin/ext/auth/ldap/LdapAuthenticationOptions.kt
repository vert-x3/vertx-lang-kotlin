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
package io.vertx.kotlin.ext.auth.ldap

import io.vertx.ext.auth.ldap.LdapAuthenticationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.ldap.LdapAuthenticationOptions] objects.
 *
 * Ldap auth configuration options
 *
 * @param authenticationMechanism  sets the authentication mechanism. default to 'simple' if not set
 * @param referral  Set the referral property. Default to 'follow' if not set
 * @param url  Set the url to the LDAP server. The url must start with `ldap://` and a port must be specified.
 * @param authenticationQuery  Set the query to use to authenticate a user. This is used to determine the actual lookup to use when looking up a user with a particular id. An example is `uid={0},ou=users,dc=foo,dc=com` - Note that the element `{0}` is substituted with the user id to create the actual lookup.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.ldap.LdapAuthenticationOptions original] using Vert.x codegen.
 */
fun ldapAuthenticationOptionsOf(
  authenticationMechanism: String? = null,
  referral: String? = null,
  url: String? = null,
  authenticationQuery: String? = null): LdapAuthenticationOptions = io.vertx.ext.auth.ldap.LdapAuthenticationOptions().apply {

  if (authenticationMechanism != null) {
    this.setAuthenticationMechanism(authenticationMechanism)
  }
  if (referral != null) {
    this.setReferral(referral)
  }
  if (url != null) {
    this.setUrl(url)
  }
  if (authenticationQuery != null) {
    this.setAuthenticationQuery(authenticationQuery)
  }
}

