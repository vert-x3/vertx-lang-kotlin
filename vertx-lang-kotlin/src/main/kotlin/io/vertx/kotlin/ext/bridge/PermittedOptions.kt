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
package io.vertx.kotlin.ext.bridge

import io.vertx.ext.bridge.PermittedOptions

/**
 * A function providing a DSL for building [io.vertx.ext.bridge.PermittedOptions] objects.
 *
 * Represents a match to allow for inbound and outbound traffic.
 *
 * @param address  The exact address the message is being sent to. If you want to allow messages based on an exact address you use this field.
 * @param addressRegex  A regular expression that will be matched against the address. If you want to allow messages based on a regular expression you use this field. If the [io.vertx.ext.bridge.PermittedOptions] value is specified this will be ignored.
 * @param match  This allows you to allow messages based on their structure. Any fields in the match must exist in the message with the same values for them to be allowed. This currently only works with JSON messages.
 * @param requiredAuthority  Declare a specific authority that user must have in order to allow messages
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.bridge.PermittedOptions original] using Vert.x codegen.
 */
fun permittedOptionsOf(
  address: String? = null,
  addressRegex: String? = null,
  match: io.vertx.core.json.JsonObject? = null,
  requiredAuthority: String? = null): PermittedOptions = io.vertx.ext.bridge.PermittedOptions().apply {

  if (address != null) {
    this.setAddress(address)
  }
  if (addressRegex != null) {
    this.setAddressRegex(addressRegex)
  }
  if (match != null) {
    this.setMatch(match)
  }
  if (requiredAuthority != null) {
    this.setRequiredAuthority(requiredAuthority)
  }
}

