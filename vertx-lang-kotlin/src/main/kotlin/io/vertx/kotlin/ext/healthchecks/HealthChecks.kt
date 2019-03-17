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
import io.vertx.ext.healthchecks.HealthChecks
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Invokes the registered procedure with the given name and sub-procedures. It computes the overall
 * outcome.
 *
 * @param name 
 * @return the current [io.vertx.ext.healthchecks.HealthChecks] *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.HealthChecks original] using Vert.x codegen.
 */
suspend fun HealthChecks.invokeAwait(name : String) : JsonObject {
  return awaitResult{
    this.invoke(name, it)
  }
}

