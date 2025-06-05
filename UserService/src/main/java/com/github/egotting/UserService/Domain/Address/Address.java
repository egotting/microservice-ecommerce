package com.github.egotting.UserService.Domain.Address;

import com.github.egotting.UserService.Domain.User.User;

import java.util.UUID;

public class Address {
    private UUID id;
    private String street;
    private String state;
    private String country;
    private String cep;
    private User user;
}
