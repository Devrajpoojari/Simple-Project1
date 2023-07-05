package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//1 declear bean 

@RestController
public class Employee {

//	has a relationship  dependency injection 

	// @Autowired
//	private Componey componey;

	private ComponeyInterface componeyInterface;

	public Employee(ComponeyInterface componeyInterface) {
		this.componeyInterface = componeyInterface;
	}

	
	@RequestMapping(path = "/get-salary", method = RequestMethod.GET)
	public String getEmployeeSalary() {
		System.out.println("Getting employee Salary.......");
		System.out.println("Employee Name : " + componeyInterface.name);
		return  "<h1 style= color:red;>" +componeyInterface.name+" "+componeyInterface.getsalaryOfEmployee()+"</h1>";
	}
	
	@GetMapping("/welcome")
	public String getGreetings() {
		return "<h1>Welcome to Dubai.....Habibi</h1>";
	}
}
