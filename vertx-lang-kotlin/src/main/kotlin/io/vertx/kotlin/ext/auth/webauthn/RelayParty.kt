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
package io.vertx.kotlin.ext.auth.webauthn

import io.vertx.ext.auth.webauthn.RelayParty

fun relayPartyOf(
  icon: String? = null,
  id: String? = null,
  name: String? = null): RelayParty = io.vertx.ext.auth.webauthn.RelayParty().apply {

  if (icon != null) {
    this.setIcon(icon)
  }
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
}

@Deprecated(
  message = "This function will be removed in a future version",
  replaceWith = ReplaceWith("relayPartyOf(icon, id, name)")
)
fun RelayParty(
  icon: String? = null,
  id: String? = null,
  name: String? = null): RelayParty = io.vertx.ext.auth.webauthn.RelayParty().apply {

  if (icon != null) {
    this.setIcon(icon)
  }
  if (id != null) {
    this.setId(id)
  }
  if (name != null) {
    this.setName(name)
  }
}

