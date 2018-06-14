package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.core.file.CopyOptions
import io.vertx.core.file.FileProps
import io.vertx.core.file.FileSystem
import io.vertx.core.file.FileSystemProps
import io.vertx.core.file.OpenOptions
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Copy a file from the path `from` to path `to`, asynchronously.
 *  <p>
 *  The copy will fail if the destination already exists.
 * @param from  the path to copy from
 * @param to  the path to copy to
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.copy(from: String, to: String) {
  awaitResult<Void?> { this.copy(from, to, it) }
}

/**
 *  Copy a file from the path `from` to path `to`, asynchronously.
 * @param from    the path to copy from
 * @param to      the path to copy to
 * @param options options describing how the file should be copied
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.copy(
  from: String,
  to: String,
  options: CopyOptions
) {
  awaitResult<Void?> { this.copy(from, to, options, it) }
}

/**
 *  Copy a file from the path `from` to path `to`, asynchronously.
 *  <p>
 *  If `recursive` is `true` and `from` represents a directory, then the directory and its contents
 *  will be copied recursively to the destination `to`.
 *  <p>
 *  The copy will fail if the destination if the destination already exists.
 * @param from  the path to copy from
 * @param to  the path to copy to
 * @param recursive
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.copyRecursive(
  from: String,
  to: String,
  recursive: Boolean
) {
  awaitResult<Void?> { this.copyRecursive(from, to, recursive, it) }
}

/**
 *  Move a file from the path `from` to path `to`, asynchronously.
 *  <p>
 *  The move will fail if the destination already exists.
 * @param from  the path to copy from
 * @param to  the path to copy to
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.move(from: String, to: String) {
  awaitResult<Void?> { this.move(from, to, it) }
}

/**
 *  Move a file from the path `from` to path `to`, asynchronously.
 * @param from    the path to copy from
 * @param to      the path to copy to
 * @param options options describing how the file should be copied
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.move(
  from: String,
  to: String,
  options: CopyOptions
) {
  awaitResult<Void?> { this.move(from, to, options, it) }
}

/**
 *  Truncate the file represented by `path` to length `len` in bytes, asynchronously.
 *  <p>
 *  The operation will fail if the file does not exist or `len` is less than `zero`.
 * @param path  the path to the file
 * @param len  the length to truncate it to
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.truncate(path: String, len: Long) {
  awaitResult<Void?> { this.truncate(path, len, it) }
}

/**
 *  Change the permissions on the file represented by `path` to `perms`, asynchronously.
 *  <p>
 *  The permission String takes the form rwxr-x--- as
 *  specified <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 * @param path  the path to the file
 * @param perms  the permissions string
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.chmod(path: String, perms: String) {
  awaitResult<Void?> { this.chmod(path, perms, it) }
}

/**
 *  Change the permissions on the file represented by `path` to `perms`, asynchronously.<p>
 *  The permission String takes the form rwxr-x--- as
 *  specified in {<a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>}.
 *  <p>
 *  If the file is directory then all contents will also have their permissions changed recursively. Any directory permissions will
 *  be set to `dirPerms`, whilst any normal file permissions will be set to `perms`.
 * @param path  the path to the file
 * @param perms  the permissions string
 * @param dirPerms  the directory permissions
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.chmodRecursive(
  path: String,
  perms: String,
  dirPerms: String
) {
  awaitResult<Void?> { this.chmodRecursive(path, perms, dirPerms, it) }
}

/**
 *  Change the ownership on the file represented by `path` to `user` and {code group}, asynchronously.
 * @param path  the path to the file
 * @param user  the user name, `null` will not change the user name
 * @param group  the user group, `null` will not change the user group name
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.chown(
  path: String,
  user: String?,
  group: String?
) {
  awaitResult<Void?> { this.chown(path, user, group, it) }
}

/**
 *  Obtain properties for the file represented by `path`, asynchronously.
 *  <p>
 *  If the file is a link, the link will be followed.
 * @param path  the path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.props(path: String): FileProps {
  return awaitResult { this.props(path, it) }
}

/**
 *  Obtain properties for the link represented by `path`, asynchronously.
 *  <p>
 *  The link will not be followed.
 * @param path  the path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.lprops(path: String): FileProps {
  return awaitResult { this.lprops(path, it) }
}

/**
 *  Create a hard link on the file system from `link` to `existing`, asynchronously.
 * @param link  the link
 * @param existing  the link destination
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.link(link: String, existing: String) {
  awaitResult<Void?> { this.link(link, existing, it) }
}

/**
 *  Create a symbolic link on the file system from `link` to `existing`, asynchronously.
 * @param link  the link
 * @param existing  the link destination
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.symlink(link: String, existing: String) {
  awaitResult<Void?> { this.symlink(link, existing, it) }
}

/**
 *  Unlinks the link on the file system represented by the path `link`, asynchronously.
 * @param link  the link
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.unlink(link: String) {
  awaitResult<Void?> { this.unlink(link, it) }
}

/**
 *  Returns the path representing the file that the symbolic link specified by `link` points to, asynchronously.
 * @param link  the link
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.readSymlink(link: String): String {
  return awaitResult { this.readSymlink(link, it) }
}

/**
 *  Deletes the file represented by the specified `path`, asynchronously.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.delete(path: String) {
  awaitResult<Void?> { this.delete(path, it) }
}

/**
 *  Deletes the file represented by the specified `path`, asynchronously.
 *  <p>
 *  If the path represents a directory and `recursive = true` then the directory and its contents will be
 *  deleted recursively.
 * @param path  path to the file
 * @param recursive  delete recursively?
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.deleteRecursive(path: String, recursive: Boolean) {
  awaitResult<Void?> { this.deleteRecursive(path, recursive, it) }
}

/**
 *  Create the directory represented by `path`, asynchronously.
 *  <p>
 *  The operation will fail if the directory already exists.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.mkdir(path: String) {
  awaitResult<Void?> { this.mkdir(path, it) }
}

/**
 *  Create the directory represented by `path`, asynchronously.
 *  <p>
 *  The new directory will be created with permissions as specified by `perms`.
 *  <p>
 *  The permission String takes the form rwxr-x--- as specified
 *  in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 *  <p>
 *  The operation will fail if the directory already exists.
 * @param path  path to the file
 * @param perms  the permissions string
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.mkdir(path: String, perms: String) {
  awaitResult<Void?> { this.mkdir(path, perms, it) }
}

/**
 *  Create the directory represented by `path` and any non existent parents, asynchronously.
 *  <p>
 *  The operation will fail if the directory already exists.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.mkdirs(path: String) {
  awaitResult<Void?> { this.mkdirs(path, it) }
}

/**
 *  Create the directory represented by `path` and any non existent parents, asynchronously.
 *  <p>
 *  The new directory will be created with permissions as specified by `perms`.
 *  <p>
 *  The permission String takes the form rwxr-x--- as specified
 *  in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 *  <p>
 *  The operation will fail if the directory already exists.<p>
 * @param path  path to the file
 * @param perms  the permissions string
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.mkdirs(path: String, perms: String) {
  awaitResult<Void?> { this.mkdirs(path, perms, it) }
}

/**
 *  Read the contents of the directory specified by `path`, asynchronously.
 *  <p>
 *  The result is an array of String representing the paths of the files inside the directory.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.readDir(path: String): MutableList<String> {
  return awaitResult { this.readDir(path, it) }
}

/**
 *  Read the contents of the directory specified by `path`, asynchronously.
 *  <p>
 *  The parameter `filter` is a regular expression. If `filter` is specified then only the paths that
 *  match  @{filter}will be returned.
 *  <p>
 *  The result is an array of String representing the paths of the files inside the directory.
 * @param path  path to the directory
 * @param filter  the filter expression
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.readDir(path: String, filter: String): MutableList<String> {
  return awaitResult { this.readDir(path, filter, it) }
}

/**
 *  Reads the entire file as represented by the path `path` as a [Buffer], asynchronously.
 *  <p>
 *  Do not use this method to read very large files or you risk running out of available RAM.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.readFile(path: String): Buffer {
  return awaitResult { this.readFile(path, it) }
}

/**
 *  Creates the file, and writes the specified `Buffer data` to the file represented by the path `path`,
 *  asynchronously.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.writeFile(path: String, data: Buffer) {
  awaitResult<Void?> { this.writeFile(path, data, it) }
}

/**
 *  Open the file represented by `path`, asynchronously.
 *  <p>
 *  The file is opened for both reading and writing. If the file does not already exist it will be created.
 * @param path  path to the file
 * @param options options describing how the file should be opened
 * @return a reference to this, so the API can be used fluently
 *
 */
suspend fun FileSystem.open(path: String, options: OpenOptions): AsyncFile {
  return awaitResult { this.open(path, options, it) }
}

/**
 *  Creates an empty file with the specified `path`, asynchronously.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.createFile(path: String) {
  awaitResult<Void?> { this.createFile(path, it) }
}

/**
 *  Creates an empty file with the specified `path` and permissions `perms`, asynchronously.
 * @param path  path to the file
 * @param perms  the permissions string
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.createFile(path: String, perms: String) {
  awaitResult<Void?> { this.createFile(path, perms, it) }
}

/**
 *  Determines whether the file as specified by the path `path` exists, asynchronously.
 * @param path  path to the file
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.exists(path: String): Boolean {
  return awaitResult { this.exists(path, it) }
}

/**
 *  Returns properties of the file-system being used by the specified `path`, asynchronously.
 * @param path  path to anywhere on the filesystem
 * @return a reference to this, so the API can be used fluently
 */
suspend fun FileSystem.fsProps(path: String): FileSystemProps {
  return awaitResult { this.fsProps(path, it) }
}
