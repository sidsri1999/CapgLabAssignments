package com.l2.controller;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.l2.config.MyFrontController;
import com.l2.model.Trainee;
import com.l2.service.TraineeServiceImpl;


@Controller
public class TraineeController {
	
	
	@RequestMapping(value="/verifyAdmin",method=RequestMethod.POST)
	public ModelAndView verifyAdmin(HttpServletRequest req,HttpServletResponse res) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyFrontController.class);
		TraineeServiceImpl service = context.getBean(TraineeServiceImpl.class);
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		Boolean status = service.verifyAdmin(userName, password);
		if(status== true) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("operation");
			return mv;
		}else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("loginFailure");
			return mv;
		}
	}
	
	@RequestMapping(value="/addTrainee",method=RequestMethod.POST)
	public ModelAndView addTrainee(HttpServletRequest req,HttpServletResponse res) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyFrontController.class);
		TraineeServiceImpl service = context.getBean(TraineeServiceImpl.class);
		Trainee trainee = context.getBean(Trainee.class);
		String traineeName = req.getParameter("traineeName");
		String traineeDomain = req.getParameter("traineeDomain");
		String traineeLocation = req.getParameter("traineeLocation");
		trainee.setTraineeName(traineeName);
		trainee.setTraineeDomain(traineeDomain);
		trainee.setTraineeLocation(traineeLocation);
		Trainee traineeAdded = service.addTrainee(trainee);
		if(traineeAdded!=null) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("addTraineeSuccess");
			mv.addObject("traineeAdded",traineeAdded);
			return mv;
		}else {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("addTraineeFailure");
			mv.addObject("traineeAdded",traineeAdded);
			return mv;
		}
	}
	
	
	@RequestMapping(value="/deleteTrainee",method=RequestMethod.POST)
	public ModelAndView deleteTrainee(HttpServletRequest req,HttpServletResponse res) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyFrontController.class);
		TraineeServiceImpl service = context.getBean(TraineeServiceImpl.class);
		int traineeId;
		try {
			traineeId = Integer.parseInt(req.getParameter("traineeId"));
		}catch(Exception e) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("deleteTraineeFailure");
			return mv;
		}
		Boolean status = service.deleteTrainee(traineeId);
		ModelAndView mv = new ModelAndView();
		if(status==true) {
			mv.setViewName("deleteTraineeSuccess");
		}else {
			mv.setViewName("deleteTraineeFailure");
		}
		return mv;
	}
	
	
	@RequestMapping(value="/modifyTraineeRequest",method=RequestMethod.POST)
	public ModelAndView modifyTraineeRequest(HttpServletRequest req,HttpServletResponse res) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyFrontController.class);
		TraineeServiceImpl service = context.getBean(TraineeServiceImpl.class);
		int traineeId;
		try {
			traineeId = Integer.parseInt(req.getParameter("traineeId"));
		}catch(Exception e) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("modifyTraineeFailure");
			return mv;
		}
		Trainee traineeObject = service.retrieveTrainee(traineeId);
		ModelAndView mv = new ModelAndView();
		if(traineeObject!=null) {
			mv.setViewName("modifyTrainee");
			mv.addObject("traineeObject",traineeObject);
		}else {
			mv.setViewName("modifyTraineeFailure");
		}
		return mv;
	}
	
	
	@RequestMapping(value="/modifyTrainee",method=RequestMethod.POST)
	public ModelAndView modifyTrainee(HttpServletRequest req,HttpServletResponse res) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyFrontController.class);
		TraineeServiceImpl service = context.getBean(TraineeServiceImpl.class);
		System.out.println("Inside Modify Trainee");
		int traineeId;
		try {
			traineeId = Integer.parseInt(req.getParameter("traineeId"));
		}catch(Exception e) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("modifyTraineeFailure");
			return mv;
		}
		System.out.println(traineeId);
		String traineeName = req.getParameter("traineeName");
		System.out.println(traineeName);
		String traineeDomain = req.getParameter("traineeDomain");
		System.out.println(traineeDomain);
		String traineeLocation = req.getParameter("traineeLocation");
		Trainee trainee = context.getBean(Trainee.class);
		trainee.setTraineeId(traineeId);
		trainee.setTraineeName(traineeName);
		trainee.setTraineeDomain(traineeDomain);
		trainee.setTraineeLocation(traineeLocation);
		boolean status = service.modifyTrainee(trainee);
		ModelAndView mv = new ModelAndView();
		if(status==true) {
			mv.setViewName("modifyTraineeSuccess");
		}else {
			mv.setViewName("modifyTraineeFailure");
		}
		return mv;
	}

	@RequestMapping(value="/retrieveTrainee",method=RequestMethod.POST)
	public ModelAndView retrieveTrainee(HttpServletRequest req,HttpServletResponse res) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyFrontController.class);
		TraineeServiceImpl service = context.getBean(TraineeServiceImpl.class);
		System.out.println("Hello");
		int traineeId;
		try {
			traineeId = Integer.parseInt(req.getParameter("traineeId"));
		}catch(Exception e) {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("retrieveTraineeFailure");
			return mv;
		}
		Trainee trainee = service.retrieveTrainee(traineeId);
		ModelAndView mv = new ModelAndView();
		if(trainee!=null) {
			mv.setViewName("retrieveTraineeSuccess");
			mv.addObject("trainee",trainee);
		}else {
			mv.setViewName("retrieveTraineeFailure");
		}
		return mv;
	}
	
	
	@RequestMapping(value="/retrieveAll",method=RequestMethod.POST)
	public ModelAndView retrieveAll() {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyFrontController.class);
		TraineeServiceImpl service = context.getBean(TraineeServiceImpl.class);
		ModelAndView mv = new ModelAndView();
		ArrayList<Trainee> traineeList= service.retrieveAllTrainees();
		if(traineeList!=null) {
			mv.setViewName("retrieveAllSuccess");
			mv.addObject("traineeList", traineeList);
		}else {
			mv.setViewName("retrieveAllFailure");
		}
		return mv;
	}
	

}
