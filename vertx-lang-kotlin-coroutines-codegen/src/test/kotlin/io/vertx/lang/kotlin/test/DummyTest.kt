package io.vertx.lang.kotlin.test

import io.vertx.codegen.testmodel.CollectionTCKImpl
import io.vertx.codegen.testmodel.NullableTCKImpl
import io.vertx.codegen.testmodel.RefedInterface2Impl
import io.vertx.codegen.testmodel.TestInterfaceImpl
import io.vertx.core.VertxException
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerAsyncResultNullJsonObject
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerAsyncResultSetAbstractVertxGen
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerAsyncResultVoid
import io.vertx.kotlin.codegen.testmodel.methodWithNullableCharHandlerAsyncResult
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Test
import kotlin.test.assertEquals

class DummyTest {
  @Test
  fun testVoid() = runBlocking {
    TestInterfaceImpl().methodWithHandlerAsyncResultVoid(sendFailure = false)
  }

  @Test(expected = VertxException::class)
  fun testVoidWithError() = runBlocking {
    TestInterfaceImpl().methodWithHandlerAsyncResultVoid(sendFailure = true)
  }

  @Test
  fun testNoAnnotationNull() = runBlocking {
    val nullJsonObject = TestInterfaceImpl().methodWithHandlerAsyncResultNullJsonObject()
    assertEquals(null, nullJsonObject as JsonObject?)
  }


  @Test
  fun testNullable() = runBlocking {
    assertEquals(null,
      NullableTCKImpl().methodWithNullableCharHandlerAsyncResult(notNull = false)
    )
  }

  @Test
  fun testCollection() = runBlocking {
    // as RefedInterface2Impl does not have a nice hashcode, set equality fails
    assertEquals(
      setOf(
        RefedInterface2Impl().setString("abstractfoo"),
        RefedInterface2Impl().setString("abstractbar")
      ).toList(),
      CollectionTCKImpl().methodWithHandlerAsyncResultSetAbstractVertxGen().toList()
    )
  }

}
