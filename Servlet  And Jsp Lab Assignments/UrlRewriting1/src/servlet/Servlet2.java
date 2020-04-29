package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,String>  m = new HashMap<String,String>();
		String city="";
		m.put("201306","Greater Noida");
		m.put("110096","Noida");
		m.put("110038","Gurgaon");
		m.put("110001","Delhi");
		String pincode=request.getParameter("pincode");
		String techno= request.getParameter("technologies");
		if(m.containsKey(pincode)) {
			city=m.get(pincode);
		}
		PrintWriter out = response.getWriter();
		if(city.equals("Greater Noida")) {
			out.print("Jobs Availability : - ");
			if(techno.contains("Java")) {
				out.print("Java Full Stack Developer");
			}else {
				out.print("Sorry, No jobs available at this location");
			}
		}else if(city.equals("Noida")) {
			out.print("Jobs Availability : - ");
			if(techno.contains("Python")) {
				out.print("AI Developer");
			}else {
				out.print("Sorry, No jobs available at this location");
			}
		}else if(city.equals("Gurgaon")) {
			out.print("Jobs availability : - ");
			if(techno.contains("Oracle")) {
				out.print("DBA");
			}else if(techno.contains("Juniper")) {
				out.print("Network Administrator");
			}else {
				out.print("Sorry, No jobs available at this location");
			}
		}else {
			out.print("Jobs Availability : - ");
			if(techno.contains("Java")) {
				out.print("Java Full Stack Developer");
			}else if(techno.contains("Oracle")) {
				out.print("DBA");
			}else if(techno.contains("Juniper")) {
				out.print("Network Administrator");
			}else {
				out.print("Sorry, No jobs available at this location");
			}
		}
		
	}

}
