package com.github.egotting.UserService.Domain.Address;


import com.github.egotting.UserService.Domain.Address.ValueObjects.Country;
import com.github.egotting.UserService.Domain.Address.ValueObjects.State;
import com.github.egotting.UserService.Domain.Address.ValueObjects.Street;
import com.github.egotting.UserService.Domain.Address.ValueObjects.ZipCode;
import com.github.egotting.UserService.Domain.User.User;

import java.util.UUID;

public class Address {
    private UUID id;
    private Street street;
    private State state;
    private Country country;
    private ZipCode zpc;
    private User user;
}
