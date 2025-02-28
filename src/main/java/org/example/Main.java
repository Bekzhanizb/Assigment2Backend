package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ITaskManagerService taskManagerService = context.getBean(ITaskManagerService.class);

        Task task1 = new Task(1,"Work Out");
        taskManagerService.SaveTask(task1);
        taskManagerService.ShowTasks();
        context.close();
    }
}