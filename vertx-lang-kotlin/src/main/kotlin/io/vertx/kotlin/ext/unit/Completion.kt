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
package io.vertx.kotlin.ext.unit

import io.vertx.ext.unit.Completion
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Completion handler to receive a completion signal when this completions completes.
 *
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.unit.Completion original] using Vert.x codegen.
 */
suspend fun <T> Completion<T>.handlerAwait() : T? {
  return awaitResult{
    this.handler(it)
  }
}

