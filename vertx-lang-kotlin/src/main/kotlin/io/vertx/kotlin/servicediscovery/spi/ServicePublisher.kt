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
package io.vertx.kotlin.servicediscovery.spi

import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.spi.ServicePublisher

/**
 * Suspending version of method [io.vertx.servicediscovery.spi.ServicePublisher.publish]
 *
 * @param record the record
 * @return [Record]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.spi.ServicePublisher] using Vert.x codegen.
 */
@Deprecated(message = "Instead use publish returning a future that can yield a result ", replaceWith = ReplaceWith("publish(record).await()"))
suspend fun ServicePublisher.publishAwait(record: Record): Record {
  return awaitResult {
    this.publish(record, it)
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.spi.ServicePublisher.unpublish]
 *
 * @param id the registration id
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.spi.ServicePublisher] using Vert.x codegen.
 */
@Deprecated(message = "Instead use unpublish returning a future that can yield a result ", replaceWith = ReplaceWith("unpublish(id).await()"))
suspend fun ServicePublisher.unpublishAwait(id: String): Unit {
  return awaitResult {
    this.unpublish(id, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.servicediscovery.spi.ServicePublisher.update]
 *
 * @param record the record
 * @return [Record]
 *
 * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.spi.ServicePublisher] using Vert.x codegen.
 */
@Deprecated(message = "Instead use update returning a future that can yield a result ", replaceWith = ReplaceWith("update(record).await()"))
suspend fun ServicePublisher.updateAwait(record: Record): Record {
  return awaitResult {
    this.update(record, it)
  }
}

