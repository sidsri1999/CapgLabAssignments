package com.l2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.l2.model.Admin;
import com.l2.model.Trainee;

@Component
public interface ITraineeDao {
	
	public Admin login();
	
	public Trainee addTrainee(Trainee trainee);
	
	public boolean deleteTrainee(int id);
	
	public boolean modifyTrainee(Trainee trainee);
	
	public Trainee retrieveTrainee(int id);
	
	public ArrayList<Trainee> retrieveAllTrainees();
	
}
