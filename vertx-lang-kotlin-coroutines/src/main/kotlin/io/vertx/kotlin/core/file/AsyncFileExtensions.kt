package io.vertx.kotlin.core.file

import io.vertx.core.buffer.Buffer
import io.vertx.core.file.AsyncFile
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Int
import kotlin.Long

suspend fun AsyncFile.close() {
  awaitResult<Void?> { this.close(it) }
}

suspend fun AsyncFile.write(buffer: Buffer, position: Long) {
  awaitResult<Void?> { this.write(buffer, position, it) }
}

suspend fun AsyncFile.read(
    buffer: Buffer,
    offset: Int,
    position: Long,
    length: Int
): Buffer = awaitResult { this.read(buffer, offset, position, length, it) }

suspend fun AsyncFile.flush() {
  awaitResult<Void?> { this.flush(it) }
}
