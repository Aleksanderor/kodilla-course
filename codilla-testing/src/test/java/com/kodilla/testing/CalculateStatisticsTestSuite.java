package com.kodilla.testing;

import com.kodilla.testing.forum.statistics.CalculateStatistics;
import com.kodilla.testing.forum.statistics.ForumUser;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> generateListOfNUsers(int usersQuantity) {
        List<String> resultList = new ArrayList<>();
        for (int n = 1; n <= usersQuantity; n++) {
            ForumUser theForumUser = new ForumUser("Name " + n, "realName " + n);
            resultList.add(theForumUser.getRealName());
        }
        return resultList;
    }

    @Test
    void testCalculateIfUsers0post0Comments(){

        //Given
        List<String> forumlist = generateListOfNUsers(0);
        int postCount = 0;
        int commentsCount = 0;
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(commentsCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(forumlist);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double forumSize = calculateStatistics.getForumSize();
        double postNb = calculateStatistics.getPostCount();
        double commentCount = calculateStatistics.getCommentsCount();
        double averageCPerU = calculateStatistics.getAverageCommentsPerUserPost();
        double averagePPerU = calculateStatistics.getAveragePostPerUser();

        CalculateStatistics calculateStatistics1 = new CalculateStatistics();
        calculateStatistics1.showStatistics();


    }
}

