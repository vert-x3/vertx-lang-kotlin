import io.vertx.core.*

val c : Context = context;
val v : Vertx = vertx;

v.eventBus().send("test-address", c.deploymentID())