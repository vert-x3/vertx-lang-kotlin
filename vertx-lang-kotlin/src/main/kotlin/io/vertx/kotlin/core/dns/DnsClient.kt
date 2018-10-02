package io.vertx.kotlin.core.dns

import io.vertx.core.dns.DnsClient
import io.vertx.core.dns.MxRecord
import io.vertx.core.dns.SrvRecord
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Try to lookup the A (ipv4) or AAAA (ipv6) record for the given name. The first found will be used.
 *
 * @param name the name to resolve
 * @param handler the [io.vertx.core.Handler] to notify with the [io.vertx.core.AsyncResult]. The handler will get notified with the resolved address if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.lookupAwait(name : String) : String? {
  return awaitResult{
    this.lookup(name, it)
  }
}

/**
 * Try to lookup the A (ipv4) record for the given name. The first found will be used.
 *
 * @param name the name to resolve
 * @param handler the  to notify with the [io.vertx.core.AsyncResult]. The handler will get notified with the resolved [java.net.Inet4Address] if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.lookup4Await(name : String) : String? {
  return awaitResult{
    this.lookup4(name, it)
  }
}

/**
 * Try to lookup the AAAA (ipv6) record for the given name. The first found will be used.
 *
 * @param name the name to resolve
 * @param handler the  to notify with the . The handler will get notified with the resolved [java.net.Inet6Address] if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.lookup6Await(name : String) : String? {
  return awaitResult{
    this.lookup6(name, it)
  }
}

/**
 * Try to resolve all A (ipv4) records for the given name.
 *
 * @param name the name to resolve
 * @param handler the [io.vertx.core.Handler] to notify with the [io.vertx.core.AsyncResult]. The handler will get notified with a [java.util.List] that contains all the resolved [java.net.Inet4Address]es. If none was found an empty [java.util.List] will be used. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolveAAwait(name : String) : List<String> {
  return awaitResult{
    this.resolveA(name, it)
  }
}

/**
 * Try to resolve all AAAA (ipv6) records for the given name.
 *
 * @param name the name to resolve
 * @param handler the [io.vertx.core.Handler] to notify with the [io.vertx.core.AsyncResult]. The handler will get notified with a [java.util.List] that contains all the resolved [java.net.Inet6Address]es. If none was found an empty [java.util.List] will be used. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolveAAAAAwait(name : String) : List<String> {
  return awaitResult{
    this.resolveAAAA(name, it)
  }
}

/**
 * Try to resolve the CNAME record for the given name.
 *
 * @param name the name to resolve the CNAME for
 * @param handler the  to notify with the . The handler will get notified with the resolved [java.lang.String] if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolveCNAMEAwait(name : String) : List<String> {
  return awaitResult{
    this.resolveCNAME(name, it)
  }
}

/**
 * Try to resolve the MX records for the given name.
 *
 * @param name the name for which the MX records should be resolved
 * @param handler the [io.vertx.core.Handler] to notify with the [io.vertx.core.AsyncResult]. The handler will get notified with a List that contains all resolved [io.vertx.core.dns.MxRecord]s, sorted by their [io.vertx.core.dns.MxRecord]. If non was found it will get notified with an empty [java.util.List]. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolveMXAwait(name : String) : List<MxRecord> {
  return awaitResult{
    this.resolveMX(name, it)
  }
}

/**
 * Try to resolve the TXT records for the given name.
 *
 * @param name the name for which the TXT records should be resolved
 * @param handler the  to notify with the . The handler will get notified with a List that contains all resolved [java.lang.String]s. If none was found it will get notified with an empty [java.util.List]. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolveTXTAwait(name : String) : List<String> {
  return awaitResult{
    this.resolveTXT(name, it)
  }
}

/**
 * Try to resolve the PTR record for the given name.
 *
 * @param name the name to resolve the PTR for
 * @param handler the  to notify with the . The handler will get notified with the resolved [java.lang.String] if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolvePTRAwait(name : String) : String? {
  return awaitResult{
    this.resolvePTR(name, it)
  }
}

/**
 * Try to resolve the NS records for the given name.
 *
 * @param name the name for which the NS records should be resolved
 * @param handler the  to notify with the . The handler will get notified with a List that contains all resolved [java.lang.String]s. If none was found it will get notified with an empty [java.util.List]. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolveNSAwait(name : String) : List<String> {
  return awaitResult{
    this.resolveNS(name, it)
  }
}

/**
 * Try to resolve the SRV records for the given name.
 *
 * @param name the name for which the SRV records should be resolved
 * @param handler the  to notify with the . The handler will get notified with a List that contains all resolved [io.vertx.core.dns.SrvRecord]s. If none was found it will get notified with an empty [java.util.List]. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.resolveSRVAwait(name : String) : List<SrvRecord> {
  return awaitResult{
    this.resolveSRV(name, it)
  }
}

/**
 * Try to do a reverse lookup of an IP address. This is basically the same as doing trying to resolve a PTR record
 * but allows you to just pass in the IP address and not a valid ptr query string.
 *
 * @param ipaddress the IP address to resolve the PTR for
 * @param handler the  to notify with the . The handler will get notified with the resolved [java.lang.String] if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.
 * @returna reference to this, so the API can be used fluently. *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.dns.DnsClient original] using Vert.x codegen.
 */
suspend fun DnsClient.reverseLookupAwait(ipaddress : String) : String? {
  return awaitResult{
    this.reverseLookup(ipaddress, it)
  }
}

