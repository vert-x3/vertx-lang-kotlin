import io.vertx.core.*

sealed class BaseVerticle : AbstractVerticle() {
  override fun start(startFuture: Future<Void>) {
    start()
    vertx.sharedData().getLocalMap<String, String>("sealed").put(this::class.java.simpleName, "started")
    startFuture.complete()
  }

  class V5 : BaseVerticle()
}
