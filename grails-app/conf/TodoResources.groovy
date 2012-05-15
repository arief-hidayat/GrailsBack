modules = {
    todo {
        dependsOn 'jquery,underscore,backbone'

        resource url: 'css/todos.css'
        resource url: 'js/todo/todomvc.js'
        resource url: 'js/todo/todomvc.todoapp.js'
        resource url: 'js/todo/todomvc.todos.js'
        resource url: 'js/todo/todomvc.todolist.js'
        resource url: 'js/application.js'
    }
    socket {
        resource url: 'js/sockjs-0.3.min.js'
    }
    backbone {
        resource url: 'js/backbone.js'
        resource url: 'js/backbone.marionette.js'
    }
    underscore {
        resource url: 'js/underscore.js', disposition: 'head'
    }
}
