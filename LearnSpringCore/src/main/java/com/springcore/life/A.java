package com.springcore.life;

public class A {

	private double patakhe;

	public A(double patakhe) {
		System.out.println("this is setter constructor");
		
		this.patakhe = patakhe;
	}

	@Override
	public String toString() {
		return "A [patakhe=" + patakhe + "]";
	}

	public void init()
	{
		System.out.println("this is init method");
	}
	
	
	public void destroy() {
		System.out.println("this is destroy method");
	}
	
	
}
