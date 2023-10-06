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
package io.vertx.lang.kotlin.test.dataobject

import io.vertx.codegen.annotations.DataObject
import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject

@DataObject
class Account {

  var id: Long = 0
  var name: String? = null
  var otherNames: List<String> = ArrayList()
  var isPrefixed: Boolean? = null
  var notPrefixed: Boolean? = null

  constructor(jo: JsonObject) {
    id = jo.getLong("id", id)
    name = jo.getString("name")
    otherNames = jo.getJsonArray("otherNames", JsonArray())
      .list
      .filter { it is String }
      .map { it as String }
    isPrefixed = jo.getBoolean("isPrefixed")
    notPrefixed = jo.getBoolean("notPrefixed")
  }
}
