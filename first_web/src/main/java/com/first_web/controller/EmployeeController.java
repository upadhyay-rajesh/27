package com.first_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	
	@RequestMapping("register.htm")
	public ModelAndView registerEmployee(@RequestParam("name") String n1,
			@RequestParam("pass") String n2,
			@RequestParam("email") String n3,
			@RequestParam("address") String n4){
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("p1", n1);
		mv.addObject("p2", n2);
		mv.addObject("p3", n3);
		mv.addObject("p4", n4);
		
		mv.setViewName("result.jsp");
		return mv;
	}
	
	@RequestMapping("login.htm")
	public ModelAndView loginEmployee(){
		ModelAndView mv=new ModelAndView();
		return mv;
	}
}
