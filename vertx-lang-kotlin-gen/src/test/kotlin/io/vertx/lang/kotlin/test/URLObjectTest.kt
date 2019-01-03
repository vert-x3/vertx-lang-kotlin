package io.vertx.lang.kotlin.test

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.lang.kotlin.test.dataobject.urlObjectOf
import io.vertx.lang.kotlin.test.dataobject.URLObject
import org.junit.Test

class URLObjectTest {

  @Test
  fun `dataobject builder function creates a url object`() {
    var urlObject = URLObject(JsonObject())
    urlObject = urlObjectOf(schema="https")

    // TODO test deprecated method
  }
}
