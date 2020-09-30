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

import io.vertx.ext.consul.TxnRequest

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnRequest] objects.
 *
 * Holds list of operations in transaction
 *
 * @param operations  Adds operation to this request
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnRequest original] using Vert.x codegen.
 */
fun txnRequestOf(
  operations: Iterable<io.vertx.ext.consul.TxnOperation>? = null): TxnRequest = io.vertx.ext.consul.TxnRequest().apply {

  if (operations != null) {
    for (item in operations) {
      this.addOperation(item)
    }
  }
}

