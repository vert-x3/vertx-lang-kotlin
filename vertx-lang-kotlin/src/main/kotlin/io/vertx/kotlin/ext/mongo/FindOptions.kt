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

