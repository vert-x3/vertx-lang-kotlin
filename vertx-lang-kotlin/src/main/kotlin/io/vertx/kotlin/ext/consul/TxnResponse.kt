package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnResponse
import io.vertx.ext.consul.TxnError

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnResponse] objects.
 *
 * Holds results of transaction
 *
 * @param errors  Adds error to this response
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnResponse original] using Vert.x codegen.
 */
fun txnResponseOf(
  errors: Iterable<io.vertx.ext.consul.TxnError>? = null): TxnResponse = io.vertx.ext.consul.TxnResponse().apply {

  if (errors != null) {
    for (item in errors) {
      this.addError(item)
    }
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnResponse] objects.
 *
 * Holds results of transaction
 *
 * @param errors  Adds error to this response
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnResponse original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("txnResponseOf(errors)")
)
fun TxnResponse(
  errors: Iterable<io.vertx.ext.consul.TxnError>? = null): TxnResponse = io.vertx.ext.consul.TxnResponse().apply {

  if (errors != null) {
    for (item in errors) {
      this.addError(item)
    }
  }
}

