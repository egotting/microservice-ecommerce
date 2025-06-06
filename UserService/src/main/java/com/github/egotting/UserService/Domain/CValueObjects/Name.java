package com.github.egotting.UserService.Domain.CValueObjects;

public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        if (!isValid()) {
            throw new IllegalArgumentException("First name and last name cannot be null or empty");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isValid() {
        return firstName != null && lastName != null && !firstName.toString().isEmpty() && !lastName.toString().isEmpty();
    }
}
