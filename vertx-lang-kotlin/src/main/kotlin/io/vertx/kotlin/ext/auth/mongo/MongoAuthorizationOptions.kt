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

import io.vertx.ext.auth.mongo.MongoAuthorizationOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.mongo.MongoAuthorizationOptions] objects.
 *
 * Options configuring Mongo authentication.
 *
 * @param collectionName  The property name to be used to set the name of the collection inside the config.
 * @param permissionField  The property name to be used to set the name of the field, where the permissions are stored inside.
 * @param roleField  The property name to be used to set the name of the field, where the roles are stored inside.
 * @param usernameField  The property name to be used to set the name of the field, where the username is stored inside.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.mongo.MongoAuthorizationOptions original] using Vert.x codegen.
 */
fun mongoAuthorizationOptionsOf(
  collectionName: String? = null,
  permissionField: String? = null,
  roleField: String? = null,
  usernameField: String? = null): MongoAuthorizationOptions = io.vertx.ext.auth.mongo.MongoAuthorizationOptions().apply {

  if (collectionName != null) {
    this.setCollectionName(collectionName)
  }
  if (permissionField != null) {
    this.setPermissionField(permissionField)
  }
  if (roleField != null) {
    this.setRoleField(roleField)
  }
  if (usernameField != null) {
    this.setUsernameField(usernameField)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.auth.mongo.MongoAuthorizationOptions] objects.
 *
 * Options configuring Mongo authentication.
 *
 * @param collectionName  The property name to be used to set the name of the collection inside the config.
 * @param permissionField  The property name to be used to set the name of the field, where the permissions are stored inside.
 * @param roleField  The property name to be used to set the name of the field, where the roles are stored inside.
 * @param usernameField  The property name to be used to set the name of the field, where the username is stored inside.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.mongo.MongoAuthorizationOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("mongoAuthorizationOptionsOf(collectionName, permissionField, roleField, usernameField)")
)
fun MongoAuthorizationOptions(
  collectionName: String? = null,
  permissionField: String? = null,
  roleField: String? = null,
  usernameField: String? = null): MongoAuthorizationOptions = io.vertx.ext.auth.mongo.MongoAuthorizationOptions().apply {

  if (collectionName != null) {
    this.setCollectionName(collectionName)
  }
  if (permissionField != null) {
    this.setPermissionField(permissionField)
  }
  if (roleField != null) {
    this.setRoleField(roleField)
  }
  if (usernameField != null) {
    this.setUsernameField(usernameField)
  }
}

