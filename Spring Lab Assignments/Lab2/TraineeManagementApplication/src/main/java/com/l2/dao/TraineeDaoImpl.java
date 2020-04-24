package com.l2.dao;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.l2.config.MyFrontController;
import com.l2.model.Admin;
import com.l2.model.Trainee;

@Component
public class TraineeDaoImpl implements ITraineeDao {
	@Autowired
	Admin admin;
	@Autowired
	Trainee trainee;
	@Autowired
	EntityManagerProvider emp;
	public Admin login(){
		return admin;
	}

	public Trainee addTrainee(Trainee trainee) {
		EntityManager em = emp.getEntityManager(); 
		em.getTransaction().begin();
		em.persist(trainee);
		em.getTransaction().commit();
		return trainee;
	}

	public boolean deleteTrainee(int id) {
		EntityManager em = emp.getEntityManager();
		Trainee trainee = em.find(Trainee.class, id);
		if(trainee!=null) {
			em.getTransaction().begin();
			em.remove(trainee);
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public boolean modifyTrainee(Trainee trainee) {
		EntityManager em = emp.getEntityManager();
		Trainee trainee1 = em.find(Trainee.class, trainee.getTraineeId());
		if(trainee1!=null) {
			em.getTransaction().begin();
			trainee1.setTraineeName(trainee.getTraineeName());
			trainee1.setTraineeLocation(trainee.getTraineeLocation());
			trainee1.setTraineeDomain(trainee.getTraineeDomain());
			em.getTransaction().commit();
			return true;
		}
		return false;
	}

	public Trainee retrieveTrainee(int id) {
		EntityManager em = emp.getEntityManager();
		Trainee trainee = em.find(Trainee.class, id);
		if(trainee!=null) {
			return trainee;
		}
		return null;
	}

	public ArrayList<Trainee> retrieveAllTrainees() {
		EntityManager em = emp.getEntityManager();
		ArrayList<Trainee> trainees = (ArrayList<Trainee>) em.createNamedQuery("Trainee.getAllTrainees",Trainee.class).getResultList();
		return trainees;
	}


}
