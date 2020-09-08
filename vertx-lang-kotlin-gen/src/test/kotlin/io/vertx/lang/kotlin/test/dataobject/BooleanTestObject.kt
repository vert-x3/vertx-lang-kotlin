package io.vertx.lang.kotlin.test.dataobject

import io.vertx.codegen.annotations.DataObject
import io.vertx.core.json.JsonObject

@DataObject
class BooleanTestObject {
  var isPrefixed: Boolean? = null
  var notPrefixed: Boolean? = null

  constructor(json: JsonObject) {
    isPrefixed = json.getBoolean("isPrefixed")
    notPrefixed = json.getBoolean("notPrefixed")
  }
}
