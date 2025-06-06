package com.github.egotting.UserService.Domain.Person.User;

import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.CValueObjects.Name;
import com.github.egotting.UserService.Domain.Person.Customer.Customer;
import com.github.egotting.UserService.Domain.CValueObjects.Email;
import com.github.egotting.UserService.Domain.Person.User.ValueObjects.Password;


public class User {
    private Id id;
    private Name name;
    private Email email;
    private Password password;
    private Customer customer;
}
