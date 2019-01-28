package io.vertx.kotlin.redis.op

import io.vertx.redis.op.SortOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.SortOptions] objects.
 *
 *
 * @param alpha 
 * @param by 
 * @param descending 
 * @param gets 
 * @param store 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.SortOptions original] using Vert.x codegen.
 */
fun sortOptionsOf(
  alpha: Boolean? = null,
  by: String? = null,
  descending: Boolean? = null,
  gets: Iterable<String>? = null,
  store: String? = null): SortOptions = io.vertx.redis.op.SortOptions().apply {

  if (alpha != null) {
    this.setAlpha(alpha)
  }
  if (by != null) {
    this.setBy(by)
  }
  if (descending != null) {
    this.setDescending(descending)
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

/**
 * A function providing a DSL for building [io.vertx.redis.op.SortOptions] objects.
 *
 *
 * @param alpha 
 * @param by 
 * @param descending 
 * @param gets 
 * @param store 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.SortOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("sortOptionsOf(alpha, by, descending, gets, store)")
)
fun SortOptions(
  alpha: Boolean? = null,
  by: String? = null,
  descending: Boolean? = null,
  gets: Iterable<String>? = null,
  store: String? = null): SortOptions = io.vertx.redis.op.SortOptions().apply {

  if (alpha != null) {
    this.setAlpha(alpha)
  }
  if (by != null) {
    this.setBy(by)
  }
  if (descending != null) {
    this.setDescending(descending)
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

