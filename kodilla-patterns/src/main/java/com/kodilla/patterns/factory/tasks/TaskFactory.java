package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;
import java.util.Map;

public class TaskFactory {
    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    private final Map<Task, Boolean> tasks = new HashMap<>();

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("SHOPPING TASK", "beer", 9);
            case PAINTING_TASK:
                return new PaintingTask("PAINTING TASK", "white", "wall");
            case DRIVING_TASK:
                return new DrivingTask("DRIVING TASK", "Amsterdam", "bicycle");
            default:
                return null;
        }
    }


        public Map<Task, Boolean> taskToMap (Task task){
            task.executeTask();
            Boolean isExecuted = task.isTaskExecuted();
            tasks.put(task, isExecuted);
            return tasks;

    }
}
