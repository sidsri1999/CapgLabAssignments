package com.cg.assignment;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee e1 = context.getBean(Employee.class);
		e1.setEmployeeId(1);
		e1.setEmployeeName("Vaibhav");
		e1.setSalary(40000);
		
		Employee e2 = context.getBean(Employee.class);
		e2.setEmployeeId(2);
		e2.setEmployeeName("Rtvik");
		e2.setSalary(40000);
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		
		SBU sbu = context.getBean(SBU.class);
		sbu.setEmpList(empList);
		
		System.out.println(sbu);
		
		
		
		
	}
	
}
