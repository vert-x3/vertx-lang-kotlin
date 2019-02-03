package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.get]
 *
 * @param k the key
 * @return [V?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.getAwait(k: K): V? {
  return awaitResult {
    this.get(k, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.put]
 *
 * @param k the key
 * @param v the value
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putAwait(k: K, v: V): Unit {
  return awaitResult {
    this.put(k, v) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.put]
 *
 * @param k the key
 * @param v the value
 * @param ttl The time to live (in ms) for the entry
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putAwait(k: K, v: V, ttl: Long): Unit {
  return awaitResult {
    this.put(k, v, ttl) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.putIfAbsent]
 *
 * @param k the key
 * @param v the value
 * @return [V?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putIfAbsentAwait(k: K, v: V): V? {
  return awaitResult {
    this.putIfAbsent(k, v, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.putIfAbsent]
 *
 * @param k the key
 * @param v the value
 * @param ttl The time to live (in ms) for the entry
 * @return [V?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putIfAbsentAwait(k: K, v: V, ttl: Long): V? {
  return awaitResult {
    this.putIfAbsent(k, v, ttl, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.remove]
 *
 * @param k the key
 * @return [V?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.removeAwait(k: K): V? {
  return awaitResult {
    this.remove(k, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.removeIfPresent]
 *
 * @param k the key
 * @param v the value
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.removeIfPresentAwait(k: K, v: V): Boolean {
  return awaitResult {
    this.removeIfPresent(k, v, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.replace]
 *
 * @param k the key
 * @param v the new value
 * @return [V?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.replaceAwait(k: K, v: V): V? {
  return awaitResult {
    this.replace(k, v, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.replaceIfPresent]
 *
 * @param k the key
 * @param oldValue the existing value
 * @param newValue the new value
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.replaceIfPresentAwait(k: K, oldValue: V, newValue: V): Boolean {
  return awaitResult {
    this.replaceIfPresent(k, oldValue, newValue, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.clear]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.clearAwait(): Unit {
  return awaitResult {
    this.clear { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.size]
 *
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.sizeAwait(): Int {
  return awaitResult {
    this.size(it)
  }
}

