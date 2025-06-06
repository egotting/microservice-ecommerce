package com.github.egotting.UserService.Domain.Payment;

import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.CValueObjects.Value;
import com.github.egotting.UserService.Domain.Payment.ValueObjects.PaymentMethod;
import com.github.egotting.UserService.Domain.Payment.ValueObjects.StatusPayment;
import com.github.egotting.UserService.Domain.User.User;

import java.time.LocalDateTime;

public class Payment {
    private Id id;
    private User cpf_payed;
    private LocalDateTime date_payment;
    private PaymentMethod payment_method;
    private StatusPayment status_payment;
    private Value total_value;
}
