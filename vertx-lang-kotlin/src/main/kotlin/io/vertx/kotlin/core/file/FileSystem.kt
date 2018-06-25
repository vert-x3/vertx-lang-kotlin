package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.core.file.CopyOptions
import io.vertx.core.file.FileProps
import io.vertx.core.file.FileSystem
import io.vertx.core.file.FileSystemProps
import io.vertx.core.file.OpenOptions
import io.vertx.kotlin.coroutines.awaitResult

suspend fun FileSystem.copyAwait(from : String, to : String) : Unit {
    return awaitResult{
        this.copy(from, to, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.copyAwait(from : String, to : String, options : CopyOptions) : Unit {
    return awaitResult{
        this.copy(from, to, options, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.copyRecursiveAwait(from : String, to : String, recursive : Boolean) : Unit {
    return awaitResult{
        this.copyRecursive(from, to, recursive, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.moveAwait(from : String, to : String) : Unit {
    return awaitResult{
        this.move(from, to, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.moveAwait(from : String, to : String, options : CopyOptions) : Unit {
    return awaitResult{
        this.move(from, to, options, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.truncateAwait(path : String, len : Long) : Unit {
    return awaitResult{
        this.truncate(path, len, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.chmodAwait(path : String, perms : String) : Unit {
    return awaitResult{
        this.chmod(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.chmodRecursiveAwait(path : String, perms : String, dirPerms : String) : Unit {
    return awaitResult{
        this.chmodRecursive(path, perms, dirPerms, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.chownAwait(path : String, user : String, group : String) : Unit {
    return awaitResult{
        this.chown(path, user, group, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.propsAwait(path : String) : FileProps {
    return awaitResult{
        this.props(path, it)
    }
}

suspend fun FileSystem.lpropsAwait(path : String) : FileProps {
    return awaitResult{
        this.lprops(path, it)
    }
}

suspend fun FileSystem.linkAwait(link : String, existing : String) : Unit {
    return awaitResult{
        this.link(link, existing, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.symlinkAwait(link : String, existing : String) : Unit {
    return awaitResult{
        this.symlink(link, existing, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.unlinkAwait(link : String) : Unit {
    return awaitResult{
        this.unlink(link, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.readSymlinkAwait(link : String) : String {
    return awaitResult{
        this.readSymlink(link, it)
    }
}

suspend fun FileSystem.deleteAwait(path : String) : Unit {
    return awaitResult{
        this.delete(path, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.deleteRecursiveAwait(path : String, recursive : Boolean) : Unit {
    return awaitResult{
        this.deleteRecursive(path, recursive, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.mkdirAwait(path : String) : Unit {
    return awaitResult{
        this.mkdir(path, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.mkdirAwait(path : String, perms : String) : Unit {
    return awaitResult{
        this.mkdir(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.mkdirsAwait(path : String) : Unit {
    return awaitResult{
        this.mkdirs(path, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.mkdirsAwait(path : String, perms : String) : Unit {
    return awaitResult{
        this.mkdirs(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.readDirAwait(path : String) : List<String> {
    return awaitResult{
        this.readDir(path, it)
    }
}

suspend fun FileSystem.readDirAwait(path : String, filter : String) : List<String> {
    return awaitResult{
        this.readDir(path, filter, it)
    }
}

suspend fun FileSystem.readFileAwait(path : String) : Buffer {
    return awaitResult{
        this.readFile(path, it)
    }
}

suspend fun FileSystem.writeFileAwait(path : String, data : Buffer) : Unit {
    return awaitResult{
        this.writeFile(path, data, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.openAwait(path : String, options : OpenOptions) : AsyncFile {
    return awaitResult{
        this.open(path, options, it)
    }
}

suspend fun FileSystem.createFileAwait(path : String) : Unit {
    return awaitResult{
        this.createFile(path, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.createFileAwait(path : String, perms : String) : Unit {
    return awaitResult{
        this.createFile(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

suspend fun FileSystem.existsAwait(path : String) : Boolean {
    return awaitResult{
        this.exists(path, it)
    }
}

suspend fun FileSystem.fsPropsAwait(path : String) : FileSystemProps {
    return awaitResult{
        this.fsProps(path, it)
    }
}

