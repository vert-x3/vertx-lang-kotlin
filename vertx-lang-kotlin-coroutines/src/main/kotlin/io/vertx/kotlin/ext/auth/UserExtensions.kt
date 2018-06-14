package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String

/**
 *  Is the user authorised to
 * @param authority  the authority - what this really means is determined by the specific implementation. It might
 *                    represent a permission to access a resource e.g. `printers:printer34` or it might represent
 *                    authority to a role in a roles based model, e.g. `role:admin`.
 * @return the User to enable fluent use
 */
suspend fun User.isAuthorized(authority: String): Boolean {
  return awaitResult { this.isAuthorized(authority, it) }
}

/**
 *
 * @deprecated See [User.isAuthorized]
 */
@Deprecated("")
suspend fun User.isAuthorised(authority: String): Boolean {
  return awaitResult { this.isAuthorised(authority, it) }
}
