package com.orest.patterns.pizzeria;

import com.orest.patterns.cooks.CapricciosaCook;
import com.orest.patterns.cooks.MargharitaCook;
import com.orest.patterns.cooks.PizzaBuilder;
import com.orest.patterns.pizza.Pizza;

public class Pizzeria {
	
	PizzaBuilder capricciosaBuilder = new CapricciosaCook();
	PizzaBuilder margharitaBuilder = new MargharitaCook();
	
	/**
	 * used by pizzeria client for constructing pizza capricciosa
	 * 
	 */
	
	public Pizza getCapricciosa(){
		return capricciosaBuilder.getPizza();
	}
	/**
	 * used by pizzeria client for constructing pizza margharita 
	 * 
	 */
	public Pizza getMargharita(){
		return margharitaBuilder.getPizza();
	}
	
	
}
