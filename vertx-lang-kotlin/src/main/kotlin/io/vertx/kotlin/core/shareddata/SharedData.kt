package io.vertx.kotlin.core.shareddata

import io.vertx.core.shareddata.AsyncMap
import io.vertx.core.shareddata.Counter
import io.vertx.core.shareddata.Lock
import io.vertx.core.shareddata.SharedData
import io.vertx.kotlin.coroutines.awaitResult

/**
 * Get the cluster wide map with the specified name. The map is accessible to all nodes in the cluster and data
 * put into the map from any node is visible to to any other node.
 *
 * @param name the name of the map
 * @param resultHandler the map will be returned asynchronously in this handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.SharedData original] using Vert.x codegen.
 */
suspend fun <K,V> SharedData.getClusterWideMapAwait(name : String) : AsyncMap<K,V> {
  return awaitResult{
    this.getClusterWideMap(name, it)
  }
}

/**
 * Get the [io.vertx.core.shareddata.AsyncMap] with the specified name. When clustered, the map is accessible to all nodes in the cluster
 * and data put into the map from any node is visible to to any other node.
 * <p>
 *   <strong>WARNING</strong>: In clustered mode, asynchronous shared maps rely on distributed data structures provided by the cluster manager.
 *   Beware that the latency relative to asynchronous shared maps operations can be much higher in clustered than in local mode.
 * </p>
 *
 * @param name the name of the map
 * @param resultHandler the map will be returned asynchronously in this handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.SharedData original] using Vert.x codegen.
 */
suspend fun <K,V> SharedData.getAsyncMapAwait(name : String) : AsyncMap<K,V> {
  return awaitResult{
    this.getAsyncMap(name, it)
  }
}

/**
 * Get an asynchronous lock with the specified name. The lock will be passed to the handler when it is available.
 * <p>
 *   In general lock acquision is unordered, so that sequential attempts to acquire a lock,
 *   even from a single thread, can happen in non-sequential order.
 * </p>
 *
 * @param name the name of the lock
 * @param resultHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.SharedData original] using Vert.x codegen.
 */
suspend fun SharedData.getLockAwait(name : String) : Lock {
  return awaitResult{
    this.getLock(name, it)
  }
}

/**
 * Like [io.vertx.core.shareddata.SharedData] but specifying a timeout. If the lock is not obtained within the timeout
 * a failure will be sent to the handler.
 * <p>
 *   In general lock acquision is unordered, so that sequential attempts to acquire a lock,
 *   even from a single thread, can happen in non-sequential order.
 * </p>
 *
 * @param name the name of the lock
 * @param timeout the timeout in ms
 * @param resultHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.SharedData original] using Vert.x codegen.
 */
suspend fun SharedData.getLockWithTimeoutAwait(name : String, timeout : Long) : Lock {
  return awaitResult{
    this.getLockWithTimeout(name, timeout, it)
  }
}

/**
 * Get an asynchronous counter. The counter will be passed to the handler.
 *
 * @param name the name of the counter.
 * @param resultHandler the handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.shareddata.SharedData original] using Vert.x codegen.
 */
suspend fun SharedData.getCounterAwait(name : String) : Counter {
  return awaitResult{
    this.getCounter(name, it)
  }
}

