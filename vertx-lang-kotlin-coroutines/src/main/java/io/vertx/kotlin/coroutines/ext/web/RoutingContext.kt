package io.vertx.kotlin.coroutines.ext.web

import io.vertx.ext.web.RoutingContext
import io.vertx.kotlin.ext.web.checkedRun
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

/**
 * Launches a coroutine like [launch], and calls [RoutingContext.fail] on [ctx] if a [Throwable] is thrown in [block].
 */
inline fun CoroutineScope.launchChecked(
  ctx: RoutingContext,
  context: CoroutineContext = EmptyCoroutineContext,
  start: CoroutineStart = CoroutineStart.DEFAULT,
  crossinline block: suspend CoroutineScope.() -> Unit
) =
  launch(context, start) {
    ctx.checkedRun { block() }
  }
