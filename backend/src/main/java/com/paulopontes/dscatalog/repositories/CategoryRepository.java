package com.paulopontes.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulopontes.dscatalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
