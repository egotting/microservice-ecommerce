package com.github.egotting.UserService.Domain.Person.Customer;

import com.github.egotting.UserService.Domain.Address.Address;
import com.github.egotting.UserService.Domain.CValueObjects.CPF;
import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.CValueObjects.Name;
import com.github.egotting.UserService.Domain.Orders.Orders;
import com.github.egotting.UserService.Domain.Person.Customer.ValueObjects.Phone;
import com.github.egotting.UserService.Domain.Person.User.User;

public class Customer {
    private Id id;
    private User user;
    private Name fullName;
    private CPF cpf;
    private Phone phone;
    private Address address;
    private Orders orders;
}

