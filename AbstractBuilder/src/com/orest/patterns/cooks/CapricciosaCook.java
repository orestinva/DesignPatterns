package com.orest.patterns.cooks;

import com.orest.patterns.pizza.Pizza;
/**
 * pizza builder used by pizzeria for pizza capricciosa creation
 * 
 *
 */
public class CapricciosaCook extends PizzaBuilder {

	@Override
	public Pizza getPizza() {
		Pizza thisPizza = super.getPizza();
		thisPizza.setName("Capricciosa");
		return thisPizza;
	}

	@Override
	protected void addSalami(Pizza pizza) {
		pizza.setSalami(1);

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
		pizza.setOlives(1);

	}

	@Override
	protected void addSpices(Pizza pizza) {
		pizza.setSpices(1);

	}

}
