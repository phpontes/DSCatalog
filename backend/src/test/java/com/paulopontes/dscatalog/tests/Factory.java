package com.paulopontes.dscatalog.tests;

import java.time.Instant;

import com.paulopontes.dscatalog.dto.ProductDTO;
import com.paulopontes.dscatalog.entities.Category;
import com.paulopontes.dscatalog.entities.Product;

public class Factory {

	public static Product createProduct() {
		Product product = new Product(1L, "Phone", "Fairly Good Phone", 800.0, "https://img.com/img.png", Instant.parse("2014-03-28T23:00:00Z"));
		product.getCategories().add(new Category(2L, "Eletronicaiada"));
		return product;
	}
	
	public static ProductDTO createProductDTO() {
		Product product = createProduct();
		return new ProductDTO(product, product.getCategories());
	}
}
