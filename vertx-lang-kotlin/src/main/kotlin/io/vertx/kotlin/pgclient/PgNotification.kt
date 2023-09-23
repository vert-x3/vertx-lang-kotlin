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
package io.vertx.kotlin.pgclient

import io.vertx.pgclient.PgNotification

/**
 * A function providing a DSL for building [io.vertx.pgclient.PgNotification] objects.
 *
 * A notification emited by Postgres.
 *
 * @param processId  Set the process id.
 * @param channel  Set the channel value.
 * @param payload  Set the payload value.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.pgclient.PgNotification original] using Vert.x codegen.
 */
fun pgNotificationOf(
  processId: Int? = null,
  channel: String? = null,
  payload: String? = null): PgNotification = io.vertx.pgclient.PgNotification().apply {

  if (processId != null) {
    this.setProcessId(processId)
  }
  if (channel != null) {
    this.setChannel(channel)
  }
  if (payload != null) {
    this.setPayload(payload)
  }
}

