package com.kodilla.hibernate.Patterns2.observer;

public interface TaskObserver {
    String approveTheTask(Task task);
    String writeAComment(Task task);
    void addQueue(TasksQueue tasksQueue);
    int countQueues();
}

