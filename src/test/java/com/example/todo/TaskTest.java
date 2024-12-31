package com.example.todo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    @Test
    void testTaskCreation() {
        Task task = new Task("Learn Java");
        assertEquals("Learn Java", task.getTitle());
        assertFalse(task.isCompleted());
    }

    @Test
    void testMarkAsCompleted() {
        Task task = new Task("Learn Java");
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }
}
