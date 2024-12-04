package com.arquiteturaWeb.provaAv2.controller;

import com.arquiteturaWeb.provaAv2.model.Task;
import com.arquiteturaWeb.provaAv2.model.User;
import com.arquiteturaWeb.provaAv2.service.AuthService;
import com.arquiteturaWeb.provaAv2.service.TaskService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    private final TaskService taskService;
    private final AuthService authService;

    public TaskController(TaskService taskService, AuthService authService) {
        this.taskService = taskService;
        this.authService = authService;
    }

    @PostMapping
    public Task createTask(@RequestBody Task task) {
        var user = authService.getLoggedUser();

        task.setUser(user);

        return taskService.saveTask(task);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();
        return taskService.getTasksByUser(user.getId());
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTaskById(id);
    }
}
