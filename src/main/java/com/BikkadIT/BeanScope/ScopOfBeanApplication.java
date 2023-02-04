package com.BikkadIT.BeanScope;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class ScopOfBeanApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ScopOfBeanApplication.class, args);
		Employee bean=context.getBean(Employee.class);
		System.out.println(bean.hashCode());
		boolean singleton=context.isSingleton("employee");
		System.out.println(singleton);
		
		Employee bean1=context.getBean(Employee.class);
		System.out.println(bean1.hashCode());
		boolean singleton1=context.isSingleton("employee");
		System.out.println(singleton1);
	}

}
