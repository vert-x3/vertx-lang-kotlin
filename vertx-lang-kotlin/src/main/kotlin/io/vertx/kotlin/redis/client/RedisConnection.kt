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

import io.vertx.core.streams.WriteStream
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.client.RedisConnection
import io.vertx.redis.client.Request
import io.vertx.redis.client.Response

/**
 * Suspending version of method [io.vertx.redis.client.RedisConnection.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pipeTo returning a future and chain with coAwait()", replaceWith = ReplaceWith("pipeTo(dst).coAwait()"))
suspend fun RedisConnection.pipeToAwait(dst: WriteStream<Response>): Unit {
  return awaitResult {
    this.pipeTo(dst, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisConnection.send]
 *
 * @param command the command to send
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use send returning a future and chain with coAwait()", replaceWith = ReplaceWith("send(command).coAwait()"))
suspend fun RedisConnection.sendAwait(command: Request): Response? {
  return awaitResult {
    this.send(command, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisConnection.batch]
 *
 * @param commands list of command to send
 * @return [List<Response?>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use batch returning a future and chain with coAwait()", replaceWith = ReplaceWith("batch(commands).coAwait()"))
suspend fun RedisConnection.batchAwait(commands: List<Request>): List<Response?> {
  return awaitResult {
    this.batch(commands, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisConnection.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisConnection] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with coAwait()", replaceWith = ReplaceWith("close().coAwait()"))
suspend fun RedisConnection.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

