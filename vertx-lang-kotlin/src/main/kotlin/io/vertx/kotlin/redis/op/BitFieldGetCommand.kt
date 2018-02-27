package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldGetCommand

fun BitFieldGetCommand(
  offset: Long? = null,
  type: String? = null): BitFieldGetCommand = io.vertx.redis.op.BitFieldGetCommand().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
}

