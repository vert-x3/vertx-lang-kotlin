package io.vertx.kotlin.core.experimental.coroutines

import io.vertx.core.Vertx
import kotlinx.coroutines.experimental.CancellableContinuation
import kotlinx.coroutines.experimental.CoroutineDispatcher
import kotlinx.coroutines.experimental.Delay
import kotlinx.coroutines.experimental.DisposableHandle
import java.util.concurrent.TimeUnit
import kotlin.coroutines.experimental.CoroutineContext

/**
 * Dispatches execution onto Vert.x context and provides native [delay] support.
 */
internal class VertxDispatcher(private val vertx: Vertx) : CoroutineDispatcher(), Delay {
    override fun dispatch(context: CoroutineContext,
                          block: Runnable) =
            vertx.runOnContext { block.run() }

    override fun scheduleResumeAfterDelay(time: Long,
                                          unit: TimeUnit,
                                          continuation: CancellableContinuation<Unit>) {
        vertx.setTimer(unit.toMillis(time)) { with(continuation) { resumeUndispatched(Unit) } }
    }

    override fun invokeOnTimeout(time: Long,
                                 unit: TimeUnit,
                                 block: Runnable): DisposableHandle {
        val timerId = vertx.setTimer(unit.toMillis(time)) { block.run() }
        return object : DisposableHandle {
            override fun dispose() {
                vertx.cancelTimer(timerId)
            }
        }
    }

    override fun toString() = "VertxDispatcher{$vertx}"
}
