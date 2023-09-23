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

import io.vertx.ext.consul.KeyValue

/**
 * A function providing a DSL for building [io.vertx.ext.consul.KeyValue] objects.
 *
 * Represents key/value pair stored in Consul
 *
 * @param key  Set the key
 * @param value  Set the value
 * @param session  Set the session that owns the lock
 * @param flags  Set the flags attached to this entry. Clients can choose to use this however makes sense for their application.
 * @param createIndex  Set the internal index value that represents when the entry was created.
 * @param modifyIndex  Set the last index that modified this key.
 * @param lockIndex  Set the number of times this key has successfully been acquired in a lock.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.KeyValue original] using Vert.x codegen.
 */
fun keyValueOf(
  key: String? = null,
  value: String? = null,
  session: String? = null,
  flags: Long? = null,
  createIndex: Long? = null,
  modifyIndex: Long? = null,
  lockIndex: Long? = null): KeyValue = io.vertx.ext.consul.KeyValue().apply {

  if (key != null) {
    this.setKey(key)
  }
  if (value != null) {
    this.setValue(value)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (modifyIndex != null) {
    this.setModifyIndex(modifyIndex)
  }
  if (lockIndex != null) {
    this.setLockIndex(lockIndex)
  }
}

