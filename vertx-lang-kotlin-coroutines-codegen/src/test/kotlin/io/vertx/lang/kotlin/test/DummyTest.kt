package io.vertx.lang.kotlin.test
import org.junit.Test
import kotlinx.coroutines.experimental.*
import io.vertx.kotlin.codegen.testmodel.methodWithHandlerAsyncResultVoid
import io.vertx.codegen.testmodel.TestInterfaceImpl

class DummyTest {
  @Test
  fun testVoid() = runBlocking {
    TestInterfaceImpl().methodWithHandlerAsyncResultVoid(sendFailure = false)
  }

}
