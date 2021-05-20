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
package io.vertx.kotlin.core.net

import io.vertx.core.net.KeyStoreOptions

/**
 * A function providing a DSL for building [io.vertx.core.net.KeyStoreOptions] objects.
 *
 * Key or trust store options configuring private key and/or certificates based on <code>KeyStore</code>.
 *
 * <ul>
 *   <li>when used as a key store, it should point to a store containing a private key and its certificate.</li>
 *   <li>when used as a trust store, it should point to a store containing a list of trusted certificates.</li>
 * </ul>
 *
 * <p> The store can either be loaded by Vert.x from the filesystem:
 *
 * <pre>
 * HttpServerOptions options = HttpServerOptions.httpServerOptions();
 * options.setKeyCertOptions(new KeyStoreOptions().setType("JKS").setPath("/mykeystore.jks").setPassword("foo"));
 * </pre>
 *
 * Or directly provided as a buffer:
 *
 * <pre>
 * Buffer store = vertx.fileSystem().readFileBlocking("/mykeystore.jks");
 * options.setKeyCertOptions(new KeyStoreOptions().setType("JKS").setValue(store).setPassword("foo"));
 * </pre>
 *
 * <p> You can also use specific subclasses [io.vertx.core.net.JksOptions] or [io.vertx.core.net.PfxOptions] that will set
 * the [io.vertx.core.net.KeyStoreOptions] for you:
 *
 * <pre>
 * HttpServerOptions options = HttpServerOptions.httpServerOptions();
 * options.setKeyCertOptions(new JksOptions().setPath("/mykeystore.jks").setPassword("foo"));
 * </pre>
 *
 * @param alias  Set the alias for a server certificate when the keystore has more than one.
 * @param password  Set the password for the key store
 * @param path  Set the path to the key store
 * @param provider  Set the store provider.
 * @param type  Set the store type.
 * @param value  Set the key store as a buffer
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.net.KeyStoreOptions original] using Vert.x codegen.
 */
fun keyStoreOptionsOf(
  alias: String? = null,
  password: String? = null,
  path: String? = null,
  provider: String? = null,
  type: String? = null,
  value: io.vertx.core.buffer.Buffer? = null): KeyStoreOptions = io.vertx.core.net.KeyStoreOptions().apply {

  if (alias != null) {
    this.setAlias(alias)
  }
  if (password != null) {
    this.setPassword(password)
  }
  if (path != null) {
    this.setPath(path)
  }
  if (provider != null) {
    this.setProvider(provider)
  }
  if (type != null) {
    this.setType(type)
  }
  if (value != null) {
    this.setValue(value)
  }
}

