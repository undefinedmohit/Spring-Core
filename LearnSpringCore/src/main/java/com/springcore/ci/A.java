package com.springcore.ci;

public class A {

	private int x;
	private int y;
	
	
	public A(double x, double y) {
		super();
		this.x = (int) x;
		this.y = (int) y;
		
		System.out.println("this is double method");
	}
	
	public A(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
		System.out.println("this is int method...");
	}

	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}

	

}
