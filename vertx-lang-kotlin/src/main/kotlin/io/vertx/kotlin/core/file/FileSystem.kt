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
 * Copy a file from the path <code>from</code> to path <code>to</code>, asynchronously.
 * <p>
 * The copy will fail if the destination already exists.
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.copyAwait(from : String, to : String) : Unit {
  return awaitResult{
    this.copy(from, to, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Copy a file from the path <code>from</code> to path <code>to</code>, asynchronously.
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param options options describing how the file should be copied
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.copyAwait(from : String, to : String, options : CopyOptions) : Unit {
  return awaitResult{
    this.copy(from, to, options, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Copy a file from the path <code>from</code> to path <code>to</code>, asynchronously.
 * <p>
 * If <code>recursive</code> is <code>true</code> and <code>from</code> represents a directory, then the directory and its contents
 * will be copied recursively to the destination <code>to</code>.
 * <p>
 * The copy will fail if the destination if the destination already exists.
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param recursive 
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.copyRecursiveAwait(from : String, to : String, recursive : Boolean) : Unit {
  return awaitResult{
    this.copyRecursive(from, to, recursive, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Move a file from the path <code>from</code> to path <code>to</code>, asynchronously.
 * <p>
 * The move will fail if the destination already exists.
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.moveAwait(from : String, to : String) : Unit {
  return awaitResult{
    this.move(from, to, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Move a file from the path <code>from</code> to path <code>to</code>, asynchronously.
 *
 * @param from the path to copy from
 * @param to the path to copy to
 * @param options options describing how the file should be copied
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.moveAwait(from : String, to : String, options : CopyOptions) : Unit {
  return awaitResult{
    this.move(from, to, options, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Truncate the file represented by <code>path</code> to length <code>len</code> in bytes, asynchronously.
 * <p>
 * The operation will fail if the file does not exist or <code>len</code> is less than <code>zero</code>.
 *
 * @param path the path to the file
 * @param len the length to truncate it to
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.truncateAwait(path : String, len : Long) : Unit {
  return awaitResult{
    this.truncate(path, len, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Change the permissions on the file represented by <code>path</code> to <code>perms</code>, asynchronously.
 * <p>
 * The permission String takes the form rwxr-x--- as
 * specified <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 *
 * @param path the path to the file
 * @param perms the permissions string
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.chmodAwait(path : String, perms : String) : Unit {
  return awaitResult{
    this.chmod(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Change the permissions on the file represented by <code>path</code> to <code>perms</code>, asynchronously.<p>
 * The permission String takes the form rwxr-x--- as
 * specified in {<a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>}.
 * <p>
 * If the file is directory then all contents will also have their permissions changed recursively. Any directory permissions will
 * be set to <code>dirPerms</code>, whilst any normal file permissions will be set to <code>perms</code>.
 *
 * @param path the path to the file
 * @param perms the permissions string
 * @param dirPerms the directory permissions
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.chmodRecursiveAwait(path : String, perms : String, dirPerms : String) : Unit {
  return awaitResult{
    this.chmodRecursive(path, perms, dirPerms, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Change the ownership on the file represented by <code>path</code> to <code>user</code> and {code group}, asynchronously.
 *
 * @param path the path to the file
 * @param user the user name, <code>null</code> will not change the user name
 * @param group the user group, <code>null</code> will not change the user group name
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.chownAwait(path : String, user : String, group : String) : Unit {
  return awaitResult{
    this.chown(path, user, group, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Obtain properties for the file represented by <code>path</code>, asynchronously.
 * <p>
 * If the file is a link, the link will be followed.
 *
 * @param path the path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.propsAwait(path : String) : FileProps {
  return awaitResult{
    this.props(path, it)
  }
}

/**
 * Obtain properties for the link represented by <code>path</code>, asynchronously.
 * <p>
 * The link will not be followed.
 *
 * @param path the path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.lpropsAwait(path : String) : FileProps {
  return awaitResult{
    this.lprops(path, it)
  }
}

/**
 * Create a hard link on the file system from <code>link</code> to <code>existing</code>, asynchronously.
 *
 * @param link the link
 * @param existing the link destination
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.linkAwait(link : String, existing : String) : Unit {
  return awaitResult{
    this.link(link, existing, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Create a symbolic link on the file system from <code>link</code> to <code>existing</code>, asynchronously.
 *
 * @param link the link
 * @param existing the link destination
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.symlinkAwait(link : String, existing : String) : Unit {
  return awaitResult{
    this.symlink(link, existing, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Unlinks the link on the file system represented by the path <code>link</code>, asynchronously.
 *
 * @param link the link
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.unlinkAwait(link : String) : Unit {
  return awaitResult{
    this.unlink(link, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Returns the path representing the file that the symbolic link specified by <code>link</code> points to, asynchronously.
 *
 * @param link the link
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.readSymlinkAwait(link : String) : String {
  return awaitResult{
    this.readSymlink(link, it)
  }
}

/**
 * Deletes the file represented by the specified <code>path</code>, asynchronously.
 *
 * @param path path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.deleteAwait(path : String) : Unit {
  return awaitResult{
    this.delete(path, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Deletes the file represented by the specified <code>path</code>, asynchronously.
 * <p>
 * If the path represents a directory and <code>recursive = true</code> then the directory and its contents will be
 * deleted recursively.
 *
 * @param path path to the file
 * @param recursive delete recursively?
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.deleteRecursiveAwait(path : String, recursive : Boolean) : Unit {
  return awaitResult{
    this.deleteRecursive(path, recursive, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Create the directory represented by <code>path</code>, asynchronously.
 * <p>
 * The operation will fail if the directory already exists.
 *
 * @param path path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.mkdirAwait(path : String) : Unit {
  return awaitResult{
    this.mkdir(path, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Create the directory represented by <code>path</code>, asynchronously.
 * <p>
 * The new directory will be created with permissions as specified by <code>perms</code>.
 * <p>
 * The permission String takes the form rwxr-x--- as specified
 * in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 * <p>
 * The operation will fail if the directory already exists.
 *
 * @param path path to the file
 * @param perms the permissions string
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.mkdirAwait(path : String, perms : String) : Unit {
  return awaitResult{
    this.mkdir(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Create the directory represented by <code>path</code> and any non existent parents, asynchronously.
 * <p>
 * The operation will fail if the directory already exists.
 *
 * @param path path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.mkdirsAwait(path : String) : Unit {
  return awaitResult{
    this.mkdirs(path, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Create the directory represented by <code>path</code> and any non existent parents, asynchronously.
 * <p>
 * The new directory will be created with permissions as specified by <code>perms</code>.
 * <p>
 * The permission String takes the form rwxr-x--- as specified
 * in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 * <p>
 * The operation will fail if the directory already exists.<p>
 *
 * @param path path to the file
 * @param perms the permissions string
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.mkdirsAwait(path : String, perms : String) : Unit {
  return awaitResult{
    this.mkdirs(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Read the contents of the directory specified by <code>path</code>, asynchronously.
 * <p>
 * The result is an array of String representing the paths of the files inside the directory.
 *
 * @param path path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.readDirAwait(path : String) : List<String> {
  return awaitResult{
    this.readDir(path, it)
  }
}

/**
 * Read the contents of the directory specified by <code>path</code>, asynchronously.
 * <p>
 * The parameter <code>filter</code> is a regular expression. If <code>filter</code> is specified then only the paths that
 * match  @{filter}will be returned.
 * <p>
 * The result is an array of String representing the paths of the files inside the directory.
 *
 * @param path path to the directory
 * @param filter the filter expression
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.readDirAwait(path : String, filter : String) : List<String> {
  return awaitResult{
    this.readDir(path, filter, it)
  }
}

/**
 * Reads the entire file as represented by the path <code>path</code> as a , asynchronously.
 * <p>
 * Do not use this method to read very large files or you risk running out of available RAM.
 *
 * @param path path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.readFileAwait(path : String) : Buffer {
  return awaitResult{
    this.readFile(path, it)
  }
}

/**
 * Creates the file, and writes the specified <code>Buffer data</code> to the file represented by the path <code>path</code>,
 * asynchronously.
 *
 * @param path path to the file
 * @param data 
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.writeFileAwait(path : String, data : Buffer) : Unit {
  return awaitResult{
    this.writeFile(path, data, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Open the file represented by <code>path</code>, asynchronously.
 * <p>
 * The file is opened for both reading and writing. If the file does not already exist it will be created.
 *
 * @param path path to the file
 * @param options options describing how the file should be opened
 * @param handler 
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.openAwait(path : String, options : OpenOptions) : AsyncFile {
  return awaitResult{
    this.open(path, options, it)
  }
}

/**
 * Creates an empty file with the specified <code>path</code>, asynchronously.
 *
 * @param path path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createFileAwait(path : String) : Unit {
  return awaitResult{
    this.createFile(path, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Creates an empty file with the specified <code>path</code> and permissions <code>perms</code>, asynchronously.
 *
 * @param path path to the file
 * @param perms the permissions string
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createFileAwait(path : String, perms : String) : Unit {
  return awaitResult{
    this.createFile(path, perms, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Determines whether the file as specified by the path <code>path</code> exists, asynchronously.
 *
 * @param path path to the file
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.existsAwait(path : String) : Boolean {
  return awaitResult{
    this.exists(path, it)
  }
}

/**
 * Returns properties of the file-system being used by the specified <code>path</code>, asynchronously.
 *
 * @param path path to anywhere on the filesystem
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.fsPropsAwait(path : String) : FileSystemProps {
  return awaitResult{
    this.fsProps(path, it)
  }
}

/**
 * Creates a new directory in the default temporary-file directory, using the given
 * prefix to generate its name, asynchronously.
 *
 * <p>
 * As with the <code>File.createTempFile</code> methods, this method is only
 * part of a temporary-file facility.A [java.lang.Runtime],
 * or the [java.io.File] mechanism may be used to delete the directory automatically.
 * </p>
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createTempDirectoryAwait(prefix : String) : String {
  return awaitResult{
    this.createTempDirectory(prefix, it)
  }
}

/**
 * Creates a new directory in the default temporary-file directory, using the given
 * prefix to generate its name, asynchronously.
 * <p>
 * The new directory will be created with permissions as specified by <code>perms</code>.
 * </p>
 * The permission String takes the form rwxr-x--- as specified
 * in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 *
 * <p>
 * As with the <code>File.createTempFile</code> methods, this method is only
 * part of a temporary-file facility.A [java.lang.Runtime],
 * or the [java.io.File] mechanism may be used to delete the directory automatically.
 * </p>
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param perms the permissions string
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createTempDirectoryAwait(prefix : String, perms : String) : String {
  return awaitResult{
    this.createTempDirectory(prefix, perms, it)
  }
}

/**
 * Creates a new directory in the directory provided by the path <code>path</code>, using the given
 * prefix to generate its name, asynchronously.
 * <p>
 * The new directory will be created with permissions as specified by <code>perms</code>.
 * </p>
 * The permission String takes the form rwxr-x--- as specified
 * in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 *
 * <p>
 * As with the <code>File.createTempFile</code> methods, this method is only
 * part of a temporary-file facility.A [java.lang.Runtime],
 * or the [java.io.File] mechanism may be used to delete the directory automatically.
 * </p>
 *
 * @param dir the path to directory in which to create the directory
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param perms the permissions string
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createTempDirectoryAwait(dir : String, prefix : String, perms : String) : String {
  return awaitResult{
    this.createTempDirectory(dir, prefix, perms, it)
  }
}

/**
 * Creates a new file in the default temporary-file directory, using the given
 * prefix and suffix to generate its name, asynchronously.
 *
 * <p>
 * As with the <code>File.createTempFile</code> methods, this method is only
 * part of a temporary-file facility.A [java.lang.Runtime],
 * or the [java.io.File] mechanism may be used to delete the directory automatically.
 * </p>
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param suffix the suffix string to be used in generating the file's name; may be <code>null</code>, in which case "<code>.tmp</code>" is used
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createTempFileAwait(prefix : String, suffix : String) : String {
  return awaitResult{
    this.createTempFile(prefix, suffix, it)
  }
}

/**
 * Creates a new file in the directory provided by the path <code>dir</code>, using the given
 * prefix and suffix to generate its name, asynchronously.
 *
 * <p>
 * As with the <code>File.createTempFile</code> methods, this method is only
 * part of a temporary-file facility.A [java.lang.Runtime],
 * or the [java.io.File] mechanism may be used to delete the directory automatically.
 * </p>
 *
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param suffix the suffix string to be used in generating the file's name; may be <code>null</code>, in which case "<code>.tmp</code>" is used
 * @param perms 
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createTempFileAwait(prefix : String, suffix : String, perms : String) : String {
  return awaitResult{
    this.createTempFile(prefix, suffix, perms, it)
  }
}

/**
 * Creates a new file in the directory provided by the path <code>dir</code>, using the given
 * prefix and suffix to generate its name, asynchronously.
 * <p>
 * The new directory will be created with permissions as specified by <code>perms</code>.
 * </p>
 * The permission String takes the form rwxr-x--- as specified
 * in <a href="http://download.oracle.com/javase/7/docs/api/java/nio/file/attribute/PosixFilePermissions.html">here</a>.
 *
 * <p>
 * As with the <code>File.createTempFile</code> methods, this method is only
 * part of a temporary-file facility.A [java.lang.Runtime],
 * or the [java.io.File] mechanism may be used to delete the directory automatically.
 * </p>
 *
 * @param dir the path to directory in which to create the directory
 * @param prefix the prefix string to be used in generating the directory's name; may be <code>null</code>
 * @param suffix the suffix string to be used in generating the file's name; may be <code>null</code>, in which case "<code>.tmp</code>" is used
 * @param perms the permissions string
 * @param handler the handler that will be called on completion
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.FileSystem original] using Vert.x codegen.
 */
suspend fun FileSystem.createTempFileAwait(dir : String, prefix : String, suffix : String, perms : String) : String {
  return awaitResult{
    this.createTempFile(dir, prefix, suffix, perms, it)
  }
}

