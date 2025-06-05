package com.github.egotting.UserService.Domain.ProductsOrders;

import java.math.BigDecimal;
import java.util.UUID;

// TODO: Aplicar calisthenics types
public class ProductsOrders {
    private UUID id;
    private Orders orders;
    private Products products;
    private long quantity;
    private BigDecimal price;
}
