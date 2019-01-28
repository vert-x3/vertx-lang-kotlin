package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.SessionOptions
import io.vertx.ext.consul.SessionBehavior

/**
 * A function providing a DSL for building [io.vertx.ext.consul.SessionOptions] objects.
 *
 * Options used to create session.
 *
 * @param behavior  Set the behavior when a session is invalidated. The release behavior is the default if none is specified.
 * @param checks  Set a list of associated health checks. It is highly recommended that, if you override this list, you include the default "serfHealth"
 * @param lockDelay  Set the lock-delay period.
 * @param name  Set the human-readable name for the Session
 * @param node  Set the node to which the session will be assigned
 * @param ttl  Set the TTL interval. When TTL interval expires without being renewed, the session has expired and an invalidation is triggered. If specified, it must be between <code>10s</code> and <code>86400s</code> currently. The contract of a TTL is that it represents a lower bound for invalidation; that is, Consul will not expire the session before the TTL is reached, but it is allowed to delay the expiration past the TTL. The lowest practical TTL should be used to keep the number of managed sessions low. When locks are forcibly expired, such as during a leader election, sessions may not be reaped for up to double this TTL, so long TTL values (&gt; 1 hour) should be avoided.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.SessionOptions original] using Vert.x codegen.
 */
fun sessionOptionsOf(
  behavior: SessionBehavior? = null,
  checks: Iterable<String>? = null,
  lockDelay: Long? = null,
  name: String? = null,
  node: String? = null,
  ttl: Long? = null): SessionOptions = io.vertx.ext.consul.SessionOptions().apply {

  if (behavior != null) {
    this.setBehavior(behavior)
  }
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (ttl != null) {
    this.setTtl(ttl)
  }
}

/**
 * A function providing a DSL for building [io.vertx.ext.consul.SessionOptions] objects.
 *
 * Options used to create session.
 *
 * @param behavior  Set the behavior when a session is invalidated. The release behavior is the default if none is specified.
 * @param checks  Set a list of associated health checks. It is highly recommended that, if you override this list, you include the default "serfHealth"
 * @param lockDelay  Set the lock-delay period.
 * @param name  Set the human-readable name for the Session
 * @param node  Set the node to which the session will be assigned
 * @param ttl  Set the TTL interval. When TTL interval expires without being renewed, the session has expired and an invalidation is triggered. If specified, it must be between <code>10s</code> and <code>86400s</code> currently. The contract of a TTL is that it represents a lower bound for invalidation; that is, Consul will not expire the session before the TTL is reached, but it is allowed to delay the expiration past the TTL. The lowest practical TTL should be used to keep the number of managed sessions low. When locks are forcibly expired, such as during a leader election, sessions may not be reaped for up to double this TTL, so long TTL values (&gt; 1 hour) should be avoided.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.SessionOptions original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("sessionOptionsOf(behavior, checks, lockDelay, name, node, ttl)")
)
fun SessionOptions(
  behavior: SessionBehavior? = null,
  checks: Iterable<String>? = null,
  lockDelay: Long? = null,
  name: String? = null,
  node: String? = null,
  ttl: Long? = null): SessionOptions = io.vertx.ext.consul.SessionOptions().apply {

  if (behavior != null) {
    this.setBehavior(behavior)
  }
  if (checks != null) {
    this.setChecks(checks.toList())
  }
  if (lockDelay != null) {
    this.setLockDelay(lockDelay)
  }
  if (name != null) {
    this.setName(name)
  }
  if (node != null) {
    this.setNode(node)
  }
  if (ttl != null) {
    this.setTtl(ttl)
  }
}

