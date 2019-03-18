package io.vertx

import io.vertx.core.Vertx
import org.junit.After
import org.junit.Test

/**
 *  created by wang007 on 2019/3/18
 */
class KotlinVerticleFactoryFixTest {

  val vertx = Vertx.vertx()!!

  @After
  fun tearDown() {
    vertx.close()
  }

  @Test
  fun kotlinVerticlFactoryFixTest() {
    vertx.deployVerticle("kt:io.vertx.DemoVerticlekt")
  }

}
