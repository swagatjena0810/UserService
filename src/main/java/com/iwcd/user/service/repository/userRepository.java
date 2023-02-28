package com.iwcd.user.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iwcd.user.service.entities.User;

public interface userRepository extends JpaRepository<User,String>{

}
