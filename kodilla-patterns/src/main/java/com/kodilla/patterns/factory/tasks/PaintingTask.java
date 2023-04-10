package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    boolean executed;
    private final String taskName;
    private final String color;
    private final String whaToPaint;


    public PaintingTask(String taskName, String color, String whatToPaint){
        this.color = color;
        this.taskName = taskName;
        this.whaToPaint = whatToPaint;
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
