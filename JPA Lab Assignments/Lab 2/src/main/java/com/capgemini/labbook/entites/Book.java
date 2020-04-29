package com.capgemini.labbook.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "BOOKS")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ISBN;
	private String title;
	private int price;
	@ManyToMany(mappedBy = "books")
	private List<Author> authors = new ArrayList<Author>();
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int iSBN, String title, int price, List<Author> authors) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.price = price;
		this.authors = authors;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	
}
