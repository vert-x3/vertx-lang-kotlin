import io.vertx.core.*

interface MyVerticle : Verticle
abstract class A : AbstractVerticle()
sealed class S : AbstractVerticle()

class V3 : A(), MyVerticle {
  override fun start(startFuture: Promise<Void>) {
    start()
    vertx.sharedData().getLocalMap<String, String>("V3").put("started", "true")
    startFuture.complete()
  }
}
