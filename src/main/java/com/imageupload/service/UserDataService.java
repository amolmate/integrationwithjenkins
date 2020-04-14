package com.imageupload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imageupload.dao.UserDataRepository;
import com.imageupload.model.User;

@Service
public class UserDataService {
	
	@Autowired
	private UserDataRepository repo;

	public User addUser(User user){
		return repo.save(user);
		
	}
	
	public User getUser(int userId){
		return repo.findUser(userId);
	}
}
