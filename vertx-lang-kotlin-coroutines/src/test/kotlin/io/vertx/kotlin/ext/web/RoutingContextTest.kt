package io.vertx.kotlin.ext.web

import io.vertx.kotlin.coroutines.runTest
import kotlin.test.Test

class RoutingContextTest : RoutingContextBaseTest() {
  @Test
  fun `test checkedRun`() = runTest {
    testChecked {
      checkedRun { throw it }
    }
  }
}
