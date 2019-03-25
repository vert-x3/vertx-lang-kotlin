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
package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.StompServerConnection
import io.vertx.ext.stomp.StompServerHandler
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.stomp.StompServerHandler.onAuthenticationRequest]
 *
 * @param connection server connection that contains session ID
 * @param login the login
 * @param passcode the password
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.stomp.StompServerHandler] using Vert.x codegen.
 */
suspend fun StompServerHandler.onAuthenticationRequestAwait(connection: StompServerConnection, login: String, passcode: String): Boolean {
  return awaitResult {
    this.onAuthenticationRequest(connection, login, passcode, it)
  }
}

