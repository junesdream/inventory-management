package com.example.inventory.service;

import com.example.inventory.model.Product;
import com.example.inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Show all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Save a new product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    // Check repository
    public boolean isInStock(Long id) {
        return productRepository.findById(id)
                .map(p -> p.getQuantity() > 0)
                .orElse(false);
    }
}