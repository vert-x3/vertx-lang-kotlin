package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClient
import io.vertx.core.dns.MxRecord
import io.vertx.core.dns.SrvRecord
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.String
import kotlin.collections.MutableList

/**
 *  Try to lookup the A (ipv4) or AAAA (ipv6) record for the given name. The first found will be used.
 * @param name  the name to resolve
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DnsClient.lookup(name: String): String? {
  return awaitResult { this.lookup(name, it) }
}

/**
 *  Try to lookup the A (ipv4) record for the given name. The first found will be used.
 * @param name  the name to resolve
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DnsClient.lookup4(name: String): String? {
  return awaitResult { this.lookup4(name, it) }
}

/**
 *  Try to lookup the AAAA (ipv6) record for the given name. The first found will be used.
 * @param name  the name to resolve
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DnsClient.lookup6(name: String): String? {
  return awaitResult { this.lookup6(name, it) }
}

/**
 *  Try to resolve all A (ipv4) records for the given name.
 * @param name  the name to resolve
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DnsClient.resolveA(name: String): MutableList<String> {
  return awaitResult { this.resolveA(name, it) }
}

/**
 *  Try to resolve all AAAA (ipv6) records for the given name.
 * @param name  the name to resolve
 * @return a reference to this, so the API can be used fluently
 */
suspend fun DnsClient.resolveAAAA(name: String): MutableList<String> {
  return awaitResult { this.resolveAAAA(name, it) }
}

/**
 *  Try to resolve the CNAME record for the given name.
 * @param name  the name to resolve the CNAME for
 * @return a reference to this, so the API can be used fluently.
 */
suspend fun DnsClient.resolveCNAME(name: String): MutableList<String> {
  return awaitResult { this.resolveCNAME(name, it) }
}

/**
 *  Try to resolve the MX records for the given name.
 * @param name  the name for which the MX records should be resolved
 * @return a reference to this, so the API can be used fluently.
 */
suspend fun DnsClient.resolveMX(name: String): MutableList<MxRecord> {
  return awaitResult { this.resolveMX(name, it) }
}

/**
 *  Try to resolve the TXT records for the given name.
 * @param name  the name for which the TXT records should be resolved
 * @return a reference to this, so the API can be used fluently.
 */
suspend fun DnsClient.resolveTXT(name: String): MutableList<String> {
  return awaitResult { this.resolveTXT(name, it) }
}

/**
 *  Try to resolve the PTR record for the given name.
 * @param name  the name to resolve the PTR for
 * @return a reference to this, so the API can be used fluently.
 */
suspend fun DnsClient.resolvePTR(name: String): String? {
  return awaitResult { this.resolvePTR(name, it) }
}

/**
 *  Try to resolve the NS records for the given name.
 * @param name  the name for which the NS records should be resolved
 * @return a reference to this, so the API can be used fluently.
 */
suspend fun DnsClient.resolveNS(name: String): MutableList<String> {
  return awaitResult { this.resolveNS(name, it) }
}

/**
 *  Try to resolve the SRV records for the given name.
 * @param name  the name for which the SRV records should be resolved
 * @return a reference to this, so the API can be used fluently.
 */
suspend fun DnsClient.resolveSRV(name: String): MutableList<SrvRecord> {
  return awaitResult { this.resolveSRV(name, it) }
}

/**
 *  Try to do a reverse lookup of an IP address. This is basically the same as doing trying to resolve a PTR record
 *  but allows you to just pass in the IP address and not a valid ptr query string.
 * @param ipaddress  the IP address to resolve the PTR for
 * @return a reference to this, so the API can be used fluently.
 */
suspend fun DnsClient.reverseLookup(ipaddress: String): String? {
  return awaitResult { this.reverseLookup(ipaddress, it) }
}
