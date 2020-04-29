package com.example.demo.database;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Product;

public class ProductDB {
	
	private static List<Product> products;
	
	

	public ProductDB() {
		super();
		products = new ArrayList<Product>();
		products.add(new Product(1,"Shampoo",200));
		products.add(new Product(2,"Soap",20));
		System.out.println(products);
	}

	public static List<Product> getProducts() {
		return products;
	}

	public static void addProduct(Product product) {
		products.add(product);
		System.out.println("Inside ProductDb add Product"+ products);
	}
}
