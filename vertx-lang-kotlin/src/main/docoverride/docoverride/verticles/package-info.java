/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

/**
 *
 * === Writing Verticles
 *
 * Writing a Verticle with Kotlin is achieved the same way you write a Java Verticle by
 * extending the {@link io.vertx.core.AbstractVerticle}.
 *
 * Here's an example verticle:
 *
 * [source, kotlin]
 * ----
 * import io.vertx.core.AbstractVerticle
 *
 * class MyVerticle : AbstractVerticle() {
 *
 *   // Called when verticle is deployed
 *   override fun start() {
 *   }
 *
 *   // Optional - called when verticle is undeployed
 *   override fun stop() {
 *   }
 * }
 * ----
 *
 * Please refer to the Java documentation.
 */
@Document(fileName = "override/verticles.adoc")
package docoverride.verticles;

import io.vertx.docgen.Document;
