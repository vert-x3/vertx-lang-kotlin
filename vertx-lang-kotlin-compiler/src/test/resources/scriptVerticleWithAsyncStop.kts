import io.vertx.core.*

val c : Context = context;
val v : Vertx = vertx;

fun stop(fut : Promise<Void>) {
  v.eventBus().send("test-address", c.deploymentID())
  fut.complete()
}
