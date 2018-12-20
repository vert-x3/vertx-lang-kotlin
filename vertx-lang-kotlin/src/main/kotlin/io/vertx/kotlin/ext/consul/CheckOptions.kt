package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.CheckOptions
import io.vertx.ext.consul.CheckStatus

/**
 * A function providing a DSL for building [io.vertx.ext.consul.CheckOptions] objects.
 *
 * Options used to register checks in Consul.
 *
 * @param deregisterAfter  Set deregister timeout. This is optional field, which is a timeout in the same time format as Interval and TTL. If a check is associated with a service and has the critical state for more than this configured value, then its associated service (and all of its associated checks) will automatically be deregistered. The minimum timeout is 1 minute, and the process that reaps critical services runs every 30 seconds, so it may take slightly longer than the configured timeout to trigger the deregistration. This should generally be configured with a timeout that's much, much longer than any expected recoverable outage for the given service.
 * @param grpc  Specifies a gRPC check's endpoint that supports the standard <a href="https://github.com/grpc/grpc/blob/master/doc/health-checking.md">gRPC health checking protocol</a>. The state of the check will be updated at the given Interval by probing the configured endpoint. The endpoint must be represented as <code>address:port/service</code>
 * @param grpcTls  Specifies whether to use TLS for this gRPC health check. If TLS is enabled, then by default, a valid TLS certificate is expected. Certificate verification can be turned off by setting <code>TLSSkipVerify</code> to <code>true</code>.
 * @param http  Set HTTP address to check. Also you should set checking interval
 * @param id  Set check ID
 * @param interval  Set checking interval
 * @param name  Set check name. This is mandatory field
 * @param notes  Set check notes
 * @param scriptArgs  Set scriptArgs. Also you should set checking interval
 * @param serviceId  Set the service ID to associate the registered check with an existing service provided by the agent.
 * @param status  Set the check status to specify the initial state of the health check.
 * @param tcp  Set TCP address to check. Also you should set checking interval
 * @param tlsSkipVerify  Specifies if the certificate for an HTTPS check should not be verified.
 * @param ttl  Set Time to Live of check.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.CheckOptions original] using Vert.x codegen.
 */
fun checkOptionsOf(
  deregisterAfter: String? = null,
  grpc: String? = null,
  grpcTls: Boolean? = null,
  http: String? = null,
  id: String? = null,
  interval: String? = null,
  name: String? = null,
  notes: String? = null,
  scriptArgs: Iterable<String>? = null,
  serviceId: String? = null,
  status: CheckStatus? = null,
  tcp: String? = null,
  tlsSkipVerify: Boolean? = null,
  ttl: String? = null): CheckOptions = io.vertx.ext.consul.CheckOptions().apply {

  if (deregisterAfter != null) {
    this.setDeregisterAfter(deregisterAfter)
  }
  if (grpc != null) {
    this.setGrpc(grpc)
  }
  if (grpcTls != null) {
    this.setGrpcTls(grpcTls)
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
  if (scriptArgs != null) {
    this.setScriptArgs(scriptArgs.toList())
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
  if (tlsSkipVerify != null) {
    this.setTlsSkipVerify(tlsSkipVerify)
  }
  if (ttl != null) {
    this.setTtl(ttl)
  }
}

