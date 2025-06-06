package com.github.egotting.UserService.Domain.Payment;

import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.CValueObjects.Value;
import com.github.egotting.UserService.Domain.Payment.ValueObjects.PaymentMethod;
import com.github.egotting.UserService.Domain.Payment.ValueObjects.StatusPayment;
import com.github.egotting.UserService.Domain.Person.Customer.Customer;

import java.time.LocalDateTime;

public class Payment {
    private Id id;
    private Customer cpf_payed;
    private LocalDateTime date_payment;
    private PaymentMethod payment_method;
    private StatusPayment status_payment;
    private Value total_value;
}
