package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.BulkWriteOptions
import io.vertx.ext.mongo.WriteOption

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.BulkWriteOptions] objects.
 *
 * Options for configuring bulk write operations.
 *
 * @param ordered  Set the ordered option
 * @param writeOption  Set the write option
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.BulkWriteOptions original] using Vert.x codegen.
 */
fun bulkWriteOptionsOf(
  ordered: Boolean? = null,
  writeOption: WriteOption? = null): BulkWriteOptions = io.vertx.ext.mongo.BulkWriteOptions().apply {

  if (ordered != null) {
    this.setOrdered(ordered)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.BulkWriteOptions] objects.
 *
 * Options for configuring bulk write operations.
 *
 * @param ordered  Set the ordered option
 * @param writeOption  Set the write option
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.BulkWriteOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("bulkWriteOptionsOf(ordered, writeOption)")
)
fun BulkWriteOptions(
  ordered: Boolean? = null,
  writeOption: WriteOption? = null): BulkWriteOptions = io.vertx.ext.mongo.BulkWriteOptions().apply {

  if (ordered != null) {
    this.setOrdered(ordered)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

