package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.MemberDescription
import io.vertx.kafka.admin.MemberAssignment

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.MemberDescription] objects.
 *
 * A detailed description of a single group instance in the cluster
 *
 * @param assignment  Set the assignment of the group member
 * @param clientId  Set the client id of the group member
 * @param consumerId  Set the consumer id of the group member
 * @param host  Set the host where the group member is running
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.MemberDescription original] using Vert.x codegen.
 */
fun memberDescriptionOf(
  assignment: io.vertx.kafka.admin.MemberAssignment? = null,
  clientId: String? = null,
  consumerId: String? = null,
  host: String? = null): MemberDescription = io.vertx.kafka.admin.MemberDescription().apply {

  if (assignment != null) {
    this.setAssignment(assignment)
  }
  if (clientId != null) {
    this.setClientId(clientId)
  }
  if (consumerId != null) {
    this.setConsumerId(consumerId)
  }
  if (host != null) {
    this.setHost(host)
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.MemberDescription] objects.
 *
 * A detailed description of a single group instance in the cluster
 *
 * @param assignment  Set the assignment of the group member
 * @param clientId  Set the client id of the group member
 * @param consumerId  Set the consumer id of the group member
 * @param host  Set the host where the group member is running
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.MemberDescription original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("memberDescriptionOf(assignment, clientId, consumerId, host)")
)
fun MemberDescription(
  assignment: io.vertx.kafka.admin.MemberAssignment? = null,
  clientId: String? = null,
  consumerId: String? = null,
  host: String? = null): MemberDescription = io.vertx.kafka.admin.MemberDescription().apply {

  if (assignment != null) {
    this.setAssignment(assignment)
  }
  if (clientId != null) {
    this.setClientId(clientId)
  }
  if (consumerId != null) {
    this.setConsumerId(consumerId)
  }
  if (host != null) {
    this.setHost(host)
  }
}

