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
package io.vertx.kotlin.ext.sql

import io.vertx.core.json.JsonArray
import io.vertx.core.streams.WriteStream
import io.vertx.ext.sql.SQLRowStream
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.sql.SQLRowStream.pipeTo]
 *
 * @param dst the destination write stream
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLRowStream] using Vert.x codegen.
 */
suspend fun SQLRowStream.pipeToAwait(dst: WriteStream<JsonArray>): Unit {
  return awaitResult {
    this.pipeTo(dst) { ar -> it.handle(ar.mapEmpty()) }
  }
}

/**
 * Suspending version of method [io.vertx.ext.sql.SQLRowStream.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.sql.SQLRowStream] using Vert.x codegen.
 */
suspend fun SQLRowStream.closeAwait(): Unit {
  return awaitResult {
    this.close { ar -> it.handle(ar.mapEmpty()) }
  }
}

