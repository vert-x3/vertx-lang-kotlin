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

suspend fun FileSystem.copy(from: String, to: String) {
  awaitResult<Void?> { this.copy(from, to, it) }
}

suspend fun FileSystem.copy(
    from: String,
    to: String,
    options: CopyOptions
) {
  awaitResult<Void?> { this.copy(from, to, options, it) }
}

suspend fun FileSystem.copyRecursive(
    from: String,
    to: String,
    recursive: Boolean
) {
  awaitResult<Void?> { this.copyRecursive(from, to, recursive, it) }
}

suspend fun FileSystem.move(from: String, to: String) {
  awaitResult<Void?> { this.move(from, to, it) }
}

suspend fun FileSystem.move(
    from: String,
    to: String,
    options: CopyOptions
) {
  awaitResult<Void?> { this.move(from, to, options, it) }
}

suspend fun FileSystem.truncate(path: String, len: Long) {
  awaitResult<Void?> { this.truncate(path, len, it) }
}

suspend fun FileSystem.chmod(path: String, perms: String) {
  awaitResult<Void?> { this.chmod(path, perms, it) }
}

suspend fun FileSystem.chmodRecursive(
    path: String,
    perms: String,
    dirPerms: String
) {
  awaitResult<Void?> { this.chmodRecursive(path, perms, dirPerms, it) }
}

suspend fun FileSystem.chown(
    path: String,
    user: String?,
    group: String?
) {
  awaitResult<Void?> { this.chown(path, user, group, it) }
}

suspend fun FileSystem.props(path: String): FileProps = awaitResult { this.props(path, it) }

suspend fun FileSystem.lprops(path: String): FileProps = awaitResult { this.lprops(path, it) }

suspend fun FileSystem.link(link: String, existing: String) {
  awaitResult<Void?> { this.link(link, existing, it) }
}

suspend fun FileSystem.symlink(link: String, existing: String) {
  awaitResult<Void?> { this.symlink(link, existing, it) }
}

suspend fun FileSystem.unlink(link: String) {
  awaitResult<Void?> { this.unlink(link, it) }
}

suspend fun FileSystem.readSymlink(link: String): String = awaitResult { this.readSymlink(link, it) }

suspend fun FileSystem.delete(path: String) {
  awaitResult<Void?> { this.delete(path, it) }
}

suspend fun FileSystem.deleteRecursive(path: String, recursive: Boolean) {
  awaitResult<Void?> { this.deleteRecursive(path, recursive, it) }
}

suspend fun FileSystem.mkdir(path: String) {
  awaitResult<Void?> { this.mkdir(path, it) }
}

suspend fun FileSystem.mkdir(path: String, perms: String) {
  awaitResult<Void?> { this.mkdir(path, perms, it) }
}

suspend fun FileSystem.mkdirs(path: String) {
  awaitResult<Void?> { this.mkdirs(path, it) }
}

suspend fun FileSystem.mkdirs(path: String, perms: String) {
  awaitResult<Void?> { this.mkdirs(path, perms, it) }
}

suspend fun FileSystem.readDir(path: String): MutableList<String> = awaitResult { this.readDir(path, it) }

suspend fun FileSystem.readDir(path: String, filter: String): MutableList<String> = awaitResult { this.readDir(path, filter, it) }

suspend fun FileSystem.readFile(path: String): Buffer = awaitResult { this.readFile(path, it) }

suspend fun FileSystem.writeFile(path: String, data: Buffer) {
  awaitResult<Void?> { this.writeFile(path, data, it) }
}

suspend fun FileSystem.open(path: String, options: OpenOptions): AsyncFile = awaitResult { this.open(path, options, it) }

suspend fun FileSystem.createFile(path: String) {
  awaitResult<Void?> { this.createFile(path, it) }
}

suspend fun FileSystem.createFile(path: String, perms: String) {
  awaitResult<Void?> { this.createFile(path, perms, it) }
}

suspend fun FileSystem.exists(path: String): Boolean = awaitResult { this.exists(path, it) }

suspend fun FileSystem.fsProps(path: String): FileSystemProps = awaitResult { this.fsProps(path, it) }
