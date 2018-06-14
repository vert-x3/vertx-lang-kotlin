package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.core.shareddata.Counter
import io.vertx.core.shareddata.Lock
import io.vertx.core.shareddata.SharedData
import io.vertx.kotlin.coroutines.awaitResult
import kotlin.Any
import kotlin.Long
import kotlin.String

/**
 *  Get the cluster wide map with the specified name. The map is accessible to all nodes in the cluster and data
 *  put into the map from any node is visible to to any other node.
 * @param name  the name of the map
 * @throws IllegalStateException if the parent [io.vertx.core.Vertx] instance is not clustered
 */
suspend fun <K : Any, V : Any> SharedData.getClusterWideMap(name: String): AsyncMap<K, V> {
  return awaitResult { this.getClusterWideMap(name, it) }
}

/**
 *  Get the [AsyncMap] with the specified name. When clustered, the map is accessible to all nodes in the cluster
 *  and data put into the map from any node is visible to to any other node.
 *  <p>
 *    <strong>WARNING</strong>: In clustered mode, asynchronous shared maps rely on distributed data structures provided by the cluster manager.
 *    Beware that the latency relative to asynchronous shared maps operations can be much higher in clustered than in local mode.
 *  </p>
 * @param name the name of the map */
suspend fun <K : Any, V : Any> SharedData.getAsyncMap(name: String): AsyncMap<K, V> {
  return awaitResult { this.getAsyncMap(name, it) }
}

/**
 *  Get an asynchronous lock with the specified name. The lock will be passed to the handler when it is available.
 * @param name  the name of the lock */
suspend fun SharedData.getLock(name: String): Lock {
  return awaitResult { this.getLock(name, it) }
}

/**
 *  Like [SharedData.getLock] but specifying a timeout. If the lock is not obtained within the timeout
 *  a failure will be sent to the handler
 * @param name  the name of the lock
 * @param timeout  the timeout in ms */
suspend fun SharedData.getLockWithTimeout(name: String, timeout: Long): Lock {
  return awaitResult { this.getLockWithTimeout(name, timeout, it) }
}

/**
 *  Get an asynchronous counter. The counter will be passed to the handler.
 * @param name  the name of the counter. */
suspend fun SharedData.getCounter(name: String): Counter {
  return awaitResult { this.getCounter(name, it) }
}
