import io.vertx.core.*

class V2 : AbstractVerticle() {
  override fun start(startFuture: Future<Void>) {
    start()
    vertx.sharedData().getLocalMap<String, String>("V2").put("started", "true")
    startFuture.complete()
  }
}
