package io.vertx.kotlin.redis.op

import io.vertx.redis.op.BitFieldOptions
import io.vertx.redis.op.BitFieldGetCommand
import io.vertx.redis.op.BitFieldIncrbyCommand
import io.vertx.redis.op.BitFieldSetCommand

fun BitFieldOptions(
  get: io.vertx.redis.op.BitFieldGetCommand? = null,
  incrby: io.vertx.redis.op.BitFieldIncrbyCommand? = null,
  set: io.vertx.redis.op.BitFieldSetCommand? = null): BitFieldOptions = io.vertx.redis.op.BitFieldOptions().apply {

  if (get != null) {
    this.setGet(get)
  }
  if (incrby != null) {
    this.setIncrby(incrby)
  }
  if (set != null) {
    this.setSet(set)
  }
}

