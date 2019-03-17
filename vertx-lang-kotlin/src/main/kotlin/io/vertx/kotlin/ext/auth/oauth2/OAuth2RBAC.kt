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
package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.ext.auth.oauth2.AccessToken
import io.vertx.ext.auth.oauth2.OAuth2RBAC
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.ext.auth.oauth2.OAuth2RBAC.isAuthorized]
 *
 * @param user the given user to assert on
 * @param authority the authority to lookup
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.ext.auth.oauth2.OAuth2RBAC] using Vert.x codegen.
 */
suspend fun OAuth2RBAC.isAuthorizedAwait(user: AccessToken, authority: String): Boolean {
  return awaitResult {
    this.isAuthorized(user, authority, it)
  }
}

