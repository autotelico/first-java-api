public class Main {
    public static void main(String[] args) {
        TodoList myTodos = new TodoList();
        myTodos.addTask("Clean floor", "Mop it");
        myTodos.addTask("Clean desk", "Organize it");
        myTodos.printAllTasks();
        myTodos.removeTask("Clean floor");
    }
}
