package com.example.inventory.repository;

import com.example.inventory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Hier könnten wir später eigene Suchmethoden hinzufügen,
    // z.B. List<Product> findByName(String name);
}
