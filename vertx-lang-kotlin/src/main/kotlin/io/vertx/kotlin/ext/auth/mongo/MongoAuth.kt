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
package io.vertx.kotlin.ext.auth.mongo

import io.vertx.ext.auth.mongo.MongoAuth
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Insert a new user into mongo in the convenient way
 *
 * @param username the username to be set
 * @param password the passsword in clear text, will be adapted following the definitions of the defined [io.vertx.ext.auth.mongo.HashStrategy]
 * @param roles a list of roles to be set
 * @param permissions a list of permissions to be set
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.mongo.MongoAuth original] using Vert.x codegen.
 */
suspend fun MongoAuth.insertUserAwait(username : String, password : String, roles : List<String>, permissions : List<String>) : String {
  return awaitResult{
    this.insertUser(username, password, roles, permissions, it)
  }
}

