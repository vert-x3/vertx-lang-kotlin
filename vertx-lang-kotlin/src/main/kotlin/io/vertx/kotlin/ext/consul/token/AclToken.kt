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
package io.vertx.kotlin.ext.consul.token

import io.vertx.ext.consul.token.AclToken
import io.vertx.ext.consul.token.NodeTokenApplyingOptions
import io.vertx.ext.consul.token.PolicyLink
import io.vertx.ext.consul.token.ServiceTokenApplyingOptions

fun aclTokenOf(
  description: String? = null,
  policies: Iterable<io.vertx.ext.consul.token.PolicyLink>? = null,
  policys: Iterable<io.vertx.ext.consul.token.PolicyLink>? = null,
  expirationTime: String? = null,
  namespace: String? = null,
  nodeIdentities: Iterable<io.vertx.ext.consul.token.NodeTokenApplyingOptions>? = null,
  serviceIdentities: Iterable<io.vertx.ext.consul.token.ServiceTokenApplyingOptions>? = null): AclToken = io.vertx.ext.consul.token.AclToken().apply {

  if (description != null) {
    this.setDescription(description)
  }
  if (policies != null) {
    this.setPolicies(policies.toList())
  }
  if (policys != null) {
    for (item in policys) {
      this.addPolicy(item)
    }
  }
  if (expirationTime != null) {
    this.setExpirationTime(expirationTime)
  }
  if (namespace != null) {
    this.setNamespace(namespace)
  }
  if (nodeIdentities != null) {
    this.setNodeIdentities(nodeIdentities.toList())
  }
  if (serviceIdentities != null) {
    this.setServiceIdentities(serviceIdentities.toList())
  }
}

