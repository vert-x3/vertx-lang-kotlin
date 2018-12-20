package io.vertx.kotlin.redis.op

import io.vertx.redis.op.SetOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.SetOptions] objects.
 *
 *
 * @param ex 
 * @param nx 
 * @param px 
 * @param xx 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.SetOptions original] using Vert.x codegen.
 */
fun setOptionsOf(
  ex: Long? = null,
  nx: Boolean? = null,
  px: Long? = null,
  xx: Boolean? = null): SetOptions = io.vertx.redis.op.SetOptions().apply {

  if (ex != null) {
    this.setEX(ex)
  }
  if (nx != null) {
    this.setNX(nx)
  }
  if (px != null) {
    this.setPX(px)
  }
  if (xx != null) {
    this.setXX(xx)
  }
}

