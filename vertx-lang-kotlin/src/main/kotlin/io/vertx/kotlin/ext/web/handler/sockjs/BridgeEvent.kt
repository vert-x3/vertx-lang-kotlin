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
package io.vertx.kotlin.ext.web.handler.sockjs

import io.vertx.ext.web.handler.sockjs.BridgeEvent
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Set a handler for the result.
 * <p>
 * If the future has already been completed it will be called immediately. Otherwise it will be called when the
 * future is completed.
 *
 * @return a reference to this, so it can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.handler.sockjs.BridgeEvent original] using Vert.x codegen.
 */
suspend fun BridgeEvent.setHandlerAwait() : Boolean {
  return awaitResult{
    this.setHandler(it)
  }
}

