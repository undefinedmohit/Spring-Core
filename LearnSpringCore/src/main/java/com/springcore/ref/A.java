package com.springcore.ref;

public class A {
	
	private int x;
	private B obb;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObb() {
		return obb;
	}
	public void setObb(B obb) {
		this.obb = obb;
	}
	public A(int x, B obb) {
		super();
		this.x = x;
		this.obb = obb;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obb=" + obb + "]";
	}
	
	
	

}
