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

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.redis.client.RedisAPI
import io.vertx.redis.client.Response

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.acl]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use acl returning a future and chain with await()", replaceWith = ReplaceWith("acl(args).await()"))
suspend fun RedisAPI.aclAwait(args: List<String>): Response? {
  return awaitResult {
    this.acl(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.append]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use append returning a future and chain with await()", replaceWith = ReplaceWith("append(arg0, arg1).await()"))
suspend fun RedisAPI.appendAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.append(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.asking]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use asking returning a future and chain with await()", replaceWith = ReplaceWith("asking().await()"))
suspend fun RedisAPI.askingAwait(): Response? {
  return awaitResult {
    this.asking(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.auth]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use auth returning a future and chain with await()", replaceWith = ReplaceWith("auth(args).await()"))
suspend fun RedisAPI.authAwait(args: List<String>): Response? {
  return awaitResult {
    this.auth(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bgrewriteaof]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bgrewriteaof returning a future and chain with await()", replaceWith = ReplaceWith("bgrewriteaof().await()"))
suspend fun RedisAPI.bgrewriteaofAwait(): Response? {
  return awaitResult {
    this.bgrewriteaof(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bgsave]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bgsave returning a future and chain with await()", replaceWith = ReplaceWith("bgsave(args).await()"))
suspend fun RedisAPI.bgsaveAwait(args: List<String>): Response? {
  return awaitResult {
    this.bgsave(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitcount]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bitcount returning a future and chain with await()", replaceWith = ReplaceWith("bitcount(args).await()"))
suspend fun RedisAPI.bitcountAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitcount(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitfield]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bitfield returning a future and chain with await()", replaceWith = ReplaceWith("bitfield(args).await()"))
suspend fun RedisAPI.bitfieldAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitfield(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitfieldRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bitfieldRo returning a future and chain with await()", replaceWith = ReplaceWith("bitfieldRo(args).await()"))
suspend fun RedisAPI.bitfieldRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitfieldRo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bitop returning a future and chain with await()", replaceWith = ReplaceWith("bitop(args).await()"))
suspend fun RedisAPI.bitopAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bitpos]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bitpos returning a future and chain with await()", replaceWith = ReplaceWith("bitpos(args).await()"))
suspend fun RedisAPI.bitposAwait(args: List<String>): Response? {
  return awaitResult {
    this.bitpos(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.blmove]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @param arg3 
 * @param arg4 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use blmove returning a future and chain with await()", replaceWith = ReplaceWith("blmove(arg0, arg1, arg2, arg3, arg4).await()"))
suspend fun RedisAPI.blmoveAwait(arg0: String, arg1: String, arg2: String, arg3: String, arg4: String): Response? {
  return awaitResult {
    this.blmove(arg0, arg1, arg2, arg3, arg4, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.blpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use blpop returning a future and chain with await()", replaceWith = ReplaceWith("blpop(args).await()"))
suspend fun RedisAPI.blpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.blpop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.brpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use brpop returning a future and chain with await()", replaceWith = ReplaceWith("brpop(args).await()"))
suspend fun RedisAPI.brpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.brpop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.brpoplpush]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use brpoplpush returning a future and chain with await()", replaceWith = ReplaceWith("brpoplpush(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.brpoplpushAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.brpoplpush(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bzpopmax]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bzpopmax returning a future and chain with await()", replaceWith = ReplaceWith("bzpopmax(args).await()"))
suspend fun RedisAPI.bzpopmaxAwait(args: List<String>): Response? {
  return awaitResult {
    this.bzpopmax(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bzpopmin]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bzpopmin returning a future and chain with await()", replaceWith = ReplaceWith("bzpopmin(args).await()"))
suspend fun RedisAPI.bzpopminAwait(args: List<String>): Response? {
  return awaitResult {
    this.bzpopmin(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.client]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use client returning a future and chain with await()", replaceWith = ReplaceWith("client(args).await()"))
suspend fun RedisAPI.clientAwait(args: List<String>): Response? {
  return awaitResult {
    this.client(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cluster]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cluster returning a future and chain with await()", replaceWith = ReplaceWith("cluster(args).await()"))
suspend fun RedisAPI.clusterAwait(args: List<String>): Response? {
  return awaitResult {
    this.cluster(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.command]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use command returning a future and chain with await()", replaceWith = ReplaceWith("command(args).await()"))
suspend fun RedisAPI.commandAwait(args: List<String>): Response? {
  return awaitResult {
    this.command(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.config]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use config returning a future and chain with await()", replaceWith = ReplaceWith("config(args).await()"))
suspend fun RedisAPI.configAwait(args: List<String>): Response? {
  return awaitResult {
    this.config(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.copy]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use copy returning a future and chain with await()", replaceWith = ReplaceWith("copy(args).await()"))
suspend fun RedisAPI.copyAwait(args: List<String>): Response? {
  return awaitResult {
    this.copy(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.dbsize]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use dbsize returning a future and chain with await()", replaceWith = ReplaceWith("dbsize().await()"))
suspend fun RedisAPI.dbsizeAwait(): Response? {
  return awaitResult {
    this.dbsize(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.debug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use debug returning a future and chain with await()", replaceWith = ReplaceWith("debug(args).await()"))
suspend fun RedisAPI.debugAwait(args: List<String>): Response? {
  return awaitResult {
    this.debug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.decr]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use decr returning a future and chain with await()", replaceWith = ReplaceWith("decr(arg0).await()"))
suspend fun RedisAPI.decrAwait(arg0: String): Response? {
  return awaitResult {
    this.decr(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.decrby]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use decrby returning a future and chain with await()", replaceWith = ReplaceWith("decrby(arg0, arg1).await()"))
suspend fun RedisAPI.decrbyAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.decrby(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.del]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use del returning a future and chain with await()", replaceWith = ReplaceWith("del(args).await()"))
suspend fun RedisAPI.delAwait(args: List<String>): Response? {
  return awaitResult {
    this.del(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.discard]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use discard returning a future and chain with await()", replaceWith = ReplaceWith("discard().await()"))
suspend fun RedisAPI.discardAwait(): Response? {
  return awaitResult {
    this.discard(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.dump]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use dump returning a future and chain with await()", replaceWith = ReplaceWith("dump(arg0).await()"))
suspend fun RedisAPI.dumpAwait(arg0: String): Response? {
  return awaitResult {
    this.dump(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.echo]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use echo returning a future and chain with await()", replaceWith = ReplaceWith("echo(arg0).await()"))
suspend fun RedisAPI.echoAwait(arg0: String): Response? {
  return awaitResult {
    this.echo(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.eval]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use eval returning a future and chain with await()", replaceWith = ReplaceWith("eval(args).await()"))
suspend fun RedisAPI.evalAwait(args: List<String>): Response? {
  return awaitResult {
    this.eval(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.evalsha]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use evalsha returning a future and chain with await()", replaceWith = ReplaceWith("evalsha(args).await()"))
suspend fun RedisAPI.evalshaAwait(args: List<String>): Response? {
  return awaitResult {
    this.evalsha(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.exec]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use exec returning a future and chain with await()", replaceWith = ReplaceWith("exec().await()"))
suspend fun RedisAPI.execAwait(): Response? {
  return awaitResult {
    this.exec(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.exists]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use exists returning a future and chain with await()", replaceWith = ReplaceWith("exists(args).await()"))
suspend fun RedisAPI.existsAwait(args: List<String>): Response? {
  return awaitResult {
    this.exists(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.expire]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use expire returning a future and chain with await()", replaceWith = ReplaceWith("expire(arg0, arg1).await()"))
suspend fun RedisAPI.expireAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.expire(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.expireat]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use expireat returning a future and chain with await()", replaceWith = ReplaceWith("expireat(arg0, arg1).await()"))
suspend fun RedisAPI.expireatAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.expireat(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.failover]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use failover returning a future and chain with await()", replaceWith = ReplaceWith("failover(args).await()"))
suspend fun RedisAPI.failoverAwait(args: List<String>): Response? {
  return awaitResult {
    this.failover(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.flushall]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use flushall returning a future and chain with await()", replaceWith = ReplaceWith("flushall(args).await()"))
suspend fun RedisAPI.flushallAwait(args: List<String>): Response? {
  return awaitResult {
    this.flushall(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.flushdb]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use flushdb returning a future and chain with await()", replaceWith = ReplaceWith("flushdb(args).await()"))
suspend fun RedisAPI.flushdbAwait(args: List<String>): Response? {
  return awaitResult {
    this.flushdb(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geoadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use geoadd returning a future and chain with await()", replaceWith = ReplaceWith("geoadd(args).await()"))
suspend fun RedisAPI.geoaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.geoadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geodist]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use geodist returning a future and chain with await()", replaceWith = ReplaceWith("geodist(args).await()"))
suspend fun RedisAPI.geodistAwait(args: List<String>): Response? {
  return awaitResult {
    this.geodist(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geohash]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use geohash returning a future and chain with await()", replaceWith = ReplaceWith("geohash(args).await()"))
suspend fun RedisAPI.geohashAwait(args: List<String>): Response? {
  return awaitResult {
    this.geohash(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geopos]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use geopos returning a future and chain with await()", replaceWith = ReplaceWith("geopos(args).await()"))
suspend fun RedisAPI.geoposAwait(args: List<String>): Response? {
  return awaitResult {
    this.geopos(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadius]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use georadius returning a future and chain with await()", replaceWith = ReplaceWith("georadius(args).await()"))
suspend fun RedisAPI.georadiusAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadius(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadiusRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use georadiusRo returning a future and chain with await()", replaceWith = ReplaceWith("georadiusRo(args).await()"))
suspend fun RedisAPI.georadiusRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadiusRo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadiusbymember]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use georadiusbymember returning a future and chain with await()", replaceWith = ReplaceWith("georadiusbymember(args).await()"))
suspend fun RedisAPI.georadiusbymemberAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadiusbymember(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.georadiusbymemberRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use georadiusbymemberRo returning a future and chain with await()", replaceWith = ReplaceWith("georadiusbymemberRo(args).await()"))
suspend fun RedisAPI.georadiusbymemberRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.georadiusbymemberRo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geosearch]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use geosearch returning a future and chain with await()", replaceWith = ReplaceWith("geosearch(args).await()"))
suspend fun RedisAPI.geosearchAwait(args: List<String>): Response? {
  return awaitResult {
    this.geosearch(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.geosearchstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use geosearchstore returning a future and chain with await()", replaceWith = ReplaceWith("geosearchstore(args).await()"))
suspend fun RedisAPI.geosearchstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.geosearchstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.get]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use get returning a future and chain with await()", replaceWith = ReplaceWith("get(arg0).await()"))
suspend fun RedisAPI.getAwait(arg0: String): Response? {
  return awaitResult {
    this.get(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getbit]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getbit returning a future and chain with await()", replaceWith = ReplaceWith("getbit(arg0, arg1).await()"))
suspend fun RedisAPI.getbitAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.getbit(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getdel]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getdel returning a future and chain with await()", replaceWith = ReplaceWith("getdel(arg0).await()"))
suspend fun RedisAPI.getdelAwait(arg0: String): Response? {
  return awaitResult {
    this.getdel(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getex returning a future and chain with await()", replaceWith = ReplaceWith("getex(args).await()"))
suspend fun RedisAPI.getexAwait(args: List<String>): Response? {
  return awaitResult {
    this.getex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getrange]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getrange returning a future and chain with await()", replaceWith = ReplaceWith("getrange(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.getrangeAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.getrange(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.getset]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getset returning a future and chain with await()", replaceWith = ReplaceWith("getset(arg0, arg1).await()"))
suspend fun RedisAPI.getsetAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.getset(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hdel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hdel returning a future and chain with await()", replaceWith = ReplaceWith("hdel(args).await()"))
suspend fun RedisAPI.hdelAwait(args: List<String>): Response? {
  return awaitResult {
    this.hdel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hello]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hello returning a future and chain with await()", replaceWith = ReplaceWith("hello(args).await()"))
suspend fun RedisAPI.helloAwait(args: List<String>): Response? {
  return awaitResult {
    this.hello(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hexists]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hexists returning a future and chain with await()", replaceWith = ReplaceWith("hexists(arg0, arg1).await()"))
suspend fun RedisAPI.hexistsAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.hexists(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hget]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hget returning a future and chain with await()", replaceWith = ReplaceWith("hget(arg0, arg1).await()"))
suspend fun RedisAPI.hgetAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.hget(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hgetall]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hgetall returning a future and chain with await()", replaceWith = ReplaceWith("hgetall(arg0).await()"))
suspend fun RedisAPI.hgetallAwait(arg0: String): Response? {
  return awaitResult {
    this.hgetall(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hincrby]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hincrby returning a future and chain with await()", replaceWith = ReplaceWith("hincrby(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.hincrbyAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.hincrby(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hincrbyfloat]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hincrbyfloat returning a future and chain with await()", replaceWith = ReplaceWith("hincrbyfloat(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.hincrbyfloatAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.hincrbyfloat(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hkeys]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hkeys returning a future and chain with await()", replaceWith = ReplaceWith("hkeys(arg0).await()"))
suspend fun RedisAPI.hkeysAwait(arg0: String): Response? {
  return awaitResult {
    this.hkeys(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hlen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hlen returning a future and chain with await()", replaceWith = ReplaceWith("hlen(arg0).await()"))
suspend fun RedisAPI.hlenAwait(arg0: String): Response? {
  return awaitResult {
    this.hlen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hmget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hmget returning a future and chain with await()", replaceWith = ReplaceWith("hmget(args).await()"))
suspend fun RedisAPI.hmgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.hmget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hmset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hmset returning a future and chain with await()", replaceWith = ReplaceWith("hmset(args).await()"))
suspend fun RedisAPI.hmsetAwait(args: List<String>): Response? {
  return awaitResult {
    this.hmset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.host]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use host returning a future and chain with await()", replaceWith = ReplaceWith("host(args).await()"))
suspend fun RedisAPI.hostAwait(args: List<String>): Response? {
  return awaitResult {
    this.host(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hrandfield]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hrandfield returning a future and chain with await()", replaceWith = ReplaceWith("hrandfield(args).await()"))
suspend fun RedisAPI.hrandfieldAwait(args: List<String>): Response? {
  return awaitResult {
    this.hrandfield(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hscan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hscan returning a future and chain with await()", replaceWith = ReplaceWith("hscan(args).await()"))
suspend fun RedisAPI.hscanAwait(args: List<String>): Response? {
  return awaitResult {
    this.hscan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hset returning a future and chain with await()", replaceWith = ReplaceWith("hset(args).await()"))
suspend fun RedisAPI.hsetAwait(args: List<String>): Response? {
  return awaitResult {
    this.hset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hsetnx]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hsetnx returning a future and chain with await()", replaceWith = ReplaceWith("hsetnx(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.hsetnxAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.hsetnx(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hstrlen]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hstrlen returning a future and chain with await()", replaceWith = ReplaceWith("hstrlen(arg0, arg1).await()"))
suspend fun RedisAPI.hstrlenAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.hstrlen(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.hvals]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use hvals returning a future and chain with await()", replaceWith = ReplaceWith("hvals(arg0).await()"))
suspend fun RedisAPI.hvalsAwait(arg0: String): Response? {
  return awaitResult {
    this.hvals(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.incr]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use incr returning a future and chain with await()", replaceWith = ReplaceWith("incr(arg0).await()"))
suspend fun RedisAPI.incrAwait(arg0: String): Response? {
  return awaitResult {
    this.incr(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.incrby]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use incrby returning a future and chain with await()", replaceWith = ReplaceWith("incrby(arg0, arg1).await()"))
suspend fun RedisAPI.incrbyAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.incrby(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.incrbyfloat]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use incrbyfloat returning a future and chain with await()", replaceWith = ReplaceWith("incrbyfloat(arg0, arg1).await()"))
suspend fun RedisAPI.incrbyfloatAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.incrbyfloat(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.info]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use info returning a future and chain with await()", replaceWith = ReplaceWith("info(args).await()"))
suspend fun RedisAPI.infoAwait(args: List<String>): Response? {
  return awaitResult {
    this.info(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.keys]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use keys returning a future and chain with await()", replaceWith = ReplaceWith("keys(arg0).await()"))
suspend fun RedisAPI.keysAwait(arg0: String): Response? {
  return awaitResult {
    this.keys(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lastsave]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lastsave returning a future and chain with await()", replaceWith = ReplaceWith("lastsave().await()"))
suspend fun RedisAPI.lastsaveAwait(): Response? {
  return awaitResult {
    this.lastsave(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.latency]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use latency returning a future and chain with await()", replaceWith = ReplaceWith("latency(args).await()"))
suspend fun RedisAPI.latencyAwait(args: List<String>): Response? {
  return awaitResult {
    this.latency(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lindex]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lindex returning a future and chain with await()", replaceWith = ReplaceWith("lindex(arg0, arg1).await()"))
suspend fun RedisAPI.lindexAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.lindex(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.linsert]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @param arg3 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use linsert returning a future and chain with await()", replaceWith = ReplaceWith("linsert(arg0, arg1, arg2, arg3).await()"))
suspend fun RedisAPI.linsertAwait(arg0: String, arg1: String, arg2: String, arg3: String): Response? {
  return awaitResult {
    this.linsert(arg0, arg1, arg2, arg3, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.llen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use llen returning a future and chain with await()", replaceWith = ReplaceWith("llen(arg0).await()"))
suspend fun RedisAPI.llenAwait(arg0: String): Response? {
  return awaitResult {
    this.llen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lmove]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @param arg3 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lmove returning a future and chain with await()", replaceWith = ReplaceWith("lmove(arg0, arg1, arg2, arg3).await()"))
suspend fun RedisAPI.lmoveAwait(arg0: String, arg1: String, arg2: String, arg3: String): Response? {
  return awaitResult {
    this.lmove(arg0, arg1, arg2, arg3, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lolwut]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lolwut returning a future and chain with await()", replaceWith = ReplaceWith("lolwut(args).await()"))
suspend fun RedisAPI.lolwutAwait(args: List<String>): Response? {
  return awaitResult {
    this.lolwut(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lpop returning a future and chain with await()", replaceWith = ReplaceWith("lpop(args).await()"))
suspend fun RedisAPI.lpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.lpop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lpos]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lpos returning a future and chain with await()", replaceWith = ReplaceWith("lpos(args).await()"))
suspend fun RedisAPI.lposAwait(args: List<String>): Response? {
  return awaitResult {
    this.lpos(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lpush]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lpush returning a future and chain with await()", replaceWith = ReplaceWith("lpush(args).await()"))
suspend fun RedisAPI.lpushAwait(args: List<String>): Response? {
  return awaitResult {
    this.lpush(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lpushx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lpushx returning a future and chain with await()", replaceWith = ReplaceWith("lpushx(args).await()"))
suspend fun RedisAPI.lpushxAwait(args: List<String>): Response? {
  return awaitResult {
    this.lpushx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lrange]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lrange returning a future and chain with await()", replaceWith = ReplaceWith("lrange(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.lrangeAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.lrange(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lrem]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lrem returning a future and chain with await()", replaceWith = ReplaceWith("lrem(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.lremAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.lrem(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lset]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lset returning a future and chain with await()", replaceWith = ReplaceWith("lset(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.lsetAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.lset(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ltrim]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ltrim returning a future and chain with await()", replaceWith = ReplaceWith("ltrim(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.ltrimAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.ltrim(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.memory]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use memory returning a future and chain with await()", replaceWith = ReplaceWith("memory(args).await()"))
suspend fun RedisAPI.memoryAwait(args: List<String>): Response? {
  return awaitResult {
    this.memory(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.mget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use mget returning a future and chain with await()", replaceWith = ReplaceWith("mget(args).await()"))
suspend fun RedisAPI.mgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.mget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.migrate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use migrate returning a future and chain with await()", replaceWith = ReplaceWith("migrate(args).await()"))
suspend fun RedisAPI.migrateAwait(args: List<String>): Response? {
  return awaitResult {
    this.migrate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.module]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use module returning a future and chain with await()", replaceWith = ReplaceWith("module(args).await()"))
suspend fun RedisAPI.moduleAwait(args: List<String>): Response? {
  return awaitResult {
    this.module(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.monitor]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use monitor returning a future and chain with await()", replaceWith = ReplaceWith("monitor().await()"))
suspend fun RedisAPI.monitorAwait(): Response? {
  return awaitResult {
    this.monitor(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.move]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use move returning a future and chain with await()", replaceWith = ReplaceWith("move(arg0, arg1).await()"))
suspend fun RedisAPI.moveAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.move(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.mset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use mset returning a future and chain with await()", replaceWith = ReplaceWith("mset(args).await()"))
suspend fun RedisAPI.msetAwait(args: List<String>): Response? {
  return awaitResult {
    this.mset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.msetnx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use msetnx returning a future and chain with await()", replaceWith = ReplaceWith("msetnx(args).await()"))
suspend fun RedisAPI.msetnxAwait(args: List<String>): Response? {
  return awaitResult {
    this.msetnx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.multi]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use multi returning a future and chain with await()", replaceWith = ReplaceWith("multi().await()"))
suspend fun RedisAPI.multiAwait(): Response? {
  return awaitResult {
    this.multi(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.object]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use object returning a future and chain with await()", replaceWith = ReplaceWith("object(args).await()"))
suspend fun RedisAPI.objectAwait(args: List<String>): Response? {
  return awaitResult {
    this.`object`(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.persist]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use persist returning a future and chain with await()", replaceWith = ReplaceWith("persist(arg0).await()"))
suspend fun RedisAPI.persistAwait(arg0: String): Response? {
  return awaitResult {
    this.persist(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pexpire]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pexpire returning a future and chain with await()", replaceWith = ReplaceWith("pexpire(arg0, arg1).await()"))
suspend fun RedisAPI.pexpireAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.pexpire(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pexpireat]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pexpireat returning a future and chain with await()", replaceWith = ReplaceWith("pexpireat(arg0, arg1).await()"))
suspend fun RedisAPI.pexpireatAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.pexpireat(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pfadd returning a future and chain with await()", replaceWith = ReplaceWith("pfadd(args).await()"))
suspend fun RedisAPI.pfaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfcount]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pfcount returning a future and chain with await()", replaceWith = ReplaceWith("pfcount(args).await()"))
suspend fun RedisAPI.pfcountAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfcount(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfdebug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pfdebug returning a future and chain with await()", replaceWith = ReplaceWith("pfdebug(args).await()"))
suspend fun RedisAPI.pfdebugAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfdebug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfmerge]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pfmerge returning a future and chain with await()", replaceWith = ReplaceWith("pfmerge(args).await()"))
suspend fun RedisAPI.pfmergeAwait(args: List<String>): Response? {
  return awaitResult {
    this.pfmerge(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pfselftest]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pfselftest returning a future and chain with await()", replaceWith = ReplaceWith("pfselftest().await()"))
suspend fun RedisAPI.pfselftestAwait(): Response? {
  return awaitResult {
    this.pfselftest(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ping]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ping returning a future and chain with await()", replaceWith = ReplaceWith("ping(args).await()"))
suspend fun RedisAPI.pingAwait(args: List<String>): Response? {
  return awaitResult {
    this.ping(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.post]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use post returning a future and chain with await()", replaceWith = ReplaceWith("post(args).await()"))
suspend fun RedisAPI.postAwait(args: List<String>): Response? {
  return awaitResult {
    this.post(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.psetex]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use psetex returning a future and chain with await()", replaceWith = ReplaceWith("psetex(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.psetexAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.psetex(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.psubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use psubscribe returning a future and chain with await()", replaceWith = ReplaceWith("psubscribe(args).await()"))
suspend fun RedisAPI.psubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.psubscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.psync]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use psync returning a future and chain with await()", replaceWith = ReplaceWith("psync(args).await()"))
suspend fun RedisAPI.psyncAwait(args: List<String>): Response? {
  return awaitResult {
    this.psync(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pttl]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pttl returning a future and chain with await()", replaceWith = ReplaceWith("pttl(arg0).await()"))
suspend fun RedisAPI.pttlAwait(arg0: String): Response? {
  return awaitResult {
    this.pttl(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.publish]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use publish returning a future and chain with await()", replaceWith = ReplaceWith("publish(arg0, arg1).await()"))
suspend fun RedisAPI.publishAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.publish(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pubsub]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pubsub returning a future and chain with await()", replaceWith = ReplaceWith("pubsub(args).await()"))
suspend fun RedisAPI.pubsubAwait(args: List<String>): Response? {
  return awaitResult {
    this.pubsub(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.punsubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use punsubscribe returning a future and chain with await()", replaceWith = ReplaceWith("punsubscribe(args).await()"))
suspend fun RedisAPI.punsubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.punsubscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.randomkey]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use randomkey returning a future and chain with await()", replaceWith = ReplaceWith("randomkey().await()"))
suspend fun RedisAPI.randomkeyAwait(): Response? {
  return awaitResult {
    this.randomkey(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.readonly]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readonly returning a future and chain with await()", replaceWith = ReplaceWith("readonly().await()"))
suspend fun RedisAPI.readonlyAwait(): Response? {
  return awaitResult {
    this.readonly(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.readwrite]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readwrite returning a future and chain with await()", replaceWith = ReplaceWith("readwrite().await()"))
suspend fun RedisAPI.readwriteAwait(): Response? {
  return awaitResult {
    this.readwrite(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rename]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use rename returning a future and chain with await()", replaceWith = ReplaceWith("rename(arg0, arg1).await()"))
suspend fun RedisAPI.renameAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.rename(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.renamenx]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use renamenx returning a future and chain with await()", replaceWith = ReplaceWith("renamenx(arg0, arg1).await()"))
suspend fun RedisAPI.renamenxAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.renamenx(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.replconf]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use replconf returning a future and chain with await()", replaceWith = ReplaceWith("replconf(args).await()"))
suspend fun RedisAPI.replconfAwait(args: List<String>): Response? {
  return awaitResult {
    this.replconf(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.replicaof]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use replicaof returning a future and chain with await()", replaceWith = ReplaceWith("replicaof(arg0, arg1).await()"))
suspend fun RedisAPI.replicaofAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.replicaof(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.reset]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use reset returning a future and chain with await()", replaceWith = ReplaceWith("reset().await()"))
suspend fun RedisAPI.resetAwait(): Response? {
  return awaitResult {
    this.reset(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.restore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use restore returning a future and chain with await()", replaceWith = ReplaceWith("restore(args).await()"))
suspend fun RedisAPI.restoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.restore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.restoreAsking]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use restoreAsking returning a future and chain with await()", replaceWith = ReplaceWith("restoreAsking(args).await()"))
suspend fun RedisAPI.restoreAskingAwait(args: List<String>): Response? {
  return awaitResult {
    this.restoreAsking(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.role]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use role returning a future and chain with await()", replaceWith = ReplaceWith("role().await()"))
suspend fun RedisAPI.roleAwait(): Response? {
  return awaitResult {
    this.role(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use rpop returning a future and chain with await()", replaceWith = ReplaceWith("rpop(args).await()"))
suspend fun RedisAPI.rpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.rpop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpoplpush]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use rpoplpush returning a future and chain with await()", replaceWith = ReplaceWith("rpoplpush(arg0, arg1).await()"))
suspend fun RedisAPI.rpoplpushAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.rpoplpush(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpush]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use rpush returning a future and chain with await()", replaceWith = ReplaceWith("rpush(args).await()"))
suspend fun RedisAPI.rpushAwait(args: List<String>): Response? {
  return awaitResult {
    this.rpush(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.rpushx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use rpushx returning a future and chain with await()", replaceWith = ReplaceWith("rpushx(args).await()"))
suspend fun RedisAPI.rpushxAwait(args: List<String>): Response? {
  return awaitResult {
    this.rpushx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sadd returning a future and chain with await()", replaceWith = ReplaceWith("sadd(args).await()"))
suspend fun RedisAPI.saddAwait(args: List<String>): Response? {
  return awaitResult {
    this.sadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.save]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use save returning a future and chain with await()", replaceWith = ReplaceWith("save().await()"))
suspend fun RedisAPI.saveAwait(): Response? {
  return awaitResult {
    this.save(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.scan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use scan returning a future and chain with await()", replaceWith = ReplaceWith("scan(args).await()"))
suspend fun RedisAPI.scanAwait(args: List<String>): Response? {
  return awaitResult {
    this.scan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.scard]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use scard returning a future and chain with await()", replaceWith = ReplaceWith("scard(arg0).await()"))
suspend fun RedisAPI.scardAwait(arg0: String): Response? {
  return awaitResult {
    this.scard(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.script]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use script returning a future and chain with await()", replaceWith = ReplaceWith("script(args).await()"))
suspend fun RedisAPI.scriptAwait(args: List<String>): Response? {
  return awaitResult {
    this.script(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sdiff]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sdiff returning a future and chain with await()", replaceWith = ReplaceWith("sdiff(args).await()"))
suspend fun RedisAPI.sdiffAwait(args: List<String>): Response? {
  return awaitResult {
    this.sdiff(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sdiffstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sdiffstore returning a future and chain with await()", replaceWith = ReplaceWith("sdiffstore(args).await()"))
suspend fun RedisAPI.sdiffstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.sdiffstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.select]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use select returning a future and chain with await()", replaceWith = ReplaceWith("select(arg0).await()"))
suspend fun RedisAPI.selectAwait(arg0: String): Response? {
  return awaitResult {
    this.select(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.set]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use set returning a future and chain with await()", replaceWith = ReplaceWith("set(args).await()"))
suspend fun RedisAPI.setAwait(args: List<String>): Response? {
  return awaitResult {
    this.set(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setbit]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setbit returning a future and chain with await()", replaceWith = ReplaceWith("setbit(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.setbitAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.setbit(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setex]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setex returning a future and chain with await()", replaceWith = ReplaceWith("setex(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.setexAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.setex(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setnx]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setnx returning a future and chain with await()", replaceWith = ReplaceWith("setnx(arg0, arg1).await()"))
suspend fun RedisAPI.setnxAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.setnx(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.setrange]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use setrange returning a future and chain with await()", replaceWith = ReplaceWith("setrange(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.setrangeAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.setrange(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.shutdown]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use shutdown returning a future and chain with await()", replaceWith = ReplaceWith("shutdown(args).await()"))
suspend fun RedisAPI.shutdownAwait(args: List<String>): Response? {
  return awaitResult {
    this.shutdown(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sinter]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sinter returning a future and chain with await()", replaceWith = ReplaceWith("sinter(args).await()"))
suspend fun RedisAPI.sinterAwait(args: List<String>): Response? {
  return awaitResult {
    this.sinter(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sinterstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sinterstore returning a future and chain with await()", replaceWith = ReplaceWith("sinterstore(args).await()"))
suspend fun RedisAPI.sinterstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.sinterstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sismember]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sismember returning a future and chain with await()", replaceWith = ReplaceWith("sismember(arg0, arg1).await()"))
suspend fun RedisAPI.sismemberAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.sismember(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.slaveof]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use slaveof returning a future and chain with await()", replaceWith = ReplaceWith("slaveof(arg0, arg1).await()"))
suspend fun RedisAPI.slaveofAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.slaveof(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.slowlog]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use slowlog returning a future and chain with await()", replaceWith = ReplaceWith("slowlog(args).await()"))
suspend fun RedisAPI.slowlogAwait(args: List<String>): Response? {
  return awaitResult {
    this.slowlog(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.smembers]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use smembers returning a future and chain with await()", replaceWith = ReplaceWith("smembers(arg0).await()"))
suspend fun RedisAPI.smembersAwait(arg0: String): Response? {
  return awaitResult {
    this.smembers(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.smismember]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use smismember returning a future and chain with await()", replaceWith = ReplaceWith("smismember(args).await()"))
suspend fun RedisAPI.smismemberAwait(args: List<String>): Response? {
  return awaitResult {
    this.smismember(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.smove]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use smove returning a future and chain with await()", replaceWith = ReplaceWith("smove(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.smoveAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.smove(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sort]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sort returning a future and chain with await()", replaceWith = ReplaceWith("sort(args).await()"))
suspend fun RedisAPI.sortAwait(args: List<String>): Response? {
  return awaitResult {
    this.sort(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.spop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use spop returning a future and chain with await()", replaceWith = ReplaceWith("spop(args).await()"))
suspend fun RedisAPI.spopAwait(args: List<String>): Response? {
  return awaitResult {
    this.spop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.srandmember]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use srandmember returning a future and chain with await()", replaceWith = ReplaceWith("srandmember(args).await()"))
suspend fun RedisAPI.srandmemberAwait(args: List<String>): Response? {
  return awaitResult {
    this.srandmember(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.srem]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use srem returning a future and chain with await()", replaceWith = ReplaceWith("srem(args).await()"))
suspend fun RedisAPI.sremAwait(args: List<String>): Response? {
  return awaitResult {
    this.srem(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sscan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sscan returning a future and chain with await()", replaceWith = ReplaceWith("sscan(args).await()"))
suspend fun RedisAPI.sscanAwait(args: List<String>): Response? {
  return awaitResult {
    this.sscan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.stralgo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use stralgo returning a future and chain with await()", replaceWith = ReplaceWith("stralgo(args).await()"))
suspend fun RedisAPI.stralgoAwait(args: List<String>): Response? {
  return awaitResult {
    this.stralgo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.strlen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use strlen returning a future and chain with await()", replaceWith = ReplaceWith("strlen(arg0).await()"))
suspend fun RedisAPI.strlenAwait(arg0: String): Response? {
  return awaitResult {
    this.strlen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.subscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use subscribe returning a future and chain with await()", replaceWith = ReplaceWith("subscribe(args).await()"))
suspend fun RedisAPI.subscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.subscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.substr]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use substr returning a future and chain with await()", replaceWith = ReplaceWith("substr(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.substrAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.substr(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sunion]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sunion returning a future and chain with await()", replaceWith = ReplaceWith("sunion(args).await()"))
suspend fun RedisAPI.sunionAwait(args: List<String>): Response? {
  return awaitResult {
    this.sunion(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sunionstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sunionstore returning a future and chain with await()", replaceWith = ReplaceWith("sunionstore(args).await()"))
suspend fun RedisAPI.sunionstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.sunionstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.swapdb]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use swapdb returning a future and chain with await()", replaceWith = ReplaceWith("swapdb(arg0, arg1).await()"))
suspend fun RedisAPI.swapdbAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.swapdb(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sync]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sync returning a future and chain with await()", replaceWith = ReplaceWith("sync().await()"))
suspend fun RedisAPI.syncAwait(): Response? {
  return awaitResult {
    this.sync(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.time]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use time returning a future and chain with await()", replaceWith = ReplaceWith("time().await()"))
suspend fun RedisAPI.timeAwait(): Response? {
  return awaitResult {
    this.time(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.touch]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use touch returning a future and chain with await()", replaceWith = ReplaceWith("touch(args).await()"))
suspend fun RedisAPI.touchAwait(args: List<String>): Response? {
  return awaitResult {
    this.touch(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ttl]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ttl returning a future and chain with await()", replaceWith = ReplaceWith("ttl(arg0).await()"))
suspend fun RedisAPI.ttlAwait(arg0: String): Response? {
  return awaitResult {
    this.ttl(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.type]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use type returning a future and chain with await()", replaceWith = ReplaceWith("type(arg0).await()"))
suspend fun RedisAPI.typeAwait(arg0: String): Response? {
  return awaitResult {
    this.type(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.unlink]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use unlink returning a future and chain with await()", replaceWith = ReplaceWith("unlink(args).await()"))
suspend fun RedisAPI.unlinkAwait(args: List<String>): Response? {
  return awaitResult {
    this.unlink(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.unsubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use unsubscribe returning a future and chain with await()", replaceWith = ReplaceWith("unsubscribe(args).await()"))
suspend fun RedisAPI.unsubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.unsubscribe(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.unwatch]
 *
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use unwatch returning a future and chain with await()", replaceWith = ReplaceWith("unwatch().await()"))
suspend fun RedisAPI.unwatchAwait(): Response? {
  return awaitResult {
    this.unwatch(it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.wait]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use wait returning a future and chain with await()", replaceWith = ReplaceWith("wait(arg0, arg1).await()"))
suspend fun RedisAPI.waitAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.wait(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.watch]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use watch returning a future and chain with await()", replaceWith = ReplaceWith("watch(args).await()"))
suspend fun RedisAPI.watchAwait(args: List<String>): Response? {
  return awaitResult {
    this.watch(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xack]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xack returning a future and chain with await()", replaceWith = ReplaceWith("xack(args).await()"))
suspend fun RedisAPI.xackAwait(args: List<String>): Response? {
  return awaitResult {
    this.xack(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xadd returning a future and chain with await()", replaceWith = ReplaceWith("xadd(args).await()"))
suspend fun RedisAPI.xaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.xadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xautoclaim]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xautoclaim returning a future and chain with await()", replaceWith = ReplaceWith("xautoclaim(args).await()"))
suspend fun RedisAPI.xautoclaimAwait(args: List<String>): Response? {
  return awaitResult {
    this.xautoclaim(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xclaim]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xclaim returning a future and chain with await()", replaceWith = ReplaceWith("xclaim(args).await()"))
suspend fun RedisAPI.xclaimAwait(args: List<String>): Response? {
  return awaitResult {
    this.xclaim(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xdel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xdel returning a future and chain with await()", replaceWith = ReplaceWith("xdel(args).await()"))
suspend fun RedisAPI.xdelAwait(args: List<String>): Response? {
  return awaitResult {
    this.xdel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xgroup]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xgroup returning a future and chain with await()", replaceWith = ReplaceWith("xgroup(args).await()"))
suspend fun RedisAPI.xgroupAwait(args: List<String>): Response? {
  return awaitResult {
    this.xgroup(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xinfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xinfo returning a future and chain with await()", replaceWith = ReplaceWith("xinfo(args).await()"))
suspend fun RedisAPI.xinfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.xinfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xlen]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xlen returning a future and chain with await()", replaceWith = ReplaceWith("xlen(arg0).await()"))
suspend fun RedisAPI.xlenAwait(arg0: String): Response? {
  return awaitResult {
    this.xlen(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xpending]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xpending returning a future and chain with await()", replaceWith = ReplaceWith("xpending(args).await()"))
suspend fun RedisAPI.xpendingAwait(args: List<String>): Response? {
  return awaitResult {
    this.xpending(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xrange returning a future and chain with await()", replaceWith = ReplaceWith("xrange(args).await()"))
suspend fun RedisAPI.xrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.xrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xread]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xread returning a future and chain with await()", replaceWith = ReplaceWith("xread(args).await()"))
suspend fun RedisAPI.xreadAwait(args: List<String>): Response? {
  return awaitResult {
    this.xread(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xreadgroup]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xreadgroup returning a future and chain with await()", replaceWith = ReplaceWith("xreadgroup(args).await()"))
suspend fun RedisAPI.xreadgroupAwait(args: List<String>): Response? {
  return awaitResult {
    this.xreadgroup(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xrevrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xrevrange returning a future and chain with await()", replaceWith = ReplaceWith("xrevrange(args).await()"))
suspend fun RedisAPI.xrevrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.xrevrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xsetid]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xsetid returning a future and chain with await()", replaceWith = ReplaceWith("xsetid(arg0, arg1).await()"))
suspend fun RedisAPI.xsetidAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.xsetid(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.xtrim]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xtrim returning a future and chain with await()", replaceWith = ReplaceWith("xtrim(args).await()"))
suspend fun RedisAPI.xtrimAwait(args: List<String>): Response? {
  return awaitResult {
    this.xtrim(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zadd returning a future and chain with await()", replaceWith = ReplaceWith("zadd(args).await()"))
suspend fun RedisAPI.zaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.zadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zcard]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zcard returning a future and chain with await()", replaceWith = ReplaceWith("zcard(arg0).await()"))
suspend fun RedisAPI.zcardAwait(arg0: String): Response? {
  return awaitResult {
    this.zcard(arg0, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zcount]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zcount returning a future and chain with await()", replaceWith = ReplaceWith("zcount(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.zcountAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zcount(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zdiff]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zdiff returning a future and chain with await()", replaceWith = ReplaceWith("zdiff(args).await()"))
suspend fun RedisAPI.zdiffAwait(args: List<String>): Response? {
  return awaitResult {
    this.zdiff(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zdiffstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zdiffstore returning a future and chain with await()", replaceWith = ReplaceWith("zdiffstore(args).await()"))
suspend fun RedisAPI.zdiffstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zdiffstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zincrby]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zincrby returning a future and chain with await()", replaceWith = ReplaceWith("zincrby(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.zincrbyAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zincrby(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zinter]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zinter returning a future and chain with await()", replaceWith = ReplaceWith("zinter(args).await()"))
suspend fun RedisAPI.zinterAwait(args: List<String>): Response? {
  return awaitResult {
    this.zinter(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zinterstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zinterstore returning a future and chain with await()", replaceWith = ReplaceWith("zinterstore(args).await()"))
suspend fun RedisAPI.zinterstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zinterstore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zlexcount]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zlexcount returning a future and chain with await()", replaceWith = ReplaceWith("zlexcount(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.zlexcountAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zlexcount(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zmscore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zmscore returning a future and chain with await()", replaceWith = ReplaceWith("zmscore(args).await()"))
suspend fun RedisAPI.zmscoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zmscore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zpopmax]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zpopmax returning a future and chain with await()", replaceWith = ReplaceWith("zpopmax(args).await()"))
suspend fun RedisAPI.zpopmaxAwait(args: List<String>): Response? {
  return awaitResult {
    this.zpopmax(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zpopmin]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zpopmin returning a future and chain with await()", replaceWith = ReplaceWith("zpopmin(args).await()"))
suspend fun RedisAPI.zpopminAwait(args: List<String>): Response? {
  return awaitResult {
    this.zpopmin(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrandmember]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrandmember returning a future and chain with await()", replaceWith = ReplaceWith("zrandmember(args).await()"))
suspend fun RedisAPI.zrandmemberAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrandmember(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrange returning a future and chain with await()", replaceWith = ReplaceWith("zrange(args).await()"))
suspend fun RedisAPI.zrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrangebylex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrangebylex returning a future and chain with await()", replaceWith = ReplaceWith("zrangebylex(args).await()"))
suspend fun RedisAPI.zrangebylexAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrangebylex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrangebyscore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrangebyscore returning a future and chain with await()", replaceWith = ReplaceWith("zrangebyscore(args).await()"))
suspend fun RedisAPI.zrangebyscoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrangebyscore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrangestore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrangestore returning a future and chain with await()", replaceWith = ReplaceWith("zrangestore(args).await()"))
suspend fun RedisAPI.zrangestoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrangestore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrank]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrank returning a future and chain with await()", replaceWith = ReplaceWith("zrank(arg0, arg1).await()"))
suspend fun RedisAPI.zrankAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.zrank(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrem]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrem returning a future and chain with await()", replaceWith = ReplaceWith("zrem(args).await()"))
suspend fun RedisAPI.zremAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrem(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zremrangebylex]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zremrangebylex returning a future and chain with await()", replaceWith = ReplaceWith("zremrangebylex(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.zremrangebylexAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zremrangebylex(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zremrangebyrank]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zremrangebyrank returning a future and chain with await()", replaceWith = ReplaceWith("zremrangebyrank(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.zremrangebyrankAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zremrangebyrank(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zremrangebyscore]
 *
 * @param arg0 
 * @param arg1 
 * @param arg2 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zremrangebyscore returning a future and chain with await()", replaceWith = ReplaceWith("zremrangebyscore(arg0, arg1, arg2).await()"))
suspend fun RedisAPI.zremrangebyscoreAwait(arg0: String, arg1: String, arg2: String): Response? {
  return awaitResult {
    this.zremrangebyscore(arg0, arg1, arg2, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrevrange returning a future and chain with await()", replaceWith = ReplaceWith("zrevrange(args).await()"))
suspend fun RedisAPI.zrevrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrevrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrangebylex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrevrangebylex returning a future and chain with await()", replaceWith = ReplaceWith("zrevrangebylex(args).await()"))
suspend fun RedisAPI.zrevrangebylexAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrevrangebylex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrangebyscore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrevrangebyscore returning a future and chain with await()", replaceWith = ReplaceWith("zrevrangebyscore(args).await()"))
suspend fun RedisAPI.zrevrangebyscoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zrevrangebyscore(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zrevrank]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zrevrank returning a future and chain with await()", replaceWith = ReplaceWith("zrevrank(arg0, arg1).await()"))
suspend fun RedisAPI.zrevrankAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.zrevrank(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zscan]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zscan returning a future and chain with await()", replaceWith = ReplaceWith("zscan(args).await()"))
suspend fun RedisAPI.zscanAwait(args: List<String>): Response? {
  return awaitResult {
    this.zscan(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zscore]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zscore returning a future and chain with await()", replaceWith = ReplaceWith("zscore(arg0, arg1).await()"))
suspend fun RedisAPI.zscoreAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.zscore(arg0, arg1, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zunion]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zunion returning a future and chain with await()", replaceWith = ReplaceWith("zunion(args).await()"))
suspend fun RedisAPI.zunionAwait(args: List<String>): Response? {
  return awaitResult {
    this.zunion(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zunionstore]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zunionstore returning a future and chain with await()", replaceWith = ReplaceWith("zunionstore(args).await()"))
suspend fun RedisAPI.zunionstoreAwait(args: List<String>): Response? {
  return awaitResult {
    this.zunionstore(args, it)
  }
}

