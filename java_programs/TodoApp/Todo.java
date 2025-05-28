package TodoApp;

public class Todo {
    String title;
    String description;

    public Todo(String title,String description) {
        this.title = title;
        this.description = description;
    }

    public void displayTodo(){
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
    }
}
