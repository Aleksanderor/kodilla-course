package com.kodilla.testing.PATTERNS.FoodToDoor;

public class User {

    private String name;

    private String email;

    public User (String name, String email){
        this.name=name;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
