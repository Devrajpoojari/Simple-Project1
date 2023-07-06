package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Api's

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}

	@PutMapping("/update")
	public Student update(@RequestBody Student student) throws Exception {
		return studentService.updateStudent(student);
	}

	@GetMapping("/get-all")
	public List<Student> getAll() {
		return studentService.getAllStudents();
	}

	@GetMapping("/{sId}")
	public Student getStudentById(@PathVariable int sId) throws Exception {
		return studentService.getStudentById(sId);
	}

	@DeleteMapping("/{sId}")
	public String deleteById(@PathVariable int sId) throws Exception {
		return studentService.deleteStudent(sId);
	}

}
