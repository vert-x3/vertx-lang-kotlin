package io.vertx.kotlin.core.http

import io.vertx.core.http.StreamPriority

/**
 * A function providing a DSL for building [io.vertx.core.http.StreamPriority] objects.
 *
 * This class represents HTTP/2 stream priority defined in RFC 7540 clause 5.3
 *
 * @param dependency  Set the priority dependency value.
 * @param exclusive  Set the priority exclusive value.
 * @param weight  Set the priority weight.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.StreamPriority original] using Vert.x codegen.
 */
fun streamPriorityOf(
  dependency: Int? = null,
  exclusive: Boolean? = null,
  weight: Short? = null): StreamPriority = io.vertx.core.http.StreamPriority().apply {

  if (dependency != null) {
    this.setDependency(dependency)
  }
  if (exclusive != null) {
    this.setExclusive(exclusive)
  }
  if (weight != null) {
    this.setWeight(weight)
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.http.StreamPriority] objects.
 *
 * This class represents HTTP/2 stream priority defined in RFC 7540 clause 5.3
 *
 * @param dependency  Set the priority dependency value.
 * @param exclusive  Set the priority exclusive value.
 * @param weight  Set the priority weight.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.http.StreamPriority original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("streamPriorityOf(dependency, exclusive, weight)")
)
fun StreamPriority(
  dependency: Int? = null,
  exclusive: Boolean? = null,
  weight: Short? = null): StreamPriority = io.vertx.core.http.StreamPriority().apply {

  if (dependency != null) {
    this.setDependency(dependency)
  }
  if (exclusive != null) {
    this.setExclusive(exclusive)
  }
  if (weight != null) {
    this.setWeight(weight)
  }
}

