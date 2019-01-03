package io.vertx.kotlin.redis.op

import io.vertx.redis.op.GeoRadiusOptions

/**
 * A function providing a DSL for building [io.vertx.redis.op.GeoRadiusOptions] objects.
 *
 *
 * @param count  Set the radius options limit the result count.
 * @param withCoord  Set the radius options to be coordinate based.
 * @param withDist  Set the radius options to be distance based.
 * @param withHash  Set the radius options to be hash based.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.GeoRadiusOptions original] using Vert.x codegen.
 */
fun geoRadiusOptionsOf(
  count: Long? = null,
  withCoord: Boolean? = null,
  withDist: Boolean? = null,
  withHash: Boolean? = null): GeoRadiusOptions = io.vertx.redis.op.GeoRadiusOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (withCoord != null) {
    this.setWithCoord(withCoord)
  }
  if (withDist != null) {
    this.setWithDist(withDist)
  }
  if (withHash != null) {
    this.setWithHash(withHash)
  }
}

/**
 * A function providing a DSL for building [io.vertx.redis.op.GeoRadiusOptions] objects.
 *
 *
 * @param count  Set the radius options limit the result count.
 * @param withCoord  Set the radius options to be coordinate based.
 * @param withDist  Set the radius options to be distance based.
 * @param withHash  Set the radius options to be hash based.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.GeoRadiusOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("geoRadiusOptionsOf(count, withCoord, withDist, withHash)")
)
fun GeoRadiusOptions(
  count: Long? = null,
  withCoord: Boolean? = null,
  withDist: Boolean? = null,
  withHash: Boolean? = null): GeoRadiusOptions = io.vertx.redis.op.GeoRadiusOptions().apply {

  if (count != null) {
    this.setCount(count)
  }
  if (withCoord != null) {
    this.setWithCoord(withCoord)
  }
  if (withDist != null) {
    this.setWithDist(withDist)
  }
  if (withHash != null) {
    this.setWithHash(withHash)
  }
}

