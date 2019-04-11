package com.mintex;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user1")
@CrossOrigin
public class UserService {
	
	@GetMapping(path="/hello", produces = "application/json")
	public String sayHello() {
		return "{\"name\": \"i am a service, you can call me an API. Updated\"}";
	}
	
	@GetMapping(path="/users", produces = "application/json")
	public User getUsers() {
		User user =  new User();
		user.setFirstname("dev");
		user.setLastname("vup");
		user.setUsername("dev");
		return user;
	}


}
