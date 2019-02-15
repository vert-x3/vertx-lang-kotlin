package io.vertx.kotlin.ext.auth.mongo

import io.vertx.ext.auth.mongo.MongoAuth
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.mongo.MongoAuth.insertUser]
 *
 * @param username the username to be set
 * @param password the passsword in clear text, will be adapted following the definitions of the defined [io.vertx.ext.auth.mongo.HashStrategy]
 * @param roles a list of roles to be set
 * @param permissions a list of permissions to be set
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.mongo.MongoAuth] using Vert.x codegen.
 */
suspend fun MongoAuth.insertUserAwait(username: String, password: String, roles: List<String>, permissions: List<String>): String {
  return awaitResult {
    this.insertUser(username, password, roles, permissions, it)
  }
}

