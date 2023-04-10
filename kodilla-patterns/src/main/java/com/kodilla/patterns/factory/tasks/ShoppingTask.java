package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    boolean executed;
    private final String taskName;
    private final String whayToBuy;
    private final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.quantity = quantity;
        this.whayToBuy = whatToBuy;
    }

    @Override
    public void executeTask() {
        executed = true;
    }

    @Override
    public String getTaskName(){
        return taskName;
    }

    @Override
    public boolean isTaskExecuted(){
        return executed;
    }
}
