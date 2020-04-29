package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pincode = request.getParameter("pincode");
		String technologies =	request.getParameter("technologies");
		System.out.println(pincode);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Pincode  - "+pincode+"</br>");
		out.print("</br>");
		out.print( technologies);	
		out.print("</br>");
		out.print("</br>");
		out.print("<a href='Servlet2?pincode="+pincode+"&technologies="+technologies+"'>Search</a>");
	}

}
