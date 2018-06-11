package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.core.shareddata.Counter
import io.vertx.core.shareddata.Lock
import io.vertx.core.shareddata.SharedData
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Long
import kotlin.String

suspend fun <K : Any, V : Any> SharedData.getClusterWideMap(name: String): AsyncMap<K, V> = awaitResult { this.getClusterWideMap(name, it) }

suspend fun <K : Any, V : Any> SharedData.getAsyncMap(name: String): AsyncMap<K, V> = awaitResult { this.getAsyncMap(name, it) }

suspend fun SharedData.getLock(name: String): Lock = awaitResult { this.getLock(name, it) }

suspend fun SharedData.getLockWithTimeout(name: String, timeout: Long): Lock = awaitResult { this.getLockWithTimeout(name, timeout, it) }

suspend fun SharedData.getCounter(name: String): Counter = awaitResult { this.getCounter(name, it) }
