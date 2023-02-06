package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String username;
    private char gender;
    private LocalDate birthDate;
    private int numberOfPosts;

    public ForumUser(int userId, String username, char gender, LocalDate birthDate, int numberOfPosts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.birthDate = birthDate;
        this.numberOfPosts = numberOfPosts;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }
}
