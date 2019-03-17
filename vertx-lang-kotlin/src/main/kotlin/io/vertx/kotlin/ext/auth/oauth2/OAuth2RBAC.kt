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
 * This method should verify if the user has the given authority and return either a boolean value or an error.
 *
 * Note that false and errors are not the same. A user might not have a given authority but that doesn't mean that
 * there was an error during the call.
 *
 * @param user the given user to assert on
 * @param authority the authority to lookup
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2RBAC original] using Vert.x codegen.
 */
suspend fun OAuth2RBAC.isAuthorizedAwait(user : AccessToken, authority : String) : Boolean {
  return awaitResult{
    this.isAuthorized(user, authority, it)
  }
}

