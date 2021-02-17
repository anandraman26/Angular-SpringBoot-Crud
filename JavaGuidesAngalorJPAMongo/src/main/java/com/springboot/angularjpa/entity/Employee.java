package com.springboot.angularjpa.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Employee")
public class Employee {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private Float price;
	private String name;
	private String dept;

	public Employee(String firstName, String lastName,  Float price, Date joiningDate, String name,
			String dept) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.price = price;
		this.name = name;
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


}
