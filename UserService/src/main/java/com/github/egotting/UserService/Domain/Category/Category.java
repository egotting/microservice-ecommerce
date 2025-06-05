package com.github.egotting.UserService.Domain.Category;


import com.github.egotting.UserService.Domain.CValueObjects.Name;
import com.github.egotting.UserService.Domain.Products.Products;

import java.util.UUID;

public class Category {
    private UUID id;
    private Name name;
    private Products products;
}
