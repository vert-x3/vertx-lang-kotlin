package io.vertx.kotlin.servicediscovery.types

import io.vertx.core.eventbus.MessageConsumer
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.coroutines.awaitResult
import io.vertx.servicediscovery.Record
import io.vertx.servicediscovery.ServiceDiscovery
import io.vertx.servicediscovery.types.MessageSource as MessageSourceVertxAlias
import java.util.function.Function

object MessageSource {
  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MessageSource.getConsumer]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, optional
   * @return [MessageConsumer<T>]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MessageSource] using Vert.x codegen.
   */
  suspend fun <T> getConsumerAwait(discovery: ServiceDiscovery, filter: JsonObject): MessageConsumer<T> {
    return awaitResult {
      MessageSourceVertxAlias.getConsumer(discovery, filter, it)
    }
  }

  /**
   * Suspending version of method [io.vertx.servicediscovery.types.MessageSource.getConsumer]
   *
   * @param discovery The service discovery instance
   * @param filter The filter, must not be <code>null</code>
   * @return [MessageConsumer<T>]
   *
   * NOTE: This function has been automatically generated from [io.vertx.servicediscovery.types.MessageSource] using Vert.x codegen.
   */
  suspend fun <T> getConsumerAwait(discovery: ServiceDiscovery, filter: (Record) -> Boolean): MessageConsumer<T> {
    return awaitResult {
      MessageSourceVertxAlias.getConsumer(discovery, filter, it::handle)
    }
  }

}
