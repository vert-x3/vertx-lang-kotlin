/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
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
@Deprecated(message = "Instead use get returning a future and chain with await()", replaceWith = ReplaceWith("get(k).await()"))
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
@Deprecated(message = "Instead use put returning a future and chain with await()", replaceWith = ReplaceWith("put(k, v).await()"))
suspend fun <K,V> AsyncMap<K,V>.putAwait(k: K, v: V): Unit {
  return awaitResult {
    this.put(k, v, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
@Deprecated(message = "Instead use put returning a future and chain with await()", replaceWith = ReplaceWith("put(k, v, ttl).await()"))
suspend fun <K,V> AsyncMap<K,V>.putAwait(k: K, v: V, ttl: Long): Unit {
  return awaitResult {
    this.put(k, v, ttl, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
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
@Deprecated(message = "Instead use putIfAbsent returning a future and chain with await()", replaceWith = ReplaceWith("putIfAbsent(k, v).await()"))
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
@Deprecated(message = "Instead use putIfAbsent returning a future and chain with await()", replaceWith = ReplaceWith("putIfAbsent(k, v, ttl).await()"))
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
@Deprecated(message = "Instead use remove returning a future and chain with await()", replaceWith = ReplaceWith("remove(k).await()"))
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
@Deprecated(message = "Instead use removeIfPresent returning a future and chain with await()", replaceWith = ReplaceWith("removeIfPresent(k, v).await()"))
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
@Deprecated(message = "Instead use replace returning a future and chain with await()", replaceWith = ReplaceWith("replace(k, v).await()"))
suspend fun <K,V> AsyncMap<K,V>.replaceAwait(k: K, v: V): V? {
  return awaitResult {
    this.replace(k, v, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.replace]
 *
 * @param k the key
 * @param v the new value
 * @param ttl The time to live (in ms) for the entry
 * @return [V?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
@Deprecated(message = "Instead use replace returning a future and chain with await()", replaceWith = ReplaceWith("replace(k, v, ttl).await()"))
suspend fun <K,V> AsyncMap<K,V>.replaceAwait(k: K, v: V, ttl: Long): V? {
  return awaitResult {
    this.replace(k, v, ttl, it)
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
@Deprecated(message = "Instead use replaceIfPresent returning a future and chain with await()", replaceWith = ReplaceWith("replaceIfPresent(k, oldValue, newValue).await()"))
suspend fun <K,V> AsyncMap<K,V>.replaceIfPresentAwait(k: K, oldValue: V, newValue: V): Boolean {
  return awaitResult {
    this.replaceIfPresent(k, oldValue, newValue, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.replaceIfPresent]
 *
 * @param k the key
 * @param oldValue the existing value
 * @param newValue the new value
 * @param ttl The time to live (in ms) for the entry
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
@Deprecated(message = "Instead use replaceIfPresent returning a future and chain with await()", replaceWith = ReplaceWith("replaceIfPresent(k, oldValue, newValue, ttl).await()"))
suspend fun <K,V> AsyncMap<K,V>.replaceIfPresentAwait(k: K, oldValue: V, newValue: V, ttl: Long): Boolean {
  return awaitResult {
    this.replaceIfPresent(k, oldValue, newValue, ttl, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.clear]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
@Deprecated(message = "Instead use clear returning a future and chain with await()", replaceWith = ReplaceWith("clear().await()"))
suspend fun <K,V> AsyncMap<K,V>.clearAwait(): Unit {
  return awaitResult {
    this.clear(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.AsyncMap.size]
 *
 * @return [Int]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.AsyncMap] using Vert.x codegen.
 */
@Deprecated(message = "Instead use size returning a future and chain with await()", replaceWith = ReplaceWith("size().await()"))
suspend fun <K,V> AsyncMap<K,V>.sizeAwait(): Int {
  return awaitResult {
    this.size(it)
  }
}

