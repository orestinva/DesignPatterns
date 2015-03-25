package com.orest.patterns.shops;

import com.orest.patterns.candies.Candy;
import com.orest.patterns.factories.CandyFactory;
import com.orest.patterns.factories.CaramelFactory;
import com.orest.patterns.factories.ChocolateFactory;

public class SweetsShop {
	
	private CandyFactory caramelFactory;
	private CandyFactory chocolateFactory;
	
	public SweetsShop(){
		this.caramelFactory = new CaramelFactory();
		this.chocolateFactory = new ChocolateFactory();
		}
	
	public Candy getCandy(String yourCandy){
		if (yourCandy.equals("chocolate")) {
			return chocolateFactory.getCandy();
		}
		else{
			return caramelFactory.getCandy();
		}
	}
	
}
