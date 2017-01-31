package io.vertx.lang.kotlin.test

import io.vertx.lang.kotlin.*
import org.junit.*
import java.io.*
import kotlin.test.*

/**
 * Author: Sergey Mashkov
 */
class KotlinCompilerHelperTest {
  @Test
  fun smokeTest() {
    compile(File("src/test/resources/main.kt"))
  }

  @Test
  fun testClassesWithFunctions() {
    assertEquals(listOf("test.A", "test.B"), compile(File("src/test/resources/classesWithFunctions.kt")).map { it.name }.sorted())
  }

  @Test
  fun testNestedClasses() {
    assertEquals(listOf("test.Outer", "test.Outer\$Inner"), compile(File("src/test/resources/nestedClasses.kt")).map { it.name }.sorted())
  }

  @Test
  fun testScript() {
    assertEquals(listOf("Script"), compile(File("src/test/resources/script.kts"), script = true).map { it.name })
  }

  private fun compile(file: File, script: Boolean = false) =
      KotlinCompilerHelper.compileKotlinScript(KotlinCompilerHelperTest::class.java.classLoader, script, file.toURI().toURL()) { state, it ->
        true
      }
}