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
package io.vertx.kotlin.mssqlclient

import io.vertx.mssqlclient.MSSQLInfo

/**
 * A function providing a DSL for building [io.vertx.mssqlclient.MSSQLInfo] objects.
 *
 * An information message sent by the server to the client.
 *
 * @param number 
 * @param state 
 * @param severity 
 * @param message 
 * @param serverName 
 * @param procedureName 
 * @param lineNumber 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.mssqlclient.MSSQLInfo original] using Vert.x codegen.
 */
fun mssqlInfoOf(
  number: Int? = null,
  state: Byte? = null,
  severity: Byte? = null,
  message: String? = null,
  serverName: String? = null,
  procedureName: String? = null,
  lineNumber: Int? = null): MSSQLInfo = io.vertx.mssqlclient.MSSQLInfo().apply {

  if (number != null) {
    this.setNumber(number)
  }
  if (state != null) {
    this.setState(state)
  }
  if (severity != null) {
    this.setSeverity(severity)
  }
  if (message != null) {
    this.setMessage(message)
  }
  if (serverName != null) {
    this.setServerName(serverName)
  }
  if (procedureName != null) {
    this.setProcedureName(procedureName)
  }
  if (lineNumber != null) {
    this.setLineNumber(lineNumber)
  }
}

