package com.shailendra.Thakur;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	String brand;
	
	/*
	 * public Tyre(String brand) { super(); this.brand = brand; }
	 */
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return this.brand;
	}
	

	public String toString() {
		return "is running!!!" ;
	}
	

}
