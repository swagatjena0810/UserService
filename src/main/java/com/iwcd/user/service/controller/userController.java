package com.iwcd.user.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iwcd.user.service.entities.User;
import com.iwcd.user.service.services.userService;

@RestController
@RequestMapping("/users")
public class userController {
	
	@Autowired
	private userService userservice;
	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user){
		User u=userservice.SaveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(u);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId){
		User u2=userservice.getUser(userId);
		return ResponseEntity.ok(u2);
	}
	
	@GetMapping("/getallusers")
	public ResponseEntity<List<User>> getListOfUsers(){
		List<User> allusers=userservice.getAllUsers();
		return ResponseEntity.ok(allusers);
	}
}
