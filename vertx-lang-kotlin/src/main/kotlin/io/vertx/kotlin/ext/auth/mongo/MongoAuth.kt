package io.vertx.kotlin.ext.auth.mongo

import io.vertx.ext.auth.mongo.MongoAuth
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Insert a new user into mongo in the convenient way
 *
 * @param username the username to be set
 * @param password the passsword in clear text, will be adapted following the definitions of the defined [io.vertx.ext.auth.mongo.HashStrategy]
 * @param roles a list of roles to be set
 * @param permissions a list of permissions to be set
 * @param resultHandler the ResultHandler will be provided with the id of the generated record
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.mongo.MongoAuth original] using Vert.x codegen.
 */
suspend fun MongoAuth.insertUserAwait(username : String, password : String, roles : List<String>, permissions : List<String>) : String {
  return awaitResult{
    this.insertUser(username, password, roles, permissions, it)
  }
}

