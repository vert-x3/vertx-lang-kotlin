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
package io.vertx.kotlin.ext.healthchecks

import io.vertx.core.json.JsonObject
import io.vertx.ext.healthchecks.CheckResult
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.healthchecks.HealthChecks.invoke]
 *
 * @param name 
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.healthchecks.HealthChecks] using Vert.x codegen.
 */
@Deprecated(message = "Instead use invoke returning a future and chain with await()", replaceWith = ReplaceWith("invoke(name).await()"))
suspend fun HealthChecks.invokeAwait(name: String): JsonObject {
  return awaitResult {
    this.invoke(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.healthchecks.HealthChecks.checkStatus]
 *
 * @return [CheckResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.healthchecks.HealthChecks] using Vert.x codegen.
 */
@Deprecated(message = "Instead use checkStatus returning a future and chain with await()", replaceWith = ReplaceWith("checkStatus().await()"))
suspend fun HealthChecks.checkStatusAwait(): CheckResult {
  return awaitResult {
    this.checkStatus(it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.healthchecks.HealthChecks.checkStatus]
 *
 * @param name 
 * @return [CheckResult]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.healthchecks.HealthChecks] using Vert.x codegen.
 */
@Deprecated(message = "Instead use checkStatus returning a future and chain with await()", replaceWith = ReplaceWith("checkStatus(name).await()"))
suspend fun HealthChecks.checkStatusAwait(name: String): CheckResult {
  return awaitResult {
    this.checkStatus(name, it)
  }
}

