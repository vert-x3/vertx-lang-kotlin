package io.vertx.lang.kotlin.coroutines

import io.vertx.codegen.testmodel.*
import io.vertx.core.VertxException
import io.vertx.core.json.JsonObject
import io.vertx.kotlin.codegen.testmodel.*
import kotlinx.coroutines.experimental.runBlocking
import org.junit.Test
import kotlin.test.*

class CoroutineCodeGenTest {
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
    // As the method is not annotated with @Nullable,
    // the generated type is without a "?".
    // Users can cast it back to nullable.
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
    // Because RefedInterface2Impl does not have a nice hashcode, set equality fails.
    assertEquals(
      setOf(
        RefedInterface2Impl().setString("abstractfoo"),
        RefedInterface2Impl().setString("abstractbar")
      ).toList(),
      CollectionTCKImpl().methodWithHandlerAsyncResultSetAbstractVertxGen().toList()
    )
  }

  @Test
  fun testParameterized() = runBlocking {
    GenericsTCKImpl().let {
      assertEquals(
        it.methodWithByteParameterizedReturn().value,
        it.methodWithHandlerAsyncResultByteParameterized().value
      )
    }
  }

  @Test
  fun testCreateFromClass() = runBlocking {
    GenericsTCKImpl().let {
      assertEquals(
        it.methodWithJsonObjectParameterizedReturn().value,
        it.methodWithClassTypeHandlerAsyncResult(JsonObject::class.java)
      )
    }
  }

  @Test
  fun testGenerics() = runBlocking {
    assertEquals(
      Hello("world"),
      NullableTCKImpl().methodWithNullableTypeVariableHandlerAsyncResult(
        notNull = true,
        value = Hello("world")
      )
    )

    assertEquals(
      null,
      NullableTCKImpl().methodWithNullableTypeVariableHandlerAsyncResult(
        notNull = false,
        value = Hello("world")
      ) as Hello? // because the annotation is missing
    )
  }

  @Test
  fun testNullableTypeParam() = runBlocking {
    assertTrue(
      NullableTCKImpl()
        .methodWithMapNullableBooleanHandlerAsyncResult().any { (_, value) ->
          value == null
        }
    )
  }

  data class Hello(val world: String)
}
