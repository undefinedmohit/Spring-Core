package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String> phone;
	private Set<String> city;
	private Map<String, String> courses;
	private Properties props;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getPhone() {
		return phone;
	}
	public void setPhone(List phone) {
		this.phone = phone;
	}
	public Set getCity() {
		return city;
	}
	public void setCity(Set city) {
		this.city = city;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List phone, Set city, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.courses = courses;
		this.props = props;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", city=" + city + ", courses=" + courses + ", props="
				+ props + "]";
	}
	
	
	

}
