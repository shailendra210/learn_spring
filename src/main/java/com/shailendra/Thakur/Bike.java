package com.shailendra.Thakur;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile{
	public void drive() {
		System.out.println("bhaag raha hai");
	}
}
