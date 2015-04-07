package com.orest.patterns.cooks;

import com.orest.patterns.pizza.Pizza;

/**
 * basic class used for creating pizza; methods for adding elements should be
 * overrided in custom implementations
 *
 */
public abstract class PizzaBuilder {

	public PizzaBuilder() {

	}

	private int pizzaCount = 0;

	/**
	 * default pizza creation implementation, could be overrided by nesting
	 * classes
	 * 
	 */
	public Pizza getPizza() {
		Pizza pizza = new Pizza();
		pizzaCount++;
		pizza.setId(pizzaCount);
		addSalami(pizza);
		addTomatoes(pizza);
		addCheese(pizza);
		addOlives(pizza);
		addSpices(pizza);
		return pizza;
	}

	protected abstract void addSalami(Pizza pizza);

	protected abstract void addTomatoes(Pizza pizza);

	protected abstract void addCheese(Pizza pizza);

	protected abstract void addOlives(Pizza pizza);

	protected abstract void addSpices(Pizza pizza);

	public int getPizzaCount() {
		return pizzaCount;
	}

	public void setPizzaCount(int pizzaCount) {
		this.pizzaCount = pizzaCount;
	}
}
