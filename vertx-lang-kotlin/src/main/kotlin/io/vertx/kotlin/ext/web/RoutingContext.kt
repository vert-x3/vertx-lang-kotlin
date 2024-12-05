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
package io.vertx.kotlin.ext.web

import io.vertx.core.buffer.Buffer
import io.vertx.ext.web.RoutingContext
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.RoutingContext.redirect]
 *
 * @param url 
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.RoutingContext] using Vert.x codegen.
 */
@Deprecated(message = "Instead use redirect returning a future and chain with coAwait()", replaceWith = ReplaceWith("redirect(url).coAwait()"))
suspend fun RoutingContext.redirectAwait(url: String): Unit {
  return awaitResult {
    this.redirect(url, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.RoutingContext.json]
 *
 * @param json 
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.RoutingContext] using Vert.x codegen.
 */
@Deprecated(message = "Instead use json returning a future and chain with coAwait()", replaceWith = ReplaceWith("json(json).coAwait()"))
suspend fun RoutingContext.jsonAwait(json: Any): Unit {
  return awaitResult {
    this.json(json, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.RoutingContext.end]
 *
 * @param chunk 
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.RoutingContext] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with coAwait()", replaceWith = ReplaceWith("end(chunk).coAwait()"))
suspend fun RoutingContext.endAwait(chunk: String): Unit {
  return awaitResult {
    this.end(chunk, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.RoutingContext.end]
 *
 * @param buffer 
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.RoutingContext] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with coAwait()", replaceWith = ReplaceWith("end(buffer).coAwait()"))
suspend fun RoutingContext.endAwait(buffer: Buffer): Unit {
  return awaitResult {
    this.end(buffer, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.web.RoutingContext.end]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.RoutingContext] using Vert.x codegen.
 */
@Deprecated(message = "Instead use end returning a future and chain with coAwait()", replaceWith = ReplaceWith("end().coAwait()"))
suspend fun RoutingContext.endAwait(): Unit {
  return awaitResult {
    this.end(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

