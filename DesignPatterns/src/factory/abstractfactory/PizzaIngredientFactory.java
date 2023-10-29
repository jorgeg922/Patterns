package factory.abstractfactory;

import factory.abstractfactory.families.Cheese;
import factory.abstractfactory.families.Clams;
import factory.abstractfactory.families.Dough;
import factory.abstractfactory.families.Pepperoni;
import factory.abstractfactory.families.Sauce;
import factory.abstractfactory.families.Veggies;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
