package com.kodilla.patterns.strategy.social;

public class Millenials extends  User {
    private String name;
    public Millenials(String name){
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
    @Override
    public String getName() {
        return name;
    }
}
