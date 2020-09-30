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
package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.AclToken
import io.vertx.ext.consul.AclTokenType

/**
 * A function providing a DSL for building [io.vertx.ext.consul.AclToken] objects.
 *
 * Holds properties of Acl token
 *
 * @param id  Set ID of token
 * @param name  Set name of token
 * @param rules  Set rules for token
 * @param type  Set type of token
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.AclToken original] using Vert.x codegen.
 */
fun aclTokenOf(
  id: String? = null,
  name: String? = null,
  rules: String? = null,
  type: AclTokenType? = null): AclToken = io.vertx.ext.consul.AclToken().apply {

  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (rules != null) {
    this.setRules(rules)
  }
  if (type != null) {
    this.setType(type)
  }
}

