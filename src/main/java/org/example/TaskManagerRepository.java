package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("prototype")
public class TaskManagerRepository {
    private static TaskManagerRepository instance;
    private final List<Task> tasks;

    private TaskManagerRepository() {
        tasks = new ArrayList<>();
    }

    public static TaskManagerRepository getInstance() {
        if (instance == null) {
            instance = new TaskManagerRepository();
        }
        return instance;
    }

    public void showTasks() {
        for (Task task : tasks) {
            System.out.println("ID: " + task.getId() + ". Task: " + task.getTask());
        }
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }
}