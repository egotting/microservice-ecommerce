package com.github.egotting.UserService.Domain.Orders;

import com.github.egotting.UserService.Domain.Payment.Payment;
import com.github.egotting.UserService.Domain.ProductsOrders.ProductsOrders;
import com.github.egotting.UserService.Domain.User.User;

import java.time.Instant;
import java.util.UUID;

public class Orders {
    private UUID id;
    private Instant data_order;
    private StatusOrders status_orders;
    private User user;
    private ProductsOrders products_orders;
    private Payment payment;
}
