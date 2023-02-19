package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {

    private double averagePostPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerUserPost;

    private double commentsCount;
    private double postCount;
    private double forumSize;

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> usersNames = statistics.usersNames();
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();

        if (forumSize == 0 && postsCount == 0) {
            averagePostPerUser = 0.0;
            averageCommentsPerUserPost = 0.0;
            averageCommentsPerUser = 0.0;
        } else if (forumSize > 0 && postsCount == 0) {
            averagePostPerUser = commentsCount / forumSize;
            averageCommentsPerUserPost = postsCount / forumSize;
            averageCommentsPerUser = 0;
        } else if (forumSize == 0 && postsCount > 0) {
            averagePostPerUser = commentsCount / postsCount;
            averageCommentsPerUserPost = 0.0;
            averageCommentsPerUser = 0.0;
        } else if (forumSize > 0 && postsCount > 0) {
            averagePostPerUser = commentsCount / forumSize;
            averageCommentsPerUserPost = postsCount / forumSize;
            averageCommentsPerUser = commentsCount / postsCount;
        }
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerUserPost() {
        return averageCommentsPerUserPost;
    }

    public double getAveragePostPerUser() {
        return averagePostPerUser;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public double getPostCount() {
        return postCount;
    }

    public double getForumSize() {
        return forumSize;
    }

    public void showStatistics(){
        System.out.println(".......... Statistics: ..........");
        System.out.println("User count: " + getForumSize());
        System.out.println("Post count: "+ getPostCount());
        System.out.println("Comments count: " + getCommentsCount());
        System.out.println("Comments per User: " + getAverageCommentsPerUserPost());
        System.out.println("Comments per user Post: " + getAverageCommentsPerUserPost());


    }
}
