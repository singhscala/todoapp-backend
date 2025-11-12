package org.example.repository;
import org.example.entity.Task;
import org.springframework.stereotype.Repository;
import software.amazon.awssdk.enhanced.dynamodb.*;

import java.util.ArrayList; import java.util.List;
import java.util.UUID;

@Repository
public class TaskRepository {
    private final DynamoDbEnhancedClient enhancedClient;
    private final DynamoDbTable<Task> taskTable;

    public TaskRepository(DynamoDbEnhancedClient enhancedClient) {
        this.enhancedClient = enhancedClient;
        this.taskTable = enhancedClient.table("Tasks", TableSchema.fromBean(Task.class));
    }

    public List<Task> findAll() {
        List<Task> tasks = new ArrayList<>();
        for (Task task : taskTable.scan().items()) {
            tasks.add(task);
        }
        return tasks;
    }

    public Task findById(String id) {
        return taskTable.getItem(Key.builder().partitionValue(id).build());
    }

    public Task save(Task task) {
        if (task.getId() == null) {
            task.setId(UUID.randomUUID().toString());
        }
        if (task.getCreatedAt() == null) {
            task.setCreatedAt(java.time.Instant.now().toString());
        }
        taskTable.putItem(task);
        return task;
    }

    public void deleteById(String id) {
        taskTable.deleteItem(Key.builder().partitionValue(id).build());
    }
}