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
package io.vertx.kotlin.redis.client

import io.vertx.core.Vertx
import io.vertx.core.net.SocketAddress
import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.client.Redis as RedisVertxAlias
import io.vertx.redis.client.RedisOptions
import io.vertx.redis.client.Request
import io.vertx.redis.client.Response

/**
 * Suspending version of method [io.vertx.redis.client.Redis.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
 */
suspend fun RedisVertxAlias.pipeToAwait(dst: WriteStream<Response>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

suspend fun RedisVertxAlias.sendAwait(command: Request): Response? {
  return awaitResult {
    this.send(command, it)
  }
}

suspend fun RedisVertxAlias.batchAwait(commands: List<Request>): List<Response> {
  return awaitResult {
    this.batch(commands, it)
  }
}

object Redis {
  /**
   * Suspending version of method [io.vertx.redis.client.Redis.createClient]
   *
   * @param vertx 
   * @param address 
   * @return [RedisVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
   */
  suspend fun createClientAwait(vertx: Vertx, address: SocketAddress): RedisVertxAlias {
    return awaitResult {
      RedisVertxAlias.createClient(vertx, address, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.redis.client.Redis.createClient]
   *
   * @param vertx 
   * @param options 
   * @return [RedisVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
   */
  suspend fun createClientAwait(vertx: Vertx, options: RedisOptions): RedisVertxAlias {
    return awaitResult {
      RedisVertxAlias.createClient(vertx, options, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.redis.client.Redis.createSentinelClient]
   *
   * @param vertx 
   * @param address 
   * @return [RedisVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
   */
  suspend fun createSentinelClientAwait(vertx: Vertx, address: SocketAddress): RedisVertxAlias {
    return awaitResult {
      RedisVertxAlias.createSentinelClient(vertx, address, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.redis.client.Redis.createSentinelClient]
   *
   * @param vertx 
   * @param options 
   * @return [RedisVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
   */
  suspend fun createSentinelClientAwait(vertx: Vertx, options: RedisOptions): RedisVertxAlias {
    return awaitResult {
      RedisVertxAlias.createSentinelClient(vertx, options, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.redis.client.Redis.createClusterClient]
   *
   * @param vertx 
   * @param address 
   * @return [RedisVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
   */
  suspend fun createClusterClientAwait(vertx: Vertx, address: SocketAddress): RedisVertxAlias {
    return awaitResult {
      RedisVertxAlias.createClusterClient(vertx, address, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.redis.client.Redis.createClusterClient]
   *
   * @param vertx 
   * @param options 
   * @return [RedisVertxAlias]
   *
   * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
   */
  suspend fun createClusterClientAwait(vertx: Vertx, options: RedisOptions): RedisVertxAlias {
    return awaitResult {
      RedisVertxAlias.createClusterClient(vertx, options, it)
    }
  }

}
