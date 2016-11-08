import io.vertx.core.*

private class PrivateV : AbstractVerticle() {
  override fun start(startFuture: Future<Void>) {
    start()
    vertx.sharedData().getLocalMap<String, String>("V4").put("privateStarted", "true")
    startFuture.complete()
  }
}

class V4 : AbstractVerticle() {
  override fun start(startFuture: Future<Void>) {
    start()
    vertx.sharedData().getLocalMap<String, String>("V4").put("started", "true")
    startFuture.complete()
  }
}

