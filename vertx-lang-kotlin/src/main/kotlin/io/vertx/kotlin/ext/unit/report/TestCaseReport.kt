package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.TestCaseReport
import io.vertx.ext.unit.report.TestResult
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun TestCaseReport.endHandlerAwait() : TestResult {
    return awaitEvent{
        this.endHandler(it)
    }
}

