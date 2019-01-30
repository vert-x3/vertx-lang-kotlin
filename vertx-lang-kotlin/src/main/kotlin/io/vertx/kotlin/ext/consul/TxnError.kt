package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnError

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnError] objects.
 *
 * Holds information describing which operations failed if the transaction was rolled back.
 *
 * @param opIndex  Set the index of the failed operation in the transaction
 * @param what  Set error message about why that operation failed.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnError original] using Vert.x codegen.
 */
fun txnErrorOf(
  opIndex: Int? = null,
  what: String? = null): TxnError = io.vertx.ext.consul.TxnError().apply {

  if (opIndex != null) {
    this.setOpIndex(opIndex)
  }
  if (what != null) {
    this.setWhat(what)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnError] objects.
 *
 * Holds information describing which operations failed if the transaction was rolled back.
 *
 * @param opIndex  Set the index of the failed operation in the transaction
 * @param what  Set error message about why that operation failed.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnError original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("txnErrorOf(opIndex, what)")
)
fun TxnError(
  opIndex: Int? = null,
  what: String? = null): TxnError = io.vertx.ext.consul.TxnError().apply {

  if (opIndex != null) {
    this.setOpIndex(opIndex)
  }
  if (what != null) {
    this.setWhat(what)
  }
}

