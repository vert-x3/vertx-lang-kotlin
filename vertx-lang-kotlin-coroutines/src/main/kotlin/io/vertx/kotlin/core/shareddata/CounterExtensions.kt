package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.Counter
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Long

/**
 *  Get the current value of the counter */
suspend fun Counter.get(): Long {
  return awaitResult { this.get(it) }
}

/**
 *  Increment the counter atomically and return the new count */
suspend fun Counter.incrementAndGet(): Long {
  return awaitResult { this.incrementAndGet(it) }
}

/**
 *  Increment the counter atomically and return the value before the increment. */
suspend fun Counter.getAndIncrement(): Long {
  return awaitResult { this.getAndIncrement(it) }
}

/**
 *  Decrement the counter atomically and return the new count */
suspend fun Counter.decrementAndGet(): Long {
  return awaitResult { this.decrementAndGet(it) }
}

/**
 *  Add the value to the counter atomically and return the new count
 * @param value  the value to add */
suspend fun Counter.addAndGet(value: Long): Long {
  return awaitResult { this.addAndGet(value, it) }
}

/**
 *  Add the value to the counter atomically and return the value before the add
 * @param value  the value to add */
suspend fun Counter.getAndAdd(value: Long): Long {
  return awaitResult { this.getAndAdd(value, it) }
}

/**
 *  Set the counter to the specified value only if the current value is the expectec value. This happens
 *  atomically.
 * @param expected  the expected value
 * @param value  the new value */
suspend fun Counter.compareAndSet(expected: Long, value: Long): Boolean {
  return awaitResult { this.compareAndSet(expected, value, it) }
}
