package com.github.egotting.UserService.Domain.Payment;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    private UUID id;
    private LocalDateTime date_payment;
    private PaymentMethod payment_method;
    private StatusPayment status_payment;
    private double total_value;
}
