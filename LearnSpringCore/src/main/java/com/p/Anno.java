package com.p;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class Anno {
	
	@Value("Mohit Yadav")
	private String name;
	@Value("SRE")
	private String city;
	
	@Value("10")
	private int income;
	
	@Value("#{temp}")
	private List<String> list;
	
	
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Anno(String name, String city, int income, List<String> list) {
		super();
		this.name = name;
		this.city = city;
		this.income = income;
		this.list = list;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public Anno(String name, String city, int income) {
		super();
		this.name = name;
		this.city = city;
		this.income = income;
	}
	public Anno() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Anno [name=" + name + ", city=" + city + ", income=" + income + ", list=" + list + "]";
	}
	
	
	
}
