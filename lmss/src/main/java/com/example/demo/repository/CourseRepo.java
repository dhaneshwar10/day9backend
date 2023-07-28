package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Course;

public interface CourseRepo extends JpaRepository<Course,String>{

}
