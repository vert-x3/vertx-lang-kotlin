package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckOptions
import io.vertx.ext.consul.CheckStatus

/**
 * A function providing a DSL for building [io.vertx.ext.consul.CheckOptions] objects.
 *
 * Options used to register checks in Consul.
 *
 * @param deregisterAfter  Set deregister timeout. This is optional field, which is a timeout in the same time format as Interval and TTL. If a check is associated with a service and has the critical state for more than this configured value, then its associated service (and all of its associated checks) will automatically be deregistered. The minimum timeout is 1 minute, and the process that reaps critical services runs every 30 seconds, so it may take slightly longer than the configured timeout to trigger the deregistration. This should generally be configured with a timeout that's much, much longer than any expected recoverable outage for the given service.
 * @param http  Set HTTP address to check. Also you should set checking interval
 * @param id  Set check ID
 * @param interval  Set checking interval
 * @param name  Set check name. This is mandatory field
 * @param notes  Set check notes
 * @param script  Set path to checking script. Also you should set checking interval
 * @param serviceId  Set the service ID to associate the registered check with an existing service provided by the agent.
 * @param status  Set the check status to specify the initial state of the health check.
 * @param tcp  Set TCP address to check. Also you should set checking interval
 * @param ttl  Set Time to Live of check.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.CheckOptions original] using Vert.x codegen.
 */
fun CheckOptions(
  deregisterAfter: String? = null,
  http: String? = null,
  id: String? = null,
  interval: String? = null,
  name: String? = null,
  notes: String? = null,
  script: String? = null,
  serviceId: String? = null,
  status: CheckStatus? = null,
  tcp: String? = null,
  ttl: String? = null): CheckOptions = io.vertx.ext.consul.CheckOptions().apply {

  if (deregisterAfter != null) {
    this.setDeregisterAfter(deregisterAfter)
  }
  if (http != null) {
    this.setHttp(http)
  }
  if (id != null) {
    this.setId(id)
  }
  if (interval != null) {
    this.setInterval(interval)
  }
  if (name != null) {
    this.setName(name)
  }
  if (notes != null) {
    this.setNotes(notes)
  }
  if (script != null) {
    this.setScript(script)
  }
  if (serviceId != null) {
    this.setServiceId(serviceId)
  }
  if (status != null) {
    this.setStatus(status)
  }
  if (tcp != null) {
    this.setTcp(tcp)
  }
  if (ttl != null) {
    this.setTtl(ttl)
  }
}

