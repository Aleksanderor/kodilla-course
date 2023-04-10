package com.kodilla.patterns.strategy.social;

public class User {

    private String name;

    protected SocialPublisher socialPublisher;

    public User (String name) {
        this.name = name;
    }

    public String sharePost(){
        return socialPublisher.share();
    }
    public void setSocialNetwork(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getName() {
        return name;
    }
}
