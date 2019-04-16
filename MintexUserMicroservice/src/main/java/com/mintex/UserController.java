package com.mintex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/getByName")
	public User getByName() {
		User user =  userRepository.findByUsername("steveJobs");
		return user;
	}
	
	@GetMapping("/getByZip")
	public User getByZip(@RequestParam("zipcode") String zipCodeValue) {
		User user =  userRepository.findByZipcode(zipCodeValue);
		return user;
	}
	
	@GetMapping("/getByZip/{zipcode}")
	public User getByZipParameter(@PathVariable("zipcode") String zipCodeValue) {
		User user =  userRepository.findByZipcode(zipCodeValue);
		return user;
	}
	
	@PostMapping("/addUser")
	public User addUser() {
		User newUser = new User("steve", "jobs", "steveJobs", 
				"steve@mintex.com", "steve", "1 steve drive", "steve", "NJ", "08854");
		return userRepository.save(newUser);
	}
	
	
	

}
