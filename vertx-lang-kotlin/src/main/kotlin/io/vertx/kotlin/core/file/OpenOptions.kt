package io.vertx.kotlin.core.file

import io.vertx.core.file.OpenOptions

/**
 * A function providing a DSL for building [io.vertx.core.file.OpenOptions] objects.
 *
 * Describes how an [io.vertx.core.file.AsyncFile] should be opened.
 *
 * @param append  Whether the file should be opened in append mode. Defaults to <code>false</code>.
 * @param create  Set whether the file should be created if it does not already exist.
 * @param createNew  Set whether the file should be created and fail if it does exist already.
 * @param deleteOnClose  Set whether the file should be deleted when it's closed, or the JVM is shutdown.
 * @param dsync  Set whether every write to the file's content  ill be written synchronously to the underlying hardware.
 * @param perms  Set the permissions string
 * @param read  Set whether the file is to be opened for reading
 * @param sparse  Set whether a hint should be provided that the file to created is sparse
 * @param sync  Set whether every write to the file's content and meta-data will be written synchronously to the underlying hardware.
 * @param truncateExisting  Set whether the file should be truncated to zero length on opening if it exists and is opened for write
 * @param write  Set whether the file is to be opened for writing
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.OpenOptions original] using Vert.x codegen.
 */
fun openOptionsOf(
  append: Boolean? = null,
  create: Boolean? = null,
  createNew: Boolean? = null,
  deleteOnClose: Boolean? = null,
  dsync: Boolean? = null,
  perms: String? = null,
  read: Boolean? = null,
  sparse: Boolean? = null,
  sync: Boolean? = null,
  truncateExisting: Boolean? = null,
  write: Boolean? = null): OpenOptions = io.vertx.core.file.OpenOptions().apply {

  if (append != null) {
    this.setAppend(append)
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
  if (dsync != null) {
    this.setDsync(dsync)
  }
  if (perms != null) {
    this.setPerms(perms)
  }
  if (read != null) {
    this.setRead(read)
  }
  if (sparse != null) {
    this.setSparse(sparse)
  }
  if (sync != null) {
    this.setSync(sync)
  }
  if (truncateExisting != null) {
    this.setTruncateExisting(truncateExisting)
  }
  if (write != null) {
    this.setWrite(write)
  }
}

