package com.example.first_project.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class Person {
	private String name;
	private int age;
	private long id;
	private double salary;
	
	public Person() {
		name="sebine";
		age=19;
		id=123;
		salary=2000;
	}

	public Person(String name,int age,long id,double salary) {
		this.name=name;
		this.age=age;
		this.id=id;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public long getId() {
		return id;
	}
	
	public void setID(long id) {
		this.id=id;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	

    @Autowired
    private ApplicationContext applicationContext;
	public void printValues() {
		Person personBean = applicationContext.getBean(Person.class);
		
		System.out.println("Name: " + personBean.getName());
		System.out.println("ID: " + personBean.getId());
		System.out.println("Age: " + personBean.getAge());
		System.out.println("Salary: " + personBean.getSalary());
		
	}
	
	public void personInfo(Person person) {
		
		System.out.println("Name: " + person.getName() + " ID: " + person.getId() +" Age: " + person.getAge() + " Salary: " + person.getSalary());
	}
	
	
	
}
