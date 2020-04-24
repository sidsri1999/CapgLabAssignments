package com.l2.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.l2.dao.TraineeDaoImpl;
import com.l2.model.Admin;
import com.l2.model.Trainee;



@Component
public class TraineeServiceImpl implements ITraineeService {
	@Autowired
	TraineeDaoImpl traineeDao;
	public boolean verifyAdmin(String userName, String password) {
		Admin admin = traineeDao.login();
		if(admin.getUserName().equals(userName) && admin.getPassword().equals(password)) {
			return true;
		}
		return false;
	}

	public Trainee addTrainee(Trainee trainee) {
		return traineeDao.addTrainee(trainee);
	}

	public boolean deleteTrainee(int traineeId) {
		return traineeDao.deleteTrainee(traineeId);
	}

	public boolean modifyTrainee(Trainee trainee) {
		return traineeDao.modifyTrainee(trainee);
	}

	

	public Trainee retrieveTrainee(int traineeId) {
		return traineeDao.retrieveTrainee(traineeId);
	}

	public ArrayList<Trainee> retrieveAllTrainees() {
		return traineeDao.retrieveAllTrainees();
	}



	

}
