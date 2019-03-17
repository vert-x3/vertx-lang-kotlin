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
 * Publishes a record.
 *
 * @param record the record
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServicePublisher original] using Vert.x codegen.
 */
suspend fun ServicePublisher.publishAwait(record : Record) : Record {
  return awaitResult{
    this.publish(record, it)
  }
}

/**
 * Un-publishes a record.
 *
 * @param id the registration id
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServicePublisher original] using Vert.x codegen.
 */
suspend fun ServicePublisher.unpublishAwait(id : String) : Unit {
  return awaitResult{
    this.unpublish(id, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Updates an existing record.
 *
 * @param record the record
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.spi.ServicePublisher original] using Vert.x codegen.
 */
suspend fun ServicePublisher.updateAwait(record : Record) : Record {
  return awaitResult{
    this.update(record, it)
  }
}

