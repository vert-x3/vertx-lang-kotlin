import io.vertx.core.*

class M1 : Verticle {
  private lateinit var vertx: Vertx

  override fun init(vertx: Vertx, context: Context?) {
    this.vertx = vertx
  }

  override fun start(startFuture: Future<Void>?) {
    vertx.sharedData().getLocalMap<String, String>("M").put("M1", "1")
    startFuture?.complete()
  }

  override fun stop(stopFuture: Future<Void>?) {
    stopFuture?.complete()
  }

  override fun getVertx() = vertx
}

class M2 : Verticle {
  private lateinit var vertx: Vertx

  override fun init(vertx: Vertx, context: Context?) {
    this.vertx = vertx
  }

  override fun start(startFuture: Future<Void>?) {
    vertx.sharedData().getLocalMap<String, String>("M").put("M2", "2")
    startFuture?.complete()
  }

  override fun stop(stopFuture: Future<Void>?) {
    stopFuture?.complete()
  }

  override fun getVertx() = vertx
}

class M3 : Verticle {
  private lateinit var vertx: Vertx

  override fun init(vertx: Vertx, context: Context) {
    this.vertx = vertx
  }

  override fun start(startFuture: Future<Void>?) {
    vertx.sharedData().getLocalMap<String, String>("M").put("M3", "3")
    startFuture?.complete()
  }

  override fun stop(stopFuture: Future<Void>?) {
    stopFuture?.complete()
  }

  override fun getVertx() = vertx
}