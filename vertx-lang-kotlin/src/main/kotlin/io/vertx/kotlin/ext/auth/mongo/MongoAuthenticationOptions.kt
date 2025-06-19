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

import io.vertx.ext.auth.mongo.MongoAuthenticationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.mongo.MongoAuthenticationOptions] objects.
 *
 * Options configuring Mongo authentication.
 *
 * @param collectionName  The property name to be used to set the name of the collection inside the config.
 * @param passwordCredentialField 
 * @param passwordField  The property name to be used to set the name of the field, where the password is stored inside
 * @param usernameCredentialField  The property name to be used to set the name of the field, where the username for the credentials is stored inside.
 * @param usernameField  The property name to be used to set the name of the field, where the username is stored inside.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.mongo.MongoAuthenticationOptions original] using Vert.x codegen.
 */
fun mongoAuthenticationOptionsOf(
  collectionName: String? = null,
  passwordCredentialField: String? = null,
  passwordField: String? = null,
  usernameCredentialField: String? = null,
  usernameField: String? = null): MongoAuthenticationOptions = io.vertx.ext.auth.mongo.MongoAuthenticationOptions().apply {

  if (collectionName != null) {
    this.setCollectionName(collectionName)
  }
  if (passwordCredentialField != null) {
    this.setPasswordCredentialField(passwordCredentialField)
  }
  if (passwordField != null) {
    this.setPasswordField(passwordField)
  }
  if (usernameCredentialField != null) {
    this.setUsernameCredentialField(usernameCredentialField)
  }
  if (usernameField != null) {
    this.setUsernameField(usernameField)
  }
}

