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

import io.vertx.mysqlclient.data.spatial.MultiPoint
import io.vertx.mysqlclient.data.spatial.Point

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.MultiPoint] objects.
 *
 * A MultiPoint is a geometry collection composed of Point elements. The points are not connected or ordered in any way.
 *
 * @param points 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.MultiPoint original] using Vert.x codegen.
 */
fun multiPointOf(
  points: Iterable<io.vertx.mysqlclient.data.spatial.Point>? = null,
  srid: Long? = null): MultiPoint = io.vertx.mysqlclient.data.spatial.MultiPoint().apply {

  if (points != null) {
    this.setPoints(points.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.MultiPoint] objects.
 *
 * A MultiPoint is a geometry collection composed of Point elements. The points are not connected or ordered in any way.
 *
 * @param points 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.MultiPoint original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("multiPointOf(points, srid)")
)
fun MultiPoint(
  points: Iterable<io.vertx.mysqlclient.data.spatial.Point>? = null,
  srid: Long? = null): MultiPoint = io.vertx.mysqlclient.data.spatial.MultiPoint().apply {

  if (points != null) {
    this.setPoints(points.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

