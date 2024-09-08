package io.vertx.lang.kotlin.test

import org.junit.Test
import io.vertx.kotlin.core.*;
import kotlin.test.assertEquals

class DataObjectTest {

  @Test
  fun smoke() {
    var options = vertxOptionsOf(workerPoolSize = 10)
    assertEquals(10, options.workerPoolSize)
  }
}
