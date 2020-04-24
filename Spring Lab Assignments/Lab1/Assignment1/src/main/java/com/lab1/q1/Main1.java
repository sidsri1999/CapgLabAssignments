package com.lab1.q1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(JavaConfig.class);
		context.refresh();
		
		Employee e = context.getBean(Employee.class);
		System.out.println("Employee Details");
		System.out.println("Employee Id "+e.getEmployeeId());
		System.out.println("Employee Name "+e.getEmployeeName());
		System.out.println("Employee Salary "+e.getSalary());
		System.out.println("Employee Business Unit "+e.getBusinessUnit());
		System.out.println("Employee Age "+e.getAge());
		
		
		

	}

}
