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

import io.vertx.ext.consul.TxnError

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnError] objects.
 *
 * Holds information describing which operations failed if the transaction was rolled back.
 *
 * @param opIndex  Set the index of the failed operation in the transaction
 * @param what  Set error message about why that operation failed.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnError original] using Vert.x codegen.
 */
fun txnErrorOf(
  opIndex: Int? = null,
  what: String? = null): TxnError = io.vertx.ext.consul.TxnError().apply {

  if (opIndex != null) {
    this.setOpIndex(opIndex)
  }
  if (what != null) {
    this.setWhat(what)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnError] objects.
 *
 * Holds information describing which operations failed if the transaction was rolled back.
 *
 * @param opIndex  Set the index of the failed operation in the transaction
 * @param what  Set error message about why that operation failed.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnError original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("txnErrorOf(opIndex, what)")
)
fun TxnError(
  opIndex: Int? = null,
  what: String? = null): TxnError = io.vertx.ext.consul.TxnError().apply {

  if (opIndex != null) {
    this.setOpIndex(opIndex)
  }
  if (what != null) {
    this.setWhat(what)
  }
}

