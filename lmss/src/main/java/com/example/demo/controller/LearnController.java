package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Course;
import com.example.demo.repository.CourseRepo;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class LearnController {
	@Autowired
	  CourseRepo r;
//	@Autowired
//	BusService ser;
	 @GetMapping("/getcourse")
	   List<Course> getList(){
		 return r.findAll();
	 }
//	   @GetMapping("/getbus/{id}")
//	   public Course getDetailsById(@PathVariable int id)
//	   {
//	   return ser.getDetailId(id);
//	   }
	 @PostMapping("/postcourse")
	  public String create(@RequestBody Course t) {
		  r.save(t);
		  return "CourseDetailsPosted";
	 }
}
