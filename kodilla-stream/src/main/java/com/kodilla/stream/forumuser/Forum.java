package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public void addUser(ForumUser user) {

        userList.add(user);
    }

    public List<ForumUser> getUserList() {

        return userList;
    }
}
