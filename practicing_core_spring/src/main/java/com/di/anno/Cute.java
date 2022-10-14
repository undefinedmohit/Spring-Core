package com.di.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cute {
	@Value("cats...")
	private String cutu;

	public String getCutu() {
		return cutu;
	}

	public void setCutu(String cutu) {
		this.cutu = cutu;
	}

	public Cute(String cutu) {
		super();
		this.cutu = cutu;
	}

	public Cute() {
		
		super();
		System.out.println("very cutuuu mutuuuu...... gucchu mucchuuu");
	}

	@Override
	public String toString() {
		return "Cute [cutu=" + cutu + "]";
	}
	
	

}
