package com.thaiv.coursedb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaiv.coursedb.models.Course;

public interface CourseRepository extends JpaRepository<Course, String> {

}
