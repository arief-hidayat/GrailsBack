import org.vertx.groovy.core.Vertx

class BootStrap {
    def grailsApplication
    def init = { servletContext ->
        def vertx = Vertx.newVertx()
        def httpServer = vertx.createHttpServer()
        vertx.createSockJSServer(httpServer).installApp(prefix: grailsApplication.config.vertx.prefix) { sock ->
            println "on sock"
            sock.dataHandler { buff ->
                println "on buffer"
                sock << buff
            }
        }
        httpServer.listen(grailsApplication.config.vertx.port)
    }

    def destroy = {
    }
}