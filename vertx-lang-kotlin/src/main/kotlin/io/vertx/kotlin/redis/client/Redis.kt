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
import io.vertx.redis.client.Redis
import io.vertx.redis.client.Request
import io.vertx.redis.client.Response

/**
 * Suspending version of method [io.vertx.redis.client.Redis.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
 */
suspend fun Redis.pipeToAwait(dst: WriteStream<Response>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.Redis.connect]
 *
 * @return [Redis]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.Redis] using Vert.x codegen.
 */
suspend fun Redis.connectAwait(): Redis {
  return awaitResult {
    this.connect(it)
  }
}

suspend fun Redis.sendAwait(command: Request): Response? {
  return awaitResult {
    this.send(command, it)
  }
}

suspend fun Redis.batchAwait(commands: List<Request>): List<Response> {
  return awaitResult {
    this.batch(commands, it)
  }
}

