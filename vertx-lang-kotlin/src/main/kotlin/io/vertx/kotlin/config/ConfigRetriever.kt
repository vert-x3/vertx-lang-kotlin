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
package io.vertx.kotlin.config

import io.vertx.config.ConfigRetriever
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.config.ConfigRetriever.getConfig]
 *
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.config.ConfigRetriever] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getConfig returning a future and chain with await()", replaceWith = ReplaceWith("getConfig().await()"))
suspend fun ConfigRetriever.getConfigAwait(): JsonObject {
  return awaitResult {
    this.getConfig(it)
  }
}

