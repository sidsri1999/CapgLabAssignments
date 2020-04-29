package com.tea.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tea.dao.DatabaseDaoImpl;
import com.tea.dto.TrainingInfo;


public class GetTraining extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<TrainingInfo> tInfo = null;
		try {
			tInfo = new DatabaseDaoImpl().getTrainingData();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		RequestDispatcher rd = request.getRequestDispatcher("/ShowTraining.jsp");
		request.setAttribute("trainingInfo", tInfo);
		rd.forward(request, response);
	}

}
