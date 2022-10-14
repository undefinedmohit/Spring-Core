package com.remove;

import org.springframework.beans.factory.annotation.Value;



public class Charger {
	@Value("this device is chargering")
	private String charging;

	public Charger() {
		super();
		System.out.println("hi, i'm charging your phone.......");
		// TODO Auto-generated constructor stub
	}

	public Charger(String charging) {
		super();
		this.charging = charging;
	}

	public String getCharging() {
		return charging;
	}

	public void setCharging(String charging) {
		this.charging = charging;
	}

	@Override
	public String toString() {
		return "Charger [charging=" + charging + "]";
	}
	
	

}
