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
package io.vertx.kotlin.ext.sql

import io.vertx.ext.sql.ResultSet

/**
 * A function providing a DSL for building [io.vertx.ext.sql.ResultSet] objects.
 *
 * Represents the results of a SQL query.
 * <p>
 * It contains a list for the column names of the results, and a list of <code>JsonArray</code> - one for each row of the
 * results.
 *
 * @param columnNames  Get the column names
 * @param next  Get the next result set
 * @param output  Get the registered outputs
 * @param results  Get the results
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.sql.ResultSet original] using Vert.x codegen.
 */
fun resultSetOf(
  columnNames: Iterable<String>? = null,
  next: io.vertx.ext.sql.ResultSet? = null,
  output: io.vertx.core.json.JsonArray? = null,
  results: Iterable<io.vertx.core.json.JsonArray>? = null): ResultSet = io.vertx.ext.sql.ResultSet().apply {

  if (columnNames != null) {
    this.setColumnNames(columnNames.toList())
  }
  if (next != null) {
    this.setNext(next)
  }
  if (output != null) {
    this.setOutput(output)
  }
  if (results != null) {
    this.setResults(results.toList())
  }
}

