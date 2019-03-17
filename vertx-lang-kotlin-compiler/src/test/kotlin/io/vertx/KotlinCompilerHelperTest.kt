/*
 * Copyright 2019 Red Hat, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Apache License v2.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * The Apache License v2.0 is available at
 * http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package io.vertx.lang.kotlin.test

import io.vertx.lang.kotlin.*
import org.junit.Test
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
    assertEquals(listOf("test.A", "test.B"), compile(File("src/test/resources/classesWithFunctions.kt")).map { it.key.name }.sorted())
  }

  @Test
  fun testNestedClasses() {
    assertEquals(listOf("test.Outer", "test.Outer\$Inner"), compile(File("src/test/resources/nestedClasses.kt")).map { it.key.name }.sorted())
  }

  @Test
  fun testScript() {
    assertEquals(listOf("Script"), compile(File("src/test/resources/script.kts"), script = true).map { it.key.name })
  }

  private fun compile(file: File, script: Boolean = false) =
      KotlinCompilerHelper.compileKotlinScript(KotlinCompilerHelperTest::class.java.classLoader, script, file.toURI().toURL()) { state, it ->
        true
      }
}
