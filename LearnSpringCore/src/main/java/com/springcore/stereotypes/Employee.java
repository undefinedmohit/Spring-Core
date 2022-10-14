package com.springcore.stereotypes;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	@Value("14")
	private int employeeId;
	@Value("Mohit")
	private String employeeName;
	
	@Value("#{temp}")
	private List<String> city;
	
	public double getPii() {
		return pii;
	}
	public void setPii(double pii) {
		this.pii = pii;
	}
	
	@Value("#{T(java.lang.Math).PI}")
	private double pii;
	
	@Value("#{1>0}")
	private boolean isActive;
	
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	
	

}
