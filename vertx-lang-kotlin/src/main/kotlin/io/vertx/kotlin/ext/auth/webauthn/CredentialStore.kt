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
import io.vertx.ext.auth.webauthn.CredentialStore
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.webauthn.CredentialStore.getUserCredentialsByName]
 *
 * @param username user unique name.
 * @return [List<JsonObject>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.webauthn.CredentialStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getUserCredentialsByName returning a future and chain with await()", replaceWith = ReplaceWith("getUserCredentialsByName(username).await()"))
suspend fun CredentialStore.getUserCredentialsByNameAwait(username: String): List<JsonObject> {
  return awaitResult {
    this.getUserCredentialsByName(username, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.webauthn.CredentialStore.getUserCredentialsById]
 *
 * @param rawId user unique rawId.
 * @return [List<JsonObject>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.webauthn.CredentialStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use getUserCredentialsById returning a future and chain with await()", replaceWith = ReplaceWith("getUserCredentialsById(rawId).await()"))
suspend fun CredentialStore.getUserCredentialsByIdAwait(rawId: String): List<JsonObject> {
  return awaitResult {
    this.getUserCredentialsById(rawId, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.webauthn.CredentialStore.updateUserCredential]
 *
 * @param id the unique user identifier.
 * @param data the data to update.
 * @param upsert insert if not present.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.webauthn.CredentialStore] using Vert.x codegen.
 */
@Deprecated(message = "Instead use updateUserCredential returning a future and chain with await()", replaceWith = ReplaceWith("updateUserCredential(id, data, upsert).await()"))
suspend fun CredentialStore.updateUserCredentialAwait(id: String, data: JsonObject, upsert: Boolean): Unit {
  return awaitResult {
    this.updateUserCredential(id, data, upsert, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

