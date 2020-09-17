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

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.core.file.CopyOptions
import io.vertx.core.file.FileProps
import io.vertx.core.file.FileSystem
import io.vertx.core.file.FileSystemProps
import io.vertx.core.file.OpenOptions
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.copy]
 *
 * @param from the path to copy from
 * @param to the path to copy to
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use copy returning a future and chain with await()", replaceWith = ReplaceWith("copy(from, to).await()"))
suspend fun FileSystem.copyAwait(from: String, to: String): Unit {
  return awaitResult {
    this.copy(from, to, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.copy]
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param options options describing how the file should be copied
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use copy returning a future and chain with await()", replaceWith = ReplaceWith("copy(from, to, options).await()"))
suspend fun FileSystem.copyAwait(from: String, to: String, options: CopyOptions): Unit {
  return awaitResult {
    this.copy(from, to, options, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.copyRecursive]
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param recursive 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use copyRecursive returning a future and chain with await()", replaceWith = ReplaceWith("copyRecursive(from, to, recursive).await()"))
suspend fun FileSystem.copyRecursiveAwait(from: String, to: String, recursive: Boolean): Unit {
  return awaitResult {
    this.copyRecursive(from, to, recursive, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.move]
 *
 * @param from the path to copy from
 * @param to the path to copy to
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use move returning a future and chain with await()", replaceWith = ReplaceWith("move(from, to).await()"))
suspend fun FileSystem.moveAwait(from: String, to: String): Unit {
  return awaitResult {
    this.move(from, to, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.move]
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param options options describing how the file should be copied
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use move returning a future and chain with await()", replaceWith = ReplaceWith("move(from, to, options).await()"))
suspend fun FileSystem.moveAwait(from: String, to: String, options: CopyOptions): Unit {
  return awaitResult {
    this.move(from, to, options, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.truncate]
 *
 * @param path the path to the file
 * @param len the length to truncate it to
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use truncate returning a future and chain with await()", replaceWith = ReplaceWith("truncate(path, len).await()"))
suspend fun FileSystem.truncateAwait(path: String, len: Long): Unit {
  return awaitResult {
    this.truncate(path, len, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.chmod]
 *
 * @param path the path to the file
 * @param perms the permissions string
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use chmod returning a future and chain with await()", replaceWith = ReplaceWith("chmod(path, perms).await()"))
suspend fun FileSystem.chmodAwait(path: String, perms: String): Unit {
  return awaitResult {
    this.chmod(path, perms, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.chmodRecursive]
 *
 * @param path the path to the file
 * @param perms the permissions string
 * @param dirPerms the directory permissions
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use chmodRecursive returning a future and chain with await()", replaceWith = ReplaceWith("chmodRecursive(path, perms, dirPerms).await()"))
suspend fun FileSystem.chmodRecursiveAwait(path: String, perms: String, dirPerms: String): Unit {
  return awaitResult {
    this.chmodRecursive(path, perms, dirPerms, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.chown]
 *
 * @param path the path to the file
 * @param user the user name, <code>null</code> will not change the user name
 * @param group the user group, <code>null</code> will not change the user group name
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use chown returning a future and chain with await()", replaceWith = ReplaceWith("chown(path, user, group).await()"))
suspend fun FileSystem.chownAwait(path: String, user: String?, group: String?): Unit {
  return awaitResult {
    this.chown(path, user, group, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.props]
 *
 * @param path the path to the file
 * @return [FileProps]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use props returning a future and chain with await()", replaceWith = ReplaceWith("props(path).await()"))
suspend fun FileSystem.propsAwait(path: String): FileProps {
  return awaitResult {
    this.props(path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.lprops]
 *
 * @param path the path to the file
 * @return [FileProps]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use lprops returning a future and chain with await()", replaceWith = ReplaceWith("lprops(path).await()"))
suspend fun FileSystem.lpropsAwait(path: String): FileProps {
  return awaitResult {
    this.lprops(path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.link]
 *
 * @param link the link
 * @param existing the link destination
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use link returning a future and chain with await()", replaceWith = ReplaceWith("link(link, existing).await()"))
suspend fun FileSystem.linkAwait(link: String, existing: String): Unit {
  return awaitResult {
    this.link(link, existing, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.symlink]
 *
 * @param link the link
 * @param existing the link destination
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use symlink returning a future and chain with await()", replaceWith = ReplaceWith("symlink(link, existing).await()"))
suspend fun FileSystem.symlinkAwait(link: String, existing: String): Unit {
  return awaitResult {
    this.symlink(link, existing, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.unlink]
 *
 * @param link the link
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use unlink returning a future and chain with await()", replaceWith = ReplaceWith("unlink(link).await()"))
suspend fun FileSystem.unlinkAwait(link: String): Unit {
  return awaitResult {
    this.unlink(link, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.readSymlink]
 *
 * @param link the link
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readSymlink returning a future and chain with await()", replaceWith = ReplaceWith("readSymlink(link).await()"))
suspend fun FileSystem.readSymlinkAwait(link: String): String {
  return awaitResult {
    this.readSymlink(link, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.delete]
 *
 * @param path path to the file
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use delete returning a future and chain with await()", replaceWith = ReplaceWith("delete(path).await()"))
suspend fun FileSystem.deleteAwait(path: String): Unit {
  return awaitResult {
    this.delete(path, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.deleteRecursive]
 *
 * @param path path to the file
 * @param recursive delete recursively?
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use deleteRecursive returning a future and chain with await()", replaceWith = ReplaceWith("deleteRecursive(path, recursive).await()"))
suspend fun FileSystem.deleteRecursiveAwait(path: String, recursive: Boolean): Unit {
  return awaitResult {
    this.deleteRecursive(path, recursive, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.mkdir]
 *
 * @param path path to the file
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use mkdir returning a future and chain with await()", replaceWith = ReplaceWith("mkdir(path).await()"))
suspend fun FileSystem.mkdirAwait(path: String): Unit {
  return awaitResult {
    this.mkdir(path, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.mkdir]
 *
 * @param path path to the file
 * @param perms the permissions string
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use mkdir returning a future and chain with await()", replaceWith = ReplaceWith("mkdir(path, perms).await()"))
suspend fun FileSystem.mkdirAwait(path: String, perms: String): Unit {
  return awaitResult {
    this.mkdir(path, perms, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.mkdirs]
 *
 * @param path path to the file
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use mkdirs returning a future and chain with await()", replaceWith = ReplaceWith("mkdirs(path).await()"))
suspend fun FileSystem.mkdirsAwait(path: String): Unit {
  return awaitResult {
    this.mkdirs(path, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.mkdirs]
 *
 * @param path path to the file
 * @param perms the permissions string
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use mkdirs returning a future and chain with await()", replaceWith = ReplaceWith("mkdirs(path, perms).await()"))
suspend fun FileSystem.mkdirsAwait(path: String, perms: String): Unit {
  return awaitResult {
    this.mkdirs(path, perms, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.readDir]
 *
 * @param path path to the file
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readDir returning a future and chain with await()", replaceWith = ReplaceWith("readDir(path).await()"))
suspend fun FileSystem.readDirAwait(path: String): List<String> {
  return awaitResult {
    this.readDir(path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.readDir]
 *
 * @param path path to the directory
 * @param filter the filter expression
 * @return [List<String>]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readDir returning a future and chain with await()", replaceWith = ReplaceWith("readDir(path, filter).await()"))
suspend fun FileSystem.readDirAwait(path: String, filter: String): List<String> {
  return awaitResult {
    this.readDir(path, filter, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.readFile]
 *
 * @param path path to the file
 * @return [Buffer]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use readFile returning a future and chain with await()", replaceWith = ReplaceWith("readFile(path).await()"))
suspend fun FileSystem.readFileAwait(path: String): Buffer {
  return awaitResult {
    this.readFile(path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.writeFile]
 *
 * @param path path to the file
 * @param data 
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use writeFile returning a future and chain with await()", replaceWith = ReplaceWith("writeFile(path, data).await()"))
suspend fun FileSystem.writeFileAwait(path: String, data: Buffer): Unit {
  return awaitResult {
    this.writeFile(path, data, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.open]
 *
 * @param path path to the file
 * @param options options describing how the file should be opened
 * @return [AsyncFile]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use open returning a future and chain with await()", replaceWith = ReplaceWith("open(path, options).await()"))
suspend fun FileSystem.openAwait(path: String, options: OpenOptions): AsyncFile {
  return awaitResult {
    this.open(path, options, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createFile]
 *
 * @param path path to the file
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createFile returning a future and chain with await()", replaceWith = ReplaceWith("createFile(path).await()"))
suspend fun FileSystem.createFileAwait(path: String): Unit {
  return awaitResult {
    this.createFile(path, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createFile]
 *
 * @param path path to the file
 * @param perms the permissions string
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createFile returning a future and chain with await()", replaceWith = ReplaceWith("createFile(path, perms).await()"))
suspend fun FileSystem.createFileAwait(path: String, perms: String): Unit {
  return awaitResult {
    this.createFile(path, perms, io.vertx.core.Handler { ar -> it.handle(ar.mapEmpty()) })
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.exists]
 *
 * @param path path to the file
 * @return [Boolean]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use exists returning a future and chain with await()", replaceWith = ReplaceWith("exists(path).await()"))
suspend fun FileSystem.existsAwait(path: String): Boolean {
  return awaitResult {
    this.exists(path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.fsProps]
 *
 * @param path path to anywhere on the filesystem
 * @return [FileSystemProps]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use fsProps returning a future and chain with await()", replaceWith = ReplaceWith("fsProps(path).await()"))
suspend fun FileSystem.fsPropsAwait(path: String): FileSystemProps {
  return awaitResult {
    this.fsProps(path, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createTempDirectory]
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTempDirectory returning a future and chain with await()", replaceWith = ReplaceWith("createTempDirectory(prefix).await()"))
suspend fun FileSystem.createTempDirectoryAwait(prefix: String): String {
  return awaitResult {
    this.createTempDirectory(prefix, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createTempDirectory]
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param perms the permissions string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTempDirectory returning a future and chain with await()", replaceWith = ReplaceWith("createTempDirectory(prefix, perms).await()"))
suspend fun FileSystem.createTempDirectoryAwait(prefix: String, perms: String): String {
  return awaitResult {
    this.createTempDirectory(prefix, perms, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createTempDirectory]
 *
 * @param dir the path to directory in which to create the directory
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param perms the permissions string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTempDirectory returning a future and chain with await()", replaceWith = ReplaceWith("createTempDirectory(dir, prefix, perms).await()"))
suspend fun FileSystem.createTempDirectoryAwait(dir: String, prefix: String, perms: String): String {
  return awaitResult {
    this.createTempDirectory(dir, prefix, perms, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createTempFile]
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param suffix the suffix string to be used in generating the file's name; may be <code>null</code>, in which case "<code>.tmp</code>" is used
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTempFile returning a future and chain with await()", replaceWith = ReplaceWith("createTempFile(prefix, suffix).await()"))
suspend fun FileSystem.createTempFileAwait(prefix: String, suffix: String): String {
  return awaitResult {
    this.createTempFile(prefix, suffix, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createTempFile]
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param suffix the suffix string to be used in generating the file's name; may be <code>null</code>, in which case "<code>.tmp</code>" is used
 * @param perms 
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTempFile returning a future and chain with await()", replaceWith = ReplaceWith("createTempFile(prefix, suffix, perms).await()"))
suspend fun FileSystem.createTempFileAwait(prefix: String, suffix: String, perms: String): String {
  return awaitResult {
    this.createTempFile(prefix, suffix, perms, it)
  }
}

/**
 * Suspending version of method [io.vertx.core.file.FileSystem.createTempFile]
 *
 * @param dir the path to directory in which to create the directory
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param suffix the suffix string to be used in generating the file's name; may be <code>null</code>, in which case "<code>.tmp</code>" is used
 * @param perms the permissions string
 * @return [String]
 *
 * NOTE: This function has been automatically generated from [io.vertx.core.file.FileSystem] using Vert.x codegen.
 */
@Deprecated(message = "Instead use createTempFile returning a future and chain with await()", replaceWith = ReplaceWith("createTempFile(dir, prefix, suffix, perms).await()"))
suspend fun FileSystem.createTempFileAwait(dir: String, prefix: String, suffix: String, perms: String): String {
  return awaitResult {
    this.createTempFile(dir, prefix, suffix, perms, it)
  }
}

