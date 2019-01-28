package io.vertx.kotlin.redis.op

import io.vertx.redis.op.KillFilter
import io.vertx.redis.op.KillFilter.Type

/**
 * A function providing a DSL for building [io.vertx.redis.op.KillFilter] objects.
 *
 *
 * @param addr  Set ADDR filter
 * @param id  Set ID filter
 * @param skipme  Set SKIPME filter
 * @param type  Set TYPE filter
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.KillFilter original] using Vert.x codegen.
 */
fun killFilterOf(
  addr: String? = null,
  id: String? = null,
  skipme: Boolean? = null,
  type: Type? = null): KillFilter = io.vertx.redis.op.KillFilter().apply {

  if (addr != null) {
    this.setAddr(addr)
  }
  if (id != null) {
    this.setId(id)
  }
  if (skipme != null) {
    this.setSkipme(skipme)
  }
  if (type != null) {
    this.setType(type)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.op.KillFilter] objects.
 *
 *
 * @param addr  Set ADDR filter
 * @param id  Set ID filter
 * @param skipme  Set SKIPME filter
 * @param type  Set TYPE filter
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.KillFilter original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("killFilterOf(addr, id, skipme, type)")
)
fun KillFilter(
  addr: String? = null,
  id: String? = null,
  skipme: Boolean? = null,
  type: Type? = null): KillFilter = io.vertx.redis.op.KillFilter().apply {

  if (addr != null) {
    this.setAddr(addr)
  }
  if (id != null) {
    this.setId(id)
  }
  if (skipme != null) {
    this.setSkipme(skipme)
  }
  if (type != null) {
    this.setType(type)
  }
}

