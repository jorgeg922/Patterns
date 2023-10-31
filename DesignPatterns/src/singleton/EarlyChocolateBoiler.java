package singleton;
//if applications always creates an instance of the singleton, or the overhead isnt significant
//create singleton early
public class EarlyChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static EarlyChocolateBoiler cb = new EarlyChocolateBoiler();
	
	private EarlyChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static EarlyChocolateBoiler getInstance() {
		return cb;
	}
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//fill the boiler with mixture
		}
	}
	
	public void drain() {
		if(!isEmpty() && isBoiled()) {
			empty = true;
		}
	}
	
	public void boil() {
		if(!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public boolean isBoiled() {
		return boiled;
	}
}
