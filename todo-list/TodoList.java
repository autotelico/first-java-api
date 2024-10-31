import java.util.*;

public class TodoList {
    List<Task> tasks = new ArrayList<>();
    Set<String> taskTitleSet = new HashSet<>();

    private static class Task {
        private UUID uuid;
        private String title;
        private String description;

        public Task(String title, String description) {
            this.uuid = UUID.randomUUID();
            this.title = title;
            this.description = description;
        }

        String getTitle() {
            return title;
        }

        void setTitle(String newTitle) {
            this.title = newTitle;
        }

        UUID getUuid() {
            return uuid;
        }
    }

    void printAllTasks() {
        System.out.println("""
                ---
                MY TASKS:""");
        for (Task task : tasks) {
            System.out.printf("- %s\n", task.title);
        }
        System.out.println("---");
    }

    void addTask(String title, String description) {
        if (taskTitleSet.contains(title)) {
            System.err.println("Task already exists.");
            return;
        }
        Task newTask = new Task(title, description);
        tasks.add(newTask);
        taskTitleSet.add(newTask.title);
    }

    void removeTask(String title) {
        tasks.removeIf(task -> task.title.equals(title));
        taskTitleSet.remove(title);
        System.out.printf("Task %s removed.\n", title);
        this.printAllTasks();
    }
}