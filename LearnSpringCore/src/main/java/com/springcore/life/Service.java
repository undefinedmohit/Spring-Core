package com.springcore.life;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Service {

	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Service [s=" + s + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("this is init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		
		System.out.println("this is destroy method...");
	}
}
