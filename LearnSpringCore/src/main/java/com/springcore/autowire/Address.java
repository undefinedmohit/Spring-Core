package com.springcore.autowire;

public class Address {
	
	private String name;
	private int age;
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
		this.age = age;
	}
	public Address(String name, int age) {
		super();
		System.out.println("this is constructor of class address...");
		
		this.name = name;
		this.age = age;
	}
	public Address() {
		super();
		System.out.println("this is constructor of class address...");
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", age=" + age + "]";
	}
	
	

}
