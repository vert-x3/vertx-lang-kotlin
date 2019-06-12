import io.vertx.core.*

class V1 : Verticle {
  private var vertx: Vertx? = null

  override fun init(vertx: Vertx?, context: Context?) {
    this.vertx = vertx
  }

  override fun start(startFuture: Promise<Void>?) {
    startFuture?.complete()
  }

  override fun stop(stopFuture: Promise<Void>?) {
    stopFuture?.complete()
  }

  override fun getVertx() = vertx
}
