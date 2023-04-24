package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private TaskList taskList;

    @BeforeEach
    public void setUp() {
        taskList = new TaskList("Test list", "Test text");
        taskListDao.save(taskList);
    }

    @AfterEach
    public void cleanUp() {
        taskListDao.delete(taskList);
    }

    @Test
    public void testFindByListName() {
        // Given
        String listName = "Test list";

        // When
        List<TaskList> foundTaskLists = taskListDao.findByListName(listName);

        // Then
        assertEquals(1, foundTaskLists.size());
        assertEquals(taskList.getId(), foundTaskLists.get(0).getId());
    }

}

