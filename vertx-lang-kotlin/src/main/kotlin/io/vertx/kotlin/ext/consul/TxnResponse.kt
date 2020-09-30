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

import io.vertx.ext.consul.TxnResponse
import io.vertx.ext.consul.TxnError

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnResponse] objects.
 *
 * Holds results of transaction
 *
 * @param errors  Adds error to this response
 * @param results  Adds result to this response
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnResponse original] using Vert.x codegen.
 */
fun txnResponseOf(
  errors: Iterable<io.vertx.ext.consul.TxnError>? = null,
  results: Iterable<io.vertx.ext.consul.TxnResult>? = null): TxnResponse = io.vertx.ext.consul.TxnResponse().apply {

  if (errors != null) {
    for (item in errors) {
      this.addError(item)
    }
  }
  if (results != null) {
    for (item in results) {
      this.addResult(item)
    }
  }
}

