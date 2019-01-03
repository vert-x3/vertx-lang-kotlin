package io.vertx.lang.kotlin.test

import io.vertx.core.json.JsonObject
import io.vertx.kotlin.lang.kotlin.test.dataobject.accountOf
import io.vertx.lang.kotlin.test.dataobject.Account
import org.junit.Test

class AccountTest {

  @Test
  fun `dataobject function creates a proper account`() {
    var account = Account(JsonObject())
    account = accountOf(
      id = 0L,
      name = "a name",
      otherNames = listOf("name", "another_name")
    )

    // TODO add deprecated method test
  }
}
