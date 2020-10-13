@file:Suppress("UNUSED")

package examples

import io.vertx.core.http.HttpServerOptions
import io.vertx.kotlin.core.http.httpServerOptionsOf
import java.util.concurrent.TimeUnit

// tag::Builder[]
val options = httpServerOptionsOf(idleTimeout = 5, idleTimeoutUnit = TimeUnit.MINUTES, logActivity = true)
// end::Builder[]

// tag::Classic[]
val classic: HttpServerOptions = HttpServerOptions()
  .setIdleTimeout(5)
  .setIdleTimeoutUnit(TimeUnit.MINUTES)
  .setLogActivity(true)
// end::Classic[]
