package com.springcore.collections.util;

import java.util.List;

public class A {
	
	private List<String> list;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public A(List<String> list) {
		super();
		this.list = list;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [list=" + list + "]";
	}
	
	

}
