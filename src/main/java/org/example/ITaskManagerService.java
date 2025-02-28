package org.example;

public interface ITaskManagerService {
    void SaveTask(Task task);
    void ShowTasks();
    void DeleteTask(Task task);
}
