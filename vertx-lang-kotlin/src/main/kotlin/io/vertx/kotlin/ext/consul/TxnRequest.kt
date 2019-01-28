package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.TxnRequest

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnRequest] objects.
 *
 * Holds list of operations in transaction
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnRequest original] using Vert.x codegen.
 */
fun txnRequestOf(
): TxnRequest = io.vertx.ext.consul.TxnRequest().apply {

}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.TxnRequest] objects.
 *
 * Holds list of operations in transaction
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.TxnRequest original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("txnRequestOf()")
)
fun TxnRequest(
): TxnRequest = io.vertx.ext.consul.TxnRequest().apply {

}

