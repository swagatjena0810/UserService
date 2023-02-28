package com.iwcd.user.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.iwcd.user.service.Exceptions.ResourceNotFoundException;
import com.iwcd.user.service.entities.User;
import com.iwcd.user.service.repository.userRepository;

public class userServiceImpl implements userService{
	
	@Autowired
	private userRepository userRepo;
	
	@Override
	public User SaveUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public User getUser(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElseThrow( () -> new ResourceNotFoundException("User with given id is not found in server : "+userId));
	}

}
