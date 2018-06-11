package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.Counter
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Long

suspend fun Counter.get(): Long {
  return awaitResult { this.get(it) }
}

suspend fun Counter.incrementAndGet(): Long {
  return awaitResult { this.incrementAndGet(it) }
}

suspend fun Counter.getAndIncrement(): Long {
  return awaitResult { this.getAndIncrement(it) }
}

suspend fun Counter.decrementAndGet(): Long {
  return awaitResult { this.decrementAndGet(it) }
}

suspend fun Counter.addAndGet(value: Long): Long {
  return awaitResult { this.addAndGet(value, it) }
}

suspend fun Counter.getAndAdd(value: Long): Long {
  return awaitResult { this.getAndAdd(value, it) }
}

suspend fun Counter.compareAndSet(expected: Long, value: Long): Boolean {
  return awaitResult { this.compareAndSet(expected, value, it) }
}
