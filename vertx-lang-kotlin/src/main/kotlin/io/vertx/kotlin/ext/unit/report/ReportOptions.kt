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
package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.ReportOptions

/**
 * A function providing a DSL for building [io.vertx.ext.unit.report.ReportOptions] objects.
 *
 * Configures a reporter consisting in a name <code>to</code>, an address <code>at</code> and an optional <code>format</code>.
 *
 * @param to  Set the current reporter name.
 * @param format  Set the current reporter format.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.report.ReportOptions original] using Vert.x codegen.
 */
fun reportOptionsOf(
  to: String? = null,
  format: String? = null): ReportOptions = io.vertx.ext.unit.report.ReportOptions().apply {

  if (to != null) {
    this.setTo(to)
  }
  if (format != null) {
    this.setFormat(format)
  }
}

