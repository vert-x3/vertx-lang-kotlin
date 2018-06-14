package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long

/**
 *  Get a value from the map, asynchronously.
 * @param k  the key */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.get(k: K): V {
  return awaitResult { this.get(k, it) }
}

/**
 *  Put a value in the map, asynchronously.
 * @param k  the key
 * @param v  the value */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.put(k: K, v: V) {
  awaitResult<Void?> { this.put(k, v, it) }
}

/**
 *  Like [AsyncMap.put] but specifying a time to live for the entry. Entry will expire and get evicted after the
 *  ttl.
 * @param k  the key
 * @param v  the value
 * @param ttl  The time to live (in ms) for the entry */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.put(
  k: K,
  v: V,
  ttl: Long
) {
  awaitResult<Void?> { this.put(k, v, ttl, it) }
}

/**
 *  Put the entry only if there is no entry with the key already present. If key already present then the existing
 *  value will be returned to the handler, otherwise null.
 * @param k  the key
 * @param v  the value */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.putIfAbsent(k: K, v: V): V {
  return awaitResult { this.putIfAbsent(k, v, it) }
}

/**
 *  Link [AsyncMap.putIfAbsent] but specifying a time to live for the entry. Entry will expire and get evicted
 *  after the ttl.
 * @param k  the key
 * @param v  the value
 * @param ttl  The time to live (in ms) for the entry */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.putIfAbsent(
  k: K,
  v: V,
  ttl: Long
): V {
  return awaitResult { this.putIfAbsent(k, v, ttl, it) }
}

/**
 *  Remove a value from the map, asynchronously.
 * @param k  the key */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.remove(k: K): V {
  return awaitResult { this.remove(k, it) }
}

/**
 *  Remove a value from the map, only if entry already exists with same value.
 * @param k  the key
 * @param v  the value */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.removeIfPresent(k: K, v: V): Boolean {
  return awaitResult { this.removeIfPresent(k, v, it) }
}

/**
 *  Replace the entry only if it is currently mapped to some value
 * @param k  the key
 * @param v  the new value */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.replace(k: K, v: V): V {
  return awaitResult { this.replace(k, v, it) }
}

/**
 *  Replace the entry only if it is currently mapped to a specific value
 * @param k  the key
 * @param oldValue  the existing value
 * @param newValue  the new value */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.replaceIfPresent(
  k: K,
  oldValue: V,
  newValue: V
): Boolean {
  return awaitResult { this.replaceIfPresent(k, oldValue, newValue, it) }
}

/**
 *  Clear all entries in the map */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.clear() {
  awaitResult<Void?> { this.clear(it) }
}

/**
 *  Provide the number of entries in the map */
suspend fun <K : Any, V : Any> AsyncMap<K, V>.size(): Int {
  return awaitResult { this.size(it) }
}
