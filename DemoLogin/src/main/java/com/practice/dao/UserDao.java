package com.practice.dao;

import java.util.List;
import java.util.Optional;

import com.practice.model.User;

public interface UserDao {
	
	public User saveUser(User user);
	
	public User findByUsernameAndPassword(String username, String password);
	
	public List<User> getAll();
	
	public Optional<User> findById(Long id);

}
