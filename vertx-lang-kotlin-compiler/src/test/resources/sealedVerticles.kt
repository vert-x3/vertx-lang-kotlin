import io.vertx.core.*

sealed class BaseVerticle : AbstractVerticle() {
    override fun start(startFuture: Future<Void>) {
        start()
        vertx.sharedData().getLocalMap<String, String>("sealed").put(javaClass.simpleName, "started")
        startFuture.complete()
    }

    class V5 : BaseVerticle()
}
