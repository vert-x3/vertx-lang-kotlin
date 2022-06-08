package io.vertx.kotlin.coroutines.ext.web

import io.vertx.kotlin.coroutines.runTest
import io.vertx.kotlin.ext.web.RoutingContextBaseTest
import kotlin.test.Test

class RoutingContextTest : RoutingContextBaseTest() {
  @Test
  fun `test launchChecked`() = runTest {
    testChecked {
      launchChecked(this) { throw it }
    }
  }
}
