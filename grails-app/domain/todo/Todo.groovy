package todo

class Todo {
    static expose = 'todo'

    boolean done
    int order
    String text

    static constraints = {
        text(nullable: false, empty: false)
    }
}
