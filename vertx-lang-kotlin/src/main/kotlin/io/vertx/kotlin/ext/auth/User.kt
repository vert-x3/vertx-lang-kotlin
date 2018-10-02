package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Is the user authorised to
 *
 * @param authority the authority - what this really means is determined by the specific implementation. It might represent a permission to access a resource e.g. `printers:printer34` or it might represent authority to a role in a roles based model, e.g. `role:admin`.
 * @param resultHandler handler that will be called with an [io.vertx.core.AsyncResult] containing the value `true` if the they has the authority or `false` otherwise.
 * @returnthe User to enable fluent use *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.User original] using Vert.x codegen.
 */
suspend fun User.isAuthorizedAwait(authority : String) : Boolean {
  return awaitResult{
    this.isAuthorized(authority, it)
  }
}

