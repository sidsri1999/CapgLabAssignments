package services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Services extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("uname");
		String password = request.getParameter("password");
		String rPassword = request.getParameter("rPassword");
		int age=0;
		try {
			age = Integer.parseInt(request.getParameter("age"));
		}catch(Exception e) {
		}
		String gender = request.getParameter("gender");
		String city = request.getParameter("city");
		String[] technologies = request.getParameterValues("technologies");
		int wexp = Integer.parseInt(request.getParameter("wexp"));
		User user = new User(userName,password,rPassword,age,gender,city,technologies,wexp);
		String check = validation(user);
		if(check.equals("fine")) {
			RequestDispatcher rd=request.getRequestDispatcher("Output");  
	        rd.forward(request, response);
		}else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h2>Invalid Credentials</h2>");
			out.print("<h2>"+check+"</h2>");
			out.print("<h2><a href='Registration.html\'>Re - Login</a></h2>");
		}
		
	}
	
	public String validation(User user) {
		String username = user.getUserName();
		String password = user.getPassword();
		String rPassword = user.getrPassword();
		int age = user.getAge();
		if(Pattern.matches("[a-zA-Z]{3,10}", username)) {
			if(password.equals(rPassword)) {
				if(age>=18 && age <=60) {
					return "fine";
				}else {
					return "age should be between 18 to 60";
				}
			}else {
				return "Password and Re-enter password not matched";
			}
		}else {
			return "UserName should have atleast 3 characters and no special symbol";
		}	
	}


}
