package com.github.egotting.UserService.Domain.User;

import com.github.egotting.UserService.Domain.Address.Address;
import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.CValueObjects.Name;
import com.github.egotting.UserService.Domain.Orders.Orders;
import com.github.egotting.UserService.Domain.User.ValueObjects.CPF;
import com.github.egotting.UserService.Domain.User.ValueObjects.Email;
import com.github.egotting.UserService.Domain.User.ValueObjects.Password;


public class User {
    private Id id;
    private Name name;
    private Email email;
    private Password password;
    private CPF cpf;
    private Address address;
    private Orders orders;
}
