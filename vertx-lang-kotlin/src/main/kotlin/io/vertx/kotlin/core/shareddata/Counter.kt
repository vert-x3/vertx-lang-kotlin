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

import io.vertx.core.shareddata.Counter
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.get]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use get returning a future that can yield a result ", replaceWith = ReplaceWith("get().await()"))
suspend fun Counter.getAwait(): Long {
  return awaitResult {
    this.get(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.incrementAndGet]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use incrementAndGet returning a future that can yield a result ", replaceWith = ReplaceWith("incrementAndGet().await()"))
suspend fun Counter.incrementAndGetAwait(): Long {
  return awaitResult {
    this.incrementAndGet(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.getAndIncrement]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getAndIncrement returning a future that can yield a result ", replaceWith = ReplaceWith("getAndIncrement().await()"))
suspend fun Counter.getAndIncrementAwait(): Long {
  return awaitResult {
    this.getAndIncrement(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.decrementAndGet]
 *
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use decrementAndGet returning a future that can yield a result ", replaceWith = ReplaceWith("decrementAndGet().await()"))
suspend fun Counter.decrementAndGetAwait(): Long {
  return awaitResult {
    this.decrementAndGet(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.addAndGet]
 *
 * @param value the value to add
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use addAndGet returning a future that can yield a result ", replaceWith = ReplaceWith("addAndGet(value).await()"))
suspend fun Counter.addAndGetAwait(value: Long): Long {
  return awaitResult {
    this.addAndGet(value, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.getAndAdd]
 *
 * @param value the value to add
 * @return [Long]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getAndAdd returning a future that can yield a result ", replaceWith = ReplaceWith("getAndAdd(value).await()"))
suspend fun Counter.getAndAddAwait(value: Long): Long {
  return awaitResult {
    this.getAndAdd(value, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.shareddata.Counter.compareAndSet]
 *
 * @param expected the expected value
 * @param value the new value
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.shareddata.Counter] using Vert.x codegen.
 */
@Deprecated(message = "Instead use compareAndSet returning a future that can yield a result ", replaceWith = ReplaceWith("compareAndSet(expected, value).await()"))
suspend fun Counter.compareAndSetAwait(expected: Long, value: Long): Boolean {
  return awaitResult {
    this.compareAndSet(expected, value, it)
  }
}

