package com.github.egotting.UserService.Domain.User.ValueObjects;

public class Email {
    private String value;

    public Email(String value) {
        if (value.isEmpty() || !isValid()) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.value = value;
    }

    public boolean isValid() {
        String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return value != null && value.matches(EMAIL_REGEX);
    }
}
