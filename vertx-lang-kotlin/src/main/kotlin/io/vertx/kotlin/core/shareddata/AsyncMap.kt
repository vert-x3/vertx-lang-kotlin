package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Get a value from the map, asynchronously.
 *
 * @param k the key
 * @param resultHandler - this will be called some time later with the async result.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.getAwait(k : K) : V? {
  return awaitResult{
    this.get(k, it)
  }
}

/**
 * Put a value in the map, asynchronously.
 *
 * @param k the key
 * @param v the value
 * @param completionHandler - this will be called some time later to signify the value has been put
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putAwait(k : K, v : V) : Unit {
  return awaitResult{
    this.put(k, v, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Like [io.vertx.core.shareddata.AsyncMap] but specifying a time to live for the entry. Entry will expire and get evicted after the
 * ttl.
 *
 * @param k the key
 * @param v the value
 * @param ttl The time to live (in ms) for the entry
 * @param completionHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putAwait(k : K, v : V, ttl : Long) : Unit {
  return awaitResult{
    this.put(k, v, ttl, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Put the entry only if there is no entry with the key already present. If key already present then the existing
 * value will be returned to the handler, otherwise null.
 *
 * @param k the key
 * @param v the value
 * @param completionHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putIfAbsentAwait(k : K, v : V) : V? {
  return awaitResult{
    this.putIfAbsent(k, v, it)
  }
}

/**
 * Link [io.vertx.core.shareddata.AsyncMap] but specifying a time to live for the entry. Entry will expire and get evicted
 * after the ttl.
 *
 * @param k the key
 * @param v the value
 * @param ttl The time to live (in ms) for the entry
 * @param completionHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.putIfAbsentAwait(k : K, v : V, ttl : Long) : V? {
  return awaitResult{
    this.putIfAbsent(k, v, ttl, it)
  }
}

/**
 * Remove a value from the map, asynchronously.
 *
 * @param k the key
 * @param resultHandler - this will be called some time later to signify the value has been removed
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.removeAwait(k : K) : V? {
  return awaitResult{
    this.remove(k, it)
  }
}

/**
 * Remove a value from the map, only if entry already exists with same value.
 *
 * @param k the key
 * @param v the value
 * @param resultHandler - this will be called some time later to signify the value has been removed
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.removeIfPresentAwait(k : K, v : V) : Boolean {
  return awaitResult{
    this.removeIfPresent(k, v, it)
  }
}

/**
 * Replace the entry only if it is currently mapped to some value
 *
 * @param k the key
 * @param v the new value
 * @param resultHandler the result handler will be passed the previous value
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.replaceAwait(k : K, v : V) : V? {
  return awaitResult{
    this.replace(k, v, it)
  }
}

/**
 * Replace the entry only if it is currently mapped to a specific value
 *
 * @param k the key
 * @param oldValue the existing value
 * @param newValue the new value
 * @param resultHandler the result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.replaceIfPresentAwait(k : K, oldValue : V, newValue : V) : Boolean {
  return awaitResult{
    this.replaceIfPresent(k, oldValue, newValue, it)
  }
}

/**
 * Clear all entries in the map
 *
 * @param resultHandler called on completion
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.clearAwait() : Unit {
  return awaitResult{
    this.clear({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Provide the number of entries in the map
 *
 * @param resultHandler handler which will receive the number of entries
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.AsyncMap original] using Vert.x codegen.
 */
suspend fun <K,V> AsyncMap<K,V>.sizeAwait() : Int {
  return awaitResult{
    this.size(it)
  }
}

