package com.example.first_project.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(FirstProjectApplication.class, args);
		
		Person newPerson=ctx.getBean("person",Person.class);
		newPerson.personInfo(newPerson);
		
		String[] arr =ctx.getBeanDefinitionNames();
		for(String bean: arr){
			System.out.println(bean);
		}
	}

}
