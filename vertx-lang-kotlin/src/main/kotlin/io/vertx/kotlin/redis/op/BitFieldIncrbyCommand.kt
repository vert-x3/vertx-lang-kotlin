package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldIncrbyCommand

fun BitFieldIncrbyCommand(
  increment: Long? = null,
  offset: Long? = null,
  type: String? = null): BitFieldIncrbyCommand = io.vertx.redis.op.BitFieldIncrbyCommand().apply {

  if (increment != null) {
    this.setIncrement(increment)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

