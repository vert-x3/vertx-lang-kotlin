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
package io.vertx.kotlin.core.net

import io.vertx.core.net.OpenSSLEngineOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.OpenSSLEngineOptions] objects.
 *
 * Configures a [io.vertx.core.net.TCPSSLOptions] to use OpenSsl.
 *
 * @param sessionCacheEnabled  Set whether session cache is enabled in open SSL session server context
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.OpenSSLEngineOptions original] using Vert.x codegen.
 */
fun openSSLEngineOptionsOf(
  sessionCacheEnabled: Boolean? = null): OpenSSLEngineOptions = io.vertx.core.net.OpenSSLEngineOptions().apply {

  if (sessionCacheEnabled != null) {
    this.setSessionCacheEnabled(sessionCacheEnabled)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.net.OpenSSLEngineOptions] objects.
 *
 * Configures a [io.vertx.core.net.TCPSSLOptions] to use OpenSsl.
 *
 * @param sessionCacheEnabled  Set whether session cache is enabled in open SSL session server context
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.OpenSSLEngineOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("openSSLEngineOptionsOf(sessionCacheEnabled)")
)
fun OpenSSLEngineOptions(
  sessionCacheEnabled: Boolean? = null): OpenSSLEngineOptions = io.vertx.core.net.OpenSSLEngineOptions().apply {

  if (sessionCacheEnabled != null) {
    this.setSessionCacheEnabled(sessionCacheEnabled)
  }
}

