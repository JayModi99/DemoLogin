package com.practice.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.dao.UserDao;
import com.practice.model.User;
import com.practice.repository.UserRepository;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(User user) 
	{
		return userRepository.save(user);
	}
	
	@Override
	public User findByUsernameAndPassword(String username, String password)
	{
		return userRepository.findByUsernameAndPassword(username, password);
	}
	
	@Override
	public List <User> getAll()
	{
		return userRepository.findAll();
	}
	
	@Override
	public Optional<User> findById(Long id)
	{
		return userRepository.findById(id);
	}
	
}
