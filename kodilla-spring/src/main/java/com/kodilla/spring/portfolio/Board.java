package com.kodilla.spring.portfolio;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board (final TaskList toDoList, final TaskList inProgressList, final TaskList doneList) {
        this.doneList = doneList;
        this.inProgressList = inProgressList;
        this.toDoList=toDoList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public String boardDisplay() {
        return "Board:\n" + "\n" + doneList.getTasksList() + toDoList.getTasksList() + "\n"
                + inProgressList.getTasksList();
    }
}
