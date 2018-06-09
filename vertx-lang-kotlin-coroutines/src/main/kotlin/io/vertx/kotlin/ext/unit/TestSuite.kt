package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.TestContext
import io.vertx.ext.unit.TestSuite
import io.vertx.kotlin.coroutines.awaitEvent

suspend fun TestSuite.beforeAwait() : TestContext {
    return awaitEvent{
        this.before(it)
    }
}

suspend fun TestSuite.beforeEachAwait() : TestContext {
    return awaitEvent{
        this.beforeEach(it)
    }
}

suspend fun TestSuite.afterAwait() : TestContext {
    return awaitEvent{
        this.after(it)
    }
}

suspend fun TestSuite.afterEachAwait() : TestContext {
    return awaitEvent{
        this.afterEach(it)
    }
}

suspend fun TestSuite.testAwait(name : String) : TestContext {
    return awaitEvent{
        this.test(name, it)
    }
}

suspend fun TestSuite.testAwait(name : String, repeat : Int) : TestContext {
    return awaitEvent{
        this.test(name, repeat, it)
    }
}

