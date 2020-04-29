package com.tea.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.tea.dto.TrainingInfo;

public interface DatabaseDao {
	ArrayList<TrainingInfo> getTrainingData() throws SQLException, ClassNotFoundException;
	void setTrainingData(int id,int seats) throws ClassNotFoundException, SQLException ;
}
