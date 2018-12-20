package io.vertx.kotlin.redis.op

import io.vertx.redis.op.LimitOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.LimitOptions] objects.
 *
 *
 * @param count 
 * @param offset 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.LimitOptions original] using Vert.x codegen.
 */
fun limitOptionsOf(
  count: Long? = null,
  offset: Long? = null): LimitOptions = io.vertx.redis.op.LimitOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
}

