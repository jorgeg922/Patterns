package factory.factorymethod;

public class NYStyleVeggiePizza extends Pizza{
	public NYStyleVeggiePizza() {
		name = "NY Style VEGGIE Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinera Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
