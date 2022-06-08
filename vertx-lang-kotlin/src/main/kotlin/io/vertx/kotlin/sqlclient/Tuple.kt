package io.vertx.kotlin.sqlclient

import io.vertx.sqlclient.Tuple

/**
 * Converts a [Tuple] to a [List].
 */
fun Tuple.toList() =
  List(size()) { getValue(it) }
