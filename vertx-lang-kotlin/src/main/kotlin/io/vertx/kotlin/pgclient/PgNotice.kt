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

import io.vertx.pgclient.PgNotice

/**
 * A function providing a DSL for building [io.vertx.pgclient.PgNotice] objects.
 *
 * A notification emited by Postgres.
 *
 * @param severity 
 * @param code 
 * @param message 
 * @param detail 
 * @param hint 
 * @param position 
 * @param internalPosition 
 * @param internalQuery 
 * @param where 
 * @param file 
 * @param line 
 * @param routine 
 * @param schema 
 * @param table 
 * @param column 
 * @param dataType 
 * @param constraint 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.pgclient.PgNotice original] using Vert.x codegen.
 */
fun pgNoticeOf(
  severity: String? = null,
  code: String? = null,
  message: String? = null,
  detail: String? = null,
  hint: String? = null,
  position: String? = null,
  internalPosition: String? = null,
  internalQuery: String? = null,
  where: String? = null,
  file: String? = null,
  line: String? = null,
  routine: String? = null,
  schema: String? = null,
  table: String? = null,
  column: String? = null,
  dataType: String? = null,
  constraint: String? = null): PgNotice = io.vertx.pgclient.PgNotice().apply {

  if (severity != null) {
    this.setSeverity(severity)
  }
  if (code != null) {
    this.setCode(code)
  }
  if (message != null) {
    this.setMessage(message)
  }
  if (detail != null) {
    this.setDetail(detail)
  }
  if (hint != null) {
    this.setHint(hint)
  }
  if (position != null) {
    this.setPosition(position)
  }
  if (internalPosition != null) {
    this.setInternalPosition(internalPosition)
  }
  if (internalQuery != null) {
    this.setInternalQuery(internalQuery)
  }
  if (where != null) {
    this.setWhere(where)
  }
  if (file != null) {
    this.setFile(file)
  }
  if (line != null) {
    this.setLine(line)
  }
  if (routine != null) {
    this.setRoutine(routine)
  }
  if (schema != null) {
    this.setSchema(schema)
  }
  if (table != null) {
    this.setTable(table)
  }
  if (column != null) {
    this.setColumn(column)
  }
  if (dataType != null) {
    this.setDataType(dataType)
  }
  if (constraint != null) {
    this.setConstraint(constraint)
  }
}

