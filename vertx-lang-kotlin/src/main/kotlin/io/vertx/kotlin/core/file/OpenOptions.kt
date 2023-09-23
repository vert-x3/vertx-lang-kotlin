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

import io.vertx.core.file.OpenOptions

/**
 * A function providing a DSL for building [io.vertx.core.file.OpenOptions] objects.
 *
 * Describes how an [io.vertx.core.file.AsyncFile] should be opened.
 *
 * @param perms  Set the permissions string
 * @param read  Set whether the file is to be opened for reading
 * @param write  Set whether the file is to be opened for writing
 * @param create  Set whether the file should be created if it does not already exist.
 * @param createNew  Set whether the file should be created and fail if it does exist already.
 * @param deleteOnClose  Set whether the file should be deleted when it's closed, or the JVM is shutdown.
 * @param truncateExisting  Set whether the file should be truncated to zero length on opening if it exists and is opened for write
 * @param sparse  Set whether a hint should be provided that the file to created is sparse
 * @param sync  Set whether every write to the file's content and meta-data will be written synchronously to the underlying hardware.
 * @param dsync  Set whether every write to the file's content will be written synchronously to the underlying hardware.
 * @param append  Whether the file should be opened in append mode. Defaults to <code>false</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.OpenOptions original] using Vert.x codegen.
 */
fun openOptionsOf(
  perms: String? = null,
  read: Boolean? = null,
  write: Boolean? = null,
  create: Boolean? = null,
  createNew: Boolean? = null,
  deleteOnClose: Boolean? = null,
  truncateExisting: Boolean? = null,
  sparse: Boolean? = null,
  sync: Boolean? = null,
  dsync: Boolean? = null,
  append: Boolean? = null): OpenOptions = io.vertx.core.file.OpenOptions().apply {

  if (perms != null) {
    this.setPerms(perms)
  }
  if (read != null) {
    this.setRead(read)
  }
  if (write != null) {
    this.setWrite(write)
  }
  if (create != null) {
    this.setCreate(create)
  }
  if (createNew != null) {
    this.setCreateNew(createNew)
  }
  if (deleteOnClose != null) {
    this.setDeleteOnClose(deleteOnClose)
  }
  if (truncateExisting != null) {
    this.setTruncateExisting(truncateExisting)
  }
  if (sparse != null) {
    this.setSparse(sparse)
  }
  if (sync != null) {
    this.setSync(sync)
  }
  if (dsync != null) {
    this.setDsync(dsync)
  }
  if (append != null) {
    this.setAppend(append)
  }
}

