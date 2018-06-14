package io.vertx.kotlin.ext.auth.mongo

import io.vertx.ext.auth.mongo.MongoAuth
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Insert a new user into mongo in the convenient way
 * @param username
 *           the username to be set
 * @param password
 *           the passsword in clear text, will be adapted following the definitions of the defined [HashStrategy]
 * @param roles
 *           a list of roles to be set
 * @param permissions
 *           a list of permissions to be set */
suspend fun MongoAuth.insertUser(
  username: String,
  password: String,
  roles: MutableList<String>,
  permissions: MutableList<String>
): String {
  return awaitResult { this.insertUser(username, password, roles, permissions, it) }
}
