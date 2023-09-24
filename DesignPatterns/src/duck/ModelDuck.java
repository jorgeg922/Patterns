package duck;

public class ModelDuck extends Duck{
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	@Override
	public void display() {
		System.out.println("Im a model duck!");
		
	}
	
}
