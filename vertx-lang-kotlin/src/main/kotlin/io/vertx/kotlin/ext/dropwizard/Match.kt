package io.vertx.kotlin.ext.dropwizard

import io.vertx.ext.dropwizard.Match
import io.vertx.ext.dropwizard.MatchType

/**
 * A function providing a DSL for building [io.vertx.ext.dropwizard.Match] objects.
 *
 * A match for a value.
 *
 * @param alias  Set the alias the human readable name that will be used as a part of registry entry name when the value matches.
 * @param type  Set the type of matching to apply.
 * @param value  Set the matched value.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.dropwizard.Match original] using Vert.x codegen.
 */
fun matchOf(
  alias: String? = null,
  type: MatchType? = null,
  value: String? = null): Match = io.vertx.ext.dropwizard.Match().apply {

  if (alias != null) {
    this.setAlias(alias)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.dropwizard.Match] objects.
 *
 * A match for a value.
 *
 * @param alias  Set the alias the human readable name that will be used as a part of registry entry name when the value matches.
 * @param type  Set the type of matching to apply.
 * @param value  Set the matched value.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.dropwizard.Match original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("matchOf(alias, type, value)")
)
fun Match(
  alias: String? = null,
  type: MatchType? = null,
  value: String? = null): Match = io.vertx.ext.dropwizard.Match().apply {

  if (alias != null) {
    this.setAlias(alias)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

