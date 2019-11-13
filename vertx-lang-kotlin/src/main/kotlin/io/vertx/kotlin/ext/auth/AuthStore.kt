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
package io.vertx.kotlin.ext.auth

import io.vertx.core.json.JsonObject
import io.vertx.ext.auth.AuthStore
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.AuthStore.getUserCredentialsByName]
 *
 * @param username user unique name.
 * @return [List<JsonObject>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.AuthStore] using Vert.x codegen.
 */
suspend fun AuthStore.getUserCredentialsByNameAwait(username: String): List<JsonObject> {
  return awaitResult {
    this.getUserCredentialsByName(username, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.AuthStore.getUserCredentialsById]
 *
 * @param rawId user unique rawId.
 * @return [List<JsonObject>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.AuthStore] using Vert.x codegen.
 */
suspend fun AuthStore.getUserCredentialsByIdAwait(rawId: String): List<JsonObject> {
  return awaitResult {
    this.getUserCredentialsById(rawId, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.AuthStore.updateUserCredential]
 *
 * @param id the unique user identifier.
 * @param data the data to update.
 * @param upsert insert if not present.
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.AuthStore] using Vert.x codegen.
 */
suspend fun AuthStore.updateUserCredentialAwait(id: String, data: JsonObject, upsert: Boolean): Unit {
  return awaitResult {
    this.updateUserCredential(id, data, upsert, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.AuthStore.getUserRoles]
 *
 * @param id the unique user identifier.
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.AuthStore] using Vert.x codegen.
 */
suspend fun AuthStore.getUserRolesAwait(id: String): List<String> {
  return awaitResult {
    this.getUserRoles(id, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.AuthStore.getUserPermissions]
 *
 * @param id the unique user identifier.
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.AuthStore] using Vert.x codegen.
 */
suspend fun AuthStore.getUserPermissionsAwait(id: String): List<String> {
  return awaitResult {
    this.getUserPermissions(id, it)
  }
}

