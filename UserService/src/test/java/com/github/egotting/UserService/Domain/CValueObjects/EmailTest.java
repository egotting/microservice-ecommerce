package com.github.egotting.UserService.Domain.CValueObjects;

import org.junit.jupiter.api.Test;

public class EmailTest {
    @Test
    void shouldCreateEmail() {
        Email createEmail = new Email("user@example.com");
        System.out.println(createEmail);
    }
}
