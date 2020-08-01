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
package io.vertx.kotlin.ext.web.handler

import io.vertx.ext.auth.authentication.Credentials
import io.vertx.ext.web.RoutingContext
import io.vertx.ext.web.handler.DigestAuthHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.web.handler.DigestAuthHandler.parseCredentials]
 *
 * @param context the routing context
 * @return [Credentials]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.web.handler.DigestAuthHandler] using Vert.x codegen.
 */
@Deprecated(message = "Instead use parseCredentials returning a future and chain with await()", replaceWith = ReplaceWith("parseCredentials(context).await()"))
suspend fun DigestAuthHandler.parseCredentialsAwait(context: RoutingContext): Credentials {
  return awaitResult {
    this.parseCredentials(context, it)
  }
}

