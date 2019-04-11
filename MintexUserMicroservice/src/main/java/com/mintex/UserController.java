package com.mintex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/alluser")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@PostMapping("/addUser")
	public User addUser() {
		User newUser = new User("steve", "jobs", "steveJobs", 
				"steve@mintex.com", "steve", "1 steve drive", "steve", "NJ", "08854");
		return userRepository.save(newUser);
	}
	
	
	

}
