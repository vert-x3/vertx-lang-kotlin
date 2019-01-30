package io.vertx.kotlin.redis.op

import io.vertx.redis.op.ScanOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.ScanOptions] objects.
 *
 *
 * @param count 
 * @param match 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.ScanOptions original] using Vert.x codegen.
 */
fun scanOptionsOf(
  count: Int? = null,
  match: String? = null): ScanOptions = io.vertx.redis.op.ScanOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (match != null) {
    this.setMatch(match)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.op.ScanOptions] objects.
 *
 *
 * @param count 
 * @param match 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.ScanOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("scanOptionsOf(count, match)")
)
fun ScanOptions(
  count: Int? = null,
  match: String? = null): ScanOptions = io.vertx.redis.op.ScanOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (match != null) {
    this.setMatch(match)
  }
}

