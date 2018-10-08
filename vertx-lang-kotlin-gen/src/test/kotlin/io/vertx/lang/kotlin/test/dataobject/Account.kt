package io.vertx.lang.kotlin.test.dataobject

import io.vertx.codegen.annotations.DataObject
import io.vertx.core.json.JsonArray
import io.vertx.core.json.JsonObject

@DataObject
class Account {

  var id: Long = 0
  var name: String? = null
  var otherNames: List<String> = ArrayList()

  constructor(jo: JsonObject) {
    this.id = jo.getLong("id")!!
    this.name = jo.getString("name")
    for (obj in jo.getJsonArray("otherNames", JsonArray())) {
      if (obj is String) {
        otherNames += obj
      }
    }
  }
}
