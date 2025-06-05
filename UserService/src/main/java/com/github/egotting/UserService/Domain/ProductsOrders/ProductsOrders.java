package com.github.egotting.UserService.Domain.ProductsOrders;

import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.CValueObjects.Quantity;
import com.github.egotting.UserService.Domain.CValueObjects.Value;
import com.github.egotting.UserService.Domain.Orders.Orders;
import com.github.egotting.UserService.Domain.Products.Products;

// TODO: Aplicar calisthenics types
public class ProductsOrders {
    private Id id;
    private Orders orders;
    private Products products;
    private Quantity quantity;
    private Value price;
}
