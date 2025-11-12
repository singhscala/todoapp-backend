package org.example.service;

import org.example.entity.Task;
import org.example.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTaskById(String id) {
        return repository.findById(id);
    }

    public Task saveTask(Task task) {
        return repository.save(task);
    }

    public Task updateTask(String id, Task updatedTask) {
        Task existing = repository.findById(id);
        if (existing == null) return null;

        existing.setTitle(updatedTask.getTitle());
        existing.setSubtitle(updatedTask.getSubtitle());
        existing.setDescription(updatedTask.getDescription());
        existing.setStartDate(updatedTask.getStartDate());
        existing.setEndDate(updatedTask.getEndDate());
        existing.setPriority(updatedTask.getPriority());
        existing.setStatus(updatedTask.getStatus());

        return repository.save(existing);
    }

    public void deleteTask(String id) {
        repository.deleteById(id);
    }
}
