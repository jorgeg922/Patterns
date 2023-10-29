package factory.abstractfactory;

import factory.abstractfactory.families.Cheese;
import factory.abstractfactory.families.Clams;
import factory.abstractfactory.families.Dough;
import factory.abstractfactory.families.Pepperoni;
import factory.abstractfactory.families.Sauce;
import factory.abstractfactory.families.Veggies;
import factory.abstractfactory.ingredients.FreshClams;
import factory.abstractfactory.ingredients.Garlic;
import factory.abstractfactory.ingredients.MarinaraSauce;
import factory.abstractfactory.ingredients.Mushroom;
import factory.abstractfactory.ingredients.Onion;
import factory.abstractfactory.ingredients.RedPepper;
import factory.abstractfactory.ingredients.ReggianoCheese;
import factory.abstractfactory.ingredients.SlicedPepperoni;
import factory.abstractfactory.ingredients.ThinCrustDough;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return new FreshClams();
	}

}
