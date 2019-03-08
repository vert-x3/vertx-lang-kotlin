/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("geoMemberOf(latitude, longitude, member)")
)
fun GeoMember(
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

