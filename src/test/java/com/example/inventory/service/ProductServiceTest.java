package com.example.inventory.service;

import com.example.inventory.model.Product;
import com.example.inventory.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testIsInStock_ShouldReturnTrue_WhenQuantityIsPositive() {
        // GIVEN
        Product testProduct = new Product();
        testProduct.setId(1L);
        testProduct.setQuantity(10);

        when(productRepository.findById(1L)).thenReturn(Optional.of(testProduct));

        // WHEN
        boolean result = productService.isInStock(1L);

        // THEN 
        assertTrue(result, "Das Produkt sollte als 'vorrätig' markiert sein.");
    }

    @Test
    public void testIsInStock_ShouldReturnFalse_WhenQuantityIsZero() {
        // GIVEN
        Product emptyProduct = new Product();
        emptyProduct.setId(2L);
        emptyProduct.setQuantity(0);

        when(productRepository.findById(2L)).thenReturn(Optional.of(emptyProduct));

        // WHEN
        boolean result = productService.isInStock(2L);

        // THEN
        assertFalse(result, "Das Produkt sollte als 'nicht vorrätig' markiert sein.");
    }
}