package com.tea.service;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tea.dao.DatabaseDaoImpl;

public class SetTraining extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("Id"));
		String name = request.getParameter("Name");
		int seats = Integer.parseInt(request.getParameter("Seats"));
		if(seats==0) {
			RequestDispatcher rd = request.getRequestDispatcher("/ResponseFail.jsp");
			rd.forward(request, response);
		}else {
			seats=seats-1;
			try {
				new DatabaseDaoImpl().setTrainingData(id, seats);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("/ResponseSuc.jsp");
			rd.forward(request, response);
		}
	}

}
