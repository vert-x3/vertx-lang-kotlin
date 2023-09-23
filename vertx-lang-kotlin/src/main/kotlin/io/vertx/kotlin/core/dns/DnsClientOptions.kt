/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClientOptions
import io.netty.handler.logging.ByteBufFormat

/**
 * A function providing a DSL for building [io.vertx.core.dns.DnsClientOptions] objects.
 *
 * Configuration options for Vert.x DNS client.
 *
 * @param port  Set the port to be used by this client in requests.
 * @param host  Set the host name to be used by this client in requests.
 * @param queryTimeout  Set the query timeout in milliseconds, i.e the amount of time after a query is considered to be failed.
 * @param logActivity  Set to true to enable network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param activityLogFormat  Set the value of Netty's logging handler's data format:  Netty's pipeline is configured for logging on Netty's logger.
 * @param recursionDesired  Set whether or not recursion is desired
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClientOptions original] using Vert.x codegen.
 */
fun dnsClientOptionsOf(
  port: Int? = null,
  host: String? = null,
  queryTimeout: Long? = null,
  logActivity: Boolean? = null,
  activityLogFormat: ByteBufFormat? = null,
  recursionDesired: Boolean? = null): DnsClientOptions = io.vertx.core.dns.DnsClientOptions().apply {

  if (port != null) {
    this.setPort(port)
  }
  if (host != null) {
    this.setHost(host)
  }
  if (queryTimeout != null) {
    this.setQueryTimeout(queryTimeout)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (activityLogFormat != null) {
    this.setActivityLogFormat(activityLogFormat)
  }
  if (recursionDesired != null) {
    this.setRecursionDesired(recursionDesired)
  }
}

