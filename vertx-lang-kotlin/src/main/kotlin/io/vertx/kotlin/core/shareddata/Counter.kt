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
suspend fun Counter.compareAndSetAwait(expected: Long, value: Long): Boolean {
  return awaitResult {
    this.compareAndSet(expected, value, it)
  }
}

