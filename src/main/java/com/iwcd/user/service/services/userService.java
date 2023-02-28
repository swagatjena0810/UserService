package com.iwcd.user.service.services;

import java.util.List;

import com.iwcd.user.service.entities.User;

public interface userService {
	
	 User SaveUser(User user);
	 
	 List<User> getAllUsers();
	 
	 User getUser(String userId);
}
