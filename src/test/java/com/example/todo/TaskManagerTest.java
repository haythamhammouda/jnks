package com.example.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class TaskManagerTest {
    @Test
    void testAddTask() {
        TaskManager manager = new TaskManager();
        Task task = new Task("Learn Java");
        manager.addTask(task);

        List<Task> tasks = manager.getTasks();
        assertEquals(1, tasks.size());
        assertEquals("Learn Java", tasks.get(0).getTitle());
    }
}
