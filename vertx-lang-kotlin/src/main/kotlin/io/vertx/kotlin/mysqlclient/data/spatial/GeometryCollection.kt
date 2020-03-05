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

import io.vertx.mysqlclient.data.spatial.GeometryCollection
import io.vertx.mysqlclient.data.spatial.Geometry

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.GeometryCollection] objects.
 *
 * A GeomCollection is a geometry that is a collection of zero or more geometries of any class.
 *
 * @param geometries 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.GeometryCollection original] using Vert.x codegen.
 */
fun geometryCollectionOf(
  geometries: Iterable<io.vertx.mysqlclient.data.spatial.Geometry>? = null,
  srid: Long? = null): GeometryCollection = io.vertx.mysqlclient.data.spatial.GeometryCollection().apply {

  if (geometries != null) {
    this.setGeometries(geometries.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.GeometryCollection] objects.
 *
 * A GeomCollection is a geometry that is a collection of zero or more geometries of any class.
 *
 * @param geometries 
 * @param srid 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.GeometryCollection original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("geometryCollectionOf(geometries, srid)")
)
fun GeometryCollection(
  geometries: Iterable<io.vertx.mysqlclient.data.spatial.Geometry>? = null,
  srid: Long? = null): GeometryCollection = io.vertx.mysqlclient.data.spatial.GeometryCollection().apply {

  if (geometries != null) {
    this.setGeometries(geometries.toList())
  }
  if (srid != null) {
    this.setSRID(srid)
  }
}

