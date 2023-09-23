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
package io.vertx.kotlin.core.http

import io.vertx.core.http.StreamPriority

/**
 * A function providing a DSL for building [io.vertx.core.http.StreamPriority] objects.
 *
 * This class represents HTTP/2 stream priority defined in RFC 7540 clause 5.3
 *
 * @param weight  Set the priority weight.
 * @param dependency  Set the priority dependency value.
 * @param exclusive  Set the priority exclusive value.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.StreamPriority original] using Vert.x codegen.
 */
fun streamPriorityOf(
  weight: Short? = null,
  dependency: Int? = null,
  exclusive: Boolean? = null): StreamPriority = io.vertx.core.http.StreamPriority().apply {

  if (weight != null) {
    this.setWeight(weight)
  }
  if (dependency != null) {
    this.setDependency(dependency)
  }
  if (exclusive != null) {
    this.setExclusive(exclusive)
  }
}

