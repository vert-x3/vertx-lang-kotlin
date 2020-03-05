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
package io.vertx.kotlin.mysqlclient.data.spatial

import io.vertx.mysqlclient.data.spatial.LineString
import io.vertx.mysqlclient.data.spatial.Point

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.LineString] objects.
 *
 * A LineString is a Curve with linear interpolation between points, it may represents a Line or a LinearRing.
 *
 * @param points 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.LineString original] using Vert.x codegen.
 */
fun lineStringOf(
  points: Iterable<io.vertx.mysqlclient.data.spatial.Point>? = null,
  srid: Long? = null): LineString = io.vertx.mysqlclient.data.spatial.LineString().apply {

  if (points != null) {
    this.setPoints(points.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.LineString] objects.
 *
 * A LineString is a Curve with linear interpolation between points, it may represents a Line or a LinearRing.
 *
 * @param points 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.LineString original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("lineStringOf(points, srid)")
)
fun LineString(
  points: Iterable<io.vertx.mysqlclient.data.spatial.Point>? = null,
  srid: Long? = null): LineString = io.vertx.mysqlclient.data.spatial.LineString().apply {

  if (points != null) {
    this.setPoints(points.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

