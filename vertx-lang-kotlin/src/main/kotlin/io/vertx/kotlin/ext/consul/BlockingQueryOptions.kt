package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.BlockingQueryOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.BlockingQueryOptions] objects.
 *
 * Options used to perform blocking query that used to wait for a potential change using long polling.
 *
 * @param index  Set index indicating that the client wishes to wait for any changes subsequent to that index.
 * @param wait  Specifying a maximum duration for the blocking request. This is limited to 10 minutes. If not set, the wait time defaults to 5 minutes. This value can be specified in the form of "10s" or "5m" (i.e., 10 seconds or 5 minutes, respectively).
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.BlockingQueryOptions original] using Vert.x codegen.
 */
fun blockingQueryOptionsOf(
  index: Long? = null,
  wait: String? = null): BlockingQueryOptions = io.vertx.ext.consul.BlockingQueryOptions().apply {

  if (index != null) {
    this.setIndex(index)
  }
  if (wait != null) {
    this.setWait(wait)
  }
}

