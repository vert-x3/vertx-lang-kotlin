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
package io.vertx.kotlin.ext.web.client

import io.vertx.ext.web.client.OAuth2WebClientOptions

/**
 * A function providing a DSL for building [io.vertx.ext.web.client.OAuth2WebClientOptions] objects.
 *
 *
 * @param renewTokenOnForbidden  Set a default behavior on how to handle the first forbidden response. <code>true</code> to attempt a token refresh and replay the request. <code>false</code> to continue the request to the user handler/promise.
 * @param leeway  Set a default leeway in seconds to be considered while validating tokens for expiration.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.web.client.OAuth2WebClientOptions original] using Vert.x codegen.
 */
fun oAuth2WebClientOptionsOf(
  renewTokenOnForbidden: Boolean? = null,
  leeway: Int? = null): OAuth2WebClientOptions = io.vertx.ext.web.client.OAuth2WebClientOptions().apply {

  if (renewTokenOnForbidden != null) {
    this.setRenewTokenOnForbidden(renewTokenOnForbidden)
  }
  if (leeway != null) {
    this.setLeeway(leeway)
  }
}

