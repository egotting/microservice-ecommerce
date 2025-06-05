package com.github.egotting.UserService.Domain.User;

import java.util.UUID;

// TODO: Aplicar calisthenics types
public class User {
    private UUID id;
    private String name;
    private String email;
    private String password;
    private Address address;
    private Orders orders;
}
