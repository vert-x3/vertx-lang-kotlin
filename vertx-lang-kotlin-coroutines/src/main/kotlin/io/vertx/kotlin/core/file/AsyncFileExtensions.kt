package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.Long

/**
 *  Close the file. The actual close happens asynchronously.
 *  The handler will be called when the close is complete, or an error occurs. */
suspend fun AsyncFile.closeSuspending() {
  awaitResult<Void?> { this.close(it) }
}

/**
 *  Write a [io.vertx.core.buffer.Buffer] to the file at position `position` in the file, asynchronously.
 *  <p>
 *  If `position` lies outside of the current size
 *  of the file, the file will be enlarged to encompass it.
 *  <p>
 *  When multiple writes are invoked on the same file
 *  there are no guarantees as to order in which those writes actually occur
 *  <p>
 *  The handler will be called when the write is complete, or if an error occurs.
 * @param buffer  the buffer to write
 * @param position  the position in the file to write it at
 * @return a reference to this, so the API can be used fluently
 */
suspend fun AsyncFile.write(buffer: Buffer, position: Long) {
  awaitResult<Void?> { this.write(buffer, position, it) }
}

/**
 *  Reads `length` bytes of data from the file at position `position` in the file, asynchronously.
 *  <p>
 *  The read data will be written into the specified `Buffer buffer` at position `offset`.
 *  <p>
 *  If data is read past the end of the file then zero bytes will be read.<p>
 *  When multiple reads are invoked on the same file there are no guarantees as to order in which those reads actually occur.
 *  <p>
 *  The handler will be called when the close is complete, or if an error occurs.
 * @param buffer  the buffer to read into
 * @param offset  the offset into the buffer where the data will be read
 * @param position  the position in the file where to start reading
 * @param length  the number of bytes to read
 * @return a reference to this, so the API can be used fluently
 */
suspend fun AsyncFile.read(
  buffer: Buffer,
  offset: Int,
  position: Long,
  length: Int
): Buffer {
  return awaitResult { this.read(buffer, offset, position, length, it) }
}

/**
 *  Same as [AsyncFile.flush] but the handler will be called when the flush is complete or if an error occurs
 */
suspend fun AsyncFile.flushSuspending() {
  awaitResult<Void?> { this.flush(it) }
}
