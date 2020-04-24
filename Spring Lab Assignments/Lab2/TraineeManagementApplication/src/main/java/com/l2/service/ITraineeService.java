package com.l2.service;

import java.util.ArrayList;
import org.springframework.stereotype.Component;
import com.l2.model.Trainee;

@Component
public interface ITraineeService {
	
	public boolean verifyAdmin(String userName,String password);
	
	public Trainee addTrainee(Trainee trainee);
	
	public boolean deleteTrainee(int traineeId);
	
	public boolean modifyTrainee(Trainee trainee);
	
	public Trainee retrieveTrainee(int traineeId);
	
	public ArrayList<Trainee> retrieveAllTrainees();
	
}
