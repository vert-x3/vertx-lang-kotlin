package io.vertx.kotlin.redis.sentinel

import io.vertx.core.json.JsonArray
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.sentinel.RedisSentinel
import kotlin.String

suspend fun RedisSentinel.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun RedisSentinel.masters(): JsonArray = awaitResult { this.masters(it) }

suspend fun RedisSentinel.master(name: String): JsonArray = awaitResult { this.master(name, it) }

suspend fun RedisSentinel.slaves(name: String): JsonArray = awaitResult { this.slaves(name, it) }

suspend fun RedisSentinel.sentinels(name: String): JsonArray = awaitResult { this.sentinels(name, it) }

suspend fun RedisSentinel.getMasterAddrByName(name: String): JsonArray = awaitResult { this.getMasterAddrByName(name, it) }

suspend fun RedisSentinel.reset(pattern: String) {
  awaitResult<Void?> { this.reset(pattern, it) }
}

suspend fun RedisSentinel.failover(name: String): String = awaitResult { this.failover(name, it) }

suspend fun RedisSentinel.ckquorum(name: String): String = awaitResult { this.ckquorum(name, it) }

suspend fun RedisSentinel.flushConfig() {
  awaitResult<Void?> { this.flushConfig(it) }
}
