package io.vertx.kotlin.core.http

import io.vertx.core.http.RequestOptions

/**
 * A function providing a DSL for building [io.vertx.core.http.RequestOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] will make connect to make a request.
 *
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param uri  Set the request relative URI
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.RequestOptions original] using Vert.x codegen.
 */
fun requestOptionsOf(
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  uri: String? = null): RequestOptions = io.vertx.core.http.RequestOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (uri != null) {
    this.setURI(uri)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.http.RequestOptions] objects.
 *
 * Options describing how an [io.vertx.core.http.HttpClient] will make connect to make a request.
 *
 * @param host  Set the host name to be used by the client request.
 * @param port  Set the port to be used by the client request.
 * @param ssl  Set whether SSL/TLS is enabled
 * @param uri  Set the request relative URI
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.RequestOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("requestOptionsOf(host, port, ssl, uri)")
)
fun RequestOptions(
  host: String? = null,
  port: Int? = null,
  ssl: Boolean? = null,
  uri: String? = null): RequestOptions = io.vertx.core.http.RequestOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (uri != null) {
    this.setURI(uri)
  }
}

