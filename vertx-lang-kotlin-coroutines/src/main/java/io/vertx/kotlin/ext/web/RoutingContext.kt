package io.vertx.kotlin.ext.web

import io.vertx.ext.web.RoutingContext

// TODO: this function should probably be put in "vertx-lang-kotlin" as it's unrelated to coroutines, but doing this now would create cyclic Maven dependencies.
/**
 * Runs the [block] and calls [RoutingContext.fail] if a [Throwable] is thrown.
 */
inline fun RoutingContext.checkedRun(block: () -> Unit): Unit =
  try {
    block()
  } catch (t: Throwable) {
    fail(t)
  }
