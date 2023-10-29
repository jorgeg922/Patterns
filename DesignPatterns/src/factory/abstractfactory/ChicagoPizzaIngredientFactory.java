package factory.abstractfactory;

import factory.abstractfactory.families.Cheese;
import factory.abstractfactory.families.Clams;
import factory.abstractfactory.families.Dough;
import factory.abstractfactory.families.Pepperoni;
import factory.abstractfactory.families.Sauce;
import factory.abstractfactory.families.Veggies;
import factory.abstractfactory.ingredients.BlackOlives;
import factory.abstractfactory.ingredients.EggPlant;
import factory.abstractfactory.ingredients.FrozenClams;
import factory.abstractfactory.ingredients.MozzarellaCheese;
import factory.abstractfactory.ingredients.PlumTomatoSauce;
import factory.abstractfactory.ingredients.SlicedPepperoni;
import factory.abstractfactory.ingredients.Spinach;
import factory.abstractfactory.ingredients.ThickCrushDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrushDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies[] veggies = {new BlackOlives(), new Spinach(), new EggPlant()};
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
		return new FrozenClams();
	}

}
