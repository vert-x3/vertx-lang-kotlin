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
import io.vertx.core.shareddata.Counter
import io.vertx.core.shareddata.Lock
import io.vertx.core.shareddata.SharedData
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getClusterWideMap]
 *
 * @param name the name of the map
 * @return [AsyncMap<K,V>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getClusterWideMap returning a future and chain with coAwait()", replaceWith = ReplaceWith("getClusterWideMap(name).coAwait()"))
suspend fun <K,V> SharedData.getClusterWideMapAwait(name: String): AsyncMap<K,V> {
  return awaitResult {
    this.getClusterWideMap(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getAsyncMap]
 *
 * @param name the name of the map
 * @return [AsyncMap<K,V>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getAsyncMap returning a future and chain with coAwait()", replaceWith = ReplaceWith("getAsyncMap(name).coAwait()"))
suspend fun <K,V> SharedData.getAsyncMapAwait(name: String): AsyncMap<K,V> {
  return awaitResult {
    this.getAsyncMap(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getLocalAsyncMap]
 *
 * @param name the name of the map
 * @return [AsyncMap<K,V>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getLocalAsyncMap returning a future and chain with coAwait()", replaceWith = ReplaceWith("getLocalAsyncMap(name).coAwait()"))
suspend fun <K,V> SharedData.getLocalAsyncMapAwait(name: String): AsyncMap<K,V> {
  return awaitResult {
    this.getLocalAsyncMap(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getLock]
 *
 * @param name the name of the lock
 * @return [Lock]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getLock returning a future and chain with coAwait()", replaceWith = ReplaceWith("getLock(name).coAwait()"))
suspend fun SharedData.getLockAwait(name: String): Lock {
  return awaitResult {
    this.getLock(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getLockWithTimeout]
 *
 * @param name the name of the lock
 * @param timeout the timeout in ms
 * @return [Lock]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getLockWithTimeout returning a future and chain with coAwait()", replaceWith = ReplaceWith("getLockWithTimeout(name, timeout).coAwait()"))
suspend fun SharedData.getLockWithTimeoutAwait(name: String, timeout: Long): Lock {
  return awaitResult {
    this.getLockWithTimeout(name, timeout, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getLocalLock]
 *
 * @param name the name of the lock
 * @return [Lock]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getLocalLock returning a future and chain with coAwait()", replaceWith = ReplaceWith("getLocalLock(name).coAwait()"))
suspend fun SharedData.getLocalLockAwait(name: String): Lock {
  return awaitResult {
    this.getLocalLock(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getLocalLockWithTimeout]
 *
 * @param name the name of the lock
 * @param timeout the timeout in ms
 * @return [Lock]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getLocalLockWithTimeout returning a future and chain with coAwait()", replaceWith = ReplaceWith("getLocalLockWithTimeout(name, timeout).coAwait()"))
suspend fun SharedData.getLocalLockWithTimeoutAwait(name: String, timeout: Long): Lock {
  return awaitResult {
    this.getLocalLockWithTimeout(name, timeout, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getCounter]
 *
 * @param name the name of the counter.
 * @return [Counter]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getCounter returning a future and chain with coAwait()", replaceWith = ReplaceWith("getCounter(name).coAwait()"))
suspend fun SharedData.getCounterAwait(name: String): Counter {
  return awaitResult {
    this.getCounter(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.SharedData.getLocalCounter]
 *
 * @param name the name of the counter.
 * @return [Counter]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.SharedData] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getLocalCounter returning a future and chain with coAwait()", replaceWith = ReplaceWith("getLocalCounter(name).coAwait()"))
suspend fun SharedData.getLocalCounterAwait(name: String): Counter {
  return awaitResult {
    this.getLocalCounter(name, it)
  }
}

