package io.vertx.lang.kotlin.test.dataobject

import io.vertx.codegen.annotations.DataObject
import io.vertx.core.json.JsonObject

@DataObject
class URLObject {
  var schema: String = "http"

  constructor(jsonObject: JsonObject) {
    schema = jsonObject.getString("schema", schema)
  }
}
