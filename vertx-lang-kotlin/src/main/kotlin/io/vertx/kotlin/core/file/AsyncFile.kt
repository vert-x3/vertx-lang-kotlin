package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Close the file. The actual close happens asynchronously.
 * The handler will be called when the close is complete, or an error occurs.
 *
 * @param handler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.AsyncFile original] using Vert.x codegen.
 */
suspend fun AsyncFile.closeAwait() : Unit {
  return awaitResult{
    this.close({ ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Write a [io.vertx.core.buffer.Buffer] to the file at position <code>position</code> in the file, asynchronously.
 * <p>
 * If <code>position</code> lies outside of the current size
 * of the file, the file will be enlarged to encompass it.
 * <p>
 * When multiple writes are invoked on the same file
 * there are no guarantees as to order in which those writes actually occur
 * <p>
 * The handler will be called when the write is complete, or if an error occurs.
 *
 * @param buffer the buffer to write
 * @param position the position in the file to write it at
 * @param handler the handler to call when the write is complete
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.AsyncFile original] using Vert.x codegen.
 */
suspend fun AsyncFile.writeAwait(buffer : Buffer, position : Long) : Unit {
  return awaitResult{
    this.write(buffer, position, { ar -> it.handle(ar.mapEmpty()) })}
}

/**
 * Reads <code>length</code> bytes of data from the file at position <code>position</code> in the file, asynchronously.
 * <p>
 * The read data will be written into the specified <code>Buffer buffer</code> at position <code>offset</code>.
 * <p>
 * If data is read past the end of the file then zero bytes will be read.<p>
 * When multiple reads are invoked on the same file there are no guarantees as to order in which those reads actually occur.
 * <p>
 * The handler will be called when the close is complete, or if an error occurs.
 *
 * @param buffer the buffer to read into
 * @param offset the offset into the buffer where the data will be read
 * @param position the position in the file where to start reading
 * @param length the number of bytes to read
 * @param handler the handler to call when the write is complete
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.AsyncFile original] using Vert.x codegen.
 */
suspend fun AsyncFile.readAwait(buffer : Buffer, offset : Int, position : Long, length : Int) : Buffer {
  return awaitResult{
    this.read(buffer, offset, position, length, it)
  }
}

/**
 * Same as [io.vertx.core.file.AsyncFile] but the handler will be called when the flush is complete or if an error occurs
 *
 * @param handler 
 * @return *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.file.AsyncFile original] using Vert.x codegen.
 */
suspend fun AsyncFile.flushAwait() : Unit {
  return awaitResult{
    this.flush({ ar -> it.handle(ar.mapEmpty()) })}
}

