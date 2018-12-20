package io.vertx.kotlin.redis.op

import io.vertx.redis.op.GeoMember

/**
 * A function providing a DSL for building [io.vertx.redis.op.GeoMember] objects.
 *
 *
 * @param latitude  Set Latitude as per EPSG:900913 / EPSG:3785 / OSGEO:41001
 * @param longitude  Set Longitude as per EPSG:900913 / EPSG:3785 / OSGEO:41001
 * @param member  Set the member name.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.op.GeoMember original] using Vert.x codegen.
 */
fun geoMemberOf(
  latitude: Double? = null,
  longitude: Double? = null,
  member: String? = null): GeoMember = io.vertx.redis.op.GeoMember().apply {

  if (latitude != null) {
    this.setLatitude(latitude)
  }
  if (longitude != null) {
    this.setLongitude(longitude)
  }
  if (member != null) {
    this.setMember(member)
  }
}

