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
package io.vertx.kotlin.redis.sentinel

import io.vertx.core.json.JsonArray
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.sentinel.RedisSentinel

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.masters]
 *
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.mastersAwait(): JsonArray {
  return awaitResult {
    this.masters(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.master]
 *
 * @param name master name
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.masterAwait(name: String): JsonArray {
  return awaitResult {
    this.master(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.slaves]
 *
 * @param name master name
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.slavesAwait(name: String): JsonArray {
  return awaitResult {
    this.slaves(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.sentinels]
 *
 * @param name master name
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.sentinelsAwait(name: String): JsonArray {
  return awaitResult {
    this.sentinels(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.getMasterAddrByName]
 *
 * @param name master name
 * @return [JsonArray]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.getMasterAddrByNameAwait(name: String): JsonArray {
  return awaitResult {
    this.getMasterAddrByName(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.reset]
 *
 * @param pattern pattern String
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.resetAwait(pattern: String): Unit {
  return awaitResult {
    this.reset(pattern, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.failover]
 *
 * @param name master name
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.failoverAwait(name: String): String {
  return awaitResult {
    this.failover(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.ckquorum]
 *
 * @param name master name
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.ckquorumAwait(name: String): String {
  return awaitResult {
    this.ckquorum(name, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.sentinel.RedisSentinel.flushConfig]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.sentinel.RedisSentinel] using Vert.x codegen.
 */
suspend fun RedisSentinel.flushConfigAwait(): Unit {
  return awaitResult {
    this.flushConfig(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

