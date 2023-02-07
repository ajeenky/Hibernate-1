package com.prac1;

public class Student {
	
//	Oldest design type of hibernate which requires following things
//	regular java project + external jars for hibernate and jdbc(mysql connector) + pojo class +
//	+ hibernate.cfg.xml file + student.hbm.xml (hibernate mapping file) + main class
//	
//	private global variables wich will be initialized when creating an object-->
	private int id;
	private String firstName;
	private String lastName;
	
//	getters and setters to set and modify the values of class variables-->
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
}
