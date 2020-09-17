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
package io.vertx.kotlin.ext.auth.authentication

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.User
import io.vertx.ext.auth.authentication.AuthenticationProvider
import io.vertx.ext.auth.authentication.Credentials
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.authentication.AuthenticationProvider.authenticate]
 *
 * @param credentials The credentials
 * @return [User]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.authentication.AuthenticationProvider] using Vert.x codegen.
 */
@Deprecated(message = "Instead use authenticate returning a future and chain with await()", replaceWith = ReplaceWith("authenticate(credentials).await()"))
suspend fun AuthenticationProvider.authenticateAwait(credentials: JsonObject): User {
  return awaitResult {
    this.authenticate(credentials, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.authentication.AuthenticationProvider.authenticate]
 *
 * @param credentials The credentials
 * @return [User]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.authentication.AuthenticationProvider] using Vert.x codegen.
 */
@Deprecated(message = "Instead use authenticate returning a future and chain with await()", replaceWith = ReplaceWith("authenticate(credentials).await()"))
suspend fun AuthenticationProvider.authenticateAwait(credentials: Credentials): User {
  return awaitResult {
    this.authenticate(credentials, it)
  }
}

