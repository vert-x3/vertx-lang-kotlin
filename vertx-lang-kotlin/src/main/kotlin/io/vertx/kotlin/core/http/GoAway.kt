package io.vertx.kotlin.core.http

import io.vertx.core.http.GoAway

/**
 * A function providing a DSL for building [io.vertx.core.http.GoAway] objects.
 *
 * A  frame.
 *
 * @param debugData  Set the additional debug data
 * @param errorCode 
 * @param lastStreamId  Set the last stream id.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.GoAway original] using Vert.x codegen.
 */
fun goAwayOf(
  debugData: io.vertx.core.buffer.Buffer? = null,
  errorCode: Long? = null,
  lastStreamId: Int? = null): GoAway = io.vertx.core.http.GoAway().apply {

  if (debugData != null) {
    this.setDebugData(debugData)
  }
  if (errorCode != null) {
    this.setErrorCode(errorCode)
  }
  if (lastStreamId != null) {
    this.setLastStreamId(lastStreamId)
  }
}

