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
package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.GridFsDownloadOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.GridFsDownloadOptions] objects.
 *
 * Options used to configure downloads from GridFS.
 *
 * @param revision 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.GridFsDownloadOptions original] using Vert.x codegen.
 */
fun gridFsDownloadOptionsOf(
  revision: Int? = null): GridFsDownloadOptions = io.vertx.ext.mongo.GridFsDownloadOptions().apply {

  if (revision != null) {
    this.setRevision(revision)
  }
}

