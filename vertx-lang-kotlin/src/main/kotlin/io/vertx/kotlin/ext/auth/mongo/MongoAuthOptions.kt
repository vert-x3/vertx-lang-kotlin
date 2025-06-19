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

import io.vertx.ext.auth.mongo.MongoAuthOptions
import io.vertx.ext.auth.mongo.HashSaltStyle

/**
 * A function providing a DSL for building [io.vertx.ext.auth.mongo.MongoAuthOptions] objects.
 *
 * Options configuring Mongo authentication.
 *
 * @param collectionName  The property name to be used to set the name of the collection inside the config.
 * @param config  The mongo client configuration: see Mongo Client documentation.
 * @param datasourceName  The mongo data source name: see Mongo Client documentation.
 * @param passwordField  The property name to be used to set the name of the field, where the password is stored inside
 * @param permissionField  The property name to be used to set the name of the field, where the permissions are stored inside.
 * @param roleField  The property name to be used to set the name of the field, where the roles are stored inside.
 * @param saltField  The property name to be used to set the name of the field, where the SALT is stored inside.
 * @param saltStyle  The property name to be used to set the name of the field, where the salt style is stored inside
 * @param shared  Use a shared Mongo client or not.
 * @param usernameCredentialField  The property name to be used to set the name of the field, where the username for the credentials is stored inside.
 * @param usernameField  The property name to be used to set the name of the field, where the username is stored inside.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.mongo.MongoAuthOptions original] using Vert.x codegen.
 */
fun mongoAuthOptionsOf(
  collectionName: String? = null,
  config: io.vertx.core.json.JsonObject? = null,
  datasourceName: String? = null,
  passwordField: String? = null,
  permissionField: String? = null,
  roleField: String? = null,
  saltField: String? = null,
  saltStyle: HashSaltStyle? = null,
  shared: Boolean? = null,
  usernameCredentialField: String? = null,
  usernameField: String? = null): MongoAuthOptions = io.vertx.ext.auth.mongo.MongoAuthOptions().apply {

  if (collectionName != null) {
    this.setCollectionName(collectionName)
  }
  if (config != null) {
    this.setConfig(config)
  }
  if (datasourceName != null) {
    this.setDatasourceName(datasourceName)
  }
  if (passwordField != null) {
    this.setPasswordField(passwordField)
  }
  if (permissionField != null) {
    this.setPermissionField(permissionField)
  }
  if (roleField != null) {
    this.setRoleField(roleField)
  }
  if (saltField != null) {
    this.setSaltField(saltField)
  }
  if (saltStyle != null) {
    this.setSaltStyle(saltStyle)
  }
  if (shared != null) {
    this.setShared(shared)
  }
  if (usernameCredentialField != null) {
    this.setUsernameCredentialField(usernameCredentialField)
  }
  if (usernameField != null) {
    this.setUsernameField(usernameField)
  }
}

