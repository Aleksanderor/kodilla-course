package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    private String firstName;
    private String lastName;
    private String pesellId;

    public LibraryUser(String firstName, String lastName,String pesellId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesellId = pesellId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesellId() {
        return pesellId;
    }

    public void setPesellId(String pesellId) {
        this.pesellId = pesellId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(pesellId, that.pesellId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesellId);
    }
}
