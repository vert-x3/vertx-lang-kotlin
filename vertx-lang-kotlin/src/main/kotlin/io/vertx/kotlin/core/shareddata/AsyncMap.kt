package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.kotlin.coroutines.awaitResult

suspend fun <K,V> AsyncMap<K,V>.getAwait(k : K) : V {
    return awaitResult{
        this.get(k, it)
    }
}

suspend fun <K,V> AsyncMap<K,V>.putAwait(k : K, v : V) : Unit {
    return awaitResult{
        this.put(k, v, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> AsyncMap<K,V>.putAwait(k : K, v : V, ttl : Long) : Unit {
    return awaitResult{
        this.put(k, v, ttl, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> AsyncMap<K,V>.putIfAbsentAwait(k : K, v : V) : V {
    return awaitResult{
        this.putIfAbsent(k, v, it)
    }
}

suspend fun <K,V> AsyncMap<K,V>.putIfAbsentAwait(k : K, v : V, ttl : Long) : V {
    return awaitResult{
        this.putIfAbsent(k, v, ttl, it)
    }
}

suspend fun <K,V> AsyncMap<K,V>.removeAwait(k : K) : V {
    return awaitResult{
        this.remove(k, it)
    }
}

suspend fun <K,V> AsyncMap<K,V>.removeIfPresentAwait(k : K, v : V) : Boolean {
    return awaitResult{
        this.removeIfPresent(k, v, it)
    }
}

suspend fun <K,V> AsyncMap<K,V>.replaceAwait(k : K, v : V) : V {
    return awaitResult{
        this.replace(k, v, it)
    }
}

suspend fun <K,V> AsyncMap<K,V>.replaceIfPresentAwait(k : K, oldValue : V, newValue : V) : Boolean {
    return awaitResult{
        this.replaceIfPresent(k, oldValue, newValue, it)
    }
}

suspend fun <K,V> AsyncMap<K,V>.clearAwait() : Unit {
    return awaitResult{
        this.clear({ ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun <K,V> AsyncMap<K,V>.sizeAwait() : Int {
    return awaitResult{
        this.size(it)
    }
}

