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

import io.vertx.mysqlclient.data.spatial.Point

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.Point] objects.
 *
 * A Point is a geometry that represents a single location in coordinate space.
 *
 * @param srid 
 * @param x 
 * @param y 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.Point original] using Vert.x codegen.
 */
fun pointOf(
  srid: Long? = null,
  x: Double? = null,
  y: Double? = null): Point = io.vertx.mysqlclient.data.spatial.Point().apply {

  if (srid != null) {
    this.setSRID(srid)
  }
  if (x != null) {
    this.setX(x)
  }
  if (y != null) {
    this.setY(y)
  }
}

/**
 * A function providing a DSL for building [io.vertx.mysqlclient.data.spatial.Point] objects.
 *
 * A Point is a geometry that represents a single location in coordinate space.
 *
 * @param srid 
 * @param x 
 * @param y 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mysqlclient.data.spatial.Point original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("pointOf(srid, x, y)")
)
fun Point(
  srid: Long? = null,
  x: Double? = null,
  y: Double? = null): Point = io.vertx.mysqlclient.data.spatial.Point().apply {

  if (srid != null) {
    this.setSRID(srid)
  }
  if (x != null) {
    this.setX(x)
  }
  if (y != null) {
    this.setY(y)
  }
}

