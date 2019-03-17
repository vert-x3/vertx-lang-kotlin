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
package io.vertx.kotlin.core.file

import io.vertx.core.file.FileSystemOptions

/**
 * A function providing a DSL for building [io.vertx.core.file.FileSystemOptions] objects.
 *
 * Vert.x file system base configuration, this class can be extended by provider implementations to configure
 * those specific implementations.
 *
 * @param classPathResolvingEnabled  When vert.x cannot find the file on the filesystem it tries to resolve the file from the class path when this is set to <code>true</code>.
 * @param fileCachingEnabled  Set to <code>true</code> to cache files on the real file system when the filesystem performs class path resolving.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystemOptions original] using Vert.x codegen.
 */
fun fileSystemOptionsOf(
  classPathResolvingEnabled: Boolean? = null,
  fileCachingEnabled: Boolean? = null): FileSystemOptions = io.vertx.core.file.FileSystemOptions().apply {

  if (classPathResolvingEnabled != null) {
    this.setClassPathResolvingEnabled(classPathResolvingEnabled)
  }
  if (fileCachingEnabled != null) {
    this.setFileCachingEnabled(fileCachingEnabled)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.file.FileSystemOptions] objects.
 *
 * Vert.x file system base configuration, this class can be extended by provider implementations to configure
 * those specific implementations.
 *
 * @param classPathResolvingEnabled  When vert.x cannot find the file on the filesystem it tries to resolve the file from the class path when this is set to <code>true</code>.
 * @param fileCachingEnabled  Set to <code>true</code> to cache files on the real file system when the filesystem performs class path resolving.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystemOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("fileSystemOptionsOf(classPathResolvingEnabled, fileCachingEnabled)")
)
fun FileSystemOptions(
  classPathResolvingEnabled: Boolean? = null,
  fileCachingEnabled: Boolean? = null): FileSystemOptions = io.vertx.core.file.FileSystemOptions().apply {

  if (classPathResolvingEnabled != null) {
    this.setClassPathResolvingEnabled(classPathResolvingEnabled)
  }
  if (fileCachingEnabled != null) {
    this.setFileCachingEnabled(fileCachingEnabled)
  }
}

