package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.ReportOptions

/**
 * A function providing a DSL for building [io.vertx.ext.unit.report.ReportOptions] objects.
 *
 * Configures a reporter consisting in a name <code>to</code>, an address <code>at</code> and an optional <code>format</code>.
 *
 * @param format  Set the current reporter format.
 * @param to  Set the current reporter name.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.report.ReportOptions original] using Vert.x codegen.
 */
fun reportOptionsOf(
  format: String? = null,
  to: String? = null): ReportOptions = io.vertx.ext.unit.report.ReportOptions().apply {

  if (format != null) {
    this.setFormat(format)
  }
  if (to != null) {
    this.setTo(to)
  }
}

