package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class TaskManagerService implements ITaskManagerService {
    private final TaskManagerRepository taskManagerRepository;

    @Autowired
    public TaskManagerService(TaskManagerRepository taskManagerRepository) {
        this.taskManagerRepository = taskManagerRepository;
    }
    @Override
    public void SaveTask(Task task){
        taskManagerRepository.addTask(task);
    }

    @Override
    public void ShowTasks() {
        System.out.println("Your tasks: ");
        taskManagerRepository.showTasks();
    }

    @Override
    public void DeleteTask(Task task) {
        taskManagerRepository.removeTask(task);
    }

}
