package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class mainController {

	@RequestMapping("/hello")
	public @ResponseBody String hello()
	{
		return "Hello World";
	}
	
	@GetMapping("/Login")
	public @ResponseBody ModelAndView login()
	{
		return new ModelAndView("Login");
	}
	
	@RequestMapping("/SignUp")
	public ModelAndView signUp()
	{
		return new ModelAndView("SignUp");
	}
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		return new ModelAndView("index");
	}
	
	@GetMapping("/ViewAll")
	public @ResponseBody ModelAndView viewAll()
	{
		return new ModelAndView("ViewAll");
	}
	
}
