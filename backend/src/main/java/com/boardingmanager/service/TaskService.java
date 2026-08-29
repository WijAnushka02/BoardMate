package com.boardingmanager.service;

import com.boardingmanager.entity.Task;
import com.boardingmanager.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task taskDetails) {
        Task task = getTaskById(id);
        task.setName(taskDetails.getName());
        task.setDescription(taskDetails.getDescription());
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
