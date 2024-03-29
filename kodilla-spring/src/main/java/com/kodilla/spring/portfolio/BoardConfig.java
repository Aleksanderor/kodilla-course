package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;
    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;


    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }
    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

}