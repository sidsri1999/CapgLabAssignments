package com.tea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.tea.dto.TrainingInfo;

public class DatabaseDaoImpl implements DatabaseDao{
	
	@Override
	public ArrayList<TrainingInfo> getTrainingData() throws SQLException, ClassNotFoundException {
		ArrayList<TrainingInfo> trainingData = new ArrayList<TrainingInfo>();
		Connection con = DatabaseConnectivity.getConnection();
		PreparedStatement ps = con.prepareStatement("SELECT * FROM training");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			int trainingId = rs.getInt(1);
			String trainingName = rs.getString(2);
			int availableSeats = rs.getInt(3);
			TrainingInfo tInfo = new TrainingInfo(trainingId,trainingName,availableSeats);
			trainingData.add(tInfo);
		}
		return trainingData;
	}

	@Override
	public void setTrainingData(int id, int seats) throws ClassNotFoundException, SQLException{
		Connection con = DatabaseConnectivity.getConnection();
		PreparedStatement ps = con.prepareStatement("UPDATE training SET AvailableSeats=? WHERE TrainingId=?");
		ps.setInt(1,seats);
		ps.setInt(2,id);
		ps.executeUpdate();
	}	
}
