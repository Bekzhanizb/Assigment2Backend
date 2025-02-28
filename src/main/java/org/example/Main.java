package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        ITaskManagerService taskManagerService = context.getBean(ITaskManagerService.class);
        ITaskManagerService taskManagerService1 = context.getBean(ITaskManagerService.class);

        Task task1 = new Task(1,"Work Out");
        Task task2 = new Task(2,"Go to School");

        Task task3 = new Task(3,"Hang out with Friends");
        Task task4 = new Task(4,"Go to Cinema");

        taskManagerService.SaveTask(task1);
        taskManagerService.SaveTask(task2);

        taskManagerService1.SaveTask(task3);
        taskManagerService1.SaveTask(task4);

        taskManagerService.ShowTasks();
        taskManagerService1.ShowTasks();

        context.close();
    }
}