package com.orest.patterns.pizza;
/**
 * class used for describing pizza
 * 
 *
 */
public class Pizza {

	private int salami;
	private int tomatoes;
	private int spices;
	private int olives;
	private int cheese;
	private String name;
	private int id;
	
	public Pizza() {

	}

	public int getSalami() {
		return salami;
	}

	public void setSalami(int salami) {
		this.salami = salami;
	}

	public int getTomatoes() {
		return tomatoes;
	}

	public void setTomatoes(int tomatoes) {
		this.tomatoes = tomatoes;
	}

	public int getSpices() {
		return spices;
	}

	public void setSpices(int spices) {
		this.spices = spices;
	}

	public int getOlives() {
		return olives;
	}

	public void setOlives(int olives) {
		this.olives = olives;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return name + " " + id;
	}
}
