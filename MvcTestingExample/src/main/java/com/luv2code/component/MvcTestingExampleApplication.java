package com.luv2code.component;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.luv2code.component.models.CollegeStudent;

@SpringBootApplication
public class MvcTestingExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcTestingExampleApplication.class, args);
	}
	
	@Bean(name = "collegeStudent")
	@Scope(value = "prototype")
	CollegeStudent getCollegeStudent() {
		return new CollegeStudent();
	}

}
