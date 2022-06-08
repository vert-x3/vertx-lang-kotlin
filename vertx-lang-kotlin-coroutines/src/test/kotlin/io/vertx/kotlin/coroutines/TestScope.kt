package io.vertx.kotlin.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.DelayController

/* see the runTest function
in https://github.com/Kotlin/kotlinx.coroutines/blob/master/kotlinx-coroutines-test/common/src/TestScope.kt
and https://github.com/Kotlin/kotlinx.coroutines/tree/master/kotlinx-coroutines-test#runtest
introduced in a newer version of kotlinx.coroutines */
fun runTest(block: suspend CoroutineScope.() -> Unit) = runBlocking(block = block)

// temporarily not used before upgrading to a newer version of kotlinx.coroutines that contains the runTest function
@OptIn(ExperimentalCoroutinesApi::class)
inline fun DelayController.measureVirtualTime(block: () -> Unit): Long {
  val start = currentTime
  block()
  return currentTime - start
}
