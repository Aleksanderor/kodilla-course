package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

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
