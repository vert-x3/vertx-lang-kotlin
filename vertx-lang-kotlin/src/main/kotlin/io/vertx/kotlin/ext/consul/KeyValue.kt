package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.KeyValue

/**
 * A function providing a DSL for building [io.vertx.ext.consul.KeyValue] objects.
 *
 * Represents key/value pair stored in Consul
 *
 * @param createIndex  Set the internal index value that represents when the entry was created.
 * @param flags  Set the flags attached to this entry. Clients can choose to use this however makes sense for their application.
 * @param key  Set the key
 * @param lockIndex  Set the number of times this key has successfully been acquired in a lock.
 * @param modifyIndex  Set the last index that modified this key.
 * @param session  Set the session that owns the lock
 * @param value  Set the value
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.KeyValue original] using Vert.x codegen.
 */
fun keyValueOf(
  createIndex: Long? = null,
  flags: Long? = null,
  key: String? = null,
  lockIndex: Long? = null,
  modifyIndex: Long? = null,
  session: String? = null,
  value: String? = null): KeyValue = io.vertx.ext.consul.KeyValue().apply {

  if (createIndex != null) {
    this.setCreateIndex(createIndex)
  }
  if (flags != null) {
    this.setFlags(flags)
  }
  if (key != null) {
    this.setKey(key)
  }
  if (lockIndex != null) {
    this.setLockIndex(lockIndex)
  }
  if (modifyIndex != null) {
    this.setModifyIndex(modifyIndex)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (value != null) {
    this.setValue(value)
  }
}

