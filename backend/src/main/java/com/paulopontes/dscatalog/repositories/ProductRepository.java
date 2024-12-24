package com.paulopontes.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulopontes.dscatalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
