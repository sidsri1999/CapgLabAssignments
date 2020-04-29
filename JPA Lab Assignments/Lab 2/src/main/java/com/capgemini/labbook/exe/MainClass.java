package com.capgemini.labbook.exe;

import java.util.List;

import com.capgemini.labbook.dao.DatabaseDaoImpl;
import com.capgemini.labbook.entites.Author;
import com.capgemini.labbook.entites.Book;
import com.capgemini.labbook.service.DatabaseServiceImpl;

public class MainClass {

	public static void main(String[] args) {
		
		DatabaseServiceImpl service = new DatabaseServiceImpl();
		
		//a.	Query all books in database. 
		List<Book> books = service.getAllBooks();
		for (Book book : books) {
			System.out.println(book.getTitle());
		}
		
		//b.	Query all books written by given author name
		String a_name = "";
		List<Author> authors = service.getAllAuthor();
		for (Author author : authors) {
			if(author.getName().equalsIgnoreCase(a_name))
			{
				System.out.println(author.getBooks());
			}
		}
		
		//c.	List all books with given price range. 
		List<Book> bookss = service.getByPrice(500, 1000);
		for (Book book : bookss) {
			System.out.println(book.getTitle());
		}
		
		//d.	List the author name for given book id. 
		Book b = service.getBook(101);
		System.out.println(b.getAuthors());
	}
}
