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
package io.vertx.kotlin.ext.mongo

import io.vertx.ext.mongo.TimeSeriesOptions
import io.vertx.ext.mongo.TimeSeriesGranularity

/**
 * A function providing a DSL for building [io.vertx.ext.mongo.TimeSeriesOptions] objects.
 *
 * Options used to configure timeseries options.
 *
 * <p>Added in MongoDB 5.0 https://www.mongodb.com/docs/manual/core/timeseries-collections/
 *
 * @param timeField 
 * @param metaField 
 * @param granularity 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.mongo.TimeSeriesOptions original] using Vert.x codegen.
 */
fun timeSeriesOptionsOf(
  timeField: String? = null,
  metaField: String? = null,
  granularity: TimeSeriesGranularity? = null): TimeSeriesOptions = io.vertx.ext.mongo.TimeSeriesOptions().apply {

  if (timeField != null) {
    this.setTimeField(timeField)
  }
  if (metaField != null) {
    this.setMetaField(metaField)
  }
  if (granularity != null) {
    this.setGranularity(granularity)
  }
}

