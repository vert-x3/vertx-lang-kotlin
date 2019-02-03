package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.User.isAuthorized]
 *
 * @param authority the authority - what this really means is determined by the specific implementation. It might represent a permission to access a resource e.g. `printers:printer34` or it might represent authority to a role in a roles based model, e.g. `role:admin`.
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.User] using Vert.x codegen.
 */
suspend fun User.isAuthorizedAwait(authority: String): Boolean {
  return awaitResult {
    this.isAuthorized(authority, it)
  }
}

