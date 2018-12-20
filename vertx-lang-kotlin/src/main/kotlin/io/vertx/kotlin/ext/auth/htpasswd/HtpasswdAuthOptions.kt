package io.vertx.kotlin.ext.auth.htpasswd

import io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions] objects.
 *
 * Options configuring htpasswd authentication.
 *
 * @param htpasswdFile 
 * @param plainTextEnabled 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions original] using Vert.x codegen.
 */
fun htpasswdAuthOptionsOf(
  htpasswdFile: String? = null,
  plainTextEnabled: Boolean? = null): HtpasswdAuthOptions = io.vertx.ext.auth.htpasswd.HtpasswdAuthOptions().apply {

  if (htpasswdFile != null) {
    this.setHtpasswdFile(htpasswdFile)
  }
  if (plainTextEnabled != null) {
    this.setPlainTextEnabled(plainTextEnabled)
  }
}

