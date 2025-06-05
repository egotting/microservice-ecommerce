package com.github.egotting.UserService.Domain.Products;


import com.github.egotting.UserService.Domain.Category.Category;

import java.math.BigDecimal;
import java.util.UUID;

public class Products {
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private long quantity_stock;
    private Category category;
}
