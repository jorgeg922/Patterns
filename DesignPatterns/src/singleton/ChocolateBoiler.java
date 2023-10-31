package singleton;
//classic
//singleton, but not thread safe. Look other implementation in this package for thread safe impl
public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler cb;
	
	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(cb == null) {
			cb = new ChocolateBoiler();
		}
		return cb;
	}
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
			//fill the biler with mixture
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
