package com.service;

import java.util.List;

import com.entity.Student;

public interface StudentService {

	// add student

	Student addStudent(Student student);

	// update student

	Student updateStudent(Student student) throws Exception;

	// delete student

	String deleteStudent(int sId) throws Exception;

	// get all students

	List<Student> getAllStudents();

	// get student by id

	Student getStudentById(int sId) throws Exception;

}
