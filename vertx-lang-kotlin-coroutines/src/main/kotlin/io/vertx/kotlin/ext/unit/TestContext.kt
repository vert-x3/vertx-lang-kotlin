package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestContext
import io.vertx.kotlin.coroutines.awaitEvent
import java.lang.Void

suspend fun TestContext.verifyAwait() : Void {
    return awaitEvent{
        this.verify(it)
    }
}

