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

import io.vertx.ext.consul.token.NodeTokenApplyingOptions

fun nodeTokenApplyingOptionsOf(
  name: String? = null,
  datacenters: Iterable<String>? = null): NodeTokenApplyingOptions = io.vertx.ext.consul.token.NodeTokenApplyingOptions(io.vertx.core.json.JsonObject()).apply {

  if (name != null) {
    this.setName(name)
  }
  if (datacenters != null) {
    this.setDatacenters(datacenters.toList())
  }
}

