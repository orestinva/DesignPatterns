package com.orest.patterns;

import com.orest.patterns.candies.Candy;
import com.orest.patterns.shops.SweetsShop;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CandyFactory chocolateFactory = new ChocolateFactory();
		// Candy chocolateCandy = chocolateFactory.getCandy();
		// CandyFactory caramelFactory = new CaramelFactory();
		// Candy caramelCandy = caramelFactory.getCandy();
		SweetsShop sweetshop = new SweetsShop();
		Candy yourCandy = sweetshop.getCandy("caramel");
		System.out.println("Your candy is: " + yourCandy);
	}

}
