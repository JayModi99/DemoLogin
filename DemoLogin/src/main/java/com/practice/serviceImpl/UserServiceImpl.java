package com.practice.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.UserDao;
import com.practice.model.User;
import com.practice.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	

	@Override
	public User saveUser(User user) {
		
		return userDao.saveUser(user);
		
	}
	
	@Override
	public User findByUsernameAndPassword(String username, String password)
	{
		return userDao.findByUsernameAndPassword(username, password);
	}
	
	@Override
	public List <User> getAll()
	{
		return userDao.getAll();
	}
	
	@Override
	public Optional<User> findById(Long id)
	{
		return userDao.findById(id);
	}

}
