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

