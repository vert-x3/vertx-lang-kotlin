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

import io.vertx.ext.mongo.RenameCollectionOptions

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.RenameCollectionOptions] objects.
 *
 * Options used to configure rename collection options.
 *
 * @param dropTarget   Sets if it should drop the target of renameCollection if exists.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.RenameCollectionOptions original] using Vert.x codegen.
 */
fun renameCollectionOptionsOf(
  dropTarget: Boolean? = null): RenameCollectionOptions = io.vertx.ext.mongo.RenameCollectionOptions().apply {

  if (dropTarget != null) {
    this.setDropTarget(dropTarget)
  }
}

