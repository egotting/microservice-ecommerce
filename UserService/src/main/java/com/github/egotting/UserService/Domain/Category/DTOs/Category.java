package com.github.egotting.UserService.Domain.Category.DTOs;

import com.github.egotting.UserService.Domain.Products.DTOs.Products;

import java.util.UUID;

public class Category {
    private UUID id;
    private String name;
    private Products products;
}
