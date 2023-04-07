package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTestSuite {

    @Test
    public void boardTest() {
        // given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // when
        List<String> listOne = board.getToDoList().getTasksList();
        int sizeListOne = listOne.size();

        List<String> listTwo = board.getInProgressList().getTasksList();
        int sizeListTwo = listTwo.size();

        List<String> listThree = board.getDoneList().getTasksList();
        int sizeListThree = listThree.size();

        // then
        assertEquals(0, sizeListOne);
        assertEquals(0, sizeListTwo);
        assertEquals(0, sizeListThree);
    }

    @Test
    public void testTaskAdd(){

        // given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        // when
        List<String> toDoList = board.getToDoList().getTasksList();
        toDoList.add("taskOne");

        List<String> inProgressList = board.getInProgressList().getTasksList();
        inProgressList.add("taskTwo");

        List<String> doneList = board.getDoneList().getTasksList();
        doneList.add("taskThree");

        // then
        assertEquals("taskOne", toDoList.get(0));
        assertEquals("taskTwo", inProgressList.get(0));
        assertEquals("taskThree", doneList.get(0));
    }
}
