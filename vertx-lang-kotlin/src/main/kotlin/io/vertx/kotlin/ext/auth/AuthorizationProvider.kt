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
package io.vertx.kotlin.ext.auth

import io.vertx.ext.auth.Authorization
import io.vertx.ext.auth.AuthorizationProvider
import io.vertx.ext.auth.User
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.AuthorizationProvider.getAuthorizations]
 *
 * @param user 
 * @return [Set<Authorization>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.AuthorizationProvider] using Vert.x codegen.
 */
suspend fun AuthorizationProvider.getAuthorizationsAwait(user: User): Set<Authorization> {
  return awaitResult {
    this.getAuthorizations(user, it)
  }
}

