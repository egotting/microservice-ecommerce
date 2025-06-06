package com.github.egotting.UserService.Domain.Orders;

import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.Orders.ValueObjects.StatusOrders;
import com.github.egotting.UserService.Domain.Payment.Payment;
import com.github.egotting.UserService.Domain.Person.Customer.Customer;
import com.github.egotting.UserService.Domain.ProductsOrders.ProductsOrders;

import java.time.Instant;

public class Orders {
    private Id id;
    private Instant data_order;
    private StatusOrders status_orders;
    private Customer user;
    private ProductsOrders products_orders;
    private Payment payment;
}
