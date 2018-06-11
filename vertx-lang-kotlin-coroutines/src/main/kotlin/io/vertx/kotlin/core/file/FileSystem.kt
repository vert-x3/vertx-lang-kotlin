package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.core.file.CopyOptions
import io.vertx.core.file.FileProps
import io.vertx.core.file.FileSystem
import io.vertx.core.file.FileSystemProps
import io.vertx.core.file.OpenOptions
import io.vertx.kotlin.coroutines.awaitResult
import java.lang.Void

suspend fun FileSystem.copyAwait(from : String, to : String) : Void? {
    return awaitResult{
        this.copy(from, to, it)
    }
}

suspend fun FileSystem.copyAwait(from : String, to : String, options : CopyOptions) : Void? {
    return awaitResult{
        this.copy(from, to, options, it)
    }
}

suspend fun FileSystem.copyRecursiveAwait(from : String, to : String, recursive : Boolean) : Void? {
    return awaitResult{
        this.copyRecursive(from, to, recursive, it)
    }
}

suspend fun FileSystem.moveAwait(from : String, to : String) : Void? {
    return awaitResult{
        this.move(from, to, it)
    }
}

suspend fun FileSystem.moveAwait(from : String, to : String, options : CopyOptions) : Void? {
    return awaitResult{
        this.move(from, to, options, it)
    }
}

suspend fun FileSystem.truncateAwait(path : String, len : Long) : Void? {
    return awaitResult{
        this.truncate(path, len, it)
    }
}

suspend fun FileSystem.chmodAwait(path : String, perms : String) : Void? {
    return awaitResult{
        this.chmod(path, perms, it)
    }
}

suspend fun FileSystem.chmodRecursiveAwait(path : String, perms : String, dirPerms : String) : Void? {
    return awaitResult{
        this.chmodRecursive(path, perms, dirPerms, it)
    }
}

suspend fun FileSystem.chownAwait(path : String, user : String, group : String) : Void? {
    return awaitResult{
        this.chown(path, user, group, it)
    }
}

suspend fun FileSystem.propsAwait(path : String) : FileProps? {
    return awaitResult{
        this.props(path, it)
    }
}

suspend fun FileSystem.lpropsAwait(path : String) : FileProps? {
    return awaitResult{
        this.lprops(path, it)
    }
}

suspend fun FileSystem.linkAwait(link : String, existing : String) : Void? {
    return awaitResult{
        this.link(link, existing, it)
    }
}

suspend fun FileSystem.symlinkAwait(link : String, existing : String) : Void? {
    return awaitResult{
        this.symlink(link, existing, it)
    }
}

suspend fun FileSystem.unlinkAwait(link : String) : Void? {
    return awaitResult{
        this.unlink(link, it)
    }
}

suspend fun FileSystem.readSymlinkAwait(link : String) : String? {
    return awaitResult{
        this.readSymlink(link, it)
    }
}

suspend fun FileSystem.deleteAwait(path : String) : Void? {
    return awaitResult{
        this.delete(path, it)
    }
}

suspend fun FileSystem.deleteRecursiveAwait(path : String, recursive : Boolean) : Void? {
    return awaitResult{
        this.deleteRecursive(path, recursive, it)
    }
}

suspend fun FileSystem.mkdirAwait(path : String) : Void? {
    return awaitResult{
        this.mkdir(path, it)
    }
}

suspend fun FileSystem.mkdirAwait(path : String, perms : String) : Void? {
    return awaitResult{
        this.mkdir(path, perms, it)
    }
}

suspend fun FileSystem.mkdirsAwait(path : String) : Void? {
    return awaitResult{
        this.mkdirs(path, it)
    }
}

suspend fun FileSystem.mkdirsAwait(path : String, perms : String) : Void? {
    return awaitResult{
        this.mkdirs(path, perms, it)
    }
}

suspend fun FileSystem.readDirAwait(path : String) : List<String>? {
    return awaitResult{
        this.readDir(path, it)
    }
}

suspend fun FileSystem.readDirAwait(path : String, filter : String) : List<String>? {
    return awaitResult{
        this.readDir(path, filter, it)
    }
}

suspend fun FileSystem.readFileAwait(path : String) : Buffer? {
    return awaitResult{
        this.readFile(path, it)
    }
}

suspend fun FileSystem.writeFileAwait(path : String, data : Buffer) : Void? {
    return awaitResult{
        this.writeFile(path, data, it)
    }
}

suspend fun FileSystem.openAwait(path : String, options : OpenOptions) : AsyncFile? {
    return awaitResult{
        this.open(path, options, it)
    }
}

suspend fun FileSystem.createFileAwait(path : String) : Void? {
    return awaitResult{
        this.createFile(path, it)
    }
}

suspend fun FileSystem.createFileAwait(path : String, perms : String) : Void? {
    return awaitResult{
        this.createFile(path, perms, it)
    }
}

suspend fun FileSystem.existsAwait(path : String) : Boolean? {
    return awaitResult{
        this.exists(path, it)
    }
}

suspend fun FileSystem.fsPropsAwait(path : String) : FileSystemProps? {
    return awaitResult{
        this.fsProps(path, it)
    }
}

