package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldSetCommand

fun bitFieldSetCommandOf(
  offset: Long? = null,
  type: String? = null,
  value: Long? = null): BitFieldSetCommand = io.vertx.redis.op.BitFieldSetCommand().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("bitFieldSetCommandOf(offset, type, value)")
)
fun BitFieldSetCommand(
  offset: Long? = null,
  type: String? = null,
  value: Long? = null): BitFieldSetCommand = io.vertx.redis.op.BitFieldSetCommand().apply {

  if (offset != null) {
    this.setOffset(offset)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

