vertx.createHttpServer.requestHandler { req: HttpServerRequest =>
  req.response.end("Hello World from Scala!")
}.listen(8080)
