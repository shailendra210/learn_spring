package com.shailendra.Thakur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vechile{

	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return this.tyre;
	}
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre; 
	}
	
	public void drive() {
		
		System.out.println("car "+ tyre );
	}
}
