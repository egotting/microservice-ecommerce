package com.github.egotting.UserService.Domain.Products;


import com.github.egotting.UserService.Domain.CValueObjects.Id;
import com.github.egotting.UserService.Domain.CValueObjects.Name;
import com.github.egotting.UserService.Domain.CValueObjects.Quantity;
import com.github.egotting.UserService.Domain.Category.Category;
import com.github.egotting.UserService.Domain.Products.ValueObjects.Description;

import java.math.BigDecimal;

public class Products {
    private Id id;
    private Name name;
    private Description description;
    private BigDecimal price;
    private Quantity quantity_stock;
    private Category category;
}
