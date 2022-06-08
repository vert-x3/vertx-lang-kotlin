package io.vertx.kotlin.sqlclient

import io.vertx.sqlclient.Tuple
import kotlin.test.Test
import kotlin.test.assertEquals

class TupleTest {
  @Test
  fun `test toList`() {
    assertEquals(emptyList(), Tuple.tuple().toList())
    assertEquals(listOf(0), Tuple.of(0).toList())
    assertEquals(listOf(0, ""), Tuple.of(0, "").toList())
  }
}
