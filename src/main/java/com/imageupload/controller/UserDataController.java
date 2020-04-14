package com.imageupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.imageupload.model.User;
import com.imageupload.service.UserDataService;

@RestController
@RequestMapping(value="/data")
public class UserDataController {

	@Autowired
	private UserDataService service;
	
	@RequestMapping(method=RequestMethod.POST, value="/createuser")
	public User createUser(@RequestBody User newUser){
		return service.addUser(newUser);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getUser")
	public User getUser(@RequestParam("id") int userId){
		return service.getUser(userId);
	}
}