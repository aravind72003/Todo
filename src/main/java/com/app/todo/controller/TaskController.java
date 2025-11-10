package com.app.todo.controller;

import com.app.todo.models.Task;
import com.app.todo.services.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller //marks a class as a spring mvc controller, making it capable of handling incoming web requests and returning a response
//@RequestMapping("/tasks") //used to map web requests (like URLs) to specific handler classes or methods
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping //used to map incoming HTTP GET requests to specific handler methods in a controller
    public String getTasks(Model model) {
        List<Task> tasks = taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }

    @PostMapping //used to map incoming HTTP GET requests to specific handler methods in a controller
    public String createTasks(@RequestParam String title) {
        taskService.createTask(title);
        return "redirect:/";
    }

    @GetMapping("/{id}/delete") //used to map incoming HTTP GET requests to specific handler methods in a controller
    public String deleteTask(@PathVariable Long id) {
    taskService.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/toggle") //used to map incoming HTTP GET requests to specific handler methods in a controller
    public String toggleTask(@PathVariable Long id) {
        taskService.toggleTask(id);
        return "redirect:/";
    }
}
