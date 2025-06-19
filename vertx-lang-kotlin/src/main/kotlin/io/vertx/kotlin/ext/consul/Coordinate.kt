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
package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.Coordinate

/**
 * A function providing a DSL for building [io.vertx.ext.consul.Coordinate] objects.
 *
 * Holds network coordinates of node
 *
 * @param adj  Set adjustment
 * @param err  Set error
 * @param height  Set height
 * @param node  Set name of node
 * @param vec  Set vector
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.Coordinate original] using Vert.x codegen.
 */
fun coordinateOf(
  adj: Float? = null,
  err: Float? = null,
  height: Float? = null,
  node: String? = null,
  vec: Iterable<Float>? = null): Coordinate = io.vertx.ext.consul.Coordinate().apply {

  if (adj != null) {
    this.setAdj(adj)
  }
  if (err != null) {
    this.setErr(err)
  }
  if (height != null) {
    this.setHeight(height)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (vec != null) {
    this.setVec(vec.toList())
  }
}

