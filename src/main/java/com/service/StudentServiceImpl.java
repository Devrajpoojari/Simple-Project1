package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Student;
import com.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	// dependency injection

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		Student s = studentRepository.save(student);

		return s;
	}

	@Override
	public Student updateStudent(Student student) throws Exception {
		Student s = studentRepository.findById(student.getsId())
				.orElseThrow(() -> new Exception("Student not found with id :" + student.getsId()));
		s.setsId(student.getsId());
		s.setsName(student.getsName());
		s.setTeacher(student.getTeacher());
		return studentRepository.save(s);
	}

	@Override
	public String deleteStudent(int sId) throws Exception {
		Student s = studentRepository.findById(sId)
				.orElseThrow(() -> new Exception("Student not found with id :" + sId));
		studentRepository.delete(s);
		return "Student object is deleted....";
	}

	@Override
	public List<Student> getAllStudents() {

		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(int sId) throws Exception {

		return studentRepository.findById(sId).orElseThrow(() -> new Exception("Student not found with id :" + sId));

	}
}
