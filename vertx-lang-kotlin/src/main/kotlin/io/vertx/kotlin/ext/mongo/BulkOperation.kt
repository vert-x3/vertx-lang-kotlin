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
import io.vertx.ext.mongo.CollationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.BulkOperation] objects.
 *
 * Contains all data needed for one operation of a bulk write operation.
 *
 * @param collation 
 * @param type  Sets the operation type
 * @param filter  Sets the filter document, used by replace, update, and delete operations
 * @param document  Sets the document, used by insert, replace, and update operations
 * @param upsert  Sets the upsert flag, used by update and replace operations
 * @param multi  Sets the multi flag, used by update and delete operations
 * @param hint  Sets the operation hint
 * @param hintString  Sets the operation hint string
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.BulkOperation original] using Vert.x codegen.
 */
fun bulkOperationOf(
  collation: io.vertx.ext.mongo.CollationOptions? = null,
  type: BulkOperationType? = null,
  filter: io.vertx.core.json.JsonObject? = null,
  document: io.vertx.core.json.JsonObject? = null,
  upsert: Boolean? = null,
  multi: Boolean? = null,
  hint: io.vertx.core.json.JsonObject? = null,
  hintString: String? = null): BulkOperation = io.vertx.ext.mongo.BulkOperation(io.vertx.core.json.JsonObject()).apply {

  if (collation != null) {
    this.setCollation(collation)
  }
  if (type != null) {
    this.setType(type)
  }
  if (filter != null) {
    this.setFilter(filter)
  }
  if (document != null) {
    this.setDocument(document)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
  if (multi != null) {
    this.setMulti(multi)
  }
  if (hint != null) {
    this.setHint(hint)
  }
  if (hintString != null) {
    this.setHintString(hintString)
  }
}

