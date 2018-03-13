package io.vertx.kotlin.ext.auth.htpasswd

import io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions] objects.
 *
 * Options configuring htpasswd authentication.
 *
 * @param htpasswdFile 
 * @param usersAuthorizedForEverything 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions original] using Vert.x codegen.
 */
fun HtpasswdAuthOptions(
  htpasswdFile: String? = null,
  usersAuthorizedForEverything: Boolean? = null): HtpasswdAuthOptions = io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions().apply {

  if (htpasswdFile != null) {
    this.setHtpasswdFile(htpasswdFile)
  }
  if (usersAuthorizedForEverything != null) {
    this.setUsersAuthorizedForEverything(usersAuthorizedForEverything)
  }
}

