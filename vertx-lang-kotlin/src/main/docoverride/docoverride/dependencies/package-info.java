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
 * If you are using Maven or Gradle, add the following dependency to the _dependencies_ section of your
 * project descriptor to access the Vert.x Core API and enable the JavaScript support:
 *
 * * Maven (in your `pom.xml`):
 *
 * [source,xml,subs="+attributes"]
 * ----
 * <dependency>
 *   <groupId>io.vertx</groupId>
 *   <artifactId>vertx-core</artifactId>
 *   <version>${maven.version}</version>
 * </dependency>
 * <dependency>
 *   <groupId>io.vertx</groupId>
 *   <artifactId>vertx-lang-kotlin</artifactId>
 *   <version>${maven.version}</version>
 * </dependency>
 * ----
 *
 * * Gradle (in your `build.gradle` file):
 *
 * [source,groovy,subs="+attributes"]
 * ----
 * compile "io.vertx:vertx-core:${maven.version}"
 * compile "io.vertx:vertx-lang-kotlin:${maven.version}"
 * ----
 */
@Document(fileName = "override/dependencies.adoc")
package docoverride.dependencies;

import io.vertx.docgen.Document;
