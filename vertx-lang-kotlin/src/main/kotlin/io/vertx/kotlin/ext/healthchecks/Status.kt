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

import io.vertx.ext.healthchecks.Status

/**
 * A function providing a DSL for building [io.vertx.ext.healthchecks.Status] objects.
 *
 * Represents the outcome of a health check procedure. Each procedure produces a [io.vertx.ext.healthchecks.Status] indicating either OK
 * or KO. Optionally, it can also provide additional data.
 *
 * @param data  Sets the metadata.
 * @param ok  Sets whether or not the current status is positive (UP) or negative (DOWN).
 * @param procedureInError  Sets whether or not the procedure attached to this status has failed (timeout, error...).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.Status original] using Vert.x codegen.
 */
fun statusOf(
  data: io.vertx.core.json.JsonObject? = null,
  ok: Boolean? = null,
  procedureInError: Boolean? = null): Status = io.vertx.ext.healthchecks.Status().apply {

  if (data != null) {
    this.setData(data)
  }
  if (ok != null) {
    this.setOk(ok)
  }
  if (procedureInError != null) {
    this.setProcedureInError(procedureInError)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.healthchecks.Status] objects.
 *
 * Represents the outcome of a health check procedure. Each procedure produces a [io.vertx.ext.healthchecks.Status] indicating either OK
 * or KO. Optionally, it can also provide additional data.
 *
 * @param data  Sets the metadata.
 * @param ok  Sets whether or not the current status is positive (UP) or negative (DOWN).
 * @param procedureInError  Sets whether or not the procedure attached to this status has failed (timeout, error...).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.healthchecks.Status original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("statusOf(data, ok, procedureInError)")
)
fun Status(
  data: io.vertx.core.json.JsonObject? = null,
  ok: Boolean? = null,
  procedureInError: Boolean? = null): Status = io.vertx.ext.healthchecks.Status().apply {

  if (data != null) {
    this.setData(data)
  }
  if (ok != null) {
    this.setOk(ok)
  }
  if (procedureInError != null) {
    this.setProcedureInError(procedureInError)
  }
}

