<!doctype html>
<html>
<head>
    <title><g:layoutTitle default="Grails"/></title>
    <g:layoutHead/>
    <script type="text/javascript">
        window.socketport = "http://localhost:${grailsApplication.config.vertx.port}${grailsApplication.config.vertx.prefix}";
    </script>
    <r:layoutResources/>
</head>

<body>
<g:layoutBody/>
<r:layoutResources/>
</body>
</html>
