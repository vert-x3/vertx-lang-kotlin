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
package io.vertx.kotlin.ext.auth.webauthn

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.webauthn.WebAuthn
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.webauthn.WebAuthn.createCredentialsOptions]
 *
 * @param user - the user object with username, displayName
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.webauthn.WebAuthn] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createCredentialsOptions returning a future that can yield a result ", replaceWith = ReplaceWith("createCredentialsOptions(user).await()"))
suspend fun WebAuthn.createCredentialsOptionsAwait(user: JsonObject): JsonObject {
  return awaitResult {
    this.createCredentialsOptions(user, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.webauthn.WebAuthn.getCredentialsOptions]
 *
 * @param username the unique user identified
 * @return [JsonObject]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.webauthn.WebAuthn] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getCredentialsOptions returning a future that can yield a result ", replaceWith = ReplaceWith("getCredentialsOptions(username).await()"))
suspend fun WebAuthn.getCredentialsOptionsAwait(username: String?): JsonObject {
  return awaitResult {
    this.getCredentialsOptions(username, it)
  }
}

