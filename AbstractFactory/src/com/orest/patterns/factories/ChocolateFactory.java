package com.orest.patterns.factories;

import com.orest.patterns.candies.Candy;
import com.orest.patterns.candies.ChocolateCandy;

public class ChocolateFactory implements CandyFactory{
	
	public Candy getCandy() {
		return new ChocolateCandy();
	}
	
	
}
