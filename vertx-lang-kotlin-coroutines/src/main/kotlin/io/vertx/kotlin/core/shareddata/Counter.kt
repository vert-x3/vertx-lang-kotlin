package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.Counter
import io.vertx.kotlin.coroutines.awaitResult

suspend fun Counter.getAwait() : Long {
    return awaitResult{
        this.get(it)
    }
}

suspend fun Counter.incrementAndGetAwait() : Long {
    return awaitResult{
        this.incrementAndGet(it)
    }
}

suspend fun Counter.getAndIncrementAwait() : Long {
    return awaitResult{
        this.getAndIncrement(it)
    }
}

suspend fun Counter.decrementAndGetAwait() : Long {
    return awaitResult{
        this.decrementAndGet(it)
    }
}

suspend fun Counter.addAndGetAwait(value : Long) : Long {
    return awaitResult{
        this.addAndGet(value, it)
    }
}

suspend fun Counter.getAndAddAwait(value : Long) : Long {
    return awaitResult{
        this.getAndAdd(value, it)
    }
}

suspend fun Counter.compareAndSetAwait(expected : Long, value : Long) : Boolean {
    return awaitResult{
        this.compareAndSet(expected, value, it)
    }
}

