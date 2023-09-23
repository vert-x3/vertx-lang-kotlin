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
package io.vertx.kotlin.ext.dropwizard

import io.vertx.ext.dropwizard.Match
import io.vertx.ext.dropwizard.MatchType

/**
 * A function providing a DSL for building [io.vertx.ext.dropwizard.Match] objects.
 *
 * A match for a value.
 *
 * @param value  Set the matched value.
 * @param type  Set the type of matching to apply.
 * @param alias  Set the alias the human readable name that will be used as a part of registry entry name when the value matches.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.dropwizard.Match original] using Vert.x codegen.
 */
fun matchOf(
  value: String? = null,
  type: MatchType? = null,
  alias: String? = null): Match = io.vertx.ext.dropwizard.Match().apply {

  if (value != null) {
    this.setValue(value)
  }
  if (type != null) {
    this.setType(type)
  }
  if (alias != null) {
    this.setAlias(alias)
  }
}

