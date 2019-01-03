package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.UpdateOptions
import io.vertx.ext.mongo.WriteOption

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.UpdateOptions] objects.
 *
 * Options for configuring updates.
 *
 * @param multi  Set whether multi is enabled
 * @param returningNewDocument  Set whether new document property is enabled. Valid only on findOneAnd* methods.
 * @param upsert  Set whether upsert is enabled
 * @param writeOption  Set the write option
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.UpdateOptions original] using Vert.x codegen.
 */
fun updateOptionsOf(
  multi: Boolean? = null,
  returningNewDocument: Boolean? = null,
  upsert: Boolean? = null,
  writeOption: WriteOption? = null): UpdateOptions = io.vertx.ext.mongo.UpdateOptions().apply {

  if (multi != null) {
    this.setMulti(multi)
  }
  if (returningNewDocument != null) {
    this.setReturningNewDocument(returningNewDocument)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.UpdateOptions] objects.
 *
 * Options for configuring updates.
 *
 * @param multi  Set whether multi is enabled
 * @param returningNewDocument  Set whether new document property is enabled. Valid only on findOneAnd* methods.
 * @param upsert  Set whether upsert is enabled
 * @param writeOption  Set the write option
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.UpdateOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("updateOptionsOf(multi, returningNewDocument, upsert, writeOption)")
)
fun UpdateOptions(
  multi: Boolean? = null,
  returningNewDocument: Boolean? = null,
  upsert: Boolean? = null,
  writeOption: WriteOption? = null): UpdateOptions = io.vertx.ext.mongo.UpdateOptions().apply {

  if (multi != null) {
    this.setMulti(multi)
  }
  if (returningNewDocument != null) {
    this.setReturningNewDocument(returningNewDocument)
  }
  if (upsert != null) {
    this.setUpsert(upsert)
  }
  if (writeOption != null) {
    this.setWriteOption(writeOption)
  }
}

