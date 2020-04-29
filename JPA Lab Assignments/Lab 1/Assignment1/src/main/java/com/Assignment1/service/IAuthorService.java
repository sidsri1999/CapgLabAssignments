package com.Assignment1.service;

import com.l1.Assignment1.model.Author;

public interface IAuthorService {
	
	public Author addAuthor(Author author);
	
	public boolean deleteAuthor(int id);
	
	public Boolean updateAuthor(Author author);
	
	public Author getAuthor(int id);
	

}
