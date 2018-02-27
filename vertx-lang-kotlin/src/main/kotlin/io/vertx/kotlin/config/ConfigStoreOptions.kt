package io.vertx.kotlin.config

import io.vertx.config.ConfigStoreOptions

/**
 * A function providing a DSL for building [io.vertx.config.ConfigStoreOptions] objects.
 *
 * Data object representing the configuration of a configuration store. This object describes the configuration of a
 * chunk of configuration that you retrieve. It specifies its type (type of configuration store), the format of the
 * retrieved configuration chunk, and you can also configures the store if it needs configuration to
 * retrieve the configuration chunk.
 *
 * @param config  Sets the configuration of the store
 * @param format  Sets the format of the configuration that is retrieved from the store.
 * @param optional  Sets whether or not the store is optional. When the configuration is retrieve, if an optional store returns a failure, the failure is ignored and an empty json object is used instead (for this store).
 * @param type  Sets the configuration type
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.config.ConfigStoreOptions original] using Vert.x codegen.
 */
fun ConfigStoreOptions(
  config: io.vertx.core.json.JsonObject? = null,
  format: String? = null,
  optional: Boolean? = null,
  type: String? = null): ConfigStoreOptions = io.vertx.config.ConfigStoreOptions().apply {

  if (config != null) {
    this.setConfig(config)
  }
  if (format != null) {
    this.setFormat(format)
  }
  if (optional != null) {
    this.setOptional(optional)
  }
  if (type != null) {
    this.setType(type)
  }
}

