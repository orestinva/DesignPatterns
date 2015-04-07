package com.orest.patterns.cooks;

import com.orest.patterns.pizza.Pizza;
/**
 * pizza builder used by pizzeria for pizza margharita creation
 * 
 *
 */
public class MargharitaCook extends PizzaBuilder{

	@Override
	public Pizza getPizza() {
		Pizza thisPizza = super.getPizza();
		thisPizza.setName("Margharita");
		return thisPizza;
	}
	
	@Override
	protected void addSalami(Pizza pizza) {
		pizza.setSalami(0);
		
	}

	@Override
	protected void addTomatoes(Pizza pizza) {
		pizza.setTomatoes(1);
		
	}

	@Override
	protected void addCheese(Pizza pizza) {
		pizza.setCheese(1);
		
	}

	@Override
	protected void addOlives(Pizza pizza) {
		pizza.setOlives(0);
		
	}

	@Override
	protected void addSpices(Pizza pizza) {
		pizza.setSpices(1);
		
	}

}
