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
package io.vertx.kotlin.core.file

import io.vertx.core.file.AsyncFileLock
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.file.AsyncFileLock.isValid]
 *
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFileLock] using Vert.x codegen.
 */
@Deprecated(message = "Instead use isValid returning a future and chain with coAwait()", replaceWith = ReplaceWith("isValid().coAwait()"))
suspend fun AsyncFileLock.isValidAwait(): Boolean {
  return awaitResult {
    this.isValid(it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.AsyncFileLock.release]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.AsyncFileLock] using Vert.x codegen.
 */
@Deprecated(message = "Instead use release returning a future and chain with coAwait()", replaceWith = ReplaceWith("release().coAwait()"))
suspend fun AsyncFileLock.releaseAwait(): Unit {
  return awaitResult {
    this.release(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

