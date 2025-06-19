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
package io.vertx.kotlin.ext.consul

import io.vertx.ext.consul.MaintenanceOptions

/**
 * A function providing a DSL for building [io.vertx.ext.consul.MaintenanceOptions] objects.
 *
 * Options used to placing a given service into "maintenance mode".
 * During maintenance mode, the service will be marked as unavailable
 * and will not be present in DNS or API queries. Maintenance mode is persistent
 * and will be automatically restored on agent restart.
 *
 * @param enable  Set maintenance mode to enabled: <code>true</code> to enter maintenance mode or <code>false</code> to resume normal operation. This flag is required.
 * @param id  Set the ID of service. This field is required.
 * @param reason  Set the reason message. If provided, its value should be a text string explaining the reason for placing the service into maintenance mode. This is simply to aid human operators.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.consul.MaintenanceOptions original] using Vert.x codegen.
 */
fun maintenanceOptionsOf(
  enable: Boolean? = null,
  id: String? = null,
  reason: String? = null): MaintenanceOptions = io.vertx.ext.consul.MaintenanceOptions().apply {

  if (enable != null) {
    this.setEnable(enable)
  }
  if (id != null) {
    this.setId(id)
  }
  if (reason != null) {
    this.setReason(reason)
  }
}

