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
 * @param code 
 * @param column 
 * @param constraint 
 * @param dataType 
 * @param detail 
 * @param file 
 * @param hint 
 * @param internalPosition 
 * @param internalQuery 
 * @param line 
 * @param message 
 * @param position 
 * @param routine 
 * @param schema 
 * @param severity 
 * @param table 
 * @param where 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.pgclient.PgNotice original] using Vert.x codegen.
 */
fun pgNoticeOf(
  code: String? = null,
  column: String? = null,
  constraint: String? = null,
  dataType: String? = null,
  detail: String? = null,
  file: String? = null,
  hint: String? = null,
  internalPosition: String? = null,
  internalQuery: String? = null,
  line: String? = null,
  message: String? = null,
  position: String? = null,
  routine: String? = null,
  schema: String? = null,
  severity: String? = null,
  table: String? = null,
  where: String? = null): PgNotice = io.vertx.pgclient.PgNotice().apply {

  if (code != null) {
    this.setCode(code)
  }
  if (column != null) {
    this.setColumn(column)
  }
  if (constraint != null) {
    this.setConstraint(constraint)
  }
  if (dataType != null) {
    this.setDataType(dataType)
  }
  if (detail != null) {
    this.setDetail(detail)
  }
  if (file != null) {
    this.setFile(file)
  }
  if (hint != null) {
    this.setHint(hint)
  }
  if (internalPosition != null) {
    this.setInternalPosition(internalPosition)
  }
  if (internalQuery != null) {
    this.setInternalQuery(internalQuery)
  }
  if (line != null) {
    this.setLine(line)
  }
  if (message != null) {
    this.setMessage(message)
  }
  if (position != null) {
    this.setPosition(position)
  }
  if (routine != null) {
    this.setRoutine(routine)
  }
  if (schema != null) {
    this.setSchema(schema)
  }
  if (severity != null) {
    this.setSeverity(severity)
  }
  if (table != null) {
    this.setTable(table)
  }
  if (where != null) {
    this.setWhere(where)
  }
}

