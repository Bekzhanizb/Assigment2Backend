package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("prototype")
public class TaskManagerRepository {
    private final List<Task> tasks;

    TaskManagerRepository() {
        tasks = new ArrayList<>();
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