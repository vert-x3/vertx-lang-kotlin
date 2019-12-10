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
package io.vertx.lang.kotlin.test

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.lang.kotlin.test.dataobject.BooleanTestObject
import io.vertx.kotlin.lang.kotlin.test.dataobject.booleanTestObjectOf
import io.vertx.lang.kotlin.test.dataobject.BooleanTestObject
import org.junit.Test

class DataObjectBooleanTest {

  @Test
  fun `dataobject function has valid property for boolean`() {
    var dataObject = BooleanTestObject(JsonObject())
    dataObject = booleanTestObjectOf(
      notPrefixed = true
    )

    dataObject = BooleanTestObject(
      notPrefixed = true
    )
  }

  @Test
  fun `dataobject function has valid property for boolean with "is" prefix`() {
    var dataObject = BooleanTestObject(JsonObject())
    dataObject = booleanTestObjectOf(
      isPrefixed = true
    )

    dataObject = BooleanTestObject(
      isPrefixed = true
    )
  }
}
