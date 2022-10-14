package com.operations;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	private String dg;
	
	@OneToMany(mappedBy = "emp")
	private List<Laptop> laptop;
	
	
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDg() {
		return dg;
	}
	public void setDg(String dg) {
		this.dg = dg;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
