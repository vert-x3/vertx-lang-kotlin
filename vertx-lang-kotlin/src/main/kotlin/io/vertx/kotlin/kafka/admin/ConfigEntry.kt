/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.kotlin.kafka.admin

import io.vertx.kafka.admin.ConfigEntry
import org.apache.kafka.clients.admin.ConfigEntry.ConfigSource

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.ConfigEntry] objects.
 *
 * A class representing a configuration entry containing name, value and additional metadata
 *
 * @param default  Set whether the config value is the default or if it's been explicitly set
 * @param name  Set the config name
 * @param readOnly  Set whether the config is read-only and cannot be updated
 * @param sensitive  Set whether the config value is sensitive. The value is always set to null by the broker if the config value is sensitive
 * @param source  Set the source of this configuration entry
 * @param synonyms  Set all config values that may be used as the value of this config along with their source, in the order of precedence
 * @param value  Set the value or null. Null is returned if the config is unset or if isSensitive is true
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.ConfigEntry original] using Vert.x codegen.
 */
fun configEntryOf(
  default: Boolean? = null,
  name: String? = null,
  readOnly: Boolean? = null,
  sensitive: Boolean? = null,
  source: ConfigSource? = null,
  synonyms: Iterable<io.vertx.kafka.admin.ConfigSynonym>? = null,
  value: String? = null): ConfigEntry = io.vertx.kafka.admin.ConfigEntry().apply {

  if (default != null) {
    this.setDefault(default)
  }
  if (name != null) {
    this.setName(name)
  }
  if (readOnly != null) {
    this.setReadOnly(readOnly)
  }
  if (sensitive != null) {
    this.setSensitive(sensitive)
  }
  if (source != null) {
    this.setSource(source)
  }
  if (synonyms != null) {
    this.setSynonyms(synonyms.toList())
  }
  if (value != null) {
    this.setValue(value)
  }
}

/**
 * A function providing a DSL for building [io.vertx.kafka.admin.ConfigEntry] objects.
 *
 * A class representing a configuration entry containing name, value and additional metadata
 *
 * @param default  Set whether the config value is the default or if it's been explicitly set
 * @param name  Set the config name
 * @param readOnly  Set whether the config is read-only and cannot be updated
 * @param sensitive  Set whether the config value is sensitive. The value is always set to null by the broker if the config value is sensitive
 * @param source  Set the source of this configuration entry
 * @param synonyms  Set all config values that may be used as the value of this config along with their source, in the order of precedence
 * @param value  Set the value or null. Null is returned if the config is unset or if isSensitive is true
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.kafka.admin.ConfigEntry original] using Vert.x codegen.
 */
@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("configEntryOf(default, name, readOnly, sensitive, source, synonyms, value)")
)
fun ConfigEntry(
  default: Boolean? = null,
  name: String? = null,
  readOnly: Boolean? = null,
  sensitive: Boolean? = null,
  source: ConfigSource? = null,
  synonyms: Iterable<io.vertx.kafka.admin.ConfigSynonym>? = null,
  value: String? = null): ConfigEntry = io.vertx.kafka.admin.ConfigEntry().apply {

  if (default != null) {
    this.setDefault(default)
  }
  if (name != null) {
    this.setName(name)
  }
  if (readOnly != null) {
    this.setReadOnly(readOnly)
  }
  if (sensitive != null) {
    this.setSensitive(sensitive)
  }
  if (source != null) {
    this.setSource(source)
  }
  if (synonyms != null) {
    this.setSynonyms(synonyms.toList())
  }
  if (value != null) {
    this.setValue(value)
  }
}

