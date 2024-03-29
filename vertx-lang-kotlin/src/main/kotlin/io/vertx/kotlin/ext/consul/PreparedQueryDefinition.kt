/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.PreparedQueryDefinition

/**
 * A function providing a DSL for building [io.vertx.ext.consul.PreparedQueryDefinition] objects.
 *
 * Defines a prepared query.
 *
 * @param id  Set ID of the query, always generated by Consul
 * @param name  Set an optional friendly name that can be used to execute a query instead of using its ID
 * @param session  Set the ID of an existing session. This provides a way to automatically remove a prepared query when the given session is invalidated. If not given the prepared query must be manually removed when no longer needed.
 * @param service  Set the name of the service to query
 * @param token  Set the ACL token to use each time the query is executed. This allows queries to be executed by clients with lesser or even no ACL Token, so this should be used with care.
 * @param dnsTtl  Set the TTL duration when query results are served over DNS. If this is specified, it will take precedence over any Consul agent-specific configuration.
 * @param nearestN  Specifies that the query will be forwarded to up to NearestN other datacenters based on their estimated network round trip time using Network Coordinates from the WAN gossip pool. The median round trip time from the server handling the query to the servers in the remote datacenter is used to determine the priority.
 * @param dcs  Specifies a fixed list of remote datacenters to forward the query to if there are no healthy nodes in the local datacenter. Datacenters are queried in the order given in the list. If this option is combined with NearestN, then the NearestN queries will be performed first, followed by the list given by Datacenters. A given datacenter will only be queried one time during a failover, even if it is selected by both NearestN and is listed in Datacenters.
 * @param tags  Set a list of service tags to filter the query results. For a service to pass the tag filter it must have all of the required tags, and none of the excluded tags (prefixed with `!`).
 * @param passing  Specifies the behavior of the query's health check filtering. If this is set to false, the results will include nodes with checks in the passing as well as the warning states. If this is set to true, only nodes with checks in the passing state will be returned.
 * @param meta  Set a list of user-defined key/value pairs that will be used for filtering the query results to nodes with the given metadata values present.
 * @param templateType  The template type, which must be <code>name_prefix_match</code>. This means that the template will apply to any query lookup with a name whose prefix matches the Name field of the template.
 * @param templateRegexp  Set regular expression which is used to extract fields from the entire name, once this template is selected.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.PreparedQueryDefinition original] using Vert.x codegen.
 */
fun preparedQueryDefinitionOf(
  id: String? = null,
  name: String? = null,
  session: String? = null,
  service: String? = null,
  token: String? = null,
  dnsTtl: String? = null,
  nearestN: Int? = null,
  dcs: Iterable<String>? = null,
  tags: Iterable<String>? = null,
  passing: Boolean? = null,
  meta: Map<String, String>? = null,
  templateType: String? = null,
  templateRegexp: String? = null): PreparedQueryDefinition = io.vertx.ext.consul.PreparedQueryDefinition().apply {

  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
  if (session != null) {
    this.setSession(session)
  }
  if (service != null) {
    this.setService(service)
  }
  if (token != null) {
    this.setToken(token)
  }
  if (dnsTtl != null) {
    this.setDnsTtl(dnsTtl)
  }
  if (nearestN != null) {
    this.setNearestN(nearestN)
  }
  if (dcs != null) {
    this.setDcs(dcs.toList())
  }
  if (tags != null) {
    this.setTags(tags.toList())
  }
  if (passing != null) {
    this.setPassing(passing)
  }
  if (meta != null) {
    this.setMeta(meta)
  }
  if (templateType != null) {
    this.setTemplateType(templateType)
  }
  if (templateRegexp != null) {
    this.setTemplateRegexp(templateRegexp)
  }
}

