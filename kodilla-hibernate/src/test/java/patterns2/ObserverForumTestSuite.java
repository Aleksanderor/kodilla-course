package patterns2;

import com.kodilla.hibernate.Patterns2.observer.Mentor;
import com.kodilla.hibernate.Patterns2.observer.TaskObserver;
import com.kodilla.hibernate.Patterns2.observer.TasksQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ObserverForumTestSuite {
    @Test
    public void RegisterMentorTest() {
        // Given
        TasksQueue tasksQueue1 = new TasksQueue("Adam Małysz");
        TasksQueue tasksQueue2 = new TasksQueue("Robert Lewandowski");
        TasksQueue tasksQueue3 = new TasksQueue("Jarosław Kaczyński");

        TaskObserver mentor1 = new Mentor("Jan Kowalski");
        TaskObserver mentor2 = new Mentor("Anna Nowak");

        // When
        tasksQueue1.registerMentor(mentor1, tasksQueue1);
        tasksQueue2.registerMentor(mentor1, tasksQueue2);
        tasksQueue3.registerMentor(mentor2, tasksQueue3);

        // Then
        assertEquals(2, mentor1.countQueues());
        assertEquals(1, mentor2.countQueues());
    }
}
