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
package io.vertx.kotlin.core

import io.vertx.core.Vertx
import io.vertx.core.VertxBuilder
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.VertxBuilder.buildClustered]
 *
 * @return [Vertx]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.VertxBuilder] using Vert.x codegen.
 */
@Deprecated(message = "Instead use buildClustered returning a future and chain with coAwait()", replaceWith = ReplaceWith("buildClustered().coAwait()"))
suspend fun VertxBuilder.buildClusteredAwait(): Vertx {
  return awaitResult {
    this.buildClustered(it)
  }
}

