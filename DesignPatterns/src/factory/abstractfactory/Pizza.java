package factory.abstractfactory;

import factory.abstractfactory.families.Cheese;
import factory.abstractfactory.families.Clams;
import factory.abstractfactory.families.Dough;
import factory.abstractfactory.families.Pepperoni;
import factory.abstractfactory.families.Sauce;
import factory.abstractfactory.families.Veggies;

public abstract class Pizza {
	String name;
	
	Dough dough;
	Sauce sauce;
	Veggies[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clams;
	
	abstract void prepare();
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	public String toString() {
		if(dough != null) {
			System.out.println(dough.toString());
		}
		if(sauce != null) {
			System.out.println(sauce.toString());
		}
		if(cheese != null) {
			System.out.println(cheese.toString());
		}
		if(pepperoni != null) {
			System.out.println(pepperoni.toString());
		}
		
		return "Ingredients above";
		
	}
}
