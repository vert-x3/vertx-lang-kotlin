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

import io.vertx.ext.mongo.FindOptions
import io.vertx.ext.mongo.CollationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.FindOptions] objects.
 *
 * Options used to configure find operations.
 *
 * @param collation  Set the collation
 * @param fields  Set the fields
 * @param sort  Set the sort document
 * @param limit  Set the limit
 * @param skip  Set the skip
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param hint  Set the hint
 * @param hintString  Set the hint string
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.FindOptions original] using Vert.x codegen.
 */
fun findOptionsOf(
  collation: io.vertx.ext.mongo.CollationOptions? = null,
  fields: io.vertx.core.json.JsonObject? = null,
  sort: io.vertx.core.json.JsonObject? = null,
  limit: Int? = null,
  skip: Int? = null,
  batchSize: Int? = null,
  hint: io.vertx.core.json.JsonObject? = null,
  hintString: String? = null): FindOptions = io.vertx.ext.mongo.FindOptions().apply {

  if (collation != null) {
    this.setCollation(collation)
  }
  if (fields != null) {
    this.setFields(fields)
  }
  if (sort != null) {
    this.setSort(sort)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
  if (skip != null) {
    this.setSkip(skip)
  }
  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (hint != null) {
    this.setHint(hint)
  }
  if (hintString != null) {
    this.setHintString(hintString)
  }
}

