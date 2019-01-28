package io.vertx.kotlin.core.net

import io.vertx.core.net.ProxyOptions
import io.vertx.core.net.ProxyType

/**
 * A function providing a DSL for building [io.vertx.core.net.ProxyOptions] objects.
 *
 * Proxy options for a net client or a net client.
 *
 * @param host  Set proxy host.
 * @param password  Set proxy password.
 * @param port  Set proxy port.
 * @param type  Set proxy type. <p>ProxyType can be HTTP, SOCKS4 and SOCKS5
 * @param username  Set proxy username.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.ProxyOptions original] using Vert.x codegen.
 */
fun proxyOptionsOf(
  host: String? = null,
  password: String? = null,
  port: Int? = null,
  type: ProxyType? = null,
  username: String? = null): ProxyOptions = io.vertx.core.net.ProxyOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (type != null) {
    this.setType(type)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.net.ProxyOptions] objects.
 *
 * Proxy options for a net client or a net client.
 *
 * @param host  Set proxy host.
 * @param password  Set proxy password.
 * @param port  Set proxy port.
 * @param type  Set proxy type. <p>ProxyType can be HTTP, SOCKS4 and SOCKS5
 * @param username  Set proxy username.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.ProxyOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("proxyOptionsOf(host, password, port, type, username)")
)
fun ProxyOptions(
  host: String? = null,
  password: String? = null,
  port: Int? = null,
  type: ProxyType? = null,
  username: String? = null): ProxyOptions = io.vertx.core.net.ProxyOptions().apply {

  if (host != null) {
    this.setHost(host)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (port != null) {
    this.setPort(port)
  }
  if (type != null) {
    this.setType(type)
  }
  if (username != null) {
    this.setUsername(username)
  }
}

