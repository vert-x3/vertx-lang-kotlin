package io.vertx.kotlin.ext.web

import io.vertx.ext.unit.TestContext
import io.vertx.kotlin.coroutines.runAsyncTest
import kotlin.test.Test

class RoutingContextTest : RoutingContextBaseTest() {
  @Test
  fun `test checkedRun`(testContext: TestContext) = vertx.runAsyncTest(testContext) {
    testChecked(testContext) {
      checkedRun { throw it }
    }
  }
}
