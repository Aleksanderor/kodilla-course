package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryPutTaskInMap() {
        // given
        TaskFactory factory = new TaskFactory();
        Map<Task, Boolean> tasks = new HashMap<>();

        // when
        Task task1 = factory.makeTask(TaskFactory.SHOPPING_TASK);
        tasks.put(task1, task1.isTaskExecuted());

        Task task2 = factory.makeTask(TaskFactory.PAINTING_TASK);
        tasks.put(task2, task2.isTaskExecuted());

        Task task3 = factory.makeTask(TaskFactory.DRIVING_TASK);
        tasks.put(task3, task3.isTaskExecuted());

        // then
        Assertions.assertEquals("SHOPPING TASK", task1.getTaskName());
        Assertions.assertEquals("PAINTING TASK", task2.getTaskName());
        Assertions.assertEquals("DRIVING TASK", task3.getTaskName());

        Assertions.assertTrue(tasks.containsKey(task1));
        Assertions.assertTrue(tasks.containsKey(task2));
        Assertions.assertTrue(tasks.containsKey(task3));

        Assertions.assertFalse(tasks.get(task1));
        Assertions.assertFalse(tasks.get(task2));
        Assertions.assertFalse(tasks.get(task3));
    }

    @Test
    void testFactoryPaintingTask() {

        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task task = factory.makeTask(TaskFactory.PAINTING_TASK);
        task.executeTask();
        boolean isExecuted = task.isTaskExecuted();

        // then
        assertEquals("PAINTING TASK", task.getTaskName());
        assertTrue(isExecuted);
    }

    @Test
    void testFactoryDrivingTask() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task task = factory.makeTask(TaskFactory.DRIVING_TASK);
        task.executeTask();
        boolean isExecuted = task.isTaskExecuted();

        // then
        assertEquals("DRIVING TASK", task.getTaskName());
        assertTrue(isExecuted);
    }

    @Test
    void testPaintingDrivingTask() {
        // given
        TaskFactory factory = new TaskFactory();

        // when
        Task task = factory.makeTask(TaskFactory.PAINTING_TASK);
        task.executeTask();
        boolean isExecuted = task.isTaskExecuted();

        // then
        assertEquals("PAINTING TASK", task.getTaskName());
        assertTrue(isExecuted);
    }
}
