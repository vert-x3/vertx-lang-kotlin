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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAdd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAdd returning a future and chain with await()", replaceWith = ReplaceWith("ftAdd(args).await()"))
suspend fun RedisAPI.ftAddAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAdd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAggregate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAggregate returning a future and chain with await()", replaceWith = ReplaceWith("ftAggregate(args).await()"))
suspend fun RedisAPI.ftAggregateAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAggregate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAliasadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAliasadd returning a future and chain with await()", replaceWith = ReplaceWith("ftAliasadd(args).await()"))
suspend fun RedisAPI.ftAliasaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAliasadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAliasdel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAliasdel returning a future and chain with await()", replaceWith = ReplaceWith("ftAliasdel(args).await()"))
suspend fun RedisAPI.ftAliasdelAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAliasdel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAliasupdate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAliasupdate returning a future and chain with await()", replaceWith = ReplaceWith("ftAliasupdate(args).await()"))
suspend fun RedisAPI.ftAliasupdateAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAliasupdate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAlter]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAlter returning a future and chain with await()", replaceWith = ReplaceWith("ftAlter(args).await()"))
suspend fun RedisAPI.ftAlterAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAlter(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftConfig]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftConfig returning a future and chain with await()", replaceWith = ReplaceWith("ftConfig(args).await()"))
suspend fun RedisAPI.ftConfigAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftConfig(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftCreate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftCreate returning a future and chain with await()", replaceWith = ReplaceWith("ftCreate(args).await()"))
suspend fun RedisAPI.ftCreateAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftCreate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftCursor]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftCursor returning a future and chain with await()", replaceWith = ReplaceWith("ftCursor(args).await()"))
suspend fun RedisAPI.ftCursorAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftCursor(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDebug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDebug returning a future and chain with await()", replaceWith = ReplaceWith("ftDebug(args).await()"))
suspend fun RedisAPI.ftDebugAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDebug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDel returning a future and chain with await()", replaceWith = ReplaceWith("ftDel(args).await()"))
suspend fun RedisAPI.ftDelAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDictadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDictadd returning a future and chain with await()", replaceWith = ReplaceWith("ftDictadd(args).await()"))
suspend fun RedisAPI.ftDictaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDictadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDictdel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDictdel returning a future and chain with await()", replaceWith = ReplaceWith("ftDictdel(args).await()"))
suspend fun RedisAPI.ftDictdelAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDictdel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDictdump]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDictdump returning a future and chain with await()", replaceWith = ReplaceWith("ftDictdump(args).await()"))
suspend fun RedisAPI.ftDictdumpAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDictdump(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDrop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDrop returning a future and chain with await()", replaceWith = ReplaceWith("ftDrop(args).await()"))
suspend fun RedisAPI.ftDropAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDrop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDropindex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDropindex returning a future and chain with await()", replaceWith = ReplaceWith("ftDropindex(args).await()"))
suspend fun RedisAPI.ftDropindexAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDropindex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftExplain]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftExplain returning a future and chain with await()", replaceWith = ReplaceWith("ftExplain(args).await()"))
suspend fun RedisAPI.ftExplainAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftExplain(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftExplaincli]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftExplaincli returning a future and chain with await()", replaceWith = ReplaceWith("ftExplaincli(args).await()"))
suspend fun RedisAPI.ftExplaincliAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftExplaincli(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftGet]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftGet returning a future and chain with await()", replaceWith = ReplaceWith("ftGet(args).await()"))
suspend fun RedisAPI.ftGetAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftGet(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftInfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftInfo returning a future and chain with await()", replaceWith = ReplaceWith("ftInfo(args).await()"))
suspend fun RedisAPI.ftInfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftInfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftMget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftMget returning a future and chain with await()", replaceWith = ReplaceWith("ftMget(args).await()"))
suspend fun RedisAPI.ftMgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftMget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftProfile]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftProfile returning a future and chain with await()", replaceWith = ReplaceWith("ftProfile(args).await()"))
suspend fun RedisAPI.ftProfileAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftProfile(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSafeadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSafeadd returning a future and chain with await()", replaceWith = ReplaceWith("ftSafeadd(args).await()"))
suspend fun RedisAPI.ftSafeaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSafeadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSearch]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSearch returning a future and chain with await()", replaceWith = ReplaceWith("ftSearch(args).await()"))
suspend fun RedisAPI.ftSearchAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSearch(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSpellcheck]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSpellcheck returning a future and chain with await()", replaceWith = ReplaceWith("ftSpellcheck(args).await()"))
suspend fun RedisAPI.ftSpellcheckAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSpellcheck(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSugadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSugadd returning a future and chain with await()", replaceWith = ReplaceWith("ftSugadd(args).await()"))
suspend fun RedisAPI.ftSugaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSugadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSugdel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSugdel returning a future and chain with await()", replaceWith = ReplaceWith("ftSugdel(args).await()"))
suspend fun RedisAPI.ftSugdelAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSugdel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSugget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSugget returning a future and chain with await()", replaceWith = ReplaceWith("ftSugget(args).await()"))
suspend fun RedisAPI.ftSuggetAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSugget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSuglen]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSuglen returning a future and chain with await()", replaceWith = ReplaceWith("ftSuglen(args).await()"))
suspend fun RedisAPI.ftSuglenAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSuglen(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSynadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSynadd returning a future and chain with await()", replaceWith = ReplaceWith("ftSynadd(args).await()"))
suspend fun RedisAPI.ftSynaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSynadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSyndump]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSyndump returning a future and chain with await()", replaceWith = ReplaceWith("ftSyndump(args).await()"))
suspend fun RedisAPI.ftSyndumpAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSyndump(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftSynupdate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftSynupdate returning a future and chain with await()", replaceWith = ReplaceWith("ftSynupdate(args).await()"))
suspend fun RedisAPI.ftSynupdateAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftSynupdate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftTagvals]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftTagvals returning a future and chain with await()", replaceWith = ReplaceWith("ftTagvals(args).await()"))
suspend fun RedisAPI.ftTagvalsAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftTagvals(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAliasaddifnx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAliasaddifnx returning a future and chain with await()", replaceWith = ReplaceWith("ftAliasaddifnx(args).await()"))
suspend fun RedisAPI.ftAliasaddifnxAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAliasaddifnx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAliasdelifx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAliasdelifx returning a future and chain with await()", replaceWith = ReplaceWith("ftAliasdelifx(args).await()"))
suspend fun RedisAPI.ftAliasdelifxAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAliasdelifx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftAlterifnx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftAlterifnx returning a future and chain with await()", replaceWith = ReplaceWith("ftAlterifnx(args).await()"))
suspend fun RedisAPI.ftAlterifnxAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftAlterifnx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftCreateifnx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftCreateifnx returning a future and chain with await()", replaceWith = ReplaceWith("ftCreateifnx(args).await()"))
suspend fun RedisAPI.ftCreateifnxAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftCreateifnx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDropifx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDropifx returning a future and chain with await()", replaceWith = ReplaceWith("ftDropifx(args).await()"))
suspend fun RedisAPI.ftDropifxAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDropifx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftDropindexifx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftDropindexifx returning a future and chain with await()", replaceWith = ReplaceWith("ftDropindexifx(args).await()"))
suspend fun RedisAPI.ftDropindexifxAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftDropindexifx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ftList]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ftList returning a future and chain with await()", replaceWith = ReplaceWith("ftList(args).await()"))
suspend fun RedisAPI.ftListAwait(args: List<String>): Response? {
  return awaitResult {
    this.ftList(args, it)
  }
}

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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfAdd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfAdd returning a future and chain with await()", replaceWith = ReplaceWith("bfAdd(args).await()"))
suspend fun RedisAPI.bfAddAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfAdd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfCard]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfCard returning a future and chain with await()", replaceWith = ReplaceWith("bfCard(args).await()"))
suspend fun RedisAPI.bfCardAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfCard(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfDebug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfDebug returning a future and chain with await()", replaceWith = ReplaceWith("bfDebug(args).await()"))
suspend fun RedisAPI.bfDebugAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfDebug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfExists]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfExists returning a future and chain with await()", replaceWith = ReplaceWith("bfExists(args).await()"))
suspend fun RedisAPI.bfExistsAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfExists(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfInfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfInfo returning a future and chain with await()", replaceWith = ReplaceWith("bfInfo(args).await()"))
suspend fun RedisAPI.bfInfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfInfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfInsert]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfInsert returning a future and chain with await()", replaceWith = ReplaceWith("bfInsert(args).await()"))
suspend fun RedisAPI.bfInsertAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfInsert(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfLoadchunk]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfLoadchunk returning a future and chain with await()", replaceWith = ReplaceWith("bfLoadchunk(args).await()"))
suspend fun RedisAPI.bfLoadchunkAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfLoadchunk(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfMadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfMadd returning a future and chain with await()", replaceWith = ReplaceWith("bfMadd(args).await()"))
suspend fun RedisAPI.bfMaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfMadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfMexists]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfMexists returning a future and chain with await()", replaceWith = ReplaceWith("bfMexists(args).await()"))
suspend fun RedisAPI.bfMexistsAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfMexists(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfReserve]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfReserve returning a future and chain with await()", replaceWith = ReplaceWith("bfReserve(args).await()"))
suspend fun RedisAPI.bfReserveAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfReserve(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bfScandump]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bfScandump returning a future and chain with await()", replaceWith = ReplaceWith("bfScandump(args).await()"))
suspend fun RedisAPI.bfScandumpAwait(args: List<String>): Response? {
  return awaitResult {
    this.bfScandump(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.blmpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use blmpop returning a future and chain with await()", replaceWith = ReplaceWith("blmpop(args).await()"))
suspend fun RedisAPI.blmpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.blmpop(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.bzmpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use bzmpop returning a future and chain with await()", replaceWith = ReplaceWith("bzmpop(args).await()"))
suspend fun RedisAPI.bzmpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.bzmpop(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfAdd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfAdd returning a future and chain with await()", replaceWith = ReplaceWith("cfAdd(args).await()"))
suspend fun RedisAPI.cfAddAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfAdd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfAddnx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfAddnx returning a future and chain with await()", replaceWith = ReplaceWith("cfAddnx(args).await()"))
suspend fun RedisAPI.cfAddnxAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfAddnx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfCompact]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfCompact returning a future and chain with await()", replaceWith = ReplaceWith("cfCompact(args).await()"))
suspend fun RedisAPI.cfCompactAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfCompact(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfCount]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfCount returning a future and chain with await()", replaceWith = ReplaceWith("cfCount(args).await()"))
suspend fun RedisAPI.cfCountAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfCount(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfDebug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfDebug returning a future and chain with await()", replaceWith = ReplaceWith("cfDebug(args).await()"))
suspend fun RedisAPI.cfDebugAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfDebug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfDel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfDel returning a future and chain with await()", replaceWith = ReplaceWith("cfDel(args).await()"))
suspend fun RedisAPI.cfDelAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfDel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfExists]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfExists returning a future and chain with await()", replaceWith = ReplaceWith("cfExists(args).await()"))
suspend fun RedisAPI.cfExistsAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfExists(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfInfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfInfo returning a future and chain with await()", replaceWith = ReplaceWith("cfInfo(args).await()"))
suspend fun RedisAPI.cfInfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfInfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfInsert]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfInsert returning a future and chain with await()", replaceWith = ReplaceWith("cfInsert(args).await()"))
suspend fun RedisAPI.cfInsertAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfInsert(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfInsertnx]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfInsertnx returning a future and chain with await()", replaceWith = ReplaceWith("cfInsertnx(args).await()"))
suspend fun RedisAPI.cfInsertnxAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfInsertnx(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfLoadchunk]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfLoadchunk returning a future and chain with await()", replaceWith = ReplaceWith("cfLoadchunk(args).await()"))
suspend fun RedisAPI.cfLoadchunkAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfLoadchunk(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfMexists]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfMexists returning a future and chain with await()", replaceWith = ReplaceWith("cfMexists(args).await()"))
suspend fun RedisAPI.cfMexistsAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfMexists(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfReserve]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfReserve returning a future and chain with await()", replaceWith = ReplaceWith("cfReserve(args).await()"))
suspend fun RedisAPI.cfReserveAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfReserve(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cfScandump]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cfScandump returning a future and chain with await()", replaceWith = ReplaceWith("cfScandump(args).await()"))
suspend fun RedisAPI.cfScandumpAwait(args: List<String>): Response? {
  return awaitResult {
    this.cfScandump(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cmsIncrby]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cmsIncrby returning a future and chain with await()", replaceWith = ReplaceWith("cmsIncrby(args).await()"))
suspend fun RedisAPI.cmsIncrbyAwait(args: List<String>): Response? {
  return awaitResult {
    this.cmsIncrby(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cmsInfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cmsInfo returning a future and chain with await()", replaceWith = ReplaceWith("cmsInfo(args).await()"))
suspend fun RedisAPI.cmsInfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.cmsInfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cmsInitbydim]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cmsInitbydim returning a future and chain with await()", replaceWith = ReplaceWith("cmsInitbydim(args).await()"))
suspend fun RedisAPI.cmsInitbydimAwait(args: List<String>): Response? {
  return awaitResult {
    this.cmsInitbydim(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cmsInitbyprob]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cmsInitbyprob returning a future and chain with await()", replaceWith = ReplaceWith("cmsInitbyprob(args).await()"))
suspend fun RedisAPI.cmsInitbyprobAwait(args: List<String>): Response? {
  return awaitResult {
    this.cmsInitbyprob(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cmsMerge]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cmsMerge returning a future and chain with await()", replaceWith = ReplaceWith("cmsMerge(args).await()"))
suspend fun RedisAPI.cmsMergeAwait(args: List<String>): Response? {
  return awaitResult {
    this.cmsMerge(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.cmsQuery]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use cmsQuery returning a future and chain with await()", replaceWith = ReplaceWith("cmsQuery(args).await()"))
suspend fun RedisAPI.cmsQueryAwait(args: List<String>): Response? {
  return awaitResult {
    this.cmsQuery(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.evalRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use evalRo returning a future and chain with await()", replaceWith = ReplaceWith("evalRo(args).await()"))
suspend fun RedisAPI.evalRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.evalRo(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.evalshaRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use evalshaRo returning a future and chain with await()", replaceWith = ReplaceWith("evalshaRo(args).await()"))
suspend fun RedisAPI.evalshaRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.evalshaRo(args, it)
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
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use expire returning a future and chain with await()", replaceWith = ReplaceWith("expire(args).await()"))
suspend fun RedisAPI.expireAwait(args: List<String>): Response? {
  return awaitResult {
    this.expire(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.expireat]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use expireat returning a future and chain with await()", replaceWith = ReplaceWith("expireat(args).await()"))
suspend fun RedisAPI.expireatAwait(args: List<String>): Response? {
  return awaitResult {
    this.expireat(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.expiretime]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use expiretime returning a future and chain with await()", replaceWith = ReplaceWith("expiretime(arg0).await()"))
suspend fun RedisAPI.expiretimeAwait(arg0: String): Response? {
  return awaitResult {
    this.expiretime(arg0, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.fcall]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fcall returning a future and chain with await()", replaceWith = ReplaceWith("fcall(args).await()"))
suspend fun RedisAPI.fcallAwait(args: List<String>): Response? {
  return awaitResult {
    this.fcall(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.fcallRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fcallRo returning a future and chain with await()", replaceWith = ReplaceWith("fcallRo(args).await()"))
suspend fun RedisAPI.fcallRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.fcallRo(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.function]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use function returning a future and chain with await()", replaceWith = ReplaceWith("function(args).await()"))
suspend fun RedisAPI.functionAwait(args: List<String>): Response? {
  return awaitResult {
    this.function(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphBulk]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphBulk returning a future and chain with await()", replaceWith = ReplaceWith("graphBulk(args).await()"))
suspend fun RedisAPI.graphBulkAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphBulk(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphConfig]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphConfig returning a future and chain with await()", replaceWith = ReplaceWith("graphConfig(args).await()"))
suspend fun RedisAPI.graphConfigAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphConfig(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphDebug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphDebug returning a future and chain with await()", replaceWith = ReplaceWith("graphDebug(args).await()"))
suspend fun RedisAPI.graphDebugAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphDebug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphDelete]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphDelete returning a future and chain with await()", replaceWith = ReplaceWith("graphDelete(args).await()"))
suspend fun RedisAPI.graphDeleteAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphDelete(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphExplain]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphExplain returning a future and chain with await()", replaceWith = ReplaceWith("graphExplain(args).await()"))
suspend fun RedisAPI.graphExplainAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphExplain(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphList]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphList returning a future and chain with await()", replaceWith = ReplaceWith("graphList(args).await()"))
suspend fun RedisAPI.graphListAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphList(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphProfile]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphProfile returning a future and chain with await()", replaceWith = ReplaceWith("graphProfile(args).await()"))
suspend fun RedisAPI.graphProfileAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphProfile(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphQuery]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphQuery returning a future and chain with await()", replaceWith = ReplaceWith("graphQuery(args).await()"))
suspend fun RedisAPI.graphQueryAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphQuery(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphRoQuery]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphRoQuery returning a future and chain with await()", replaceWith = ReplaceWith("graphRoQuery(args).await()"))
suspend fun RedisAPI.graphRoQueryAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphRoQuery(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.graphSlowlog]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use graphSlowlog returning a future and chain with await()", replaceWith = ReplaceWith("graphSlowlog(args).await()"))
suspend fun RedisAPI.graphSlowlogAwait(args: List<String>): Response? {
  return awaitResult {
    this.graphSlowlog(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonArrappend]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonArrappend returning a future and chain with await()", replaceWith = ReplaceWith("jsonArrappend(args).await()"))
suspend fun RedisAPI.jsonArrappendAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonArrappend(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonArrindex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonArrindex returning a future and chain with await()", replaceWith = ReplaceWith("jsonArrindex(args).await()"))
suspend fun RedisAPI.jsonArrindexAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonArrindex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonArrinsert]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonArrinsert returning a future and chain with await()", replaceWith = ReplaceWith("jsonArrinsert(args).await()"))
suspend fun RedisAPI.jsonArrinsertAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonArrinsert(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonArrlen]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonArrlen returning a future and chain with await()", replaceWith = ReplaceWith("jsonArrlen(args).await()"))
suspend fun RedisAPI.jsonArrlenAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonArrlen(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonArrpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonArrpop returning a future and chain with await()", replaceWith = ReplaceWith("jsonArrpop(args).await()"))
suspend fun RedisAPI.jsonArrpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonArrpop(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonArrtrim]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonArrtrim returning a future and chain with await()", replaceWith = ReplaceWith("jsonArrtrim(args).await()"))
suspend fun RedisAPI.jsonArrtrimAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonArrtrim(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonClear]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonClear returning a future and chain with await()", replaceWith = ReplaceWith("jsonClear(args).await()"))
suspend fun RedisAPI.jsonClearAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonClear(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonDebug]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonDebug returning a future and chain with await()", replaceWith = ReplaceWith("jsonDebug(args).await()"))
suspend fun RedisAPI.jsonDebugAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonDebug(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonDel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonDel returning a future and chain with await()", replaceWith = ReplaceWith("jsonDel(args).await()"))
suspend fun RedisAPI.jsonDelAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonDel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonForget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonForget returning a future and chain with await()", replaceWith = ReplaceWith("jsonForget(args).await()"))
suspend fun RedisAPI.jsonForgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonForget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonGet]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonGet returning a future and chain with await()", replaceWith = ReplaceWith("jsonGet(args).await()"))
suspend fun RedisAPI.jsonGetAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonGet(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonMget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonMget returning a future and chain with await()", replaceWith = ReplaceWith("jsonMget(args).await()"))
suspend fun RedisAPI.jsonMgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonMget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonNumincrby]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonNumincrby returning a future and chain with await()", replaceWith = ReplaceWith("jsonNumincrby(args).await()"))
suspend fun RedisAPI.jsonNumincrbyAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonNumincrby(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonNummultby]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonNummultby returning a future and chain with await()", replaceWith = ReplaceWith("jsonNummultby(args).await()"))
suspend fun RedisAPI.jsonNummultbyAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonNummultby(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonNumpowby]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonNumpowby returning a future and chain with await()", replaceWith = ReplaceWith("jsonNumpowby(args).await()"))
suspend fun RedisAPI.jsonNumpowbyAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonNumpowby(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonObjkeys]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonObjkeys returning a future and chain with await()", replaceWith = ReplaceWith("jsonObjkeys(args).await()"))
suspend fun RedisAPI.jsonObjkeysAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonObjkeys(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonObjlen]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonObjlen returning a future and chain with await()", replaceWith = ReplaceWith("jsonObjlen(args).await()"))
suspend fun RedisAPI.jsonObjlenAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonObjlen(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonResp]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonResp returning a future and chain with await()", replaceWith = ReplaceWith("jsonResp(args).await()"))
suspend fun RedisAPI.jsonRespAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonResp(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonSet]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonSet returning a future and chain with await()", replaceWith = ReplaceWith("jsonSet(args).await()"))
suspend fun RedisAPI.jsonSetAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonSet(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonStrappend]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonStrappend returning a future and chain with await()", replaceWith = ReplaceWith("jsonStrappend(args).await()"))
suspend fun RedisAPI.jsonStrappendAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonStrappend(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonStrlen]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonStrlen returning a future and chain with await()", replaceWith = ReplaceWith("jsonStrlen(args).await()"))
suspend fun RedisAPI.jsonStrlenAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonStrlen(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonToggle]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonToggle returning a future and chain with await()", replaceWith = ReplaceWith("jsonToggle(args).await()"))
suspend fun RedisAPI.jsonToggleAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonToggle(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.jsonType]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use jsonType returning a future and chain with await()", replaceWith = ReplaceWith("jsonType(args).await()"))
suspend fun RedisAPI.jsonTypeAwait(args: List<String>): Response? {
  return awaitResult {
    this.jsonType(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lcs]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lcs returning a future and chain with await()", replaceWith = ReplaceWith("lcs(args).await()"))
suspend fun RedisAPI.lcsAwait(args: List<String>): Response? {
  return awaitResult {
    this.lcs(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.lmpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lmpop returning a future and chain with await()", replaceWith = ReplaceWith("lmpop(args).await()"))
suspend fun RedisAPI.lmpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.lmpop(args, it)
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
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pexpire returning a future and chain with await()", replaceWith = ReplaceWith("pexpire(args).await()"))
suspend fun RedisAPI.pexpireAwait(args: List<String>): Response? {
  return awaitResult {
    this.pexpire(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pexpireat]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pexpireat returning a future and chain with await()", replaceWith = ReplaceWith("pexpireat(args).await()"))
suspend fun RedisAPI.pexpireatAwait(args: List<String>): Response? {
  return awaitResult {
    this.pexpireat(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.pexpiretime]
 *
 * @param arg0 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pexpiretime returning a future and chain with await()", replaceWith = ReplaceWith("pexpiretime(arg0).await()"))
suspend fun RedisAPI.pexpiretimeAwait(arg0: String): Response? {
  return awaitResult {
    this.pexpiretime(arg0, it)
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
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use pfdebug returning a future and chain with await()", replaceWith = ReplaceWith("pfdebug(arg0, arg1).await()"))
suspend fun RedisAPI.pfdebugAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.pfdebug(arg0, arg1, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.quit]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use quit returning a future and chain with await()", replaceWith = ReplaceWith("quit(args).await()"))
suspend fun RedisAPI.quitAwait(args: List<String>): Response? {
  return awaitResult {
    this.quit(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sintercard]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sintercard returning a future and chain with await()", replaceWith = ReplaceWith("sintercard(args).await()"))
suspend fun RedisAPI.sintercardAwait(args: List<String>): Response? {
  return awaitResult {
    this.sintercard(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sortRo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sortRo returning a future and chain with await()", replaceWith = ReplaceWith("sortRo(args).await()"))
suspend fun RedisAPI.sortRoAwait(args: List<String>): Response? {
  return awaitResult {
    this.sortRo(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.spublish]
 *
 * @param arg0 
 * @param arg1 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use spublish returning a future and chain with await()", replaceWith = ReplaceWith("spublish(arg0, arg1).await()"))
suspend fun RedisAPI.spublishAwait(arg0: String, arg1: String): Response? {
  return awaitResult {
    this.spublish(arg0, arg1, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.ssubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use ssubscribe returning a future and chain with await()", replaceWith = ReplaceWith("ssubscribe(args).await()"))
suspend fun RedisAPI.ssubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.ssubscribe(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.sunsubscribe]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use sunsubscribe returning a future and chain with await()", replaceWith = ReplaceWith("sunsubscribe(args).await()"))
suspend fun RedisAPI.sunsubscribeAwait(args: List<String>): Response? {
  return awaitResult {
    this.sunsubscribe(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestAdd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestAdd returning a future and chain with await()", replaceWith = ReplaceWith("tdigestAdd(args).await()"))
suspend fun RedisAPI.tdigestAddAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestAdd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestByrank]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestByrank returning a future and chain with await()", replaceWith = ReplaceWith("tdigestByrank(args).await()"))
suspend fun RedisAPI.tdigestByrankAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestByrank(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestByrevrank]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestByrevrank returning a future and chain with await()", replaceWith = ReplaceWith("tdigestByrevrank(args).await()"))
suspend fun RedisAPI.tdigestByrevrankAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestByrevrank(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestCdf]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestCdf returning a future and chain with await()", replaceWith = ReplaceWith("tdigestCdf(args).await()"))
suspend fun RedisAPI.tdigestCdfAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestCdf(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestCreate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestCreate returning a future and chain with await()", replaceWith = ReplaceWith("tdigestCreate(args).await()"))
suspend fun RedisAPI.tdigestCreateAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestCreate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestInfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestInfo returning a future and chain with await()", replaceWith = ReplaceWith("tdigestInfo(args).await()"))
suspend fun RedisAPI.tdigestInfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestInfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestMax]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestMax returning a future and chain with await()", replaceWith = ReplaceWith("tdigestMax(args).await()"))
suspend fun RedisAPI.tdigestMaxAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestMax(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestMerge]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestMerge returning a future and chain with await()", replaceWith = ReplaceWith("tdigestMerge(args).await()"))
suspend fun RedisAPI.tdigestMergeAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestMerge(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestMin]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestMin returning a future and chain with await()", replaceWith = ReplaceWith("tdigestMin(args).await()"))
suspend fun RedisAPI.tdigestMinAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestMin(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestQuantile]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestQuantile returning a future and chain with await()", replaceWith = ReplaceWith("tdigestQuantile(args).await()"))
suspend fun RedisAPI.tdigestQuantileAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestQuantile(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestRank]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestRank returning a future and chain with await()", replaceWith = ReplaceWith("tdigestRank(args).await()"))
suspend fun RedisAPI.tdigestRankAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestRank(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestReset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestReset returning a future and chain with await()", replaceWith = ReplaceWith("tdigestReset(args).await()"))
suspend fun RedisAPI.tdigestResetAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestReset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestRevrank]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestRevrank returning a future and chain with await()", replaceWith = ReplaceWith("tdigestRevrank(args).await()"))
suspend fun RedisAPI.tdigestRevrankAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestRevrank(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tdigestTrimmedMean]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tdigestTrimmedMean returning a future and chain with await()", replaceWith = ReplaceWith("tdigestTrimmedMean(args).await()"))
suspend fun RedisAPI.tdigestTrimmedMeanAwait(args: List<String>): Response? {
  return awaitResult {
    this.tdigestTrimmedMean(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.timeseriesClusterset]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use timeseriesClusterset returning a future and chain with await()", replaceWith = ReplaceWith("timeseriesClusterset(args).await()"))
suspend fun RedisAPI.timeseriesClustersetAwait(args: List<String>): Response? {
  return awaitResult {
    this.timeseriesClusterset(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.timeseriesClustersetfromshard]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use timeseriesClustersetfromshard returning a future and chain with await()", replaceWith = ReplaceWith("timeseriesClustersetfromshard(args).await()"))
suspend fun RedisAPI.timeseriesClustersetfromshardAwait(args: List<String>): Response? {
  return awaitResult {
    this.timeseriesClustersetfromshard(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.timeseriesHello]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use timeseriesHello returning a future and chain with await()", replaceWith = ReplaceWith("timeseriesHello(args).await()"))
suspend fun RedisAPI.timeseriesHelloAwait(args: List<String>): Response? {
  return awaitResult {
    this.timeseriesHello(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.timeseriesInfocluster]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use timeseriesInfocluster returning a future and chain with await()", replaceWith = ReplaceWith("timeseriesInfocluster(args).await()"))
suspend fun RedisAPI.timeseriesInfoclusterAwait(args: List<String>): Response? {
  return awaitResult {
    this.timeseriesInfocluster(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.timeseriesInnercommunication]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use timeseriesInnercommunication returning a future and chain with await()", replaceWith = ReplaceWith("timeseriesInnercommunication(args).await()"))
suspend fun RedisAPI.timeseriesInnercommunicationAwait(args: List<String>): Response? {
  return awaitResult {
    this.timeseriesInnercommunication(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.timeseriesNetworktest]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use timeseriesNetworktest returning a future and chain with await()", replaceWith = ReplaceWith("timeseriesNetworktest(args).await()"))
suspend fun RedisAPI.timeseriesNetworktestAwait(args: List<String>): Response? {
  return awaitResult {
    this.timeseriesNetworktest(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.timeseriesRefreshcluster]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use timeseriesRefreshcluster returning a future and chain with await()", replaceWith = ReplaceWith("timeseriesRefreshcluster(args).await()"))
suspend fun RedisAPI.timeseriesRefreshclusterAwait(args: List<String>): Response? {
  return awaitResult {
    this.timeseriesRefreshcluster(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.topkAdd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use topkAdd returning a future and chain with await()", replaceWith = ReplaceWith("topkAdd(args).await()"))
suspend fun RedisAPI.topkAddAwait(args: List<String>): Response? {
  return awaitResult {
    this.topkAdd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.topkCount]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use topkCount returning a future and chain with await()", replaceWith = ReplaceWith("topkCount(args).await()"))
suspend fun RedisAPI.topkCountAwait(args: List<String>): Response? {
  return awaitResult {
    this.topkCount(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.topkIncrby]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use topkIncrby returning a future and chain with await()", replaceWith = ReplaceWith("topkIncrby(args).await()"))
suspend fun RedisAPI.topkIncrbyAwait(args: List<String>): Response? {
  return awaitResult {
    this.topkIncrby(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.topkInfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use topkInfo returning a future and chain with await()", replaceWith = ReplaceWith("topkInfo(args).await()"))
suspend fun RedisAPI.topkInfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.topkInfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.topkList]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use topkList returning a future and chain with await()", replaceWith = ReplaceWith("topkList(args).await()"))
suspend fun RedisAPI.topkListAwait(args: List<String>): Response? {
  return awaitResult {
    this.topkList(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.topkQuery]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use topkQuery returning a future and chain with await()", replaceWith = ReplaceWith("topkQuery(args).await()"))
suspend fun RedisAPI.topkQueryAwait(args: List<String>): Response? {
  return awaitResult {
    this.topkQuery(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.topkReserve]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use topkReserve returning a future and chain with await()", replaceWith = ReplaceWith("topkReserve(args).await()"))
suspend fun RedisAPI.topkReserveAwait(args: List<String>): Response? {
  return awaitResult {
    this.topkReserve(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsAdd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsAdd returning a future and chain with await()", replaceWith = ReplaceWith("tsAdd(args).await()"))
suspend fun RedisAPI.tsAddAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsAdd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsAlter]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsAlter returning a future and chain with await()", replaceWith = ReplaceWith("tsAlter(args).await()"))
suspend fun RedisAPI.tsAlterAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsAlter(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsCreate]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsCreate returning a future and chain with await()", replaceWith = ReplaceWith("tsCreate(args).await()"))
suspend fun RedisAPI.tsCreateAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsCreate(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsCreaterule]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsCreaterule returning a future and chain with await()", replaceWith = ReplaceWith("tsCreaterule(args).await()"))
suspend fun RedisAPI.tsCreateruleAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsCreaterule(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsDecrby]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsDecrby returning a future and chain with await()", replaceWith = ReplaceWith("tsDecrby(args).await()"))
suspend fun RedisAPI.tsDecrbyAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsDecrby(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsDel]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsDel returning a future and chain with await()", replaceWith = ReplaceWith("tsDel(args).await()"))
suspend fun RedisAPI.tsDelAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsDel(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsDeleterule]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsDeleterule returning a future and chain with await()", replaceWith = ReplaceWith("tsDeleterule(args).await()"))
suspend fun RedisAPI.tsDeleteruleAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsDeleterule(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsGet]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsGet returning a future and chain with await()", replaceWith = ReplaceWith("tsGet(args).await()"))
suspend fun RedisAPI.tsGetAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsGet(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsIncrby]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsIncrby returning a future and chain with await()", replaceWith = ReplaceWith("tsIncrby(args).await()"))
suspend fun RedisAPI.tsIncrbyAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsIncrby(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsInfo]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsInfo returning a future and chain with await()", replaceWith = ReplaceWith("tsInfo(args).await()"))
suspend fun RedisAPI.tsInfoAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsInfo(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsMadd]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsMadd returning a future and chain with await()", replaceWith = ReplaceWith("tsMadd(args).await()"))
suspend fun RedisAPI.tsMaddAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsMadd(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsMget]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsMget returning a future and chain with await()", replaceWith = ReplaceWith("tsMget(args).await()"))
suspend fun RedisAPI.tsMgetAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsMget(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsMrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsMrange returning a future and chain with await()", replaceWith = ReplaceWith("tsMrange(args).await()"))
suspend fun RedisAPI.tsMrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsMrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsMrevrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsMrevrange returning a future and chain with await()", replaceWith = ReplaceWith("tsMrevrange(args).await()"))
suspend fun RedisAPI.tsMrevrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsMrevrange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsQueryindex]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsQueryindex returning a future and chain with await()", replaceWith = ReplaceWith("tsQueryindex(args).await()"))
suspend fun RedisAPI.tsQueryindexAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsQueryindex(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsRange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsRange returning a future and chain with await()", replaceWith = ReplaceWith("tsRange(args).await()"))
suspend fun RedisAPI.tsRangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsRange(args, it)
  }
}

/**
 * Suspending version of method [io.vertx.redis.client.RedisAPI.tsRevrange]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use tsRevrange returning a future and chain with await()", replaceWith = ReplaceWith("tsRevrange(args).await()"))
suspend fun RedisAPI.tsRevrangeAwait(args: List<String>): Response? {
  return awaitResult {
    this.tsRevrange(args, it)
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
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use xsetid returning a future and chain with await()", replaceWith = ReplaceWith("xsetid(args).await()"))
suspend fun RedisAPI.xsetidAwait(args: List<String>): Response? {
  return awaitResult {
    this.xsetid(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zintercard]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zintercard returning a future and chain with await()", replaceWith = ReplaceWith("zintercard(args).await()"))
suspend fun RedisAPI.zintercardAwait(args: List<String>): Response? {
  return awaitResult {
    this.zintercard(args, it)
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
 * Suspending version of method [io.vertx.redis.client.RedisAPI.zmpop]
 *
 * @param args 
 * @return [Response?]
 *
 * NOTE: This function has been automatically generated from [io.vertx.redis.client.RedisAPI] using Vert.x codegen.
 */
@Deprecated(message = "Instead use zmpop returning a future and chain with await()", replaceWith = ReplaceWith("zmpop(args).await()"))
suspend fun RedisAPI.zmpopAwait(args: List<String>): Response? {
  return awaitResult {
    this.zmpop(args, it)
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

