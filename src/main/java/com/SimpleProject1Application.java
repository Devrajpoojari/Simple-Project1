package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SimpleProject1Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SimpleProject1Application.class, args);
		System.out.println("Application is started........");
		
		// step 2 create IOC container

	//	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

//		step 3 . get beans from container

		Employee e = ctx.getBean(Employee.class);
		System.out.println(e.hashCode());

		System.out.println(e.getEmployeeSalary());
	}

}
