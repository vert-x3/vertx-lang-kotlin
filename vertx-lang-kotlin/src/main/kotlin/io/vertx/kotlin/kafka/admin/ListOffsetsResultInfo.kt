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

import io.vertx.kafka.admin.ListOffsetsResultInfo

fun listOffsetsResultInfoOf(
  leaderEpoch: Int? = null,
  offset: Long? = null,
  timestamp: Long? = null): ListOffsetsResultInfo = io.vertx.kafka.admin.ListOffsetsResultInfo(io.vertx.core.json.JsonObject()).apply {

  if (leaderEpoch != null) {
    this.setLeaderEpoch(leaderEpoch)
  }
  if (offset != null) {
    this.setOffset(offset)
  }
  if (timestamp != null) {
    this.setTimestamp(timestamp)
  }
}

