package com.github.egotting.UserService.Domain.Person.Customer.ValueObjects;

import org.junit.jupiter.api.Test;

public class PhoneTest {
    @Test
    void shouldCreatePhone() {

        Phone phone = new Phone("11994638824");
        System.out.println(phone);
    }
}
