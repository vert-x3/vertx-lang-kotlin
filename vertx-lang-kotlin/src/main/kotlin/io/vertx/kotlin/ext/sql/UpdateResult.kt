package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.UpdateResult

/**
 * A function providing a DSL for building [io.vertx.ext.sql.UpdateResult] objects.
 *
 * Represents the result of an update/insert/delete operation on the database.
 * <p>
 * The number of rows updated is available with [io.vertx.ext.sql.UpdateResult] and any generated
 * keys are available with [io.vertx.ext.sql.UpdateResult].
 *
 * @param keys  Get any generated keys
 * @param updated  Get the number of rows updated
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.UpdateResult original] using Vert.x codegen.
 */
fun UpdateResult(
  keys: io.vertx.core.json.JsonArray? = null,
  updated: Int? = null): UpdateResult = io.vertx.ext.sql.UpdateResult().apply {

  if (keys != null) {
    this.setKeys(keys)
  }
  if (updated != null) {
    this.setUpdated(updated)
  }
}

