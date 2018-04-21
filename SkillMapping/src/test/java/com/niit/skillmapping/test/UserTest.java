package com.niit.skillmapping.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.skillmapping.config.AppConfig;
import com.niit.skillmapping.model.User;
import com.niit.skillmapping.service.UserService;
import com.niit.skillmapping.service.UserServiceImpl;

import junit.framework.TestCase;
@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class UserTest {

	@Autowired
	UserService userService;

	@Before
	public void setup() {
		/*AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.scan("com.niit.skillmapping");// This will load the configured components UserService, UserRepository,
		ctx.refresh();

		System.out.println("AnnotationConfigApplicationContext" + ctx);

		userService = ctx.getBean("userService", UserServiceImpl.class);*/
		
		Date d = new Date(01 / 01 / 2015);
		User user = new User();
		user.setUser_id(1);
		user.setFname("Payal");
		user.setLname("Shah");
		user.setEmail_id("payal@gmail.com");
		user.setPassword("payal12345678");
		user.setPhone_number("1234567890");
		user.setDate_of_birth(d);
		user.setStatus(false);
		user.setManager_id(123);
		userService.createUser(user);
	}

	@After
	public void tearDown() {
		if(userService.getUserById(5) != null) {
		userService.deleteUser(5);
		}

	}
	
	/*@Test
	public void addUserTest() {

		Date d = new Date(01 / 01 / 2015);

		User user = new User(2, "Rajeev", "Sharma", "rs@gmail.com", "1234567890", "payal12345", d, true, 123);

		boolean flag = true;
		if (flag = true) {
			flag = true;
			userService.createUser(user);
			assertTrue("Test case Succeed", flag);
		} else {
			flag = false;
			assertFalse("Test case failed", flag);
		}
	}*/
	
	@Test
	public void addUserTestTrue() {
		Date d = new Date(01 / 01 / 2015);
		
		User user = new User();
		user.setUser_id(3);
		user.setFname("Payal");
		user.setLname("Shah");
		user.setEmail_id("payal@gmail.com");
		user.setPassword("payal12345678");
		user.setPhone_number("1234567890");
		user.setDate_of_birth(d);
		user.setStatus(false);
		user.setManager_id(123);
		assertEquals("True boolean executed",true, userService.createUser(user));
	}
	
	@Test
	public void addUserTestFalse() {
		Date d = new Date(01 / 01 / 2015);
		
		User user = new User();
		user.setUser_id(3);
		user.setFname("Payal");
		user.setLname("Shah");
		user.setEmail_id("payal@gmail.com");
		user.setPassword("payal12345678");
		user.setPhone_number("1234567890");
		user.setDate_of_birth(d);
		user.setStatus(false);
		user.setManager_id(123);
		assertEquals("False boolean executed",false, userService.createUser(user));
	}
	
	@Ignore
	@Test
	public void getUserByIdTest() {
		boolean flag = true;
		if (flag = true) {
			flag = true;
			
			if (userService.getUserById(1) != null) {
				userService.getUserById(1);
				assertTrue("Test case Succeed", flag);
			}
		} else {
		
			flag = false;
			assertFalse("Test case failed", flag);
		}
	}
	
	@Ignore
	@Test
	public void getUserByUsernameTest() {
		boolean flag = true;
		if (flag = true) {
			flag = true;
			
			if (userService.getUserByUsername("Rajeev") != null) {
				userService.getUserByUsername("Rajeev");
				assertTrue("Test case Succeed", flag);
			}
		} else {
		
			flag = false;
			assertFalse("Test case failed", flag);
		}
	}

}
