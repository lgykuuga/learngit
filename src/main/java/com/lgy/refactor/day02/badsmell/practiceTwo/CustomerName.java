package com.lgy.refactor.day02.badsmell.practiceTwo;

public class CustomerName {
    private String firstName;
    private String lastName;
    private String title;

    public CustomerName(String title, String firstName, String lastName) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Customer: " +
                title + ": " + firstName + " " + lastName;
    }

}
