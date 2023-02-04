package com.BikkadIT.BeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Employee {

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Employee class constructor");
	}
	 
}
