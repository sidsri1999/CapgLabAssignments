package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.database.ProductDB;
import com.example.demo.model.Product;

@RestController
//@ResponseBody
public class ProductResource {
	

	@RequestMapping("/home")
	public ModelAndView Home() {
		ModelAndView mv = new ModelAndView();
		ProductDB pdb =new ProductDB();
		mv.setViewName("home.jsp");
		return mv;
	}
	
	@PostMapping("/addProduct")
	public ModelAndView addProduct(Product product) {
		System.out.println(product);
		ProductDB.addProduct(product);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home.jsp");
		return mv;
	}
	
	@GetMapping("/products")
	//@ResponseBody
	public List<Product> getProducts() {
		System.out.println( ProductDB.getProducts());
		return ProductDB.getProducts();
	}
	
}
