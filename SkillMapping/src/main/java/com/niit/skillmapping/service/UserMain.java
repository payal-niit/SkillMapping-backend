package com.niit.skillmapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.skillmapping.config.DBConfig;
import com.niit.skillmapping.model.User;

public class UserMain {
	
	 public static void main(String[] args) {
		 
		 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	        ctx.scan("com.niit");//This will load the configured components UserService, UserRepository,
	        ctx.refresh();
	        
	        System.out.println("AnnotationConfigApplicationContext" + ctx);
		 
		 UserServiceImpl userService = ctx.getBean("userService",UserServiceImpl.class);
		 
		 User user = new User();
		 user.setUser_id(1);
		 user.setFname("payal");
		 user.setLname("Shah");
		 user.setEmail_id("payal@gmail.com");
		 user.setPhone_number("1234567890");
		 user.setStatus(true);
		 user.setPassword("123456ded");
		 user.setManager_id(123);
		 
		 userService.createUser(user);
		 
		 System.out.println(user.getUser_id());
		
	}
	

}
