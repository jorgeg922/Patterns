package singleton;
//With double check locking, first checks to see if an instance is created and if not then synchronize
//the FIRST time only. This method drastically reduces overhead.
public class DoubleCheckChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private volatile static DoubleCheckChocolateBoiler cb;
	
	private DoubleCheckChocolateBoiler(){
		empty = true;
		boiled = false;
	}
	
	public static synchronized DoubleCheckChocolateBoiler getInstance() {
		if(cb == null) {
			synchronized (DoubleCheckChocolateBoiler.class) {
				if(cb == null) {
					cb = new DoubleCheckChocolateBoiler();
				}
			}
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
