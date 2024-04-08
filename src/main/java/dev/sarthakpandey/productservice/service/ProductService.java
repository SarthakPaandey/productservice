package dev.sarthakpandey.productservice.service;

import dev.sarthakpandey.productservice.models.Product;

public interface ProductService {
    Product getProductById(Long id);
}