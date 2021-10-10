package com.onlinetech.clinkk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlinetech.clinkk.repository.CoursesRepository;
import com.onlinetech.clinkk.model.Courses;


@CrossOrigin
@RestController
@RequestMapping("api/v1")
public class CoursesController {

	@Autowired
	private CoursesRepository courselist;
	
	@GetMapping ("/courseList") 
	public List<Courses> getAllCourses(){ 
	  return  courselist.findAll(); 
	}
}
