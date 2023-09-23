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
package io.vertx.kotlin.core.http

import io.vertx.core.http.GoAway

/**
 * A function providing a DSL for building [io.vertx.core.http.GoAway] objects.
 *
 * A  frame.
 *
 * @param errorCode 
 * @param lastStreamId  Set the last stream id.
 * @param debugData  Set the additional debug data
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.GoAway original] using Vert.x codegen.
 */
fun goAwayOf(
  errorCode: Long? = null,
  lastStreamId: Int? = null,
  debugData: io.vertx.core.buffer.Buffer? = null): GoAway = io.vertx.core.http.GoAway().apply {

  if (errorCode != null) {
    this.setErrorCode(errorCode)
  }
  if (lastStreamId != null) {
    this.setLastStreamId(lastStreamId)
  }
  if (debugData != null) {
    this.setDebugData(debugData)
  }
}

