package io.vertx.kotlin.ext.unit.report

import io.vertx.ext.unit.report.TestCaseReport
import io.vertx.ext.unit.report.TestSuiteReport
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun TestSuiteReport.exceptionHandlerAwait() : Throwable {
    return awaitEvent{
        this.exceptionHandler(it)
    }
}

suspend fun TestSuiteReport.handlerAwait() : TestCaseReport {
    return awaitEvent{
        this.handler(it)
    }
}

suspend fun TestSuiteReport.endHandlerAwait() : Unit {
    return awaitEvent{
        this.endHandler({ v -> it.handle(null) })}
}

