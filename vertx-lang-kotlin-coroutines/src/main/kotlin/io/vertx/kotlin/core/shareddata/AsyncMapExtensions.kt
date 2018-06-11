package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long

suspend fun <K : Any, V : Any> AsyncMap<K, V>.get(k: K): V {
  return awaitResult { this.get(k, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.put(k: K, v: V) {
  awaitResult<Void?> { this.put(k, v, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.put(
  k: K,
  v: V,
  ttl: Long
) {
  awaitResult<Void?> { this.put(k, v, ttl, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.putIfAbsent(k: K, v: V): V {
  return awaitResult { this.putIfAbsent(k, v, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.putIfAbsent(
  k: K,
  v: V,
  ttl: Long
): V {
  return awaitResult { this.putIfAbsent(k, v, ttl, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.remove(k: K): V {
  return awaitResult { this.remove(k, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.removeIfPresent(k: K, v: V): Boolean {
  return awaitResult { this.removeIfPresent(k, v, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.replace(k: K, v: V): V {
  return awaitResult { this.replace(k, v, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.replaceIfPresent(
  k: K,
  oldValue: V,
  newValue: V
): Boolean {
  return awaitResult { this.replaceIfPresent(k, oldValue, newValue, it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.clear() {
  awaitResult<Void?> { this.clear(it) }
}

suspend fun <K : Any, V : Any> AsyncMap<K, V>.size(): Int {
  return awaitResult { this.size(it) }
}
