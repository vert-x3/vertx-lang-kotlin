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
import io.vertx.kotlin.lang.kotlin.test.dataobject.URLObject
import io.vertx.kotlin.lang.kotlin.test.dataobject.urlObjectOf
import io.vertx.lang.kotlin.test.dataobject.URLObject
import org.junit.Test

class URLObjectTest {

  @Test
  fun `dataobject builder function creates a url object`() {
    var urlObject = URLObject(JsonObject())
    urlObject = urlObjectOf(schema = "https")

    urlObject = URLObject(schema = null)
  }
}
