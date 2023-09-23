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

import io.vertx.ext.healthchecks.CheckResult
import io.vertx.ext.healthchecks.Status

/**
 * A function providing a DSL for building [io.vertx.ext.healthchecks.CheckResult] objects.
 *
 *
 * @param id 
 * @param status 
 * @param checks 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.CheckResult original] using Vert.x codegen.
 */
fun checkResultOf(
  id: String? = null,
  status: io.vertx.ext.healthchecks.Status? = null,
  checks: Iterable<io.vertx.ext.healthchecks.CheckResult>? = null): CheckResult = io.vertx.ext.healthchecks.CheckResult().apply {

  if (id != null) {
    this.setId(id)
  }
  if (status != null) {
    this.setStatus(status)
  }
  if (checks != null) {
    this.setChecks(checks.toList())
  }
}

