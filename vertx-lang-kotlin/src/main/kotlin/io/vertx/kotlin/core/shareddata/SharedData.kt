package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.core.shareddata.Counter
import io.vertx.core.shareddata.Lock
import io.vertx.core.shareddata.SharedData
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <K,V> SharedData.getClusterWideMapAwait(name : String) : AsyncMap<K,V> {
    return awaitResult{
        this.getClusterWideMap(name, it)
    }
}

suspend fun <K,V> SharedData.getAsyncMapAwait(name : String) : AsyncMap<K,V> {
    return awaitResult{
        this.getAsyncMap(name, it)
    }
}

suspend fun SharedData.getLockAwait(name : String) : Lock {
    return awaitResult{
        this.getLock(name, it)
    }
}

suspend fun SharedData.getLockWithTimeoutAwait(name : String, timeout : Long) : Lock {
    return awaitResult{
        this.getLockWithTimeout(name, timeout, it)
    }
}

suspend fun SharedData.getCounterAwait(name : String) : Counter {
    return awaitResult{
        this.getCounter(name, it)
    }
}

