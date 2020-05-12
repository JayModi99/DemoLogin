package com.practice.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.model.User;
import com.practice.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping("/SignUpController")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response)
	{
		
		HttpSession session=request.getSession();  
        session.setAttribute("uname",request.getParameter("username"));

    	User user = new User();
    	
    	user.setUsername(request.getParameter("username"));
    	user.setPassword(request.getParameter("password"));
    	user.setFirstName(request.getParameter("firstName"));
    	user.setLastName(request.getParameter("lastName"));
    	
    	System.out.println(user.getUsername() +user.getPassword() +user.getFirstName() +user.getPassword());
    	
        userService.saveUser(user);
        
		return new ModelAndView("index");
		
	}
	
	/*@PostMapping("/LoginController")
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mv = null;
		HttpSession session=request.getSession();  
        session.setAttribute("uname",request.getParameter("username"));

    	User user = new User();
    	
    	user.setUsername(request.getParameter("username"));
    	user.setPassword(request.getParameter("password"));
    	
    	List<User> users = userService.getAll();
    	
    	for(User u:users)
    	{
    		System.out.println(u.getUsername() +" " +u.getPassword());
    		if(u.getUsername().equals(user.getUsername()) && u.getPassword().equals(user.getPassword()))
    		{
    			Optional<User> user1 = userService.findById(u.getId());
    			
    			System.out.println(user1.get().getFirstName() +" " +user1.get().getLastName());
    			
    			mv = new ModelAndView("index");
    			break;
    		}
    		else
    		{
    			mv = new ModelAndView("Login");
    		}
    	}
    	
		return mv;
	}*/
	
	@PostMapping("/LoginController")
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mv = null;
		HttpSession session=request.getSession();  
        session.setAttribute("uname",request.getParameter("username"));

    	User user = new User();
    	
    	user.setUsername(request.getParameter("username"));
    	user.setPassword(request.getParameter("password"));
    	
    	User u = userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());

		if(u != null)
		{
			Optional<User> user1 = userService.findById(u.getId());
			
			System.out.println(user1.get().getFirstName() +" " +user1.get().getLastName());
			
			mv = new ModelAndView("index");
		}
		else
		{
			mv = new ModelAndView("Login");
			mv.addObject("msg", "Invalid Username or Password");
		}
    	
		return mv;
	}
	
	@RequestMapping("/ViewAllController")
	public ModelAndView viewAll(HttpServletRequest request)
	{
		List<User> list = userService.getAll();
		request.setAttribute("users", list);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("ViewAll");
		mv.addObject("userList", list);
		return mv;
	}

}
