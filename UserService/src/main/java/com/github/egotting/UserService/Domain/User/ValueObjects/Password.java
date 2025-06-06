package com.github.egotting.UserService.Domain.User.ValueObjects;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String value;

    public Password(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty value needs to be between 8 and " +
                    "32 characters long, must contain at least one digit, one lowercase letter, one uppercase letter");
        }
        this.value = bcryptPasswordEncoder(value).toString();
    }

    public boolean isValid(String value) {
        Pattern pattern = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$)[^@\\.;\\(\\)\\_!?&\\-\\+\\^\\´âêôáéíóúÂÊÔÁÉÍÓÚ]+$");
        Matcher matcher = pattern.matcher(value);
        if (value.length() < 8 && value.length() > 32) {
            return false;
        }

        return matcher.find();
    }

    public BCryptPasswordEncoder bcryptPasswordEncoder(String value) {
        if (!isValid(value)) {
            throw new IllegalArgumentException("Password is not valid");
        }
        return new BCryptPasswordEncoder(Integer.parseInt(value));
    }

}
