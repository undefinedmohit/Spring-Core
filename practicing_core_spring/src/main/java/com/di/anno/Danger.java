package com.di.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Danger {
	
	@Value("Lions")
	private String danger;

	public String getDanger() {
		return danger;
	}

	public void setDanger(String danger) {
		this.danger = danger;
	}

	public Danger() {
		super();
		System.out.println("these are very dangerous hoooooh.......");
	}

	public Danger(String danger) {
		super();
		this.danger = danger;
	}

	@Override
	public String toString() {
		return "Danger [danger=" + danger + "]";
	}
	
	

}


