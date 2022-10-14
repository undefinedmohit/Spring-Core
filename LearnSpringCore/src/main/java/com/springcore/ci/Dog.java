package com.springcore.ci;

public class Dog {

	private String bark;
	private Eat eat;
	
	
	public Dog(String bark, Eat eat) {
		super();
		this.bark = bark;
		this.eat = eat;
	}


	@Override
	public String toString() {
		return this.bark+" : "+this.eat+" : ";
	}
	
	
}
