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

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.FindOptions] objects.
 *
 * Options used to configure find operations.
 *
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param fields  Set the fields
 * @param limit  Set the limit
 * @param skip  Set the skip
 * @param sort  Set the sort document
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.FindOptions original] using Vert.x codegen.
 */
fun findOptionsOf(
  batchSize: Int? = null,
  fields: io.vertx.core.json.JsonObject? = null,
  limit: Int? = null,
  skip: Int? = null,
  sort: io.vertx.core.json.JsonObject? = null): FindOptions = io.vertx.ext.mongo.FindOptions().apply {

  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (fields != null) {
    this.setFields(fields)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
  if (skip != null) {
    this.setSkip(skip)
  }
  if (sort != null) {
    this.setSort(sort)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.FindOptions] objects.
 *
 * Options used to configure find operations.
 *
 * @param batchSize  Set the batch size for methods loading found data in batches.
 * @param fields  Set the fields
 * @param limit  Set the limit
 * @param skip  Set the skip
 * @param sort  Set the sort document
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.FindOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("findOptionsOf(batchSize, fields, limit, skip, sort)")
)
fun FindOptions(
  batchSize: Int? = null,
  fields: io.vertx.core.json.JsonObject? = null,
  limit: Int? = null,
  skip: Int? = null,
  sort: io.vertx.core.json.JsonObject? = null): FindOptions = io.vertx.ext.mongo.FindOptions().apply {

  if (batchSize != null) {
    this.setBatchSize(batchSize)
  }
  if (fields != null) {
    this.setFields(fields)
  }
  if (limit != null) {
    this.setLimit(limit)
  }
  if (skip != null) {
    this.setSkip(skip)
  }
  if (sort != null) {
    this.setSort(sort)
  }
}

