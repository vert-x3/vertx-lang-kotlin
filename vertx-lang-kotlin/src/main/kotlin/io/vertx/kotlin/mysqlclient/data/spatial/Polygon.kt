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

import io.vertx.mysqlclient.data.spatial.Polygon
import io.vertx.mysqlclient.data.spatial.LineString

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.Polygon] objects.
 *
 * A Polygon is a planar Surface representing a multisided geometry. It is defined by a single exterior boundary and zero or more interior boundaries, where each interior boundary defines a hole in the Polygon.
 *
 * @param lineStrings 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.Polygon original] using Vert.x codegen.
 */
fun polygonOf(
  lineStrings: Iterable<io.vertx.mysqlclient.data.spatial.LineString>? = null,
  srid: Long? = null): Polygon = io.vertx.mysqlclient.data.spatial.Polygon().apply {

  if (lineStrings != null) {
    this.setLineStrings(lineStrings.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.Polygon] objects.
 *
 * A Polygon is a planar Surface representing a multisided geometry. It is defined by a single exterior boundary and zero or more interior boundaries, where each interior boundary defines a hole in the Polygon.
 *
 * @param lineStrings 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.Polygon original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("polygonOf(lineStrings, srid)")
)
fun Polygon(
  lineStrings: Iterable<io.vertx.mysqlclient.data.spatial.LineString>? = null,
  srid: Long? = null): Polygon = io.vertx.mysqlclient.data.spatial.Polygon().apply {

  if (lineStrings != null) {
    this.setLineStrings(lineStrings.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

