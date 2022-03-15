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
package io.vertx.kotlin.uritemplate

import io.vertx.uritemplate.ExpandOptions

/**
 * A function providing a DSL for building [io.vertx.uritemplate.ExpandOptions] objects.
 *
 * Options to control template expansion.
 *
 * @param allowVariableMiss  Configures whether a template missing variable is replaced by the empty string or triggers a [java.util.NoSuchElementException] to be thrown. The default is <code>true</code> as specified by the RFC, setting <code>false</code> is a custom setting not compliant with the spec.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.uritemplate.ExpandOptions original] using Vert.x codegen.
 */
fun expandOptionsOf(
  allowVariableMiss: Boolean? = null): ExpandOptions = io.vertx.uritemplate.ExpandOptions().apply {

  if (allowVariableMiss != null) {
    this.setAllowVariableMiss(allowVariableMiss)
  }
}

