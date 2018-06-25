package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestContext
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun TestContext.verifyAwait() : Unit {
    return awaitEvent{
        this.verify({ v -> it.handle(null) })}
}

