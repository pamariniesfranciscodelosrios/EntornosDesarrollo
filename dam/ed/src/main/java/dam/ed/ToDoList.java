package dam.ed;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        if (task == null || task.isEmpty()) throw new IllegalArgumentException("Task cannot be empty");
        tasks.add(task);
    }

    public void removeTask(String task) {
        tasks.remove(task);
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public boolean containsTask(String task) {
        return tasks.contains(task);
    }
}