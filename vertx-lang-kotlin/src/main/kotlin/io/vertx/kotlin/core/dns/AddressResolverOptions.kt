package io.vertx.kotlin.core.dns

import io.vertx.core.dns.AddressResolverOptions

/**
 * A function providing a DSL for building [io.vertx.core.dns.AddressResolverOptions] objects.
 *
 * Configuration options for Vert.x hostname resolver. The resolver uses the local <i>hosts</i> file and performs
 * DNS <i>A</i> and <i>AAAA</i> queries.
 *
 * @param cacheMaxTimeToLive  Set the cache maximum TTL value in seconds. After successful resolution IP addresses are cached with their DNS response TTL, use this to set a maximum value to all responses TTL.
 * @param cacheMinTimeToLive  Set the cache minimum TTL value in seconds. After resolution successful IP addresses are cached with their DNS response TTL, use this to set a minimum value to all responses TTL.
 * @param cacheNegativeTimeToLive  Set the negative cache TTL value in seconds. After a failed hostname resolution, DNS queries won't be retried for a period of time equals to the negative TTL. This allows to reduce the response time of negative replies and reduce the amount of messages to DNS servers.
 * @param hostsPath  Set the path of an alternate hosts configuration file to use instead of the one provided by the os. <p/> The default value is null, so the operating system hosts config is used.
 * @param hostsValue  Set an alternate hosts configuration file to use instead of the one provided by the os. <p/> The value should contain the hosts content literaly, for instance <i>127.0.0.1 localhost</i> <p/> The default value is null, so the operating system hosts config is used.
 * @param maxQueries  Set the maximum number of queries when an hostname is resolved.
 * @param ndots  Set the ndots value used when resolving using search domains, the default value is <code>-1</code> which determines the value from the OS on Linux or uses the value <code>1</code>.
 * @param optResourceEnabled  Set to true to enable the automatic inclusion in DNS queries of an optional record that hints the remote DNS server about how much data the resolver can read per response.
 * @param queryTimeout  Set the query timeout in milliseconds, i.e the amount of time after a query is considered to be failed.
 * @param rdFlag  Set the DNS queries <i>Recursion Desired</i> flag value.
 * @param rotateServers  Set to <code>true</code> to enable round-robin selection of the dns server to use. It spreads the query load among the servers and avoids all lookup to hit the first server of the list.
 * @param searchDomains  Set the lists of DNS search domains. <p/> When the search domain list is null, the effective search domain list will be populated using the system DNS search domains.
 * @param servers  Set the list of DNS server addresses, an address is the IP  of the dns server, followed by an optional colon and a port, e.g <code>8.8.8.8</code> or {code 192.168.0.1:40000}. When the list is empty, the resolver will use the list of the system DNS server addresses from the environment, if that list cannot be retrieved it will use Google's public DNS servers <code>"8.8.8.8"</code> and <code>"8.8.4.4"</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.AddressResolverOptions original] using Vert.x codegen.
 */
fun addressResolverOptionsOf(
  cacheMaxTimeToLive: Int? = null,
  cacheMinTimeToLive: Int? = null,
  cacheNegativeTimeToLive: Int? = null,
  hostsPath: String? = null,
  hostsValue: io.vertx.core.buffer.Buffer? = null,
  maxQueries: Int? = null,
  ndots: Int? = null,
  optResourceEnabled: Boolean? = null,
  queryTimeout: Long? = null,
  rdFlag: Boolean? = null,
  rotateServers: Boolean? = null,
  searchDomains: Iterable<String>? = null,
  servers: Iterable<String>? = null): AddressResolverOptions = io.vertx.core.dns.AddressResolverOptions().apply {

  if (cacheMaxTimeToLive != null) {
    this.setCacheMaxTimeToLive(cacheMaxTimeToLive)
  }
  if (cacheMinTimeToLive != null) {
    this.setCacheMinTimeToLive(cacheMinTimeToLive)
  }
  if (cacheNegativeTimeToLive != null) {
    this.setCacheNegativeTimeToLive(cacheNegativeTimeToLive)
  }
  if (hostsPath != null) {
    this.setHostsPath(hostsPath)
  }
  if (hostsValue != null) {
    this.setHostsValue(hostsValue)
  }
  if (maxQueries != null) {
    this.setMaxQueries(maxQueries)
  }
  if (ndots != null) {
    this.setNdots(ndots)
  }
  if (optResourceEnabled != null) {
    this.setOptResourceEnabled(optResourceEnabled)
  }
  if (queryTimeout != null) {
    this.setQueryTimeout(queryTimeout)
  }
  if (rdFlag != null) {
    this.setRdFlag(rdFlag)
  }
  if (rotateServers != null) {
    this.setRotateServers(rotateServers)
  }
  if (searchDomains != null) {
    this.setSearchDomains(searchDomains.toList())
  }
  if (servers != null) {
    this.setServers(servers.toList())
  }
}

/**
 * A function providing a DSL for building [io.vertx.core.dns.AddressResolverOptions] objects.
 *
 * Configuration options for Vert.x hostname resolver. The resolver uses the local <i>hosts</i> file and performs
 * DNS <i>A</i> and <i>AAAA</i> queries.
 *
 * @param cacheMaxTimeToLive  Set the cache maximum TTL value in seconds. After successful resolution IP addresses are cached with their DNS response TTL, use this to set a maximum value to all responses TTL.
 * @param cacheMinTimeToLive  Set the cache minimum TTL value in seconds. After resolution successful IP addresses are cached with their DNS response TTL, use this to set a minimum value to all responses TTL.
 * @param cacheNegativeTimeToLive  Set the negative cache TTL value in seconds. After a failed hostname resolution, DNS queries won't be retried for a period of time equals to the negative TTL. This allows to reduce the response time of negative replies and reduce the amount of messages to DNS servers.
 * @param hostsPath  Set the path of an alternate hosts configuration file to use instead of the one provided by the os. <p/> The default value is null, so the operating system hosts config is used.
 * @param hostsValue  Set an alternate hosts configuration file to use instead of the one provided by the os. <p/> The value should contain the hosts content literaly, for instance <i>127.0.0.1 localhost</i> <p/> The default value is null, so the operating system hosts config is used.
 * @param maxQueries  Set the maximum number of queries when an hostname is resolved.
 * @param ndots  Set the ndots value used when resolving using search domains, the default value is <code>-1</code> which determines the value from the OS on Linux or uses the value <code>1</code>.
 * @param optResourceEnabled  Set to true to enable the automatic inclusion in DNS queries of an optional record that hints the remote DNS server about how much data the resolver can read per response.
 * @param queryTimeout  Set the query timeout in milliseconds, i.e the amount of time after a query is considered to be failed.
 * @param rdFlag  Set the DNS queries <i>Recursion Desired</i> flag value.
 * @param rotateServers  Set to <code>true</code> to enable round-robin selection of the dns server to use. It spreads the query load among the servers and avoids all lookup to hit the first server of the list.
 * @param searchDomains  Set the lists of DNS search domains. <p/> When the search domain list is null, the effective search domain list will be populated using the system DNS search domains.
 * @param servers  Set the list of DNS server addresses, an address is the IP  of the dns server, followed by an optional colon and a port, e.g <code>8.8.8.8</code> or {code 192.168.0.1:40000}. When the list is empty, the resolver will use the list of the system DNS server addresses from the environment, if that list cannot be retrieved it will use Google's public DNS servers <code>"8.8.8.8"</code> and <code>"8.8.4.4"</code>.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.AddressResolverOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("addressResolverOptionsOf(cacheMaxTimeToLive, cacheMinTimeToLive, cacheNegativeTimeToLive, hostsPath, hostsValue, maxQueries, ndots, optResourceEnabled, queryTimeout, rdFlag, rotateServers, searchDomains, servers)")
)
fun AddressResolverOptions(
  cacheMaxTimeToLive: Int? = null,
  cacheMinTimeToLive: Int? = null,
  cacheNegativeTimeToLive: Int? = null,
  hostsPath: String? = null,
  hostsValue: io.vertx.core.buffer.Buffer? = null,
  maxQueries: Int? = null,
  ndots: Int? = null,
  optResourceEnabled: Boolean? = null,
  queryTimeout: Long? = null,
  rdFlag: Boolean? = null,
  rotateServers: Boolean? = null,
  searchDomains: Iterable<String>? = null,
  servers: Iterable<String>? = null): AddressResolverOptions = io.vertx.core.dns.AddressResolverOptions().apply {

  if (cacheMaxTimeToLive != null) {
    this.setCacheMaxTimeToLive(cacheMaxTimeToLive)
  }
  if (cacheMinTimeToLive != null) {
    this.setCacheMinTimeToLive(cacheMinTimeToLive)
  }
  if (cacheNegativeTimeToLive != null) {
    this.setCacheNegativeTimeToLive(cacheNegativeTimeToLive)
  }
  if (hostsPath != null) {
    this.setHostsPath(hostsPath)
  }
  if (hostsValue != null) {
    this.setHostsValue(hostsValue)
  }
  if (maxQueries != null) {
    this.setMaxQueries(maxQueries)
  }
  if (ndots != null) {
    this.setNdots(ndots)
  }
  if (optResourceEnabled != null) {
    this.setOptResourceEnabled(optResourceEnabled)
  }
  if (queryTimeout != null) {
    this.setQueryTimeout(queryTimeout)
  }
  if (rdFlag != null) {
    this.setRdFlag(rdFlag)
  }
  if (rotateServers != null) {
    this.setRotateServers(rotateServers)
  }
  if (searchDomains != null) {
    this.setSearchDomains(searchDomains.toList())
  }
  if (servers != null) {
    this.setServers(servers.toList())
  }
}

