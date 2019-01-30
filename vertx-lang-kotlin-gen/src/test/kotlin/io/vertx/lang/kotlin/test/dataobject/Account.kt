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
    id = jo.getLong("id", id)
    name = jo.getString("name")
    otherNames = jo.getJsonArray("otherNames", JsonArray())
      .list
      .filter { it is String }
      .map { it as String }
  }
}
