package io.vertx.kotlin.redis.op

import io.vertx.redis.op.RangeLimitOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.RangeLimitOptions] objects.
 *
 *
 * @param count 
 * @param offset 
 * @param withscores 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.RangeLimitOptions original] using Vert.x codegen.
 */
fun rangeLimitOptionsOf(
  count: Long? = null,
  offset: Long? = null,
  withscores: Boolean? = null): RangeLimitOptions = io.vertx.redis.op.RangeLimitOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (withscores != null) {
    this.setWithscores(withscores)
  }
}

