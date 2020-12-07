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
package io.vertx.kotlin.pgclient.pubsub

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.pgclient.pubsub.PgSubscriber

/**
 * Suspending version of method [io.vertx.pgclient.pubsub.PgSubscriber.connect]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.pubsub.PgSubscriber] using Vert.x codegen.
 */
@Deprecated(message = "Instead use connect returning a future and chain with await()", replaceWith = ReplaceWith("connect().await()"))
suspend fun PgSubscriber.connectAwait(): Unit {
  return awaitResult {
    this.connect(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.pgclient.pubsub.PgSubscriber.close]
 *
 *
 * NOTE: This function has been automatically generated from [io.vertx.pgclient.pubsub.PgSubscriber] using Vert.x codegen.
 */
@Deprecated(message = "Instead use close returning a future and chain with await()", replaceWith = ReplaceWith("close().await()"))
suspend fun PgSubscriber.closeAwait(): Unit {
  return awaitResult {
    this.close(io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

