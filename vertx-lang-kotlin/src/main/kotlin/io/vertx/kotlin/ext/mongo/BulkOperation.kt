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
package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.BulkOperation
import io.vertx.ext.mongo.BulkOperationType

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.BulkOperation] objects.
 *
 * Contains all data needed for one operation of a bulk write operation.
 *
 * @param document  Sets the document, used by insert, replace, and update operations
 * @param filter  Sets the filter document, used by replace, update, and delete operations
 * @param multi  Sets the multi flag, used by update and delete operations
 * @param type  Sets the operation type
 * @param upsert  Sets the upsert flag, used by update and replace operations
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.BulkOperation original] using Vert.x codegen.
 */
fun bulkOperationOf(
  document: io.vertx.core.json.JsonObject? = null,
  filter: io.vertx.core.json.JsonObject? = null,
  multi: Boolean? = null,
  type: BulkOperationType? = null,
  upsert: Boolean? = null): BulkOperation = io.vertx.ext.mongo.BulkOperation(io.vertx.core.json.JsonObject()).apply {

  if (document != null) {
    this.setDocument(document)
  }
  if (filter != null) {
    this.setFilter(filter)
  }
  if (multi != null) {
    this.setMulti(multi)
  }
  if (type != null) {
    this.setType(type)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
}

