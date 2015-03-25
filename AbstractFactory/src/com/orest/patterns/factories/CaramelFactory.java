package com.orest.patterns.factories;

import com.orest.patterns.candies.Candy;
import com.orest.patterns.candies.CaramelCandy;

public class CaramelFactory implements CandyFactory {

	public Candy getCandy() {
		return new CaramelCandy();
	}
	
}
