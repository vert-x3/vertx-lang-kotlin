package io.vertx.kotlin.ext.unit.report

import io.vertx.core.streams.WriteStream
import io.vertx.ext.unit.report.TestCaseReport
import io.vertx.ext.unit.report.TestSuiteReport
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.unit.report.TestSuiteReport.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.unit.report.TestSuiteReport] using Vert.x codegen.
 */
suspend fun TestSuiteReport.pipeToAwait(dst: WriteStream<TestCaseReport>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

