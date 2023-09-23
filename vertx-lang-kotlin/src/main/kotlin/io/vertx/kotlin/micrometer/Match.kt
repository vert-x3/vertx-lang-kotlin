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
package io.vertx.kotlin.micrometer

import io.vertx.micrometer.Match
import io.vertx.micrometer.MatchType
import io.vertx.micrometer.MetricsDomain

/**
 * A function providing a DSL for building [io.vertx.micrometer.Match] objects.
 *
 * A match for a value.
 *
 * @param domain  Set the label domain, restricting this rule to a single domain.
 * @param label  Set the label name. The match will apply to the values related to this key.
 * @param value  Set the matched value.
 * @param type  Set the type of matching to apply.
 * @param alias  Set an alias that would replace the label value when it matches.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.micrometer.Match original] using Vert.x codegen.
 */
fun matchOf(
  domain: MetricsDomain? = null,
  label: String? = null,
  value: String? = null,
  type: MatchType? = null,
  alias: String? = null): Match = io.vertx.micrometer.Match().apply {

  if (domain != null) {
    this.setDomain(domain)
  }
  if (label != null) {
    this.setLabel(label)
  }
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

