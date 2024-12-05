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

import io.vertx.ext.consul.TxnServiceOperation
import io.vertx.ext.consul.ServiceOptions
import io.vertx.ext.consul.TxnServiceVerb

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnServiceOperation] objects.
 *
 * Holds the operation to apply to the service inside a transaction
 *
 * @param node  Set the node
 * @param serviceOptions  Set the service
 * @param type  Set the type of operation to perform
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnServiceOperation original] using Vert.x codegen.
 */
fun txnServiceOperationOf(
  node: String? = null,
  serviceOptions: io.vertx.ext.consul.ServiceOptions? = null,
  type: TxnServiceVerb? = null): TxnServiceOperation = io.vertx.ext.consul.TxnServiceOperation().apply {

  if (node != null) {
    this.setNode(node)
  }
  if (serviceOptions != null) {
    this.setServiceOptions(serviceOptions)
  }
  if (type != null) {
    this.setType(type)
  }
}

