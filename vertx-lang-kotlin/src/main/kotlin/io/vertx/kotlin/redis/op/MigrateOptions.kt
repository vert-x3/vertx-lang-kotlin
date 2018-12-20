package io.vertx.kotlin.redis.op

import io.vertx.redis.op.MigrateOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.MigrateOptions] objects.
 *
 *
 * @param copy 
 * @param replace 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.MigrateOptions original] using Vert.x codegen.
 */
fun migrateOptionsOf(
  copy: Boolean? = null,
  replace: Boolean? = null): MigrateOptions = io.vertx.redis.op.MigrateOptions().apply {

  if (copy != null) {
    this.setCopy(copy)
  }
  if (replace != null) {
    this.setReplace(replace)
  }
}

