package com.Assignment1.service;

import javax.persistence.EntityManager;

import com.l1.Assignment1.dao.EntityManagerProvider;
import com.l1.Assignment1.model.Author;

public class AuthorServiceImpl implements IAuthorService {

	EntityManager em;
	
	public Author addAuthor(Author author) {
		em=EntityManagerProvider.getEntityManager();
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		return author;
	}

	public boolean deleteAuthor(int id) {
		em = EntityManagerProvider.getEntityManager();
		Author trainee = em.find(Author.class, id);
		if(trainee!=null) {
			em.getTransaction().begin();
			em.remove(trainee);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public Boolean updateAuthor(Author author) {
		em = EntityManagerProvider.getEntityManager();
		Author author1 = em.find(Author.class, author.getAuthorId());
		if(author1!=null) {
			em.getTransaction().begin();
			author1.setFirstName(author.getFirstName());
			author1.setMiddleName(author.getMiddleName());
			author1.setLastName(author.getLastName());
			author1.setPhoneNo(author.getPhoneNo());
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public Author getAuthor(int id) {
		em = EntityManagerProvider.getEntityManager();
		Author author = em.find(Author.class, id);
		if(author!=null) {
			return author;
		}
		return author;
	}

}

