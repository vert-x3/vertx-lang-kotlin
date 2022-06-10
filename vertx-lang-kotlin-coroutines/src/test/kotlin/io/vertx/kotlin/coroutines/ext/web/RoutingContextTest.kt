package io.vertx.kotlin.coroutines.ext.web

import io.vertx.ext.unit.TestContext
import io.vertx.kotlin.coroutines.runAsyncTest
import io.vertx.kotlin.ext.web.RoutingContextBaseTest
import kotlin.test.Test

class RoutingContextTest : RoutingContextBaseTest() {
  @Test
  fun `test launchChecked`(testContext: TestContext) = vertx.runAsyncTest(testContext) {
    testChecked(testContext) {
      launchChecked(this) { throw it }
    }
  }
}
