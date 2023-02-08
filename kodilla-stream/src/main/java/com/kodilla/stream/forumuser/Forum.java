package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum(List<ForumUser> userList) {
        this.userList = userList;
    }

    public List<ForumUser> getUserList() {

        return userList;
    }
}
