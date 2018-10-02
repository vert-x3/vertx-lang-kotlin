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
 * Convenient method that looks for a message source and provides the configured . The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, optional
 * @param resultHandler The result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.MessageSource original] using Vert.x codegen.
 */
  suspend fun <T> getConsumerAwait(discovery : ServiceDiscovery, filter : JsonObject) : MessageConsumer<T> {
    return awaitResult{
      MessageSourceVertxAlias.getConsumer(discovery, filter, it)
    }
  }

/**
 * Convenient method that looks for a message source and provides the configured . The
 * async result is marked as failed is there are no matching services, or if the lookup fails.
 *
 * @param discovery The service discovery instance
 * @param filter The filter, must not be <code>null</code>
 * @param resultHandler The result handler
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.servicediscovery.types.MessageSource original] using Vert.x codegen.
 */
  suspend fun <T> getConsumerAwait(discovery : ServiceDiscovery, filter : Function<Record,Boolean>) : MessageConsumer<T> {
    return awaitResult{
      MessageSourceVertxAlias.getConsumer(discovery, filter, it)
    }
  }

}
