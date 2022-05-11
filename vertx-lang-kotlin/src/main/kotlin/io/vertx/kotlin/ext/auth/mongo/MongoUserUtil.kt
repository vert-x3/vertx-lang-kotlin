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
package io.vertx.kotlin.ext.auth.mongo

import io.vertx.ext.auth.mongo.MongoUserUtil
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.mongo.MongoUserUtil.createUser]
 *
 * @param username the username to be set
 * @param password the password in clear text, will be adapted following the definitions of the defined strategy
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.mongo.MongoUserUtil] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createUser returning a future and chain with await()", replaceWith = ReplaceWith("createUser(username, password).await()"))
suspend fun MongoUserUtil.createUserAwait(username: String, password: String): String {
  return awaitResult {
    this.createUser(username, password, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.mongo.MongoUserUtil.createHashedUser]
 *
 * @param username the username to be set
 * @param hash the password hash, as result of [io.vertx.ext.auth.HashingStrategy]
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.mongo.MongoUserUtil] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createHashedUser returning a future and chain with await()", replaceWith = ReplaceWith("createHashedUser(username, hash).await()"))
suspend fun MongoUserUtil.createHashedUserAwait(username: String, hash: String): String {
  return awaitResult {
    this.createHashedUser(username, hash, it)
  }
}

/**
 * Suspending version of method [io.vertx.ext.auth.mongo.MongoUserUtil.createUserRolesAndPermissions]
 *
 * @param username the username to be set
 * @param roles a to be set
 * @param permissions a to be set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.mongo.MongoUserUtil] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createUserRolesAndPermissions returning a future and chain with await()", replaceWith = ReplaceWith("createUserRolesAndPermissions(username, roles, permissions).await()"))
suspend fun MongoUserUtil.createUserRolesAndPermissionsAwait(username: String, roles: List<String>, permissions: List<String>): String {
  return awaitResult {
    this.createUserRolesAndPermissions(username, roles, permissions, it)
  }
}

