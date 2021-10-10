package com.onlinetech.clinkk.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlinetech.clinkk.model.Users;
import com.onlinetech.clinkk.repository.UserRepository;


@CrossOrigin
@RestController
@RequestMapping("clinckk/v1")
public class UsersController {
	@Autowired
	private UserRepository userlist;
	
	
	@GetMapping ("/userlist") 
	public List<Users> getAllUsers(){ 
	  return  userlist.findAll(); 
	}
	 
	
	
}
