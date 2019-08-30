package io.vertx.kotlin.dsl

import io.vertx.core.Handler
import io.vertx.core.http.HttpMethod
import io.vertx.ext.web.Route
import io.vertx.ext.web.RoutingContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext


class CoroutineRoute(val route: Route, override val coroutineContext: CoroutineContext): Route,
  CoroutineScope {
  override fun virtualHost(virtualHost: String?): Route {
    return route.virtualHost(virtualHost)
  }

  fun Route.asCoroutineRoute(coroutineContext: CoroutineContext): CoroutineRoute {
    return CoroutineRoute(this, coroutineContext)
  }
  /**
   * Set the path prefix for this route. If set then this route will only match request URI paths which start with this
   * path prefix. Only a single path or path regex can be set for a route.
   *
   * @param path  the path prefix
   * @return a reference to this, so the API can be used fluently
   */
  override fun path(path: String?): Route {
    return route.path(path).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Add a content type produced by this route. Used for content based routing.
   *
   * @param contentType  the content type
   * @return a reference to this, so the API can be used fluently
   */
  override fun produces(contentType: String?): Route {
    return route.produces(contentType).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Remove this route from the masterRouter
   *
   * @return a reference to this, so the API can be used fluently
   */
  override fun remove(): Route {
    return route.remove().asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Append a request handler to the route handlers list. The masterRouter routes requests to handlers depending on whether the various
   * criteria such as method, path, etc match. When method, path, etc are the same for different routes, You should add multiple
   * handlers to the same route object rather than creating two different routes objects with one handler for route
   *
   * @param requestHandler  the request handler
   * @return a reference to this, so the API can be used fluently
   */
  override fun handler(requestHandler: Handler<RoutingContext>?): Route {
    return route.handler(requestHandler).asCoroutineRoute(this.coroutineContext)
  }


  /**
   *
   */
  fun coroutineHandler(handler: suspend (RoutingContext) -> Unit): Route {
    this.handler {
      launch(coroutineContext) {
        try {
          handler(it)
        } catch (e: Exception) {
          it.fail(e)
        }
      }
    }
    return this
  }

  /**
   * Add an HTTP method for this route. By default a route will match all HTTP methods. If any are specified then the route
   * will only match any of the specified methods
   *
   * @param method  the HTTP method to add
   * @return a reference to this, so the API can be used fluently
   */
  override fun method(method: HttpMethod?): Route {
    return route.method(method).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Specify the order for this route. The masterRouter tests routes in that order.
   *
   * @param order  the order
   * @return a reference to this, so the API can be used fluently
   */
  override fun order(order: Int): Route {
    return route.order(order).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Add a content type consumed by this route. Used for content based routing.
   *
   * @param contentType  the content type
   * @return a reference to this, so the API can be used fluently
   */
  override fun consumes(contentType: String?): Route {
    return route.consumes(contentType).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * When you add a new route with a regular expression, you can add named capture groups for parameters. <br></br>
   * However, if you need more complex parameters names (like "param_name"), you can add parameters names with
   * this function. You have to name capture groups in regex with names: "p0", "p1", "p2", ... <br></br>
   * <br></br>
   * For example: If you declare route with regex \/(?<p0>[a-z]*)\/(?<p1>[a-z]*) and group names ["param_a", "param-b"]
   * for uri /hello/world you receive inside pathParams() the parameter param_a = "hello"
   *
   * @param groups group names
   * @return a reference to this, so the API can be used fluently
  </p1></p0> */
  override fun setRegexGroupsNames(groups: MutableList<String>?): Route {
    return route.setRegexGroupsNames(groups).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * If true then the normalised request path will be used when routing (e.g. removing duplicate /)
   * Default is true
   *
   * @param useNormalisedPath  use normalised path for routing?
   * @return a reference to this, so the API can be used fluently
   */
  override fun useNormalisedPath(useNormalisedPath: Boolean): Route {
    return route.useNormalisedPath(useNormalisedPath).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * @return the path prefix (if any) for this route
   */
  override fun getPath(): String {
    return route.getPath()
  }

  /**
   * Set the path prefix as a regular expression. If set then this route will only match request URI paths, the beginning
   * of which match the regex. Only a single path or path regex can be set for a route.
   *
   * @param path  the path regex
   * @return a reference to this, so the API can be used fluently
   */
  override fun pathRegex(path: String?): Route {
    return route.pathRegex(path).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Enable this route.
   *
   * @return a reference to this, so the API can be used fluently
   */
  override fun enable(): Route {
    return route.enable().asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Specify this is the last route for the masterRouter.
   *
   * @return a reference to this, so the API can be used fluently
   */
  override fun last(): Route {
    return route.last().asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Like [io.vertx.ext.web.Route.blockingHandler] called with ordered = true
   */
  override fun blockingHandler(requestHandler: Handler<RoutingContext>?): Route {
    return route.blockingHandler(requestHandler).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Specify a blocking request handler for the route.
   * This method works just like [.handler] excepted that it will run the blocking handler on a worker thread
   * so that it won't block the event loop. Note that it's safe to call context.next() from the
   * blocking handler as it will be executed on the event loop context (and not on the worker thread.
   *
   * If the blocking handler is ordered it means that any blocking handlers for the same context are never executed
   * concurrently but always in the order they were called. The default value of ordered is true. If you do not want this
   * behaviour and don't mind if your blocking handlers are executed in parallel you can set ordered to false.
   *
   * @param requestHandler  the blocking request handler
   * @param ordered if true handlers are executed in sequence, otherwise are run in parallel
   * @return a reference to this, so the API can be used fluently
   */
  override fun blockingHandler(requestHandler: Handler<RoutingContext>?, ordered: Boolean): Route {
    return route.blockingHandler(requestHandler, ordered).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * Append a failure handler to the route failure handlers list. The masterRouter routes failures to failurehandlers depending on whether the various
   * criteria such as method, path, etc match. When method, path, etc are the same for different routes, You should add multiple
   * failure handlers to the same route object rather than creating two different routes objects with one failure handler for route
   *
   * @param failureHandler  the request handler
   * @return a reference to this, so the API can be used fluently
   */
  override fun failureHandler(failureHandler: Handler<RoutingContext>?): Route {
    return route.failureHandler(failureHandler).asCoroutineRoute(this.coroutineContext)
  }

  /**
   * @return the http methods accepted by this route
   */
  override fun methods(): MutableSet<HttpMethod> {
    return route.methods()
  }

  /**
   * Disable this route. While disabled the masterRouter will not route any requests or failures to it.
   *
   * @return a reference to this, so the API can be used fluently
   */
  override fun disable(): Route {
    return route.disable().asCoroutineRoute(this.coroutineContext)
  }


}
