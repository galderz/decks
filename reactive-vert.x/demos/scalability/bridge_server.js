var vertx = require('vertx')

var server = vertx.createHttpServer()

// Serve the static resources
server.requestHandler(function(req) {
  var file = req.path() === '/' ? 'index.html' : req.path()
  req.response.sendFile("./" + file)
})

// Create a SockJS bridge which lets everything through (be careful!)
vertx.createSockJSServer(server).bridge({prefix: "/eventbus"}, [{}], [{}])

server.listen(8080)
