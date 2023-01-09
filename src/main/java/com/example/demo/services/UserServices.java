package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//get all the users
	public User getUserById(Long id){
		return userRepository.findById(id).get();
	}
	
	//create the user
	public User createUser(User user) {
		return userRepository.save(user);
	}
	
	//delete the user
	public void deleteUser(Long id) {
		User user = getUserById(id);
		userRepository.delete(user);
	}
	
	//update user by id
	public User updateUserById(Long id,User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	//get user by username
	public User getUserByUsername(String username) {
		return userRepository.getUserByUsername(username);
	}
	
	
	
}
