package com.practice.spring;

public class Process {
	private String p;
	
	public Process(String p)
	{
		
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}

	public Process() {
		super();
		System.out.println("vroom vroom...... processor started.");
	}

	@Override
	public String toString() {
		return "Process [p=" + p + "]";
	}
	
	
	

}
