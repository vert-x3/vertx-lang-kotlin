package io.vertx.kotlin.redis.op

import io.vertx.redis.op.SortOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.SortOptions] objects.
 *
 *
 * @param by 
 * @param gets 
 * @param store 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.SortOptions original] using Vert.x codegen.
 */
fun SortOptions(
  by: String? = null,
  gets: Iterable<String>? = null,
  store: String? = null): SortOptions = io.vertx.redis.op.SortOptions().apply {

  if (by != null) {
    this.setBy(by)
  }
  if (gets != null) {
    for (item in gets) {
      this.addGet(item)
    }
  }
  if (store != null) {
    this.setStore(store)
  }
}

