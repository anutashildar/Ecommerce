package com.BikkadIT.BeanScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.BeanScope.service.ReportService;
@SpringBootApplication
public class AtutowiringModesApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run( AtutowiringModesApplication.class,args);
		
		ReportService bean=context.getBean(ReportService.class);
		bean.generateReport();
	}
}
