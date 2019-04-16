package com.mintex;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	public List<User> findAll();
	public List<User> findByFirstname(String firstname);
	public User findByUsername(String username);
	public User findByZipcode(String zipcode);

}
