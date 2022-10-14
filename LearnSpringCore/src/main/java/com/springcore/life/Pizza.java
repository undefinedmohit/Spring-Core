package com.springcore.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pizza implements InitializingBean, DisposableBean {
	private String ready;

	public String getReady() {
		return ready;
	}

	public void setReady(String ready) {
		this.ready = ready;
	}

	@Override
	public String toString() {
		return "Pizza [ready=" + ready + "]";
	}

	public void destroy() throws Exception {
		
		System.out.println("inside destroy of pizza....");
		// TODO Auto-generated method stub
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init....");
		
		// TODO Auto-generated method stub
		
	}
	
	

}
