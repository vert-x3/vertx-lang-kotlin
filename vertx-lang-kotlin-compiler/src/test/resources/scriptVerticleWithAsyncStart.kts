import io.vertx.core.*

val c : Context = context;
val v : Vertx = vertx;

fun start(fut : Promise<Void>) {
  v.eventBus().send("test-address", c.deploymentID())
  fut.complete()
}
