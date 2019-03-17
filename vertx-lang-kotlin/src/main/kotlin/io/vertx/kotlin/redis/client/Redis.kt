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
 * Pipe this <code>ReadStream</code> to the <code>WriteStream</code>.
 * <p>
 * Elements emitted by this stream will be written to the write stream until this stream ends or fails.
 * <p>
 * Once this stream has ended or failed, the write stream will be ended and the <code>handler</code> will be
 * called with the result.
 *
 * @param dst the destination write stream
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.client.Redis original] using Vert.x codegen.
 */
suspend fun RedisVertxAlias.pipeToAwait(dst : WriteStream<Response>) : Unit {
  return awaitResult{
    this.pipeTo(dst, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun RedisVertxAlias.sendAwait(command : Request) : Response? {
  return awaitResult{
    this.send(command, it)
  }
}

suspend fun RedisVertxAlias.batchAwait(commands : List<Request>) : List<Response> {
  return awaitResult{
    this.batch(commands, it)
  }
}

object Redis {
/**
 * Connect to redis, the <code>onConnect</code> will get the [io.vertx.redis.client.Redis] instance.
 *
 * This connection will use the default options which are connect
 * to a standalone server on the default port on "localhost".
 *
 * @param vertx 
 * @param address 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.client.Redis original] using Vert.x codegen.
 */
  suspend fun createClientAwait(vertx : Vertx, address : SocketAddress) : RedisVertxAlias {
    return awaitResult{
      RedisVertxAlias.createClient(vertx, address, it)
    }
  }

/**
 * Connect to redis, the <code>onConnect</code> will get the [io.vertx.redis.client.Redis] instance.
 *
 * @param vertx 
 * @param options 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.redis.client.Redis original] using Vert.x codegen.
 */
  suspend fun createClientAwait(vertx : Vertx, options : RedisOptions) : RedisVertxAlias {
    return awaitResult{
      RedisVertxAlias.createClient(vertx, options, it)
    }
  }

}
