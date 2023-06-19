package com.kodilla.hibernate.Patterns2.observer;

public interface ObservableTask {
    String addTask(Task task);
    void registerMentor(TaskObserver taskObserver,TasksQueue tasksQueue);
    void removeMentor(TaskObserver taskObserver);
}
