package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.Counter
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Long

suspend fun Counter.get(): Long = awaitResult { this.get(it) }

suspend fun Counter.incrementAndGet(): Long = awaitResult { this.incrementAndGet(it) }

suspend fun Counter.getAndIncrement(): Long = awaitResult { this.getAndIncrement(it) }

suspend fun Counter.decrementAndGet(): Long = awaitResult { this.decrementAndGet(it) }

suspend fun Counter.addAndGet(value: Long): Long = awaitResult { this.addAndGet(value, it) }

suspend fun Counter.getAndAdd(value: Long): Long = awaitResult { this.getAndAdd(value, it) }

suspend fun Counter.compareAndSet(expected: Long, value: Long): Boolean = awaitResult { this.compareAndSet(expected, value, it) }
