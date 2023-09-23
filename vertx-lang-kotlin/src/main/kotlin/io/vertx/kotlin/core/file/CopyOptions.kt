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

import io.vertx.core.file.CopyOptions

/**
 * A function providing a DSL for building [io.vertx.core.file.CopyOptions] objects.
 *
 * Describes the copy (and move) options.
 *
 * @param replaceExisting  Whether an existing file, empty directory, or link should be replaced. Defaults to <code>false</code>.
 * @param copyAttributes  Whether the file attributes should be copied. Defaults to <code>false</code>.
 * @param atomicMove  Whether move should be performed as an atomic filesystem operation. Defaults to <code>false</code>.
 * @param nofollowLinks  Whether symbolic links should not be followed during copy or move operations. Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.CopyOptions original] using Vert.x codegen.
 */
fun copyOptionsOf(
  replaceExisting: Boolean? = null,
  copyAttributes: Boolean? = null,
  atomicMove: Boolean? = null,
  nofollowLinks: Boolean? = null): CopyOptions = io.vertx.core.file.CopyOptions().apply {

  if (replaceExisting != null) {
    this.setReplaceExisting(replaceExisting)
  }
  if (copyAttributes != null) {
    this.setCopyAttributes(copyAttributes)
  }
  if (atomicMove != null) {
    this.setAtomicMove(atomicMove)
  }
  if (nofollowLinks != null) {
    this.setNofollowLinks(nofollowLinks)
  }
}

