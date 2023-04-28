package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.taskList.TaskList;
import com.kodilla.hibernate.taskList.dao.TaskListDao;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LISTNAME = "Name";
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

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");
//        taskList.getTasks().add(task);
//        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        //taskListDao.deleteById(id);
    }

}