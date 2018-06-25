package io.vertx.lang.kotlin.test

import io.vertx.codegen.testmodel.NullableTCK
import io.vertx.codegen.testmodel.NullableTCKImpl
import io.vertx.codegen.testmodel.TestInterface
import io.vertx.codegen.testmodel.TestInterfaceImpl
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerAsyncResultStringAwait
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerDataObjectAwait
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerUserTypesAwait
import io.vertx.kotlin.codegen.testmodel.methodWithNullableStringHandlerAwait
import junit.framework.Assert.assertNull
import junit.framework.Assert.fail
import kotlinx.coroutines.experimental.Unconfined
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch
import org.junit.Test
import kotlin.test.assertEquals

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
class CoroutinesTCKTest {

  val tck: TestInterface = TestInterfaceImpl();
  val nullableTck: NullableTCK = NullableTCKImpl();

  @Test
  fun testAsyncResultSuccess() {
    val s = coroutinesTest { tck.methodWithHandlerAsyncResultStringAwait(false) }
    assertEquals("quux!", s)
  }

  @Test
  fun testAsyncResultFailure() {
    try {
      coroutinesTest { tck.methodWithHandlerAsyncResultStringAwait(true) }
      fail()
    } catch (e: Exception) {
      assertEquals("foobar!", e.message)
    }
  }

  @Test
  fun testAsyncResultNullableSuccess() {
    val s = coroutinesTest { nullableTck.methodWithNullableStringHandlerAwait(true) }
    assertEquals("the_string_value", s)
    val t = coroutinesTest { nullableTck.methodWithNullableStringHandlerAwait(false) }
    assertNull("the_string_value", t)
  }

  @Test
  fun testAsync() {
    val s = coroutinesTest { tck.methodWithHandlerDataObjectAwait() }
    assertEquals("foo", s.foo)
  }

  @Test
  fun testAsyncNullable() {
    val s = coroutinesTest { nullableTck.methodWithNullableStringHandlerAwait(true) }
    assertEquals("the_string_value", s)
    val t = coroutinesTest { nullableTck.methodWithNullableStringHandlerAwait(false) }
    assertNull(t)
  }

  fun <T> coroutinesTest(block: suspend () -> T) : T {
    val deferred = async<T>(Unconfined) {
      block()
    }
    return deferred.getCompleted()
  }


}
