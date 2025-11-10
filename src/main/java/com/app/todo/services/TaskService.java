package com.app.todo.services;

import com.app.todo.models.Task;
import com.app.todo.repositories.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //used to indicate that this class is of type "Service"
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
}
