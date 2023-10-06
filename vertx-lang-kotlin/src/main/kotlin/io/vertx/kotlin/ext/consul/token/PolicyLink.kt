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

import io.vertx.ext.consul.token.PolicyLink

/**
 * A function providing a DSL for building [io.vertx.ext.consul.token.PolicyLink] objects.
 *
 * It is an object with an "ID" and/or "Name" field to specify a policy
 *
 * @param id  Sets a policy id
 * @param name  Sets a policy name
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.token.PolicyLink original] using Vert.x codegen.
 */
fun policyLinkOf(
  id: String? = null,
  name: String? = null): PolicyLink = io.vertx.ext.consul.token.PolicyLink().apply {

  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
}

