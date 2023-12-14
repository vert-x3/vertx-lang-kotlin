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
package io.vertx.kotlin.ext.stomp

import io.vertx.ext.stomp.Frame
import io.vertx.core.buffer.Buffer
import io.vertx.ext.stomp.Command

/**
 * A function providing a DSL for building [io.vertx.ext.stomp.Frame] objects.
 *
 * Represents a STOMP frame. STOMP frames are structured as follows. It starts by a <code>command</code>, followed by a
 * set of headers. Then the frame may have a body and is finished by a <code>0</code> byte. This class represents this
 * structure and provide access to the different parts.
 * <p/>
 * This class is <strong>NOT</strong> thread-safe.
 *
 * @param headers  Sets the headers of the frames.
 * @param command  Sets the frame command.
 * @param body  Sets the body of the frame.
 * @param destination 
 * @param transaction 
 * @param id 
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.stomp.Frame original] using Vert.x codegen.
 */
fun frameOf(
  headers: Map<String, String>? = null,
  command: Command? = null,
  body: io.vertx.core.buffer.Buffer? = null,
  destination: String? = null,
  transaction: String? = null,
  id: String? = null): Frame = io.vertx.ext.stomp.Frame().apply {

  if (headers != null) {
    this.setHeaders(headers)
  }
  if (command != null) {
    this.setCommand(command)
  }
  if (body != null) {
    this.setBody(body)
  }
  if (destination != null) {
    this.setDestination(destination)
  }
  if (transaction != null) {
    this.setTransaction(transaction)
  }
  if (id != null) {
    this.setId(id)
  }
}

