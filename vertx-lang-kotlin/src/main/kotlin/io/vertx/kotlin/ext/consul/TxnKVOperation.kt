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

import io.vertx.ext.consul.TxnKVOperation
import io.vertx.ext.consul.TxnKVVerb

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnKVOperation] objects.
 *
 * Holds operation to apply to the key/value store inside a transaction
 *
 * @param flags  Set the flags attached to this entry. Clients can choose to use this however makes sense for their application.
 * @param index  Set the index used for locking, unlocking, and check-and-set operations.
 * @param key  Set the key
 * @param session  Set the session used for locking, unlocking, and check-and-set operations.
 * @param type  Set the type of operation to perform
 * @param value  Set the value
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnKVOperation original] using Vert.x codegen.
 */
fun txnKVOperationOf(
  flags: Long? = null,
  index: Long? = null,
  key: String? = null,
  session: String? = null,
  type: TxnKVVerb? = null,
  value: String? = null): TxnKVOperation = io.vertx.ext.consul.TxnKVOperation().apply {

  if (flags != null) {
    this.setFlags(flags)
  }
  if (index != null) {
    this.setIndex(index)
  }
  if (key != null) {
    this.setKey(key)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

