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
package io.vertx.kotlin.ext.consul.policy

import io.vertx.ext.consul.policy.AclPolicy

/**
 * A function providing a DSL for building [io.vertx.ext.consul.policy.AclPolicy] objects.
 *
 * Holds properties of Acl policies
 *
 * @param datacenters  Sets an optional datacenters. By default, the policy is valid in all datacenters
 * @param description  Sets an optional free-form description that is human-readable.
 * @param name  Sets a name. Must be unique
 * @param namespace  Sets an optional namespace. Default value is ns URL query parameter or in the X-Consul-Namespace header, or 'default' namespace.
 * @param rules  Sets a rules. The format of the Rules property is detailed in the ACL Rules documentation
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.policy.AclPolicy original] using Vert.x codegen.
 */
fun aclPolicyOf(
  datacenters: Iterable<String>? = null,
  description: String? = null,
  name: String? = null,
  namespace: String? = null,
  rules: String? = null): AclPolicy = io.vertx.ext.consul.policy.AclPolicy().apply {

  if (datacenters != null) {
    this.setDatacenters(datacenters.toList())
  }
  if (description != null) {
    this.setDescription(description)
  }
  if (name != null) {
    this.setName(name)
  }
  if (namespace != null) {
    this.setNamespace(namespace)
  }
  if (rules != null) {
    this.setRules(rules)
  }
}

