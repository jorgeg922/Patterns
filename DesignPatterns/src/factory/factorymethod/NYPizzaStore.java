package factory.factorymethod;

public class NYPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String type) {
		if(type.equals("cheese")) {
			return new NYStyleCheesePizza();
		}else if(type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		}
		
		return null;
	}
	
}
