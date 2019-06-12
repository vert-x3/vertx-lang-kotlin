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
package io.vertx.lang.kotlin;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Promise;
import io.vertx.core.Vertx;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class ScriptVerticle extends AbstractVerticle {

  private final Class<?> clazz;
  private Object instance;

  public ScriptVerticle(Class<?> clazz) {
    this.clazz = clazz;
  }

  @Override
  public void start(Promise<Void> startFuture) throws Exception {
    instance = clazz.getConstructor(Vertx.class, Context.class).newInstance(vertx, context);
    try {
      Method start = clazz.getDeclaredMethod("start", Promise.class);
      start.invoke(instance, startFuture);
    } catch (NoSuchMethodException ignore) {
      startFuture.complete();
    }
  }

  @Override
  public void stop(Promise<Void> stopFuture) throws Exception {
    try {
      Method stop = clazz.getDeclaredMethod("stop");
      stop.invoke(instance);
      stopFuture.complete();
    } catch (NoSuchMethodException e) {
      try {
        Method stop = clazz.getDeclaredMethod("stop", Promise.class);
        stop.invoke(instance, stopFuture);
      } catch (NoSuchMethodException ignore) {
      }
    }
  }
}
